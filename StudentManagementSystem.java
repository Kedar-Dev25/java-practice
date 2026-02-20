import java.util.Scanner;
import java.util.ArrayList;
public class Main {
    public static void main(String[] args) {
        ArrayList<String> students = new ArrayList<>();
        
             Scanner sc = new Scanner(System.in);
       
        while(true){
                    System.out.println("********* Welcom to Student Management System *********");
                    System.out.println("Enter 1 / 2 / 3 to get service ");
                    System.out.println("1.Add Student \n2.View Students \n3.Exit");
            int choice = sc.nextInt();
            sc.nextLine(); // <-- important fix

            if(choice == 1) {
                System.out.print("Enter Student's Name : ");
                String StudentName = sc.nextLine();
                System.out.println("Enter Branch of "+ StudentName+" : ");
                String StudentBranch =  sc.nextLine();
                System.out.println("Enter Roll no of "+ StudentName+" : ");
                int StudentRollno = sc.nextInt();
                System.out.println("###### Thanks for this information ######");

                String StudentInfo = "Name : "+StudentName + ",  Branch : "+StudentBranch + ",  Rollno : "+StudentRollno;
                students.add(StudentInfo);
            }else if(choice == 2) {
                if(students.isEmpty()) {
                    System.out.println("No Student Information Available");
                }else {
                System.out.println("Here is your Student's Information");
                for(String info : students) {
                    System.out.println(info);
                }
             }
            }else if(choice == 3) {
                 System.out.println("Exiting Student Management System... Goodbye!");
                 break;
            }else{
                System.out.println("Invalid choice! Please enter 1, 2, or 3.");

            }
        }
        sc.close();
    }
}
