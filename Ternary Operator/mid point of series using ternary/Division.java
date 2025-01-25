import java.util.Scanner;

public class Division {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int num = scanner.nextInt();

        String result = (num % 8 != 0) ? "Divisible by 8" : 
                        (num % 6 == 0) ? "Divisible by 6" : 
                        (num % 4 == 0) ? "Divisible by 4" : 
                        (num % 2 == 0) ? "Divisible by 2" : 
                        "Not divisible by 2, 4, 6, or 8";

        System.out.println(result);

        scanner.close();
    }
}
