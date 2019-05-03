/* Divider
*  Handling multiple exceptions
*  Anderson, Franceschi
*/

import java.util.*;

public class Divider
{
  public static void main( String [] args )
  {
    // declare and initialize variables
    int divisor = 0;
    int quotient = 0;
    int dividend = 100;

    // initialize flag variable
    boolean goodInput = false;
    Scanner keyboard = new Scanner(System.in);

    do
    {
      System.out.println("Enter an integer divisor");
      try
      {
        divisor = keyboard.nextInt();

        // attempt the division
        quotient = dividend / divisor;

        goodInput = true;
      }
      catch ( InputMismatchException ime )
      {
        System.out.println( keyboard.nextLine() + " is not an integer. ");
      }
      catch ( ArithmeticException ae )
      {
        System.out.println("Divisor cannot be 0. ");
      }
      catch ( Exception e )
      {
        System.out.println("Error: " + e.getMessage());
      }
    } while ( !goodInput );

    System.out.println("The result is " + quotient );
  }
}
