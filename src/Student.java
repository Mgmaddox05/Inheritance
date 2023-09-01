public class Student {
    private String firstName;
    private String lastName;
    private String idNum;

    public Student(String firstName, String lastName, String idNum)
    {
        this.firstName = firstName;
        this.lastName = lastName;
        this.idNum = idNum;
    }

    public String toString()
    {
        return "Student: " + firstName + " " + lastName + " ID: " + idNum;
    }
    
    
}
