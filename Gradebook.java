import java.util.ArrayList;
public class Gradebook{

    private ArrayList<Student> students;

    private int index;

    private ArrayList<String> assignmentsName;

    private ArrayList<Double> assignmentGrades;






    public Gradebook()
    {
    this.assignmentGrades = new ArrayList<Double>();
    this.students = new ArrayList<Student>();
    this.assignmentsName = new ArrayList<String>();
    }




    public void createStudent(String name)
    {
        Student student = new Student(name);
        students.add(student);
    }
    public void addAssignments(String assignment){
        assignmentsName.add(assignment);

    }

    public void gradeAssignment(String assignment, String studentName, double grade)
    {
        Student student = new Student(studentName);
        if(student != null && assignmentsName.contains(assignment))
        {
           student.gradeAssignment(assignment, grade);
        }
    }


    public Double getAverageGrade(String assignment)
    {
        Double totalGrade = 0.0;
        int assignmentCount = 0;

        for(Student students : students)
        {
            double grade = students.getAssignmentGrade(assignment);
            totalGrade += grade;
            assignmentCount++;
        }
        return totalGrade/assignmentCount;
    }


    public Double getAverageGradeOverall()
    {
        Double totalGrade = 0.0;
        int studentCount = 0;

        for(Student student : students)
        {
            totalGrade += student.getOverallGrade();
            if(student.getOverallGrade() > 0)
                studentCount++;
        }
        return totalGrade;
    }

    public Double getMinimumGrade(String assignment)
    {
        double minimumGrade = 100.0;
        for(Student student: students)
        {
            if(student.getAssignmentGrade(assignment) < minimumGrade)
            {
                minimumGrade = student.getAssignmentGrade(assignment);
            }
        }
        return minimumGrade;
    }

    public Double getMaximumGrade(String assignment)
    {
        double maximumGrade = 0.0;
        for(Student student: students)
        {
            if(student.getAssignmentGrade(assignment) > maximumGrade)
            {
                maximumGrade = student.getAssignmentGrade(assignment);
            }
        }
        return maximumGrade;
    }
    
    public Double getMinimumGradeOverall()
    {
        return null;
    }
    public Double getMaximumGradeOverall()
    {
        return null;
    }

}
