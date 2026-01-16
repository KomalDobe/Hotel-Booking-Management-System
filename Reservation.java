package com.syntecxhub.hotelbooking.model;

public class Reservation {

	    private Room room;
	    private String customerName;

	    public Reservation(Room room, String customerName) {
	        this.room = room;
	        this.customerName = customerName;
	    }

	    public Room getRoom() {
	        return room;
	    }

	    public String getCustomerName() {
	        return customerName;
	    }

	    public void setCustomerName(String customerName) {
	        this.customerName = customerName;
	    }
	}

