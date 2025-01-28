import java.util.Scanner;

public class SearchWord {
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        String word;
        char letter;


        System.out.println("Enter a Word:");
        word=obj.nextLine();
        System.out.println("Enter a Word to search:");
        letter=obj.nextLine().charAt(0);
        if(word.charAt(0)==letter)
        {
            System.out.println("letter found" + " " +letter);
        }
        else{
            System.out.println("letter not found" );

        }
        


    }
}
