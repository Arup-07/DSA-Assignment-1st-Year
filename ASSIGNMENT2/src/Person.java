import java.util.*;
public class Person{
	String nm;
	int age;
	public void setData()
	{
		Scanner sc= new Scanner(System.in);
	    System.out.println("Enter the name of the person:");
		nm=sc.nextLine();
		System.out.println("Enter the age of the person:");
		age=sc.nextInt();
	}
	public void displayData()
	{
		System.out.println("The name of the person is: "+nm);
		System.out.println("The age of the person is: "+age);
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
     Person ob1= new Person();
     Person ob2= new Person();
     ob1.setData();
     ob2.setData();
     if(ob1.age>ob2.age)
    	 System.out.println(ob1.nm+" is younger");
     else if(ob2.age>ob1.age)
    	 System.out.println(ob2.nm+" is younger");
     else
    	 System.out.println(ob1.nm+" and "+ob2.nm+" are of same age");
	}

}
