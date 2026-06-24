package module1.mvcpatternexample;

public class Student 
{
    private String name;
    private int id;
    private String grade;

    public Student(String name, int id, String grade) 
    {
        this.name = name;
        this.id = id;
        this.grade = grade;
    }

    // Getter and Setter for name
    public String getName() {
        return name;
    }

    public void setName(String name) 
    {
        this.name = name;
    }

    // Getter and Setter for id
    public int getId() 
    {
        return id;
    }

    public void setId(int id) 
    {
        this.id = id;
    }

    // Getter and Setter for grade
    public String getGrade() 
    {
        return grade;
    }

    public void setGrade(String grade) 
    {
        this.grade = grade;
    }
}