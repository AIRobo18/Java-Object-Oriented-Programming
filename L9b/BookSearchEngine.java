/* BookSearchEngine class
 Anderson, Franceschi
 */

import java.text.DecimalFormat;
import java.util.*;

public class BookSearchEngine
{
  public static void main( String [] args )
  {
    BookStore bookStore = new BookStore( );
    System.out.println( "\nOur book collection is:" );
    System.out.println( bookStore );
    
    Scanner keyboard = new Scanner(System.in);
    
    System.out.println( "\nSearching titles, enter a keyword" );
    String keyword = keyboard.next();   
    ArrayList<Book> result = bookStore.searchForTitle( keyword.toLowerCase() );    
    System.out.println( "The search results for \"" + keyword
                         + "\" are:" );
    if (result.size() > 0)
    {
      for( Book tempBook : result )
        System.out.println( tempBook );
    }
    else
    {
      System.out.println("No book meeting your search criteria has been found");
    }

    Scanner keyboard2 = new Scanner(System.in);

    System.out.println("\nEnter an author to search each book for");
    String author = keyboard2.next();
    ArrayList<Book> result2 = bookStore.searchForAuthor(author.toLowerCase());
    System.out.println("The search results for " + author + " are:");
    if (result2.size() > 0)
    {
      for (Book tempBook : result2)
      {
        System.out.println(tempBook);
      }
    }
    else
    {
      System.out.println("No book meeting your search criteria has been found");
    }

    Scanner keyboard3 = new Scanner(System.in);
    DecimalFormat money = new DecimalFormat("$#0.00");

    System.out.println("\nEnter a price limit to search each book for");
    int price = keyboard3.nextInt();
    ArrayList<Book> result3 = bookStore.searchPrice(price);
    System.out.println("The search results for books under " + money.format(price) + " are");
    if (result3.size() > 0)
    {
      for (Book tempBook : result3)
      {
        System.out.println(tempBook);
      }
    }
    else
    {
      System.out.println("No book price lower than what you have provided");
    }

    System.out.println("\nThe book in the library with the lowest price is: " + bookStore.lowestPrice());
  }
}
