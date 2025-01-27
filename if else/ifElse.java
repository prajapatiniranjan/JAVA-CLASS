import java.util.Scanner;

public class ifElse {

    public static void main(String[] args) {

        int pass;
        Scanner obj = new Scanner(System.in); 
        System.out.println("Enter password");
        pass = obj.nextInt();
        if (pass == 1234) {
            System.out.println("Successful");
        } else {
            System.out.println("Try again");
        }

    }
}
