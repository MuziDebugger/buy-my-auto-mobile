package com.repository.auto.debugger;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

import com.domain.dealership.debugger.Buyers;

@Repository
public class BuyerRepository { 
	
		private final JdbcTemplate jdbc;
		@Autowired
		public BuyerRepository(JdbcTemplate jdbc) {
			this.jdbc = jdbc;
		}
		
		// ADMIN should have access, buyer/seller has no business viewing this info 
		
		public Buyers OrderByFirstName() {
			String sql = "SELECT * FROM buyers ORDER BY buyer_name";
			return jdbc.queryForObject(sql, new RowMapper<Buyers>() {
				public Buyers mapRow(ResultSet rs, int rowNum) throws SQLException {
					Buyers buyer = new Buyers();
					buyer.setBuyer_id(rs.getInt("buyer_id"));
					buyer.setBuyer_name(rs.getString("buyer_name"));
					buyer.setBuyer_surname(rs.getString("buyer_surname"));
					return buyer; 
					// only one query method for now still testing 
				}
			});
		}
}
