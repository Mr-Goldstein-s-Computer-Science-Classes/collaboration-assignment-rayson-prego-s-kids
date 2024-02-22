import java.util.ArrayList;

public class Student
{
    private String name;
    private ArrayList<String> assignmentName;
    private ArrayList<Double> assignmentGrades;

    private double grade;

    public Student(String name)
    {
        this.name = name;
        this.assignmentName = new ArrayList<String>();
        this.assignmentGrades = new ArrayList<Double>();
    }

    public void addAssignment(String assignName)
    {
        assignmentName.add(assignName);
        assignmentGrades.add(null);
    }

    public void gradeAssignment(String assignment, double grade)
    {
       int index = assignmentName.indexOf(assignment);
       if(index != -1)
       {
           assignmentGrades.set(index, grade);
       }
    }

    public Double getAssignmentGrade(String assignment)
    {
        int index = assignmentName.indexOf(assignment);
        if(index != -1)
        {
            Double assignmentGrade = assignmentGrades.get(index);
            return assignmentGrade;
        }
        return null;
    }

    public double getOverallGrade()
    {
        double totalGrade = 0.0;
        int numAssignmentsGraded = 0;

        for(Double grade: assignmentGrades)
        {
            if(grade != null)
            {
                totalGrade += grade;
                numAssignmentsGraded++;
            }
        }
        return totalGrade/numAssignmentsGraded;
    }

    public String toString()
    {
        return "Name: " + name + " Average Grade: " + getOverallGrade();
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
