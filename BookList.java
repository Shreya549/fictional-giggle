
import java.io.*;
import java.util.*;
class BookList
{
    String isbn,name,details; 
    boolean isAvailable, isTaken;
    BookList(){
        isAvailable = false;
        isTaken = true;
    }

    BookList(String isbn, String name, String details, boolean isAvailable, boolean isTaken) 
    { 
        this.isbn = isbn;
        this.name = name;
        this.details = details;
        this.isAvailable = isAvailable;
        this.isTaken = isTaken;
    }

    protected void loadBooks()throws IOException
    {
        BookList book1 =  new BookList("12345678901","JAVA", "Introduction to JAVA", true, false);
        BookList book2 =  new BookList("12567890134","CPP", "Introduction to C++", true, false);
        BookList book3 =  new BookList("23456789011","Python", "Introduction to Python", true, false);
        BookList book4 =  new BookList("13456789012","WebDev", "Introduction to Web Development", true, false);
        BookList book5 =  new BookList("12456789013","Python", "Introduction to Python", true, false);

        System.out.println("Name : " + book1.name);
        System.out.println("ISBN : " + book1.isbn);
        System.out.println("Details : " + book1.details);
        System.out.println("Available : " + !book1.isTaken);
        System.out.println();

        System.out.println("Name : " + book2.name);
        System.out.println("ISBN : " + book2.isbn);
        System.out.println("Details : " + book2.details);
        System.out.println("Available : " + !book2.isTaken);
        System.out.println();

        System.out.println("Name : " + book3.name);
        System.out.println("ISBN : " + book3.isbn);
        System.out.println("Details : " + book3.details);
        System.out.println("Available : " + !book3.isTaken);
        System.out.println();

        System.out.println("Name : " + book4.name);
        System.out.println("ISBN : " + book4.isbn);
        System.out.println("Details : " + book4.details);
        System.out.println("Available : " + !book4.isTaken);
        System.out.println();

        System.out.println("Name : " + book5.name);
        System.out.println("ISBN : " + book5.isbn);
        System.out.println("Details : " + book5.details);
        System.out.println("Available : " + book5.isTaken);
        System.out.println();

    }

    protected void issueBook(String regnum, String isbn_num)throws IOException
    {
        String reg[] = new String[100];
        reg[0] = "18BIT0251";
        reg[1] = "18BIT0239";
        reg[2]="18BME0827";

        String book_isbn[] = new String[100];
        book_isbn[0] = "12456789013";
        book_isbn[1] = "13456789012";
        book_isbn[2] = "12567890134";

        //Adding the new record ot the list
        int num_reg = 3;
        reg[num_reg] = regnum;
        book_isbn[num_reg] = isbn_num;
        num_reg++;

        System.out.println("Book issued successfully!");
    }

    protected void returnBook(String regnum)throws IOException
    {
        String reg[] = new String[100];
        reg[0] = "18BIT0251";
        reg[1] = "18BIT0239";
        reg[2]="18BME0827";

        String book_isbn[] = new String[100];
        book_isbn[0] = "12456789013";
        book_isbn[1] = "13456789012";
        book_isbn[2] = "12567890134";

        int num_reg = 3;

        for (int i = 0;i<num_reg;i++)
        {
            if (reg[i]==regnum)
            {
                reg[i]= "NA";
                book_isbn[i]="NA";
            }
        }

        System.out.println("Deleted Successfully");
    }

    protected void addWaitingBook(String regnum, String isbn_num)throws IOException
    {

        String waiting_isbn[] = new String[100];
        String waiting[][] = new String[100][5];
        int num_wait = 1;
        waiting_isbn[0] = "13456789012";
        waiting[0][0] = "18BME0827";
        waiting[0][1] = "NA";
        waiting[0][2] = "NA";
        waiting[0][3] = "NA";
        waiting[0][4] = "NA";
        boolean flag = false;
        int pos = -1;
        for (int i = 0;i<num_wait;i++)
        {
            if (waiting_isbn[i]==isbn_num)
            {
                flag = true;
                pos = i;
                break;
            }
        }
        boolean flag2 = false;
        if (flag == true)
        {
            for (int j = 0;j<5;j++)
            {
                if (waiting[pos][j] == "NA")
                {
                    waiting[pos][j] = regnum;
                    flag2 = true;
                    break;
                }
            }

            if (flag == true)
                System.out.println("Book waitlisted successfully!");
            else
                System.out.println("Waiting List full, try again later!");
        }
        else
        {
            waiting_isbn[num_wait] = isbn_num;
            waiting[num_wait][0] = regnum;
            num_wait++;
            System.out.println("Book waitlisted successfully");
        }
    }
}

