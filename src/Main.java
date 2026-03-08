import java.text.NumberFormat;
import java.util.Scanner;
public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        //Principal amount
        System.out.print("Enter Principle Amount: ");
        double principal = sc.nextDouble();

        //Annual Interest rate
        System.out.print("Enter Annual Interest rate: ");
        double rate =sc.nextDouble();

        //period in years
        System.out.print("Enter the period (years): ");
        int period = sc.nextInt();

        //**********XXXXX*********
        //converting annual interest rate to monthly interest rate
        final byte total_months = 12;
        rate = (rate/100)/total_months;

        //number of times payments
        int number_of_payments;
        number_of_payments = period * 12;

        //Assigned string to Get Formatted values
        String result;
        System.out.println("--------------------XXXXXXXXXXXX---------------------");

        //printing all these values
        NumberFormat pricipals = NumberFormat.getCurrencyInstance();
        result = pricipals.format(principal);
        System.out.println("Principle Amount: " + result);

        NumberFormat rates = NumberFormat.getPercentInstance();
        result = rates.format(rate);
        System.out.println("Monthly interest rate: " + result);
        System.out.println("Period of Mortgage: " + period +" years," + " Number of payment: " + number_of_payments + " times");

        System.out.println("--------------------XXXXXXXXXXXX---------------------");
        //formula for mortgage
        double mortgage;
        mortgage = principal * ((rate*(Math.pow((1+rate),number_of_payments)))/((Math.pow((1+rate),number_of_payments)) - 1));

        //final result printing:
        NumberFormat mortgages = NumberFormat.getCurrencyInstance();
        result = mortgages.format(mortgage);
        System.out.println("Mortgage: " + result);
        System.out.println("-----------------------*************--------------------------");
    }
}
