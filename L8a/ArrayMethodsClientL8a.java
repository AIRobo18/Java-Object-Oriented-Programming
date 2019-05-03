/**   Lab8a
  *   @author Robert Aroutiounian
  *   @version 3/17/2014
  */
import java.util.*;
public class ArrayMethodsClientL8a
{ 
  public static void main( String [] args )
  {
    // declare and initialize array of integers in ascending order
    int [] numbers = { 1, 2, 3, 4, 5, 6 };
    
    // create an ArrayMethods object - passing the array to the object
    ArrayMethodsL8a arr1 = new ArrayMethodsL8a(numbers);
    System.out.println("Created arr1 object with the secondary constructor.");
    
    // print the content of the array
    System.out.println( "---->The elements of the array in arr1 object are: " + arr1);
    
    // print the value of the product calculated  by the method arrayProduct
    System.out.println( "---->The product of all elements in the array is: "
                         + arr1.arrayProduct() );
    
    // create an ArrayMethods object with default constructor
    ArrayMethodsL8a arr2 = new ArrayMethodsL8a();
    System.out.println("\nCreated arr2 object with the default constructor.");
    
    // print the content of the array
    System.out.println( "---->The elements of the array in arr2 object are: " + arr2);
    
    // print the value of the product calculated  by the method arrayProduct
    System.out.println( "---->The product of all elements in the array is: "
                         + arr2.arrayProduct() );
    // print the odd indexed elements 
    System.out.println( "\n---->The odd-indexed elements in arr2 object are:");

    // STUDENT IMPLEMENTS THE FOLLOWING
    // vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv
    
    // call accessor method getIntArray

      int[] accArr1 = arr1.getIntArray();
      int[] accArr2 = arr2.getIntArray();
    
    // using a for loop print the odd-indexed elements of the retrieved array

      String oddArr;

      for (int i = 0; i < arr2.getLength(); i++)
      {
          if (i%2 != 0)
          {
              oddArr = i + ". " + accArr2[i];
              System.out.println(oddArr);
          }
      }

    // ^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^
    
    // print the smallest element 
    System.out.println( "\n---->The smallest element in arr2 object is: "
                         + arr2.findMinimum() );
    
    Scanner scan = new Scanner(System.in);
    System.out.println("\nEnter a value to count the frequency of");
    int value = scan.nextInt();
    // print the frequency of value
    System.out.println( value + " appears " + arr2.countFrequency(value) + " times.");
  }
}
