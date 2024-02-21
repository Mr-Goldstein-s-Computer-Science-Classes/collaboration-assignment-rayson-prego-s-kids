import java.util.ArrayList;
public class Gradebook {
    private double averageGradeOverall;
    private double minimumGradeOverall;
    private double maximumGradeOverall;
    public ArrayList<String> assignments;
    public ArrayList<Student> students;
    public Gradebook(double averageGradeOverall, double minimumGradeOverall, double maximumGradeOverall){
    this.assignments = new ArrayList<String>();
    this.students = new ArrayList<Student>();
    this.averageGradeOverall = averageGradeOverall;
    this.minimumGradeOverall = minimumGradeOverall;
    this.maximumGradeOverall = maximumGradeOverall;

    }//default constructor


    public void createStudent(String name){
        Student student = new Student(name);
        students.add(student);
    }
    public void addAssignments(String assignment){
        assignments.add(assignment);
    }

    public void gradeAssignment(String assignment, String studentName, double grade){
        
    }

    public double getAverageGradeOverall(){
        return averageGradeOverall;
    }
    public double getMinimumGradeOverall(){
        return minimumGradeOverall;
    }
    public double getMaximumGradeOverall(){
        return maximumGradeOverall;
    }



}
