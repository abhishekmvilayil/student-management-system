
import java.util.ArrayList;

public class StudentService {
    ArrayList<Student>student=new ArrayList<>();
    
    //add functionality
    void Studentadd(Student s){
        student.add(s);
    }
    
    //view functionality
    void ViewStudentList(){
        for(Student k:student){
            System.out.println(k);
        }
    }

}
