/* SavingsAccount class
   Anderson, Franceschi
*/


import java.text.DecimalFormat;

// 1. ***** indicate that SavingsAccount inherits
   //          from BankAccount
public class SavingsAccount extends BankAccount
{
   public final double DEFAULT_RATE = .03;
   public final DecimalFormat INTEREST_RATE = new DecimalFormat("#0%");
   // 2. ****** define the private interestRate instance variable
   // interestRate, a double, represents an annual rate
   private double interestRate;
   
   // 3 ***** write the default constructor
   /** default constructor
   *   explicitly calls the BankAccount default constructor
   *   set interestRate to default value DEFAULT_RATE
   *   print a message to System.out indicating that
   *    constructor is called
   */

   public SavingsAccount()
   {
      super();
      this.interestRate = this.DEFAULT_RATE;
      System.out.println("Default constructor has been called.");
   }
   // 4 ***** write the overloaded constructor
   /** overloaded constructor
   *   explicitly call BankAccount overloaded constructor
   *   call setInterestRate method, passing startInterestRate
   *   print a message to System.out indicating that
   *    constructor is called
   *  @param  startBalance      starting balance
   *  @param  startInterestRate starting interest rate
   */

   public SavingsAccount(double startBalance, double startInterestRate)
   {
      super(startBalance);
      setInterestRate(startInterestRate);
   }

   // 5 ****** write the accessor method:
   /** accessor method for interestRate
   *  @return  interestRate
   */

   public double getInterestRate()
   {
      return this.interestRate;
   }

   // 6 ****** write the mutator method:
   /** mutator method for interestRate
   *  @param  newInterestRate new value for interestRate
   *          newInterestRate must be >= 0.0
   *            if not, print an error message
   */
   
   public void setInterestRate(double newInterestRate)
   {
      if (newInterestRate >= 0.0)
      {
         this.interestRate = newInterestRate;
      }
      else
      {
         System.err.println("Interest rate cannot be negative");
      }
   }
   
   // 7 ****** write this business method:
   /** applyInterest method, no parameters, void return value
   *  call deposit method, passing a month's worth of interest
   *  remember that interestRate instance variable is annual rate
   */

   public void applyInterest()
   {
      final int MONTHLY_INTEREST = 12;
      deposit((this.interestRate/MONTHLY_INTEREST)*getBalance());
   }

   // 8 *****  write this method
   /* toString method
   *  @return String containing formatted balance and interestRate
   *    invokes superclass toString to format balance
   *    formats interestRate as percent using a DecimalFormat object 
   */

   public String toString()
   {
      return super.toString()
              + "; interest rate is: " + this.INTEREST_RATE.format(this.interestRate);
   }
}
