// RandomFive
// Robert Aroutiounian
//

import java.util.Random;

public class RandomFive
{
   public static void main( String [] args )
   {
     Random random5 = new Random( );
     
     int start = 60, end = 100;
     int random1Pick = random5.nextInt( end - start + 1 ) + start;
     int random2Pick = random5.nextInt( end - start + 1 ) + start;
     int random3Pick = random5.nextInt( end - start + 1 ) + start;
     int random4Pick = random5.nextInt( end - start + 1 ) + start;
     int random5Pick = random5.nextInt( end - start + 1 ) + start;
     int min12 = Math.min ( random1Pick, random2Pick);
     int min3 = Math.min ( min12, random3Pick);
     int min4 = Math.min ( min3, random4Pick);
     int min5 = Math.min ( min4, random5Pick);
     System.out.println( "The five random numbers generated between 60 and 100 are: "
                          + random1Pick + ", " + random2Pick + ", " + random3Pick
                          + ", " + random4Pick + ", and " + random5Pick + "."
                          + " \nThe smallest of these five numbers is: "
                          + min5 + "." );
   }
}