import java.util.*;
public class App{
    
    public static void main(String[] args) throws Exception {
        List<Student> stuList = new ArrayList<Student>();
       
        UnderGraduateStudent stu1 = new UnderGraduateStudent("Jeff", "Harbert", "358946", "3.89");
        UnderGraduateStudent stu2 = new UnderGraduateStudent("Jimmy", "Beast", "392109", "3.46");
        GradStudent grStu1 = new GradStudent("Stuart", "Conway", "566701","2.93", "B185", "9-11" );
        GradStudent grStu2 = new GradStudent("Simon", "Burnett", "456973", "4.26", "B134", "8,10");
        stuList.add(stu1);
        stuList.add(stu2);
        stuList.add(grStu1);
        stuList.add(grStu2);
        
        //A list is different from the contents of the list
        // A list is a list of a data type for example students and the contents of the list is one specific instances
        for(int i =0; i <= stuList.size() - 1; i++)
        {
             Student stu = stuList.get(i);
            // System.out.println(stu);
             System.out.println(stu.getSerialData());
             System.out.println( stu.getDegree());
             
        }

        
           
    }
}
