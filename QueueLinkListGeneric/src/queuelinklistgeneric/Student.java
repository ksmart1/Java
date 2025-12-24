package queuelinklistgeneric;

public class Student {
    private String studentID;
    private String firstName;
    private String lastName;
    
    public Student()
    {
        
    }
    
    public Student(String studentID, String firstName, String lastName)
    {
        this.studentID = studentID;
        this.firstName = firstName;
        this.lastName = lastName;
    }
    
    public void setStudentID(String studentID)
    {
        this.studentID = studentID;
    }
    
    public String getStudentID()
    {
        return this.studentID;
    }
    
    public void setFirstName(String firstName)
    {
        this.firstName = firstName;
    }
    
    public void setLastName(String lastName)
    {
        this.lastName = lastName;
    }
    
    public String getFullName()
    {
        return this.firstName + " " + this.lastName;
    }
    
    public void displayStudent()
    {
        System.out.println("StudentID: " + getStudentID() + " " + 
                "Name: " + getFullName());
    }
}
