import java.text.NumberFormat;
import java.util.Scanner;
public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        //while loop for repetition
        //principal amount
        double principal = 0;
        while(true){
            System.out.print("Enter Principle Amount (1000 - 1000000): ");
            principal = sc.nextDouble();

            //condition for principal ammount for taking values from user between 1000 to 1000000
            if(principal < 1000 || principal > 1000000){
                System.out.println("Please, Enter the principal amount greater than equal to 1000 or less than equal to 1000000");
                continue;
            }
            break;
        }

        System.out.println("");

        //Annual interest rate
        double rate = 0;
        while(true){
            System.out.print("Enter Annual Interest rate (1 - 30): ");
            rate =sc.nextDouble();

            //condition for principal ammount for taking values from user between 1000 to 100000
            if(rate <= 0 || rate >= 30){
                System.out.println("Please, Enter rate greater than 0 and smaller than equal to 30");
                continue;
            }
            break;
        }

        System.out.println("");

        //period in years
        byte period = 0;
        System.out.print("Enter the period: ");
        period = sc.nextByte();

        System.out.println("----------------------------------");

        //conversion of rates of yearly to monthly
        rate = (rate/100)/12;

        //period into number of payment
        int number_of_payments;
        number_of_payments = period * 12;

        //printing all the values
        String result;
        //princpal
        NumberFormat pricipals = NumberFormat.getCurrencyInstance();
        result = pricipals.format(principal);
        System.out.println("Principle Amount: " + result);

        //rates into percent
        NumberFormat rates = NumberFormat.getPercentInstance();
        rates.setMinimumFractionDigits(3);
        rates.setMaximumFractionDigits(3);
        result = rates.format(rate);

        System.out.println("Monthly interest rate: " + result);

        //period
        System.out.println("Period of Mortgage: " + period +" years \n" + "Number of payment: " + number_of_payments + " times");

        System.out.println("----------------------------------");

        //formula for mortgage
        double mortgage;
        mortgage = principal * ((rate*(Math.pow((1+rate),number_of_payments)))/((Math.pow((1+rate),number_of_payments)) - 1));

        //mortgage
        NumberFormat mortgages = NumberFormat.getCurrencyInstance();
        result = mortgages.format(mortgage);
        System.out.println("Mortgage: " + result);

    }
}
