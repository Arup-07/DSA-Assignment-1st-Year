import java.util.*;
public class Q8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      Scanner sc= new Scanner(System.in);
      int r,c,s=0;
      System.out.println("Enter the number of rows and columns");
      r= sc.nextInt();
      c= sc.nextInt();
      int a[][]= new int[r][c];
      System.out.println("Enter  "+r*c+" numbers to be stored in the array");
      for(int i=0;i<r;i++)
    	  for(int j=0;j<c;j++)
    	  {
    		  a[i][j]=sc.nextInt();
    		  s+=a[i][j];
    	  }
      System.out.println("The matrix array is:");
      for(int i=0;i<r;i++)
      {
    	  for(int j=0;j<c;j++)
    		  System.out.print(a[i][j]+" ");
    	  System.out.println();
      }
      System.out.println("The sum of the elements of the 2-D array is "+s);
	}

}
