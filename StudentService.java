
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

    //Search functionality
    void Search(int id){
        for(Student s:student){
            int k=s.getId();
            if(k==id){
                System.out.println(s);
                System.out.println("Student is found");
                return;
            }

        }
        System.out.println("Student not found");

    }

    //Delete function
    void delete(int id){
        for(int i=0;i<student.size();i++){
            if(student.get(i).getId()==id){
                student.remove(i);
                System.out.println("Deleted");
                return;
            }
            
            }
            System.out.println("Student not found");
        }
    }


