import java.util.*;
public class App {
    public static void main(String[] args) throws Exception {
        List<Student> stuList = new ArrayList<Student>();
       
        Student stu1 = new Student("Jeff", "Harbert", "358946", "3.89");
        Student stu2 = new Student("Jimmy", "Beast", "392109", "3.46");
        GradStudent grStu1 = new GradStudent("Stuart", "Conway", "566701","2.93", "B185", "9-11" );
        GradStudent grStu2 = new GradStudent("Simon", "Burnett", "456973", "4.26", "B134", "8,10");
        stuList.add(stu1);
        stuList.add(stu2);
        stuList.add(grStu1);
        stuList.add(grStu2);
        
        for(int i =0; i <= stuList.size() - 1; i++)
        {
             System.out.println(stuList.get(i));
            
        }
           
    }
}
