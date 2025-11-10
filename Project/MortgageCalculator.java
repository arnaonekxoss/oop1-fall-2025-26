import java.text.NumberFormat;
import java.util.Locale;
import java.util.Scanner;
 
public class MortgageCalculator {
    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);
 
    System.out.print("Enter loan amount : ");
            double P= scanner.nextDouble();
    System.out.print("Enter your monthly sallery amount: ");
        double monthlySallery= scanner.nextDouble();
        if (P>(monthlySallery*2)){
            System.out.println("You are not eligible for the loan");
            return;
        }
            double credScore;
        while(true) {
            System.out.print("Enter your credit score (0-500): ");
                credScore = scanner.nextDouble();
                if (credScore<0 || credScore>500){
                    System.out.println("Invalid input, Credit score must be between 0 and 500.");
                }else {
                    break;
                }
        } if (credScore < 300) {
            System.out.println("You are not eligible for the loan.");
            return;
        }
           // System.out.println("Do you have any criminal records (true/false): ");

    System.out.print("Enter annual interest rate: ");
        double annualRate= scanner.nextDouble();
 
    System.out.print("Enter loan period (in years): ");
     int years= scanner.nextInt();
 
        double r= annualRate / 100 / 12;  
     int n= years * 12;                
 
 double M= P* (r* Math.pow(1 + r, n)) / (Math.pow(1 + r, n) - 1);
double totalPayment = M * n;
 double totalInterest = totalPayment - P;

 Locale bdLocale = Locale.of("en" ,"BD");
NumberFormat currencyFormatter= NumberFormat.getCurrencyInstance(bdLocale);
 
  System.out.println();
  System.out.println(" Mortgage Summary ");
     System.out.println("Loan Amount: " + currencyFormatter.format(P));
    System.out.println("Monthly Payment: " + currencyFormatter.format(M));
    System.out.println("Total Payment: " + currencyFormatter.format(totalPayment));
     System.out.println("Total Interest: " + currencyFormatter.format(totalInterest));
        scanner.close();
       
    }
}
 
 
 
 
 
 
       
 
 
   
 
 
 