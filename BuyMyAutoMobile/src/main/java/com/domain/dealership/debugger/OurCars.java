package com.domain.dealership.debugger;

import java.util.List;

import javax.annotation.Generated;
import com.domain.dealership.debugger.Buyers;
import com.domain.dealership.debugger.Sellers;

public class OurCars {
    
	  // primary key
	  private int vehicle_id; 
	  
	  private String make;
	  private String model;
	  private int yearOfMake;
	  private int price;
	  
	  // foreign keys 
	  private int buyer_id;
	  private int seller_id;
	  private int mileage;
	  
	  public OurCars() {
		  
	  }
	  public OurCars(int vehicle_id) {
		  this.setVehicle_id(vehicle_id);
	  }

	  public OurCars(int vehicle_id, String make, String model) {
		  this.setVehicle_id(vehicle_id);
		  this.setMake(make);
		  this.setModel(model);
	  }

	  public OurCars(String make) {
		  this.setMake(make);
	  }

	  public OurCars(String make, String model, int year) {
		  this.setMake(make);
		  this.setModel(model);
		  this.setYear(year);
	  }
	  
	  private List<Buyers> buyers;
	  
	  private List<Sellers> sellers;

	  public List<Buyers> getBuyers() {
		return buyers;
	}
	public void setBuyers(List<Buyers> buyers) {
		this.buyers = buyers;
	  }
	
	  public List<Sellers> getSellers() {
		return sellers;
	}
	public void setSellers(List<Sellers> sellers) {
		this.sellers = sellers;
	  }
	
	public int getVehicle_id() {
		return vehicle_id;
	}
	public String getMake() {
		return make;
	}
	public String getModel() {
		return model;
	}
	public int getYear() {
		return yearOfMake;
	}
	public int getBuyer_id() {
		return buyer_id;
	}
	public int getSeller_id() {
		return seller_id;
	}
	public void setVehicle_id(int vehicle_id) {
		this.vehicle_id = vehicle_id;
	}
	public void setMake(String make) {
		this.make = make;
	}
	public void setModel(String model) {
		this.model = model;
	}
	public int setYear(int year) {
		return this.yearOfMake = year;
	}
	public void setBuyer_id(int buyer_id) {
		this.buyer_id = buyer_id;
	}
	public void setSeller_id(int seller_id) {
		this.seller_id = seller_id;
	}
	
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public int getMileage() {
		return mileage;
	}
	public void setMileage(int mileage) {
		this.mileage = mileage;
	}
	@Override
	public String toString() {
		return "OurCars [make = make, model = model + ]";
	}

}
