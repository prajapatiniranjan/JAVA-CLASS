import java.util.Scanner;

public class Dictionary {
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        String word1, word2, word3;

        System.out.println("Enter first word:");
        word1 = obj.nextLine();
        System.out.println("Enter second word:");
        word2 = obj.nextLine();
        System.out.println("Enter third word:");
        word3 = obj.nextLine();

        if (word1.compareTo(word2) > 0) {
            String temp = word1;
            word1 = word2;
            word2 = temp;
        }
        if (word1.compareTo(word3) > 0) {
            String temp = word1;
            word1 = word3;
            word3 = temp;
        }
        if (word2.compareTo(word3) > 0) {
            String temp = word2;
            word2 = word3;
            word3 = temp;
        }

        System.out.println("Words in dictionary order:");
        System.out.println(word1);
        System.out.println(word2);
        System.out.println(word3);
    }
}
