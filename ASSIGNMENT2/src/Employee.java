import java.util.*;
 class Personn {
	String name;
	int age;
	Personn(String nm,int age)
	{
		name= nm;
		this.age=age;
	}
	

}
class Employee extends Personn
{
	int empID;
	double sal;
	Employee(String nm,int age,int empid,double s)
	{
		super(nm,age);
		empID= empid;
		sal=s;
	}
	void empDisplay()
	{
		System.out.println("Name :"+name);
		System.out.println("Age :"+age);
		System.out.println("Employee ID :"+empID);
		System.out.println("Salary :"+sal);

	}
	public static void main (String Args[])
	{
		Scanner sc= new Scanner(System.in);
		String nm;int age,empid;double s;
		System.out.println("Enter the name of the person: ");
		nm=sc.nextLine();
		System.out.println("Enter the age of the person: ");
        age=sc.nextInt(); 
        System.out.println("Enter the Employee ID of the person: ");
        empid=sc.nextInt();
        System.out.println("Enter the Salary of the person: ");
        s=sc.nextDouble();
        Employee ob1= new Employee(nm,age,empid,s);
        ob1.empDisplay();
	}
}