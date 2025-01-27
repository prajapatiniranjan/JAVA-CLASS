import java.util.Scanner;

public class Division {

    public static void main(String[] args) {

        int num1, num2, num3;
        Scanner obj = new Scanner(System.in); 
        System.out.println("Enter num 1, num 2, num 3:");
        num1 = obj.nextInt();
        num2 = obj.nextInt();
        num3 = obj.nextInt();

        if (num1 > 0 && num2 > 0 && num3 > 0) {
            
            if (num1 % 2 == 0) {
                System.out.println("num1 is divisible by 2");
            }
            
            if (num2 % 4 == 0) {
                System.out.println("num2 is divisible by 4");
            }
            
            if (num3 % 8 != 0) {
                System.out.println("num3 is not divisible by 8");
            }

        } else {
            System.out.println("All numbers must be positive. Try again.");
        }
    }
}
