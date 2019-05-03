// Circle
// Robert Aroutiounian
//

import java.text.DecimalFormat;

public class Circle
{
   public static void main( String [] args )
   {
     DecimalFormat resultPattern = new DecimalFormat( "#.00");
     
     final double POWER = 2;
     double radius = 7;
     double area = Math.PI * Math.pow( radius, POWER );
     System.out.println( "The radius of the circle is: " + radius
                          + ", and knowing that we can solve for area, which is: "
                          + resultPattern.format( area ) );
     
     final double PERIMETER_MULTIPLICATION = 2;
     double perimeter = PERIMETER_MULTIPLICATION * Math.PI * radius;
     System.out.println( "The radius of the circle is: " + radius
                          + ", and knowing that we can solve for the perimeter: "
                          + resultPattern.format( perimeter ) );
   }
}