// Chapter 3 Programming Activity 2
//   Calling class methods
//   Robert Aroutiounian
//

// ***** 
// 1. add your import statements here
import java.util.Scanner;
import java.text.DecimalFormat;
import java.util.Random;

public class PracticeMethods1
{
  public static void main( String [] args )
  {
    //*****
    // 2.  a. Create a Scanner object to read from the keyboard
    //     b. Prompt the user for his/her first name
    //     c. Print a message that says hello to the user
    //     d. Print a message that says how many letters
    //               are in the user's name
    
    
    Scanner scan = new Scanner( System.in );
    
    System.out.println( "Enter your first name here > " );
    String firstName = scan.next();
    System.out.println( "Hello " + firstName + ", how are you doing today?" );
    int firstNameLength = firstName.length();
    System.out.println( "By the way, your name consists of " + firstNameLength + " letters." );

    
    //*****
    // 3.  Print an empty line
    
    
    System.out.println();
    
    
    //*****
    // 4.  a. Using previously created Scanner object prompt the user for the year (s)he was born.
    //     b. Calculate and print the age the user will be this year.
    //     c. Declare a constant for average life expectancy,
    //            set its value to 78.74
    //     d. Print a message that tells the user the percentage
    //            of their expected life they've lived.
    //       Use the DecimalFormat class to format the percentage
    DecimalFormat percentPattern = new DecimalFormat( "#0.0%" );
                                                       
    System.out.println( "I know this is a bit rude, but what year were you born? > " );
    int year = scan.nextInt();
    final int CURRENT_YEAR = 2015;
    int age = CURRENT_YEAR - year;
    final double LIFE_EXPECTANCY = 78.74;
    double lifeExpectancy = age/LIFE_EXPECTANCY;
    System.out.println( "Based on your birth year you are " + age + " years old."
                        + "\n Also your life expectancy is " + percentPattern.format( lifeExpectancy ) );
    
    
    //*****
    // 5.  a. Create a Random object
    //             and generate a random integer between 1 and 20 inclusive
    //     b. Using previously created Scanner object prompt the user for a guess.
    //     c. Print a message that tells the user the number
    //         and how far from the number the guess was (hint: use Math.abs)
    Random random = new Random();
    
    int ranRoll = random.nextInt( 20 ) + 1;
    System.out.println( "\nLet's play a game, guess a number between 1 and 20 > ");
    int guess = scan.nextInt( );
    int far = Math.abs( ranRoll - guess );
    System.out.println( "The number you guessed was: " + guess + ", and you were "
                         + far + " away from the random number." );
  }
}