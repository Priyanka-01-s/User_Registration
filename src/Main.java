import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("------------WELCOME TO THE USER REGISTRATION PORTAL------------");

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the first name :");
        String fName = sc.nextLine();

        if(UserId.firstName(fName)){
            System.out.println("Valid first name!");

        }
        else{
            System.out.println("Invalid first name. Please enter the first letter capital!!");
        }
        sc.close();
    }
    
}
