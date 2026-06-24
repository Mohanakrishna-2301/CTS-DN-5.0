package module1.mvcpatternexample;

public class MVCPatternTest 
{
    public static void main(String[] args) 
    {
        // Create Model
        Student student = new Student("Alan", 101, "A");

        // Create View
        StudentView view = new StudentView();

        // Create Controller
        StudentController controller = new StudentController(student, view);

        // Display initial student details
        System.out.println("Initial Student Record:");
        controller.updateView();

        System.out.println();

        // Update student details using controller
        controller.setStudentName("Alan Jones");
        controller.setStudentGrade("A+");

        // Display updated student details
        System.out.println("Updated Student Record:");
        controller.updateView();
    }
}