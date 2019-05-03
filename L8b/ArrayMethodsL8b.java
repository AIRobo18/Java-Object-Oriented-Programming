/**  Supporting methods for an integer array
  *   @author Robert Aroutiounian
  *   @version 3/17/2014
  */

public class ArrayMethodsL8b
{
  /**
   * instance variable array of ints
   */ 
  private int [] intArray;
  
  /**
   * secondary constructor, 
   * the instance variable intArray will be a copy of the array created by the user
   */
  public ArrayMethodsL8b(int [] newArray)
  {
    setIntArray(newArray);
  }
  
  /**
   * accessor method, 
   * returns a copy of the instance variable intArray
   */
  public int [] getIntArray()
  {
    // instantiate array with the same length as the parameter
    int[] copy = new int [this.intArray.length];
    for (int i = 0; i < this.intArray.length; i++)
    {
      copy[i] = this.intArray[i];
    }
    return copy;
  }
  
  /**
   * returns the length of the instance variable intArray
   */
  public int getLength()
  {
    return this.intArray.length;
  }
  
  /**
   * mutator method, 
   * the instance variable intArray will be a copy of the array passed by the user
   */
  public void setIntArray(int[] newArray)
  {
    // instantiate array with the same length as the parameter
    this.intArray = new int [newArray.length];
    for (int i = 0; i < newArray.length; i++)
    {
      this.intArray[i] = newArray[i];
    }
  }
  
  /**
   * equals method
   * checks if the array in this object is the same as the array in the other object
   * if the lengths are not the same returns false right away
   * otherwise compares the elements until either the first not the equal pair is found
   *    or there are no more elements to compare
   */
  public boolean equals (ArrayMethodsL8b other)
  {
    boolean isEqual = true;
    if ( this.intArray.length != other.intArray.length )
    {
      isEqual = false; // arrays are not the same size
    }
    else
    {
      for ( int i = 0; i < this.intArray.length && isEqual; i++ )
      {
        if ( this.intArray[i] != other.intArray[i] )
        {
          // found the first pair that is not the same
          // no need to compare any further
          isEqual = false; 
        }
      }
    }
    return isEqual;
  }
  
  /**
   * toString method returns printable version
   * of the content of intArray
   */
  public String toString()
  {
    String returnValue = "";
    for ( int i = 0; i < this.intArray.length; i++ )
    {
      returnValue += this.intArray[i] + " ";
    }
    return returnValue += "\n";
  }
  
  // *** BUSINESS METHODS *** //
  
  /**
   * "business" method that calculates product
   * of all the integers in the array
   * @return an integer - value of the product
   */
  public int arrayProduct()
  {
    int product = this.intArray[0];
    for ( int i = 1; i < this.intArray.length; i++ )
    {
      product *= this.intArray[i];
    }
    return product;
  }
  
  /**
   * "business" method that swaps elements if necessary
   *                   and calculates the numbers of swaps
   * @return an integer - value of the product the number of swaps performed
   */
  public int calculateSwaps()
  {
  
    //STEP 1
    // in a for loop compare elements pairwise: first with last; second with the second last; etc
    //   if the element at the lower index is greater that the element in the higher index swap them
    // remember to count the number of swaps

    int count = 0;

    for (int i = 0; i < (this.intArray.length/2); i++)
    {
      int temp = this.intArray[i];

      if (temp > this.intArray[(this.intArray.length - 1) - i])
      {
        this.intArray[i] = this.intArray[(this.intArray.length - 1) - i];
        this.intArray[(this.intArray.length - 1) - i] = temp;
        count++;
      }
    }
    
    return count; // THIS IS A STUB
  }
  
  /**
   * "business" method that reverses the order of elements in the intArray
   *    i.e. if the elements were 11 22 33 44 55 the method will change the order to 55 44 33 22 11
   *
   */
  public void reverse()
  {
    // STEP 2
    // in a for loop change the order of elements by swapping first with last; 
    //                             second with the second last; etc
    // 
    
    for (int i = 0; i < (this.intArray.length/2); i++)
    {
      int temp = this.intArray[i];
      this.intArray[i] = this.intArray[(this.intArray.length - 1) - i];
      this.intArray[((this.intArray.length - 1) - i)] = temp;
    }
    
  }
  
  /**
   * "business" method that searches intArray to see if it contains the number
   *    
   * @return index of the element that is the same as the number
   *         or -1 if not found
   */
  public int searchForNumber(int number)
  {
    // STEP 9
    // in a for loop check for an element that is the same as the number
    // stop the search as soon as such element is found.
    // IMPORTANT: no return from the loop please, have appropriate
    //            compound boolean condition that will stop the loop when needed
    //

    boolean search = false;
    int i;

    for ( i = 0; i < this.intArray.length && search == false; i++)
    {

      if (intArray[i] == number)
      {
        search = true;
      }
    }
    
    return i; // THIS IS A STUB
  }
}