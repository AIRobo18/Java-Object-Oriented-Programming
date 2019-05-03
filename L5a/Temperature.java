// Temperature
// Robert Aroutiounian
// Based on inputted integar, program will guess whether

import java.util.Scanner;

public class Temperature
{
   public static void main( String [] args )
   {
     Scanner scan = new Scanner ( System.in );
     
     System.out.println( "Please tell me the temperature > " );
     int temp = scan.nextInt();
     String message = "";
     
     if ( temp > 110 || temp < (-5) )
     {
       message = "The temperatute " + temp + " is out of range.";
     }
     else if( temp >= 90 )
     {
       message = "The temperature outside is " + temp
                  + ", and based on that, it is probably summer.";
     }
     else if( temp >= 70 && temp < 90 )
     {
       message = "The temperature outside is " + temp
                 + ", and based on that, it is probably spring.";
     }
     else if( temp >= 50 && temp < 70 )
     {
       message = "The temperature outside is " + temp
                  + ", and based on that, it is probably fall.";
     }
     else if ( temp < 50 )
     {
       message = "The temperature outside is " + temp
                  + ", and based on that, it is probably winter.";
     }
     
     System.out.println( message );
   }
}