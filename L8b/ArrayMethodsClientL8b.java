/**   Lab8b
  *   @author Robert Aroutiounian
  *   @version 3/17/2014
  */
import java.util.*;
public class ArrayMethodsClientL8b
{ 
  public static void main( String [] args )
  {
    // declare and initialize array of integers in ascending order
    int [] intNumbersSortedA = { 1, 2, 3, 4, 5, 6 };
    
    // STEP 5 
    // declare and initialize an array with 10 randomly generated 
    //     numbers between 1 and 9
    int [] ranArr = new int[10];
    Random ranNum = new Random();
    final int MIN = 1;
    final int MAX = 9;

    for (int i = 0; i < 10; i++)
    {
      ranArr[i] = ranNum.nextInt(MAX - MIN + 1) + MIN;
    }
    
    // create an ArrayMethodsL8b object - passing the intNumbersSortedA array as the argument
    System.out.println("--->calling secondary constructor");
    ArrayMethodsL8b arr = new ArrayMethodsL8b(intNumbersSortedA);
    
    // print the content of the array
    System.out.println( "The elements of the array sorted in ascending order are: " + arr.toString());
    
    // print the value of the product calculated  by the method arrayProduct
    System.out.println( "The product of all elements in the array is: "
                         + arr.arrayProduct() );
    // calculate number of swaps
    System.out.println("The number of swaps was " + arr.calculateSwaps()); 
    System.out.println("The array after swaps is: " + arr.toString());
    
    // STEP 3    
    // call reverse method
    System.out.println("--->calling reverse method");
    arr.reverse();
    
    // STEP 4
    // print the content of the array

    System.out.println("The elements of the array sorted in descending order are: " + arr);
    // print the value of the product calculated  by the method arrayProduct

    System.out.println("The product of all elements in the array is: " + arr.arrayProduct());
    // calculate number of swaps

    System.out.println("The number of swaps was " + arr.calculateSwaps());
    System.out.println("The array after swaps is: " + arr.toString());


    // STEP 6
    // call mutator method to change the array in arr object to the one that contains random numbers
    System.out.println("---> calling mutator method");
    arr.setIntArray(ranArr);
    
    // STEP 7
    // print the content of the array

    System.out.println("The elements of the array are: " + arr);

    // print the value of the product calculated  by the method arrayProduct

    System.out.println("The product of all the elements in the array is: " + arr.arrayProduct());

    // calculate number of swaps

    System.out.println("The number of swaps was " + arr.calculateSwaps());
    System.out.println("The array after swaps is: " + arr.toString());
    
    // STEP 8
    // prompt the user for a number to search for
    Scanner scan = new Scanner(System.in);

    System.out.println("\nEnter the number to search for > ");
    int num = scan.nextInt();

    // STEP 10
    // call searchForNumber method and print either the position of the
    // searched for value or not found message

    int search = arr.searchForNumber(num);

    if (search < 10)
    {
      System.out.println("The number " + num + " was found at index " + search);
    }
    else
    {
      System.out.println("The number " + num + " was not found");
    }
  }
}
