import java.util.*;
public class LuckyNumber {
    public static void main(String args[])
    {
    	Scanner sc= new Scanner(System.in);
        int ln;
        System.out.println("Enter your Lucky Number: ");
        ln= sc.nextInt();
        try
        {
         if(ln<0)
           throw new NumberFormatException("Lucky Number cannot be negative");        	
        System.out.println("Your Lucky Number is: "+ln);
        }
        catch(NumberFormatException e)
        {
        	System.out.println(e);
        }
    }
    
}
/**
import java.util.*;
public class LuckyNumber {
    public static void main(String args[]) throws NumberFormatException
    {
    	Scanner sc= new Scanner(System.in);
        int ln;
        System.out.println("Enter your Lucky Number: ");
        ln= sc.nextInt();
        try
        {
         if(ln<0)
           throw new NumberFormatException("Lucky Number cannot be negative");        	
        System.out.println("Your Lucky Number is: "+ln);
        }
    }
    
}
*/