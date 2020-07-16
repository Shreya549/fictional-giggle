import java.io.*;
import java.util.*;
class DCCN
{
    public static void main(String args[])throws IOException
    {
        Scanner sc = new Scanner(System.in);
        //Input from user
        System.out.println("Enter the IP address");
        String ip = sc.nextLine();
        DCCN obj = new DCCN();
        //Passing address to function
        char cl = obj.FindClass(ip);
        System.out.println("The class of the given IP is : " + cl);
    }
    
    char FindClass(String ip)
    {
        // Finding first occurence of '.'
        int index = ip.indexOf('.'); 
        // First octate in str in decimal form 
        String ipsub = ip.substring(0,index); 
        int str = Integer.parseInt(ipsub); 
        // Class A 
        if (str>=1 && str<=126) 
            return 'A'; 
        // Class B 
        else if (str>=128 && str<=191) 
            return 'B'; 
        // Class C 
        else if (str>=192 && str<223) 
            return 'C'; 
        // Class D 
        else if (str >=224 && str<=239) 
            return 'D'; 
        // Class E 
        else
            return 'E';
    }
}
    
   