public class UnderGraduateStudent extends Student {

    public UnderGraduateStudent(String firstName, String lastName, String idNum, String gpa)
    {
        super(firstName, lastName, idNum, gpa);
    }

    public String getDegree()
    {
        return "2 or 4 year degree";
    }
    
}
