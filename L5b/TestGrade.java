// TestGrade
// Robert Aroutiounian
//

import java.util.Scanner;

public class TestGrade
{
   public static void main( String [] args )
   {
     Scanner scan = new Scanner( System.in );
     final int MIN = 0;
     final int MAX = 100;
     
     System.out.println( "Please enter the score you recieved on your test (0-100) > ");
     int score = scan.nextInt();
     
     if ( score > MAX || score < MIN )
     {
       System.out.println( "Your input was not valid, please a number between 0-100." );
     }
     else
     {
       int caseNum = score/10;
       char letterMessage;
       
       switch( caseNum )
       {
         case 0:
         case 1:
         case 2:
         case 3:
         case 4:
         case 5:
           letterMessage = 'F';
           break;
         case 6:
           letterMessage = 'D';
           break;
         case 7:
           letterMessage = 'C';
           break;
         case 8:
           letterMessage = 'B';
           break;
         case 9:
         case 10:
           letterMessage = 'A';
           break;
         default:
           letterMessage = 'F';
       }
       
       System.out.println( "Your percentage is " + score
                           + ", and based on this, your letter grade is: " + letterMessage );
     }
   }
}