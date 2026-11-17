package KMIT.OVR_1;
import java.util.Scanner;

public class App {

    static String[] vehicles = {
        "Toyota Innova",
        "Hyundai Creta",
        "Maruti Swift",
        "Kia Seltos",
        "Honda City"
    };

    static double[] prices = {
        2500, 2000, 1200, 1800, 1500
    };

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("==================================");
        System.out.println("     ONLINE VEHICLE RENTAL SYSTEM");
        System.out.println("==================================");

        System.out.print("Enter Customer Name: ");
        String customer = sc.nextLine();

        System.out.println("\nAvailable Vehicles:");

        for (int i = 0; i < vehicles.length; i++) {
            System.out.println((i + 1) + ". " + vehicles[i]
                    + " - Rs." + prices[i] + " per day");
        }

        System.out.print("\nSelect Vehicle (1-5): ");
        int choice = sc.nextInt();

        if (choice < 1 || choice > vehicles.length) {
            System.out.println("Invalid vehicle selection!");
            sc.close();
            return;
        }

        System.out.print("Enter Number of Rental Days: ");
        int days = sc.nextInt();

        if (days <= 0) {
            System.out.println("Invalid number of rental days!");
            sc.close();
            return;
        }

        double total = prices[choice - 1] * days;

        System.out.println("\n==================================");
        System.out.println("       VEHICLE BOOKING DETAILS");
        System.out.println("==================================");

        System.out.println("Customer Name : " + customer);
        System.out.println("Vehicle Name  : " + vehicles[choice - 1]);
        System.out.println("Price Per Day : Rs." + prices[choice - 1]);
        System.out.println("Rental Days   : " + days);
        System.out.println("----------------------------------");
        System.out.println("Total Amount  : Rs." + total);
        System.out.println("Booking Status: CONFIRMED");
        System.out.println("==================================");

        System.out.println("Thank you for choosing our service!");

        sc.close();
    }
}
