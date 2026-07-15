
import java.util.ArrayList;
import java.util.Scanner;
public class StudentService {
    ArrayList<Student>student=new ArrayList<>();
    Scanner sc=new Scanner(System.in);
    
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


    //update function
    void update(int id){
        for(int i=0;i<student.size();i++){
            if(student.get(i).getId()==id){
                System.out.println("Enter updated name:");
                String name=sc.nextLine();
                student.get(i).setName(name);
                System.out.println("Enter updated age:");
                int age=sc.nextInt();
                sc.nextLine();
                student.get(i).setAge(age);
                System.out.println("Enter the update course:");
                String course=sc.nextLine();
                student.get(i).setCourse(course);
                System.out.println("Updated");
                return;
            }
        }
        System.out.println("Id not found");
    }
    }


