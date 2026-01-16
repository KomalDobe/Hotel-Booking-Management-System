package com.syntecxhub.hotelbooking.model;
import java.util.ArrayList;

public class ReservationManager {


	
	    private ArrayList<Reservation> reservations = new ArrayList<>();

	    public boolean reserveRoom(Room room, String customerName) {
	        for (Reservation r : reservations) {
	            if (r.getRoom().getRoomNumber() == room.getRoomNumber()) {
	                return false; // already booked
	            }
	        }
	        room.bookRoom();
	        reservations.add(new Reservation(room, customerName));
	        return true;
	    }

	    public boolean cancelReservation(int roomNo) {
	        for (Reservation r : reservations) {
	            if (r.getRoom().getRoomNumber() == roomNo) {
	                r.getRoom().cancelBooking();
	                reservations.remove(r);
	                return true;
	            }
	        }
	        return false;
	    }

	    public ArrayList<Reservation> getReservations() {
	        return reservations;
	    }
	}


