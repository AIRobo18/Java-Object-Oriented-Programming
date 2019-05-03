// Chapter 3 Programming Activity 2
//   Calling class methods
//   Robert Aroutiounian
//

import java.util.*;
import java.util.Scanner;

public class PracticeMethods2
{
    public static void main( String [] args )
    {
        // The GregorianCalendar class is included in java.util package.
        // It describes a point in time, as measured by the Gregorian calendar - the standard calendar
        // that is commonly used throughout the world today.
        //
        // You construct a GregorianCalendar object from a year, month, and a day of the month, like this:
                GregorianCalendar myDate = new GregorianCalendar(); // Today's date
        //        GregorianCalendar independenceDay = new GregorianCalendar(1776, Calendar.JULY, 4);
        //
        // Use the values Calendar.JANUARY, ... , Calendar.DECEMBER to specify the month
        //
        // The add method can be used to add a number of days to a GregorianCalendar object:
        //        myDate.add(Calendar.DAY_OF_MONTH, 10); // now myDate is ten days from today
        // note that add is a mutator method - it changes the myDate object
        //
        // The get method can be used to query a given GregorianCalendar object:
        //
        //        int dayOfMonth = myDate.get(Calendar.DAY_OF_MONTH);
        //        int month = myDate.get(Calendar.MONTH);
        //        int year = myDate.get(Calendar.YEAR);
        //        int weekday = myDate.get(Calendar.DAY_OF_WEEK); // 1 is Sunday, 2 is Monday, ... , 7 is Saturday

        // ****
        // Go to java API http://docs.oracle.com/javase/8/docs/api/ and locate documentation for the GregorianCalendar class
        // Go over the description of the class, do you have any questions?
        // Explore the available constructors, do you have any questions?
        // Explore the available methods, do you have any questions? 
        //
        // Now write a program that prints:
        // 1. the weekday of your birthday
      GregorianCalendar newcalendar = new GregorianCalendar(1996, Calendar.JANUARY, 1);
      
      int weekday = newcalendar.get(Calendar.DAY_OF_WEEK);
      System.out.println( "My birthday in Gregorian calendar is: " + weekday );

        // 2. the date that is 10,000 days from your birthday
      
      newcalendar.add(Calendar.DAY_OF_MONTH, 10000);
      int weekday2 = newcalendar.get(Calendar.DAY_OF_MONTH);
      System.out.println( "10,000 days from my weekday is: " + weekday2 );

        // 3. the date and weekday that is a given number of days from today. Use Scanner to get the
        //    number of days from the user
      Scanner scanner = new Scanner( System.in );
      
      System.out.println( "Enter number of days: ");
      int inputDay = scanner.nextInt();
      myDate.add(Calendar.DAY_OF_MONTH, inputDay);
      System.out.println( "The date after your input number is: " + myDate.get(Calendar.MONTH) + "/"
                           + myDate.get(Calendar.DAY_OF_MONTH) + "/" + myDate.get(Calendar.YEAR) );

        //
        // HINT: The GregorianCalendar class is complex, and it is a really good idea to explore the API
        //       before tackling the whole problem.
        //       Implement one step at a time, compile and test it before moving to the next step
    }
}
