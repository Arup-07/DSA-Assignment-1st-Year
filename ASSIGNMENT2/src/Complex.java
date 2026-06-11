import java.util.*;
public class Complex {
	int r,i;
    void setData()
    {
    	Scanner sc= new Scanner(System.in);
    	System.out.println("Enter the real part of the number:");
    	r= sc.nextInt();
    	System.out.println("Enter the imaginary part of the number:");
    	i= sc.nextInt();
    }
    void displayData()
    {
    	System.out.println("The real part :"+r+"\nThe imaginary part: "+i+"j");
    }
    public Complex add(Complex a, Complex b)
    {
    	Complex ob3= new Complex();
    	ob3.r=a.r+b.r;
    	ob3.i=a.i+b.i;
    	return ob3;
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Complex ob1= new Complex();
    	Complex ob2= new Complex();
    	Complex ob3= new Complex();//Complex ob3; contains null value as its not an object here
    	ob1.setData();
    	ob2.setData();
    	ob2.displayData();
    	ob1.displayData();
    	ob3=ob3.add(ob1,ob2);//if we just write ob3.add it will give error as it is not an object
    	System.out.println("The sum of the 2 Complex numbers are:");
    	ob3.displayData();
	}

}
