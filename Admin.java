import java.io.*;
import java.util.*;
public class Admin extends Login //Inheriting class Login
{
    public static Student stud_list[] = new Student[100];
    public static int num_students = 0;

    public static BookList book_list[] = new BookList[100];
    public static int num_books = 0;

    public static void adminpanel()throws IOException
    {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        Scanner sc = new Scanner(System.in);
        Admin duty = new Admin(); //creating object duty of class Admin

        System.out.println("Hello, Login to continue");
        System.out.println("Enter password");
        String password = sc.nextLine();
        boolean successfulLogin = duty.securedLogin(password); //Calling function of inherited class

        if (successfulLogin == true) 
        {
            int choice, flag = 0;

            do
            {
                //Ask admin to enter choices
                System.out.println("Enter 1 to add books,2 to view books, 3 to check availability, 4 to delete books, 5 add students, 6 to view students, 7 to delete students");
                choice = sc.nextInt();
                switch (choice)
                {
                    case 1 : 
                    String garb = sc.nextLine();
                    System.out.println("Enter ISBN code");
                    String isbn = sc.nextLine();
                    System.out.println("Enter name of book");
                    String name = sc. nextLine();
                    System.out.println("Enter details, if any");
                    String details = sc.nextLine();
                    boolean isAvailable = true; //If available in library
                    boolean isTaken = false;
                    duty.Add(num_books++, isbn, name, details, isAvailable, isTaken);
                    break;

                    case 2 : 
                    duty.ViewBooks(num_books);
                    break;

                    case 3 :
                    duty.CheckAvailability(num_books);
                    break;
                    
                    case 4 : 
                    duty.DeleteBooks(num_books);
                    break;

                    case 5 : 
                    String x = sc.nextLine();
                    System.out.println("Enter registration number");
                    String regno = sc.nextLine();
                    //Example of Polymorphism
                    duty.Add(num_students++, regno);
                    break;

                    case 6 : 
                    duty.ViewStudents(num_students);
                    break;
                    
                    case 7 : 
                    duty.DeleteStudents(num_students);
                    break;

                    default:
                    System.out.println("Sorry, You have entered an invalid choice");
                }
                System.out.println("Do you want to continue?");
                System.out.println("Press 0 to exit and 1 to continue");
                flag = sc.nextInt();

            }while(flag==1);
        }

    }

    void Add(int num_books, String isbn, String name, String details, boolean isAvailable, boolean isTaken)
    {
        book_list[num_books] = new BookList(isbn,name,details,isAvailable, isTaken);
    }

    void CheckAvailability(int num_books)
    {
        for (int i = 0; i<num_books;i++)
        {
            if ((book_list[i].isTaken == false) && (book_list[i].isAvailable == true))
            {
                System.out.println("Name : " + book_list[i].name);
                System.out.println("ISBN : " + book_list[i].isbn);
                System.out.println("Details : " + book_list[i].details);
                System.out.println();
            }
        }
    }

    void ViewBooks(int num_books)
    {
        for (int i = 0; i<num_books;i++)
        {
            if(book_list[i].isAvailable == true)
            {
                System.out.println("Name : " + book_list[i].name);
                System.out.println("ISBN : " + book_list[i].isbn);
                System.out.println("Details : " + book_list[i].details);
                System.out.println("Availability : " + (!book_list[i].isTaken)); 
                System.out.println();
            }
        }
    }

    void DeleteBooks(int num_books)
    {
        Scanner sc = new Scanner (System.in);
        System.out.println("Enter the isbn number of book to be deleted");
        String isbn = sc.nextLine();
        for (int i = 0;i<num_books;i++)
        {
            if (book_list[i].isbn == isbn)
            {
                System.out.println("Book deleted");
            }
        }
    }

    void Add(int num_students, String regno)
    {
        stud_list[num_students] = new Student(regno);
    }

    void ViewStudents(int num_students)
    {
        for (int i = 0; i<num_students;i++)
        {
            System.out.println(stud_list[i].regno);
        }
    }

    void DeleteStudents(int num_students)
    {
        Scanner sc = new Scanner (System.in);
        System.out.println("Enter the isbn number of book to be deleted");
        String isbn = sc.nextLine();
        for (int i = 0;i<num_books;i++)
        {
            if (book_list[i].isbn == isbn)
            {
                System.out.println("Book deleted");
            }
        }
    }
}

