// Coordinates
// Robert Aroutiounian
//

import java.awt.Point;
import java.util.Scanner;

public class Coordinates
{
  public static void main( String [] args )
  {
    
    
    Scanner scanner = new Scanner( System.in);
    int firstX;
    int firstY;
    int secondX;
    int secondY;
    
    System.out.println( "Enter your x value for the first point");
    firstX = scanner.nextInt();
    System.out.println("Enter your y value for the first point");
    firstY = scanner.nextInt();
    Point firstPoint= new Point(firstX,firstY );
    
    System.out.println( "Enter your x value for the second point");
    secondX = scanner.nextInt();
    System.out.println("Enter your y value for the second point");
    secondY = scanner.nextInt();
    Point secondPoint= new Point(secondX,secondY);
    
    System.out.println( "Coordinates for first point: " + firstPoint.getX()
                         + " , " + firstPoint.getY() );
    
    System.out.println( "Coordinates for second point: " + secondPoint.getX()
                         + " , " + secondPoint.getY() );
  }
}