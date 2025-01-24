import java.util.Scanner;

public class EquilateralTriangle {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the first side of the triangle: ");
        int side1 = scanner.nextInt();
        
        System.out.print("Enter the second side of the triangle: ");
        int side2 = scanner.nextInt();
        
        System.out.print("Enter the third side of the triangle: ");
        int side3 = scanner.nextInt();
        
        String result = (side1 == side2 && side2 == side3) ? "The triangle is equilateral" : "The triangle is not equilateral";

        System.out.println(result);

        scanner.close();
    }
}
