/**
 * Created by Robert Aroutiounian on 3/1/2015.
 */
import java.util.Scanner;
import java.text.DecimalFormat;

public class Grade
{
    public static void main(String[] args)
    {
//        1)Declare variable minGrade and initialize it to Integer.MAX_VALUE
//        2)Declare variable maxGrade and initialize it to Integer.MIN_VALUE
//        3)Use a for loop to get 5 values. Inside the for loop:
//            1)use a do-while loop to make sure that each entered value is in the correct range.
//            2)calculate requested minimum, maximum, and the running total as the values of grades are entered
//        4)When outside of the for loop calculate the requested average
//        5)Display the results

        Scanner scan = new Scanner(System.in);
        DecimalFormat averagePattern = new DecimalFormat("#0.00");
        final double NUMBER_OF_GRADES = 5;

        int minGrade = Integer.MAX_VALUE;
        int maxGrade = Integer.MIN_VALUE;
        int total = 0;

        for (int i = 1; i <= 5; i++)
        {
            int grade = 0;

            do
            {
                System.out.print("Please enter your exam grade " + i + " > ");
                grade = scan.nextInt();
            } while (!(grade >= 0 && grade <= 100));

            if (grade < minGrade)
            {
                minGrade = grade;
            }

            if (grade > maxGrade)
            {
                maxGrade = grade;
            }

            total += grade;
        }

        double average = (double) total/NUMBER_OF_GRADES;

        System.out.println("The average grade is: " + averagePattern.format(average)
                            + "\nThe minimum grade is: " + minGrade
                            + "\nThe maximum grade is: " + maxGrade);
    }
}
