import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        StudentService service=new StudentService();
        
        Scanner sc=new Scanner(System.in);
        while (true) { 
                System.out.println("1. Add Student");
                System.out.println("2. View Students");
                System.out.println("3. Search Student");
                System.out.println("4. Delete Student");
                System.out.println("5. Updation");
                System.out.println("6. Exit");
                System.out.println("Enter your choice:");
                int n=sc.nextInt();
                switch(n) {
                    case 1:
                        System.out.println("Enter id:");
                        int id=sc.nextInt();
                        sc.nextLine();
                        System.out.println("Enter name:");
                        String name=sc.nextLine();
                        System.out.println("Enter Age:");
                        int age=sc.nextInt();
                        sc.nextLine();
                        System.out.println("Enter course name:");
                        String course=sc.nextLine();

                        service.Studentadd(new Student(id, name, age, course));
                        
                        break;
                    case 2:
                        service.ViewStudentList();
                        break;
                    case 3:
                        System.out.println("Enter the id :");
                        int k=sc.nextInt();
                        sc.nextLine();
                        service.Search(k);
                        break;
                    case 4:System.out.println("Enter the id to delete:");
                            int p=sc.nextInt();
                            sc.nextLine();
                            service.delete(p);
                            break;
                    case 5:System.out.println("Enter the id of student to update:");
                           int t=sc.nextInt();
                           sc.nextLine();
                           service.update(t);
                           break;
                    case 6:
                        System.out.println("Thank you");
                        System.exit(0);
                    default: System.out.println("Invalid choice");
                       
                }
         }
        }
    }

