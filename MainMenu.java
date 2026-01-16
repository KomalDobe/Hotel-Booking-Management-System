package com.syntecxhub.hotelbooking.model;
import java.util.Scanner;

public class MainMenu {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Room[] rooms = new Room[5];
        for (int i = 0; i < 5; i++) {
            rooms[i] = new Room(i + 1);
        }

        ReservationManager manager = new ReservationManager();
        int choice = 0; 

        do {
            System.out.println("\n=== Hotel Booking System ===");
            System.out.println("1. View Available Rooms");
            System.out.println("2. Book a Room");
            System.out.println("3. Cancel Booking");
            System.out.println("4. Exit");
            System.out.print("Enter choice: ");

          
            if (!sc.hasNextInt()) {
                System.out.println("Invalid input! Enter a number 1-4.");
                sc.next(); 
                continue;
            }

            choice = sc.nextInt(); 

            switch (choice) {
                case 1:
                    System.out.println("Available Rooms:");
                    for (Room room : rooms) {
                        if (!room.isBooked()) System.out.println("Room " + room.getRoomNumber());
                    }
                    break;

                case 2:
                    System.out.print("Enter room number to book: ");
                    int bookNo = sc.nextInt();
                    System.out.print("Enter your name: ");
                    sc.nextLine(); 
                    String name = sc.nextLine();

                    if (manager.reserveRoom(rooms[bookNo - 1], name)) {
                        System.out.println("Room booked successfully ✅");
                    } else {
                        System.out.println("Room already booked!");
                    }
                    break;

                case 3:
                    System.out.print("Enter room number to cancel booking: ");
                    int cancelNo = sc.nextInt();

                    if (manager.cancelReservation(cancelNo)) {
                        System.out.println("Booking cancelled ✅");
                    } else {
                        System.out.println("Room is not booked!");
                    }
                    break;

                case 4:
                    System.out.println("Thank you for using Hotel Booking System 😊");
                    break;

                default:
                    System.out.println("Invalid choice! Please select 1-4.");
            }

        } while (choice != 4);

        sc.close();
    }
}