public class Main {
    public static void main(String[] args)
    {
        Student student1 = new Student("Tyler");
        Student student2 = new Student("James");
        Student student3 = new Student("Ethan");
        Student student4 = new Student("Scotty");
        Student student5 = new Student("David");
        Student student6 = new Student("Patrick");

        Gradebook gradebook1 = new Gradebook();


        gradebook1.gradeAssignment("Stacks and Queues Station Activity", "Tyler", 94);
        gradebook1.gradeAssignment("Stacks and Queues Station Activity", "James", 14);
        gradebook1.gradeAssignment("Stacks and Queues Station Activity", "Ethan", 5);
        gradebook1.gradeAssignment("Stacks and Queues Station Activity", "Scotty", 100);
        gradebook1.gradeAssignment("Stacks and Queues Station Activity", "David", 0);
        gradebook1.gradeAssignment("Stacks and Queues Station Activity", "Patrick", 79);





    }
}
