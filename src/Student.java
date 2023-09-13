public abstract class Student implements Serializable {
    private String firstName;
    private String lastName;
    private String idNum;
    private String gpa;

    public String getSerialData()
    {
         return  firstName + " , " + lastName + ", " + idNum + ", " + gpa;
    }

    public Student(String firstName, String lastName, String idNum, String gpa)
    {
        this.firstName = firstName;
        this.lastName = lastName;
        this.idNum = idNum;
        this.gpa = gpa;
    }

    public String toString()
    {
        return "Student: " + firstName + " " + lastName + " ID: " + idNum + " GPA: " + gpa;
    }

    public String getfirstName()
    {
        return firstName;
    }

    public String getlastName()
    {
        return lastName;
    }

    public String getID()
    {
        return idNum;
    }

    public String getGPA()
    {
        return gpa;
    }

    public abstract String getDegree();




    
    
}
