package busreservation;

import java.util.*;
import java.text.ParseException;
import java.text.SimpleDateFormat;

public class Booking {
    String passengerName;
    int busNo;
    Date date;

    Booking() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter name of passenger: ");
        passengerName = scanner.nextLine();

        System.out.print("Enter bus no: ");
        busNo = scanner.nextInt();

        System.out.print("Enter date (dd-MM-yyyy): ");
        String dateInput = scanner.next();
        SimpleDateFormat dateFormat = new SimpleDateFormat("dd-MM-yyyy");

        try {
            date = dateFormat.parse(dateInput);
        } catch (ParseException e) {
            System.out.println("Invalid date format. Please enter in dd-MM-yyyy format.");
        }
    }

    public boolean isAvailable(ArrayList<Booking> bookings, ArrayList<Bus> buses) {
        int capacity = 0;

        for (Bus bus : buses) {
            if (bus.getBusNo() == busNo) {
                capacity = bus.getCapacity();
            }
        }

        int booked = 0;
        for (Booking b : bookings) {
            if (b.busNo == busNo && b.date.equals(date)) {
                booked++;
            }
        }

        return booked < capacity;
    }
}