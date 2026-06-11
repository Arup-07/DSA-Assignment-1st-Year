import java.util.*;
public class Q6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter a number:");
    int n=sc.nextInt();
    System.out.print(n+" is odd:");
    if(isOdd(n)==true)
    	System.out.println("true");
    else
    	System.out.println("false");
	}
    public static boolean isOdd(int n)
    {
    	while(n-2>0)
    	{
    		n-=2;
    	}
    	if(n==1)
    		return true;
    	else
    		return false;
    }
}
