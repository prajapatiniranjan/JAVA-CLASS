import java.util.Scanner; 

public class Convert {
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        
        System.out.println("Enter a number:");
        int number = obj.nextInt();
        
        int d1 = number % 10;  
        number = number / 10;
        int d2 = number % 10;  
        number = number / 10;
        int d3 = number % 10;  
        
        if (d3 == 3) {
            System.out.print("Three ");
        }
        if (d2 == 2) {
            System.out.print("Two ");
        }
        if (d1 == 1) {
            System.out.print("One ");
        }
    }
}
