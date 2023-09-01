import java.util.*;
public class App {
    public static void main(String[] args) throws Exception {
        List<Student> stuList = new ArrayList<Student>();
       
        Student stu1 = new Student("Jeff", "Harbert", "358946");
        stuList.add(stu1);
        int i = 0;
        while(i < stuList.size() - 1 )
            System.out.println(stuList.get(i));
            i++;
    }
}
