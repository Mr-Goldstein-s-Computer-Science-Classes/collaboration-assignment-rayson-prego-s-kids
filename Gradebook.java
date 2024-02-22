import java.util.ArrayList;
public class Gradebook{
    private double averageGradeOverall;
    private double minimumGradeOverall;
    private double maximumGradeOverall ;
    private ArrayList<String> assignments;
    private ArrayList<Student> students;

    private int index;

    private ArrayList<String> assignmentsName;

    private ArrayList<Double> assignmentGrades;






    public Gradebook(double averageGradeOverall, double minimumGradeOverall, double maximumGradeOverall){
    this.assignments = new ArrayList<String>();
    this.students = new ArrayList<Student>();
    this.averageGradeOverall = averageGradeOverall;
    this.minimumGradeOverall = minimumGradeOverall;
    this.maximumGradeOverall = maximumGradeOverall;

    }//default constructor

    public Gradebook()
    {

    }


    public void createStudent(String name)
    {
        Student student = new Student(name);
        students.add(student);
    }
    public void addAssignments(String assignment){
        assignments.add(assignment);

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
    
    public double getMinimumGradeOverall()
    {
        return minimumGradeOverall;
    }
    public double getMaximumGradeOverall()
    {
        return maximumGradeOverall;
    }

}
