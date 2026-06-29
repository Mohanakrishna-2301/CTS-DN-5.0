package module2.taskmanagementsystem;

public class Main 
{
    public static void main(String[] args) 
    {
        TaskLinkedList list = new TaskLinkedList();

        list.addTask(101, "Design UI", "Pending");
        list.addTask(102, "Develop Backend", "In Progress");
        list.addTask(103, "Testing", "Pending");

        list.displayTasks();

        list.searchTask(102);

        list.deleteTask(102);

        list.displayTasks();
    }
}