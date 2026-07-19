
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;
public class StudentService {
    ArrayList<Student>student=new ArrayList<>();
    Scanner sc=new Scanner(System.in);


    //Load students from file

    void loadStudent(){
        try {
            File file=new File("students.txt");
            if(!file.exists()){
                return;
            }

            Scanner fileScanner=new Scanner(file);
            while(fileScanner.hasNextLine()){
                String line=fileScanner.nextLine();
                String[] parts=line.split(",");

                int id=Integer.parseInt(parts[0]);
                String name=parts[1];
                int age=Integer.parseInt(parts[2]);
                String course= parts[3];
                student.add(new Student(id,name,age,course));
            }
            fileScanner.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }




    //save all students to file
    void saveStudents(){
        try {
            FileWriter fw =new FileWriter("students.txt");
            for(Student s:student){
                fw.write(
                    s.getId()+","+s.getName()+","+s.getAge()+","+s.getCourse()+"\n"
                );
            }
            fw.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    //id uniqueness check
    boolean idExists(int id){
        for(Student k:student){
            if(id==k.getId()){
                System.out.println("Id already exists");
                return true;
            }
        }
        return false;
    }


    
    //add functionality
    void Studentadd(Student s){

        student.add(s);
        saveStudents();
    }
    
    //view functionality
    void ViewStudentList(){
        student.sort((s1,s2)->
        Integer.compare(s1.getId(), s2.getId()));
        
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

                saveStudents();

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
                saveStudents();
                System.out.println("Updated");
                return;
            }
        }
        System.out.println("Student not found");
    }
    }


