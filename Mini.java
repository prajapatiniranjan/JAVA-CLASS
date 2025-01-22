import java.util.Scanner;

class Mini {
    int transactionId;
    String name;
    String uid;
    String bloodGroup;
    int age;

    public void inputTransactionDetails() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter Transaction ID: ");
        transactionId = scanner.nextInt();
        scanner.nextLine(); 

        System.out.print("Enter Name: ");
        name = scanner.nextLine();

        System.out.print("Enter UID: ");
        uid = scanner.nextLine();

        System.out.print("Enter Blood Group: ");
        bloodGroup = scanner.nextLine();

        System.out.print("Enter Age: ");
        age = scanner.nextInt();

        scanner.close();
    }

    public void displayTransactionDetails() {
        System.out.println("Transaction Details:");
        System.out.println("Transaction ID: " + transactionId);
        System.out.println("Name: " + name);
        System.out.println("UID: " + uid);
        System.out.println("Blood Group: " + bloodGroup);
        System.out.println("Age: " + age);
    }

    public static void main(String[] args) {
        Mini transaction = new Mini();
        
        transaction.inputTransactionDetails();
        
        transaction.displayTransactionDetails();
    }
}
