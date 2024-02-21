import java.util.ArrayList;
public class Gradebook {
    double averageGradeOverall;
    double minimumGradeOverall;
    double maximumGradeOverall;
    public ArrayList<String> assignments;
    public Gradebook(double averageGradeOverall, double minimumGradeOverall, double maximumGradeOverall){
    this.assignments = new ArrayList<String>();
    this.averageGradeOverall = averageGradeOverall;
    this.minimumGradeOverall = minimumGradeOverall;
    this.maximumGradeOverall = maximumGradeOverall;

    }//default constructor


    public void createStudent(String name){

    }
    public void addAssignments(String assignment){
        assignments.add(assignment);
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
