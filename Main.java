public class Main {
    public static void main(String[] args) {
        Student s1=new Student(1,"RAM", 20,"CSE");
        StudentService service=new StudentService();
        service.Studentadd(s1);
        service.ViewStudentList();
    }
}
