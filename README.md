# Hotel-Booking-Management-System
 SyntecxHub InternshipTask-1 : Hotel Booking Management System
This project is a beginner-friendly, CLI-based *Hotel Booking System* developed in Java.
It is modular and organized into separate classes for easy understanding and internship submission.

## ✅ Project Modules / Files

1. *Room.java*  
   - Represents a hotel room.
   - Stores room number and booking status (booked / available).

2. *Reservation.java*  
   - Stores reservation information: room and customer name.

3. *ReservationManager.java*  
   - Handles all reservation logic:
     - Booking rooms
     - Cancelling reservations
     - Viewing current reservations

4. *MainMenu.java*  
   - Main CLI program providing menu for user interaction.

## ✨ Features

- *CLI-based* console application  
- View available rooms, book a room, and cancel bookings  
- Input validation and error handling  
- Modular design (like a Library Management System)  
- Beginner-friendly and internship-ready  

## 🏃 How to Run

1. Open the project in Eclipse, IntelliJ, or NetBeans.  
2. Compile all .java files.  
3. Run MainMenu.java to start the program.  
4. Follow the console menu to view, book, or cancel rooms.

## ⚡ Example CLI Output
=== Hotel Booking System ===

View Available Rooms

Book a Room

Cancel Booking

Exit
Enter choice: 1

Available Rooms:
Room 1
Room 2
Room 3
Room 4
Room 5

Enter choice: 2
Enter room number to book: 2
Enter your name: Komal
Room 2 booked successfully ✅

Enter choice: 3
Enter room number to cancel booking: 2
Booking cancelled ✅
## Notes

- true in Room object = Room is booked  
- false in Room object = Room is available  
- Each class is independent and modular for better understanding and maintenance.
