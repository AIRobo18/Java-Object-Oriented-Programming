import java.text.DecimalFormat;

/**
 * Created by Robert Aroutiounian on 4/26/2015.
 */
public class StudentRecord
{
    private static final DecimalFormat GPA = new DecimalFormat("0.00");
    private String name;
    private String id;
    private String password;
    private double gpa;

    public StudentRecord(String newName, String newId, String newPassword, double newGpa)
    {
        this.name = newName;
        this.id = newId;
        this.password = newPassword;
        this.gpa = newGpa;
    }

    public String toSting()
    {
        return "Name: " + this.name
                + "; id: " + this.id
                + "; password: " + this.password
                + "; gpa: " + GPA.format(this.gpa);
    }
}
