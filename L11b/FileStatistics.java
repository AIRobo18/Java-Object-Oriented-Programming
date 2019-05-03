import java.io.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.InputMismatchException;
import java.util.Scanner;
import java.io.Serializable;

/**
 * Created by robert.aroutiounian3 on 4/27/2015.
 */
public class FileStatistics implements Serializable
{
    private ArrayList<Integer> grades;
    private static final int MIN_GRADE_FOR_A = 90;
    private static final int MIN_GRADE_FOR_B = 80;
    private static final int MIN_GRADE_FOR_C = 70;
    private static final int MIN_GRADE_FOR_D = 60;

    public FileStatistics(Scanner file)
    {
        this.grades = new ArrayList<Integer>();
        while (file.hasNext())
        {
            try
            {
                int intRead = file.nextInt();

                this.grades.add(intRead);
                System.out.println(intRead);
            }
            catch (InputMismatchException ime)
            {
                System.out.println("The input line " + file.nextLine() + " is not an integer - ignored");
            }
            catch (Exception e)
            {
                System.out.println("Error: " + e.getMessage());
            }
        }
    }

    public double gradeAverage()
    {
        int count = 0;
        int overall = 0;
        for (int i = 0; i < this.grades.size(); i++)
        {
            count++;
            overall += this.grades.get(i);
        }
        double average = (double)overall/count;
        return average;
    }

    public double passRate()
    {
        int count = 0;
        for (int i = 0; i < this.grades.size(); i++)
        {
            if (this.grades.get(i) > MIN_GRADE_FOR_D)
            {
                count++;
            }
        }
        double pass = (double)count/this.grades.size();
        return pass;
    }

    public int highestGrade()
    {
        int highest = this.grades.get(0);
        for (int i = 1; i < this.grades.size(); i++)
        {
            if (this.grades.get(i) > highest)
            {
                highest = this.grades.get(i);
            }
        }
        return highest;
    }

    public char[] getLetterGrades()
    {
        char[] letterGrade = new char[this.grades.size()];
        int score;
        for (int i = 0; i < this.grades.size(); i++)
        {
            score = this.grades.get(i);
            if (score >= MIN_GRADE_FOR_A)
            {
                letterGrade[i] = 'A';
            }
            else if (score < MIN_GRADE_FOR_A && score >= MIN_GRADE_FOR_B)
            {
                letterGrade[i] = 'B';
            }
            else if (score < MIN_GRADE_FOR_B && score >= MIN_GRADE_FOR_C)
            {
                letterGrade[i] = 'C';
            }
            else if (score < MIN_GRADE_FOR_C && score >= MIN_GRADE_FOR_D)
            {
                letterGrade[i] = 'D';
            }
            else
            {
                letterGrade[i] = 'F';
            }
        }
        return letterGrade;
    }

    public ArrayList<Integer> getGrades()
    {
        ArrayList<Integer> copy = new ArrayList<Integer>();
        for (int i = 0; i < this.grades.size(); i++)
        {
            copy.add(this.grades.get(i));
        }
        return copy;
    }

    public void saveGradesInFile()
    {
        try
        {
            FileOutputStream fis = new FileOutputStream("savedGrades.dat", false);
            ObjectOutputStream oos = new ObjectOutputStream(fis);

            oos.writeObject(this.grades);
            System.out.println("Saved grades in \"savedGrades.dat\" file");
            oos.close();
        }
        catch (FileNotFoundException fnfe)
        {
            System.out.println("Unable to find objects");
        }
        catch (IOException ioe)
        {
            ioe.printStackTrace();
        }
    }

    public void displaySavedGrades()
    {
        try
        {
            FileInputStream fis = new FileInputStream("savedGrades.dat");
            ObjectInputStream ois = new ObjectInputStream(fis);

            try
            {
                System.out.print("The grades are:");
                while (true)
                {
                    ArrayList<Integer> temp = (ArrayList<Integer>)ois.readObject();
                    System.out.println(temp);
                }
            }
            catch (EOFException eofe)
            {
                System.out.println("End of the file \"savedGrades.dat\" reached");
            }
            finally
            {
                System.out.println("Closing file");
                ois.close();
            }
        }
        catch (ClassNotFoundException cnfe)
        {
            System.out.println(cnfe.getMessage());
        }
        catch (FileNotFoundException fnfe)
        {
            System.out.println("Unable to find objects");
        }
        catch (IOException ioe)
        {
            ioe.printStackTrace();
        }
    }

    public String toString()
    {
        int count = 0;
        for (Integer gradesCounts : this.grades)
        {
            count++;
        }
        return "There are " + count + " grades";
    }
}
