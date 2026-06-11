import java.util.*;
public class Q9 {

	public static void  main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc= new Scanner(System.in);
		int r,c; double s;
	      System.out.println("Enter the number of rows and columns");
	      double a[][]= new double[4][4];
	      System.out.println("Enter "+16+" numbers to be stored in the array");
	      for(r=0;r<4;r++)
	    	  for(c=0;c<4;c++)
	    	     a[r][c]=sc.nextInt();
	      System.out.println("The matrix array is:");
	      for(r=0;r<4;r++)
	      {
	    	  for(c=0;c<4;c++)
	    		  System.out.print(a[r][c]+" ");
	    	  System.out.println();
	      }
	      s=sumMajorDiagonal(a);
	      System.out.println("Sum of Major Diagonal elements of the array: "+s);
	      }
	public static double sumMajorDiagonal(double[][] m)
	{
		double s=0;
		for(int r=0;r<4;r++)
	    	  for(int c=0;c<4;c++)
	    	  {
	    		  if(r==c)
	    			  s+=m[r][c];
	    	  }
		return s;
	}

}
