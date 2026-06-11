import java.util.*;
public class Q3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		   Scanner sc= new Scanner (System.in);
		   System.out.println("Enter a Number");
          int n,s=0,p=1;
          n=sc.nextInt();
          System.out.print(n);
          while(n!=0)
          {
        	  s+=n%10;
        	  p*=n%10;
        	  n/=10;
          }
          if(s==p)
        	  System.out.print(" is a Spy number");
          else
        	  System.out.println(" is not a Spy number");
	}

}
