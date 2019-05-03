/**
 * Created by Robert Aroutiounian on 4/26/2015.
 */
import java.io.File;
import java.io.FileNotFoundException;

import java.io.FileOutputStream;
import java.io.PrintWriter;
import java.util.Scanner;
import java.util.InputMismatchException;
import java.util.ArrayList;

public class ProcessStudents
{
    public static void main(String[] args)
    {
        ArrayList<StudentRecord> listOfStudents = new ArrayList<StudentRecord>();

        try
        {
            Scanner file = new Scanner(new File("studentsInput.txt"));
            System.out.println("Reading data from studentsInput.txt");

            while (file.hasNext())
            {
                String stringRead = file.nextLine();
                System.out.println("processing record: " + stringRead);

                Scanner parse = new Scanner(stringRead);
                parse.useDelimiter("&");
                String studentName = parse.next();
                String studentId = parse.next();
                String studentPass = parse.next();

                try
                {
                    double gpa = parse.nextDouble();

                    StudentRecord stTemp = new StudentRecord(studentName, studentId, studentPass, gpa);

                    listOfStudents.add(stTemp);
                } catch (InputMismatchException ime)
                {
                    System.out.println(">>>>>>>>>Error in student record: " + stringRead + "; record ignored<<<<<<<<<<");
                }
                catch ( Exception e)
                {
                    System.out.println(">>>>>>>>>Error in student record: " + stringRead + "; record ignored<<<<<<<<<<");
                }
            }
            file.close();
        }
        catch (FileNotFoundException fnfe)
        {
            System.out.println("Unable to find studentsInput.txt");
        }
        catch (Exception e)
        {
            e.printStackTrace();
        }
        System.out.println("\nFinished reading the file studentsInput.txt"
                + "\nThe size of the ArrayList of StudentRecords is: " + listOfStudents.size());

        System.out.println("\nThe student records:");
        for (StudentRecord student : listOfStudents)
        {
            System.out.println(student.toSting());
        }

        try
        {
            FileOutputStream fos = new FileOutputStream("studentsOutput.txt", false);

            PrintWriter pw = new PrintWriter(fos);

            for (StudentRecord student2 : listOfStudents)
            {
                pw.println(student2.toSting());
            }
            pw.close();
        }
        catch (FileNotFoundException fnfe)
        {
            System.out.println("Unable to find studentsOutput.txt");
        }
    }
}
