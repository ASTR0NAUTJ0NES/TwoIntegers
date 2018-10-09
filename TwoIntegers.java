/**
 * TwoIntegers - Homework 2 - A program which shows how you can manipulate user entered 
 * numbers and do calculations on them and prints out the returned calculations.
 *
 * @author Andrew Albanese
 * @version 2016-01-26
 * Help - My dad helped me through it and helped me find out how to use the math class.
 */
import java.util.Scanner;

public class TwoIntegers
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);

        System.out.println("\nThis program will perform various calculations on two integers.");
        System.out.println("Submitted By Andrew Albanese\n");
        System.out.print("Enter the first integer: ");
        int inputNumber1 = in.nextInt();
        System.out.print("Enter the second integer: ");
        int inputNumber2 = in.nextInt();

        //start doing calculations
        int sum = inputNumber1 + inputNumber2;
        int difference = inputNumber1 - inputNumber2;
        int product = inputNumber1 * inputNumber2;
        double average = (inputNumber1 + inputNumber2)/2;
        int distance = Math.abs(difference);
        int max = Math.max(inputNumber1, inputNumber2);
        int min = Math.min(inputNumber1, inputNumber2); 

        //int distance = (difference<0) ?  difference*-1 : difference;
        String oStr = String.format("%8s",sum);
        System.out.println("\nSum: \t\t" + oStr);

        oStr = String.format("%8s",difference);
        System.out.println("Difference: \t" + oStr);

        oStr = String.format("%8s",product);
        System.out.println("Product: \t" + oStr);

        oStr = String.format("%10s",average);
        System.out.println("Average: \t" + oStr);

        oStr = String.format("%8s",distance);
        System.out.println("Distance: \t" + oStr);

        oStr = String.format("%8s",max);
        System.out.println("Maximum: \t" + oStr);

        oStr = String.format("%8s",min);
        System.out.println("Minimum: \t" + oStr + "\n");
    }
}