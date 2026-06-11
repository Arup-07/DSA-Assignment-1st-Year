import java.util.*;
public class Q7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	    Scanner sc=new Scanner(System.in);
	    System.out.println("Enter the length of the array:");
	    int d,c1=0,i1=0,i2=0,c2=0, n= sc.nextInt();
	    int a[]= new int[n];
	    for(int i=0;i<n;i++)
	    {
	    	System.out.println("Enter a number to be stored in the array");
	    	a[i]=sc.nextInt();
	    }
	    int h=a[0],l=a[0];
	    for(int i=0;i<n;i++)
	    {
	    	if(a[i]>h)
	    		h=a[i];
	    	if(a[i]<l)
	    		l=a[i];
	    }
	    for(int i=0;i<n;i++)
	    	if(a[i]==h)
	    	{
	    		c1++;i1=i;
	    	}
	    for(int i=n-1;i>=0;i--)
	    	if(a[i]==l)
	    	{
	    		c2++;i2=i;
	    	}
	    
	    System.out.print("Minimum element of the array is "+l+" and it occurs "+c2+"times with min position "+i2);
	    System.out.print("\nMaximum element of the array is "+h+" and it occurs "+c1+"times with min position "+i1);

	    
	    }

}
