import java.util.*;
public class Q2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    Scanner sc= new Scanner (System.in);
    System.out.println("Enter Weight in kg:");
    double w,h,bmi;
    w=sc.nextDouble();
    System.out.println("Enter Height in meters:");
    h=sc.nextDouble();
    bmi=(w*1.0)/(h*h);
    if(bmi<18.5)
    	System.out.println("Underweight");
    else if(bmi<=24.9)
    	System.out.println("Normal Weight");
    else if(bmi<=29.9)
    	System.out.println("Overweight");
    else
    	System.out.println("Obese");
	}

}
