import java.util.Scanner;

public class BillingSystem {
     public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);

            System.out.println("Please enter the number of items that you have purchased: ");
            int items = sc.nextInt();

            float totalPrice = 0;

            for(int i = 1; i<=items; i++){
                System.out.println("Enter the price: ");
                float ItemPrice = sc.nextInt();
                System.out.println("Enter the quantity " + i);
                float ItemQuantity = sc.nextFloat();

                totalPrice = totalPrice + (ItemPrice * ItemQuantity);
            }

            float discountedPrice = totalPrice - ( ((float) 10 /100) * totalPrice );

            float vatPrice = discountedPrice - ( ((float) 13/100) * discountedPrice );

            System.out.println("Your final Price is Rs : " + vatPrice);
        }
    }

