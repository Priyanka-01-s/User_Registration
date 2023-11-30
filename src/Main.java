import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("------------WELCOME TO THE USER REGISTRATION PORTAL------------");

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the first name(First letter as Capital and minimum 3 characters) :");
        String fName = sc.nextLine();

        System.out.println("Enter the last name First letter as Capital and minimum 3 characters:");
        String lName = sc.nextLine();

        if(UserId.firstName(fName) && UserId.lastName(lName)){
            System.out.println("Valid first and last name!");

        }
        else{
            System.out.println("Invalid first name. Please enter in a valid formall!!");
        }
        sc.close();
    }
    
}
