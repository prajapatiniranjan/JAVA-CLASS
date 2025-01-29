import java.util.Scanner;

public class Color {

    public static void main(String[] args) {

        Scanner obj = new Scanner(System.in); 
        System.out.println("Enter color 1:");
        String color1=obj.nextLine();

             System.out.println("Enter color 2:");
        String color2=obj.nextLine();

        String a = "Yellow";
         String b = "blue";
 
    if(a.equals(color1 ) &&  b.equals(color2)){
        System.out.println("Green");
    }

    }
}