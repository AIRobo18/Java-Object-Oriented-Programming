/**
 * Created by robert.aroutiounian3 on 2/23/2015.
 */

import java.util.Scanner;

public class SquareRoot
{
    public static void main(String[] args)
    {
        // with do-while loop keep prompting the user for input for as long as the given number is NOT greater than 10.0 (see example 6.13)
        // calculate the first square root of the given number (prime read)
        // with a while loop (see example 6.1):
            // increment the square roots counter
            // print the running count followed by the square root value
            // calculate the next square root (for example squareRoot = Math.sqrt(squareRoot);)
        // print the final results

        Scanner scan = new Scanner(System.in);
        final double MAX_NUMBER = 10.0;
        final double FINAL_VALUE = 1.01;

        double number;
        do
        {
            System.out.print("Please enter a number greater than " + MAX_NUMBER + " > ");
            number = scan.nextDouble();
        } while (number < MAX_NUMBER);

        double squareRoot = Math.sqrt(number);
        int counter = 0;
        while (squareRoot > FINAL_VALUE)
        {
            counter++;
            System.out.println(counter + ". The square root is : " + squareRoot);
            squareRoot = Math.sqrt(squareRoot);
        }

        System.out.println("Your number " + number + " took " + counter + " times to square root"
                            + " to get it greater than or equal to " + FINAL_VALUE);
    }
}