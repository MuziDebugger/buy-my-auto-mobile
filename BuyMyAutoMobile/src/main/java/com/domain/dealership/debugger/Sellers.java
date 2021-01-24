package com.domain.dealership.debugger;

import java.util.List;

// ARE YOU FORGETTING SOMETHING?
public class Sellers {
	
	 private int seller_id;
     private String seller_name;
     private String seller_surname;
     private String email_address;
     private String mobile_contact;
     
     // foreign key
     private int vehicle_id ;
     
     // Cars
     private List<OurCars> ourCars; 

     // Buyer

     private List<Buyers> buyers; 
     
	public List<Buyers> getBuyers() {
		return buyers;
	}
	
	public void setSellers(List<Buyers> buyers) {
		this.buyers = buyers;
	}

	public void setCars(List<OurCars> ourCars) {
		this.ourCars = ourCars;
	}

	public List<OurCars> getOurCars() {
		return ourCars;
	}
	
	public String getEmail_address() {
		return email_address;
	}
	public void setEmail_address(String email_address) {
		this.email_address = email_address;
	}

	// private no arg constructor is needed by the JPA
	public Sellers() {
    	 
     }
     
     // public constructor to print the seller's id
     
     public Sellers(int seller_id) {
    	 this.setSeller_id(seller_id);
    	 
     }
     
  // public constructor to print the seller's id and name
     
     public Sellers(int seller_id, String seller_name) {
    	 this.setSeller_id(seller_id);
    	 this.setSeller_name(seller_name);

    	 
     }
     
  // public constructor to print the seller's name, surname

     public Sellers(int seller_id, String seller_name, String seller_surname) {
    	 this.setSeller_id(seller_id);
    	 this.setSeller_name(seller_name);
    	 this.setSeller_surname(seller_surname);
    	 
     }
     
    public int getSeller_id() {
		return seller_id;
	}
	public String getSeller_name() {
		return seller_name;
	}
	public String getSeller_surname() {
		return seller_surname;
	}
	public String getEmailaddress() {
		return email_address;
	}
	public String getMobile_contact() {
		return mobile_contact;
	}
	public void setSeller_id(int seller_id) {
		this.seller_id = seller_id;
	}
	public void setSeller_name(String seller_name) {
		this.seller_name = seller_name;
	}
	public void setSeller_surname(String seller_surname) {
		this.seller_surname = seller_surname;
	}
	public void setEmailaddress(String emailaddress) {
		this.email_address = emailaddress;
	}
	public void setMobile_contact(String mobile_contact) {
		this.mobile_contact = mobile_contact;
	}
	public int getVehicle_id() {
		return vehicle_id;
	}
	public void setVehicle_id(int vehicle_id) {
		this.vehicle_id = vehicle_id;
	}
	
	@Override
	public String toString() {
		return "Seller[firstName = firstName, lastName = lastName + ]";
	}
	
     
}