import java.io.*;
import java.util.*;
class Manager
{
    public static void main(String args[])throws IOException
    {
        Scanner sc = new Scanner(System.in);
        int choice, flag = 0;

        do
        {
            System.out.println("Enter 1 for admin, 2 for student");
            choice = sc.nextInt();
            switch(choice)
            {
                case 1 :
                Admin admin = new Admin();
                admin.adminpanel();
                System.out.println("Goodbye! Admin");
                break;

                case 2 :
                StudentPortal student = new StudentPortal();
                student.studentpanel();
                System.out.println("Goodbye! Student");
                break;

                default:
                System.out.println("Invalid Request");
            }
            System.out.println("Do you want to continue?");
            System.out.println("Press 0 to exit and 1 to continue");
            flag = sc.nextInt();
        }while(flag == 1);
    }
}