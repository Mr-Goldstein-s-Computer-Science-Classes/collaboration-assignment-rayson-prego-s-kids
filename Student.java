import java.util.ArrayList;

public class Student
{
    private String name;
    private ArrayList<String> assignments;

    private double grade;

    public Student(String name)
    {
        this.name = name;
        this.assignments = new ArrayList<String>();
    }

    public void addAssignment(String assignName)
    {
        assignments.add(assignName);
    }

    public void gradeAssignment(String assignment, double grade)
    {

    }

    public double getGrade()
    {
        return grade;
    }

    public void setGrade(double grade)
    {
        this.grade = grade;
    }
}
