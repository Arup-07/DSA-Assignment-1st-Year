package abc;
class Student
{
	String name;
	int roll;
	void inputDetails(String n,int r)
	{
		name=n;
		roll=r;
	}
	void showDetails()
	{
		System.out.println("Name: "+name);
		System.out.println("Roll No: "+roll);

	}
}