import java.util.Scanner;

public class FarCal {
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);

        System.out.println("Enter choice:");
        System.out.println("1 - Convert Fahrenheit to Celsius");
        System.out.println("2 - Convert Celsius to Fahrenheit");
        int choice = obj.nextInt(); 

        if (choice == 1) {
            System.out.println("Enter temperature in Fahrenheit:");
            double fahrenheit = obj.nextDouble();
            double celsius = (fahrenheit - 32) * 5 / 9;
            System.out.println("Temperature in Celsius: " + celsius);
            
        } else if (choice == 2) {
            System.out.println("Enter temperature in Celsius:");
            double celsius = obj.nextDouble();
            double fahrenheit = (celsius * 9 / 5) + 32;
            System.out.println("Temperature in Fahrenheit: " + fahrenheit);
            
        } else {
            System.out.println("Invalid choice! Please enter 1 or 2.");
        }

        obj.close(); 
    }
}
