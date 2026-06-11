import java.util.*;
public class Q5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
   Scanner sc= new Scanner(System.in);
   System.out.println("Entere a number");
   int n= sc.nextInt();
   if(n<=9)
	   System.out.println("Sum of the digits:"+n);
   else 
	  while(n>=10)
		 n= sum_Of_Digits(n);
	System.out.println("Sum of the digits:"+n);
	 
	
   
	}
	public static int sum_Of_Digits(int n)
	{
	      int s=0;
		  while(n!=0)
          {
        	  s+=n%10;
        	  n/=10;
          }
		  return s;
	}
}
