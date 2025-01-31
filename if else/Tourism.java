
import java.util.Scanner;

public class Tourism {

    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);

        System.out.println("Enter Website (www.Tourism.com): ");
        String web = obj.nextLine();

        if (web.equals("www.Tourism.com")) {
            System.out.println("Choose Visit Type: ");
            System.out.println("1. International Visit");
            System.out.println("2. Domestic Visit");

            int choice = obj.nextInt();
            obj.nextLine();

            if (choice == 1) {
                System.out.println("Available International Destinations:");
                System.out.println("- Japan");
                System.out.println("- Russia");

                System.out.println("Enter your destination: ");
                String destination = obj.nextLine();

                 if (destination.equals("Japan")) {
                    System.out.println("Cost: 200Rs");
                  } else if (destination.equals("Russia")) {
                    System.out.println("Cost: 300Rs");
                } else {
                    System.out.println("Invalid International Destination!");
                }

            } else if (choice == 2) {
                System.out.println("Available Domestic Destinations:");
                System.out.println("- Bhopal");
                System.out.println("- Indore");

                System.out.println("Enter your destination: ");
                String destination = obj.nextLine();

                if (destination.equals("Bhopal")) {
                    System.out.println("Cost: 600Rs");
                } else if (destination.equals("Indore")) {
                    System.out.println("Cost: 500Rs");
                } else {
                    System.out.println("Invalid Domestic Destination!");
                }

            } else {
                System.out.println("Invalid choice! Please enter 1 for International or 2 for Domestic.");
            }
        } else {
            System.out.println("Invalid Website!");
        }

    }
}
