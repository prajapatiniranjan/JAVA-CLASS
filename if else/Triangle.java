import java.util.Scanner;

public class Triangle {

    public static void main(String[] args) {

        int slid1;
        int slid2;
        int slid3;
        Scanner obj = new Scanner(System.in); 
        System.out.println("Enter Slid 1 2 3");
        slid1 = obj.nextInt();
        slid2 = obj.nextInt();
        slid3 = obj.nextInt();
        if (slid1==slid2 && slid3==slid1 ) {
            System.out.println("Equivalante Triangle");
        } else {
            System.out.println("Try again");
        }

    }
}
