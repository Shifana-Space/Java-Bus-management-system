package busreservation;

import java.util.*;

public class BusReservation {
    public static void main(String[] args) {
        ArrayList<Bus> buses = new ArrayList<>();
        ArrayList<Booking> bookings = new ArrayList<>();

        // Add some buses
        buses.add(new Bus(1, true, 2));
        buses.add(new Bus(2, false, 3));

        for (Bus bus : buses) {
            bus.displayBusInfo();
        }

        char choice;
        do {
            Booking booking = new Booking();
            if (booking.isAvailable(bookings, buses)) {
                bookings.add(booking);
                System.out.println("Booking confirmed!");
            } else {
                System.out.println("Sorry, bus is full. Booking failed.");
            }

            System.out.print("Do you want to make another booking? (y/n): ");
            Scanner scanner = new Scanner(System.in);
            choice = scanner.next().charAt(0);

        } while (choice == 'y' || choice == 'Y');

        System.out.println("Thank you for using the Bus Reservation System.");
    }
}
