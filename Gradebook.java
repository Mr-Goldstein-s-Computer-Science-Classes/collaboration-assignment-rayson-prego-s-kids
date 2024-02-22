import java.util.ArrayList;
public class Gradebook{
    private double averageGradeOverall;
    private double minimumGradeOverall;
    private double maximumGradeOverall ;
    private ArrayList<String> assignments;
    private ArrayList<Student> students;

    private int index;

    private ArrayList<String> gradedAssignmentsName;

    private ArrayList<Double> gradedAssignments;

    private ArrayList<String> studentsName;




    public Gradebook(double averageGradeOverall, double minimumGradeOverall, double maximumGradeOverall){
    this.assignments = new ArrayList<String>();
    this.students = new ArrayList<Student>();
    this.averageGradeOverall = averageGradeOverall;
    this.minimumGradeOverall = minimumGradeOverall;
    this.maximumGradeOverall = maximumGradeOverall;

    }//default constructor

    public Gradebook()


    public void createStudent(String name){
        Student student = new Student(name);
        students.add(student);
    }
    public void addAssignments(String assignment){
        assignments.add(assignment);

    }

    public void gradeAssignment(String assignment, String studentName, double grade){
        if(assignments.contains(assignment)){
            gradedAssignmentsName.add(assignment);
            gradedAssignments.add(grade);
            studentsName.add(studentName);
        }
    }


    public Double getAverageGrade(String assignment) {


        int index = gradedAssignmentsName.indexOf(assignment);

        return gradedAssignments.get(index);
    }

    public
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
