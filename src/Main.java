import java.util.ArrayList;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        ArrayList<String> bookstore =new ArrayList<>();
        Scanner scanner =new Scanner(System.in);
        System.out.println("Select the role you want to use:\n");
        System.out.printf("----------------------------\n");
        int key=0;
        while (key !=3)
        {
            displayMenu();
            System.out.println("Enter Your Choice:  ");
            scanner.nextLine();
            switch (key)
            {
                case 1:
                    Admin(bookstore,scanner);
                    break;
                case 2:
                    Staff(bookstore,scanner);
                    break;
                case 3:
                    Customer(bookstore,scanner);
                    break;
            }
            
        }
    }

    private static void Customer(ArrayList<String> bookstore, Scanner scanner) {
        int admin = 1;
        while (admin != 1)
        {
            switch (admin)
            {
                case 1:
                    System.out.println("Add book");
                    break;
            }
        }
    }

    private static void Staff(ArrayList<String> bookstore, Scanner scanner) {
    }

    private static void Admin(ArrayList<String> bookstore, Scanner scanner) {
    }


    private static void displayMenu() {
        System.out.println( "1. Admin" );
        System.out.println( "2. Staff ");
        System.out.println( "3. Customer " );
    }
}