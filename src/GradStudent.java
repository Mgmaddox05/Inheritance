public class GradStudent extends Student
{
    private String officeNum;
    private String officeHour;
    


    public GradStudent(String firstName, String lastName, String idNum, String gpa, String officeNum, String officeHour)
    {
        super(firstName, lastName, idNum, gpa);
        this.officeNum = officeNum;
        this.officeHour = officeHour;
    }

    @Override
    public String toString()
    {
        return getfirstName() + " " + getlastName() + " ID: GR-" + getID() + " GPA: " + getGPA() +" Office Number: " + officeNum + " Office Hours: " + officeHour;
    }

    
}
