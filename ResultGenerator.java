import java.util.Scanner;
public class ResultGenerator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the total number of subjects:");
        int subject = sc.nextInt();
        float totalMarks = 0;
        for (int i = 1; i <= subject; i++) {
            System.out.println("Enter Marks : ");
            float Marks = sc.nextFloat();

            totalMarks = totalMarks + Marks;


        }
        float percentage = (totalMarks / subject);
        System.out.println(percentage + "%");

    }
}