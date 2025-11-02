import java.util.Scanner

public class AvgScore {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter score of Student 1: ");
        double s1 = input.nextDouble();

        System.out.print("Enter score of Student 2: ");
        double s2 = input.nextDouble();

        System.out.print("Enter score of Student 3: ");
        double s3 = input.nextDouble();

        double average = (s1 + s2 + s3) / 3.0;

        System.out.printf("Average score: %.2f%n", average);

        input.close();
    }
}
