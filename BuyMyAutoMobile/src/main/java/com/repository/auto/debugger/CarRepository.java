package com.repository.auto.debugger;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

import com.domain.dealership.debugger.OurCars;

@Repository
public class CarRepository {
	
	private final JdbcTemplate jdbc;

	@Autowired
	public CarRepository(JdbcTemplate jdbc) {
		this.jdbc = jdbc;
	}
	
	// Insert SQL Statements here
	
	// Retrieve cars in database by mileage for the user
	public OurCars OrderByMileage() {
		String sql = "SELECT * FROM ourCars ORDER BY mileage";
		return jdbc.queryForObject(sql, new RowMapper<OurCars>() {
			public OurCars mapRow(ResultSet rs, int rowNum) throws SQLException {
				OurCars car = new OurCars();				 
				car.setVehicle_id(rs.getInt("vehicle_id")); 
				car.setMake(rs.getString("make"));
				car.setModel(rs.getString("model"));
				car.setYear(rs.getInt("yearOfMake"));
				car.setPrice(rs.getInt("price"));
				car.setBuyer_id(rs.getInt("buyer_id"));
				car.setSeller_id(rs.getInt("seller_id"));
				car.setMileage(rs.getInt("mileage"));
				return car;
			}
		});
	}
	
	public OurCars OrderCarsByPriceDesc() {
		String sql = "SELECT make, model, price FROM ourCars oc ORDER BY price ASC";
		return jdbc.queryForObject(sql, new RowMapper<OurCars>() {
			public OurCars mapRow(ResultSet rs, int rowNum) throws SQLException {
				OurCars ourCar = new OurCars();
				ourCar.setMake(rs.getString("make"));
				ourCar.setModel(rs.getString("model"));
				ourCar.setPrice(rs.getInt("price"));
				return ourCar;
				}
			});
		}
	public List<OurCars> listAllInAlphabeticalOrder() {
	String sql = "SELECT make,model, price FROM ourCars ORDER BY make";
	return jdbc.query(sql, (rs,i) -> new OurCars(
		rs.getString("make"),
		rs.getString("model"),
		rs.getInt("price")));
	
	}
}






