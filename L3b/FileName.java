// FileName
// Robert Aroutiounian
//

import java.util.Scanner;

public class FileName
{
   public static void main( String [] args )
   {
     Scanner scan = new Scanner( System.in );
     
     System.out.println( "Please enter a file name and remember to include the file extension as well: " );
     String fileName = scan.next( );
     int fileLen = fileName.length( );
     int dot = fileName.indexOf( "." );
     String fileExtension = fileName.substring( (dot + 1), fileLen);
     System.out.println( "You have inputted the following file: " + fileName
                          + "\nThe extension of your file input is: " + fileExtension );
   }
}