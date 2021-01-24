package com.repository.auto.debugger;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

import com.domain.dealership.debugger.Sellers;

@Repository
public class SellerRepository {
	
	private final JdbcTemplate jdbc;

	@Autowired
	public SellerRepository(JdbcTemplate jdbc) {
		this.jdbc = jdbc;
	}
	
	// ADMIN should have access, buyer/seller has no business viewing this info 
	
	public Sellers OrderByFirstName() {
		String sql = "SELECT * FROM sellers ORDER BY seller_name";
		return jdbc.queryForObject(sql, new RowMapper<Sellers>() {
			public Sellers mapRow(ResultSet rs, int rowNum) throws SQLException {
				Sellers seller = new Sellers();
				seller.setSeller_id(rs.getInt("seller_id"));
				seller.setSeller_name(rs.getString("seller_name"));
				seller.setSeller_surname(rs.getString("seller_surname"));
				return seller; 
				// only one query method for now still testing 
			}
		});
	}
}