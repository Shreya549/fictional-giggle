import java.io.*;
import java.util.*;
class StudentPortal extends BookList
{
    BookList book1 =  new BookList("12345678901","JAVA", "Introduction to JAVA", true, false);
    BookList book2 =  new BookList("12567890134","CPP", "Introduction to C++", true, true);
    BookList book3 =  new BookList("23456789011","Python", "Introduction to Python", true, false);
    BookList book4 =  new BookList("13456789012","WebDev", "Introduction to Web Development", true, true);
    BookList book5 =  new BookList("12456789013","Python", "Introduction to Python", true, false);
    public static void studentpanel()throws IOException
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter registration number");
        String regno = sc.nextLine();
        System.out.println("Welcome student");
        //Ask admin to enter choices

        int flag = 0;

        StudentPortal stud = new StudentPortal();
        do{
            System.out.println("Enter 1 to view books, 2 to issue book, 3 to add to waiting list, 4 to return book ");
            int choice = sc.nextInt();
            switch (choice)
            {
                case 1:
                stud.loadBooks();
                break;

                case 2 :
                String xyz = sc.nextLine();
                System.out.println("Enter isbn code");
                String code = sc.nextLine();

                stud.issueBook(regno, code);
                break;

                case 3 :                
                String z = sc.nextLine();
                System.out.println("Enter isbn code");
                String ncode = sc.nextLine();
                stud.addWaitingBook(regno, ncode);
                break;

                case 4 :
                String zY = sc.nextLine();
                System.out.println("Enter isbn code");
                String nisbn = sc.nextLine();
                stud.returnBook(regno);
                break;

                default:
                System.out.println("Sorry, You have entered an invalid choice");
            }
            System.out.println("Do you want to continue?");
            System.out.println("Press 0 to exit and 1 to continue");
            flag = sc.nextInt();
        }while(flag == 1);
    }
}