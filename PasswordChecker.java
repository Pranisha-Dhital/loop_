import java.util.Scanner;
public class PasswordChecker {
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);

            for (int i = 1; i <= 5; i++) {
                System.out.println("Enter Username");
                String Username = sc.next();
                System.out.println("Enter Password");
                String Password = sc.next();

                if (Password.equals("Pranisha@#11") && Username.equals("Pranisha.Dhital")) {
                    System.out.println("Correct");
                    break;
                } else {
                    System.out.println("Incorrect");
                    System.out.println("Your Remaining Tries Are: " + (5 - i));
                }

            }
        }
    }




