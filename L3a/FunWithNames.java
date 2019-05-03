// FunWithNames
// Robert Aroutiounian
//

public class FunWithNames
{
   public static void main( String [] args )
   {
     String myFullName = new String( "Robert Aroutiounian" );
     String myFullNameUpper = myFullName.toUpperCase();
     String myFullNameLower = myFullName.toLowerCase();
     System.out.println( "My full name in all upper case is: " + myFullNameUpper + "."
                          + "\nMy full name in all lower case is: " + myFullNameLower + "."
                          + "\nMy full name written regualry is: " + myFullName + "." );
     
     int myFullNameNumChar = myFullName.length();
     System.out.println( "My name is " + myFullName + " and it is " + myFullNameNumChar 
                          + " characters long." );
     
     String myFirstName = myFullName.substring(0,6);
     String myLastName = myFullName.substring(7, myFullNameNumChar);
     System.out.println( "My inverted name is " + myLastName + ", " + myFirstName + "." );
     
     String friendsFullName = "Brandon Huang";
     int friendsFullNameNumChar = friendsFullName.length();
     System.out.println( "My friend's name is " + friendsFullName + ", and it is "
                          + friendsFullNameNumChar + " characters long." );
     
     String friendsFirstName = friendsFullName.substring(0,7);
     String friendsLastName = friendsFullName.substring(8,friendsFullNameNumChar);
     System.out.println( "My friend's inverted name is " + friendsLastName + ", " + friendsFirstName
                          + "." );
     
     char myFullNameFirIni = myFullNameLower.charAt(0);
     char myFullNameLastIni = myFullNameLower.charAt(7);
     String friendsFullNameLower = friendsFullName.toLowerCase();
     char friendsFullNameFirIni = friendsFullNameLower.charAt(0);
     char friendsFullNameLastIni = friendsFullNameLower.charAt(8);
     System.out.println( "" + myFullNameFirIni + myFullNameLastIni + " and "
                         + friendsFullNameFirIni + friendsFullNameLastIni
                         + " are friends." );
   }
}