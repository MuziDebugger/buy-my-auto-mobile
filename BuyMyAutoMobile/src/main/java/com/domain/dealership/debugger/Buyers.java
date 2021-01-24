package com.domain.dealership.debugger;

import java.util.List;

public class Buyers {

	 private int buyer_id;
     private String buyer_name;
     private String buyer_surname;
     private String emailaddress;
     private String mobile_contact;
     // foreign key
     private int vehicle_id ;
     
     public Buyers() {
    	 
     }
     
     private List<Sellers> sellers;
     
     
     public List<Sellers> getSellers() {
		return sellers;
	}


	public void setSellers(List<Sellers> sellers) {
		this.sellers = sellers;
	}


	public Buyers(int buyer_id) {
    	 this.setBuyer_id(buyer_id);
    	 
     }
     

     public Buyers(int buyer_id, String buyer_name) {
    	 this.setBuyer_id(buyer_id);
    	 this.setBuyer_name(buyer_name);
     }
     
     public Buyers(int buyer_id, String buyer_name, String buyer_surname) {
    	 this.setBuyer_id(buyer_id);
    	 this.setBuyer_name(buyer_name);
    	 this.setBuyer_surname(buyer_surname);
    	 
     }
     

	public int getBuyer_id() {
		return buyer_id;
	}

	public String getBuyer_name() {
		return buyer_name;
	}

	public String getBuyer_surname() {
		return buyer_surname;
	}

	public String getEmailaddress() {
		return emailaddress;
	}

	public String getMobile_contact() {
		return mobile_contact;
	}

	public int getVehicle_id() {
		return vehicle_id;
	}

	public void setBuyer_id(int buyer_id) {
		this.buyer_id = buyer_id;
	}

	public void setBuyer_name(String buyer_name) {
		this.buyer_name = buyer_name;
	}

	public void setBuyer_surname(String buyer_surname) {
		this.buyer_surname = buyer_surname;
	}

	public void setEmailaddress(String emailaddress) {
		this.emailaddress = emailaddress;
	}

	public void setMobile_contact(String mobile_contact) {
		this.mobile_contact = mobile_contact;
	}

	public void setVehicle_id(int vehicle_id) {
		this.vehicle_id = vehicle_id;
	}
     
     // ARE YOU FORGETTING SOMETHING?
	
	@Override
	public String toString() {
		return "Buyer[firstName = firstName, lastName = lastName + ]";
	}

}
