# 🚌 Bus Reservation System (Java Console Application)

## 📌 Overview

This **Bus Reservation System** is a simple Java-based console application that allows users to view available buses, book tickets, and check existing reservations. It's designed with a focus on **Object-Oriented Programming** concepts and basic Java I/O.

---

## ⚙️ Features

- ✅ View list of available buses  
- 🧾 Book tickets for a specific bus and date  
- 🔍 Check availability before booking  
- 📅 Prevents duplicate bookings for the same user, bus, and date  
- 📚 Uses file storage to save and retrieve booking data  

---

## 🛠️ Tech Stack

- **Language:** Java  
- **IDE:** VS Code / Eclipse  
- **Concepts Used:** OOP, File Handling, Collections (`ArrayList`, `Scanner`), Exception Handling

---

## 🧱 Project Structure

```bash
busreservation/
│
├── Bus.java             # Contains Bus details (busNo, AC/Non-AC, capacity)
├── Booking.java         # Handles reservation logic and stores user data
├── BusDemo.java         # Main class to run the application
├── bookings.txt         # (Optional) To store booking history
└── README.md            # Project documentation
```

---

## 📥 How to Run

1. **Clone the Repository**
   ```bash
   git clone https://github.com/your-username/bus-reservation-system.git
   cd bus-re

