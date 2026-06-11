import java.util.*;
abstract class Marks {
	int markICP,markDSA;
	double percentage;
	abstract void getPercentage();
}
class CSE extends Marks
{
	int algoDesign;
	CSE(int markICP,int markDSA,int algoDesign)
	{
      		this.markICP=markICP;
      		this.markDSA=markDSA;
      		this.algoDesign=algoDesign;
	}
	void getPercentage()
	{
		percentage= (markICP+ markDSA+algoDesign)/3.0;
	}
}
class NonCSE extends Marks
{
	int enggMechanics ;
	NonCSE(int markICP,int markDSA,int algoDesign)
	{
      		this.markICP=markICP;
      		this.markDSA=markDSA;
      		this.enggMechanics=enggMechanics;
	}
	void getPercentage()
	{
		percentage= (markICP+ markDSA+enggMechanics)/3.0;
	}
}
public class Demo
{
	public static void main(String args[])
	{
		Scanner sc= new Scanner (System.in);
		int icp,dsa,algo,en;
		System.out.println("Enter the marks in ICP:");
		icp=sc.nextInt();
		System.out.println("Enter the marks in DSA:");
		dsa=sc.nextInt();
		System.out.println("Enter the marks in Algo Design:");
		algo=sc.nextInt();
		System.out.println("Enter the marks in Engineering Mechanics:");
		en=sc.nextInt();
		CSE ob1= new CSE(icp,dsa,algo);
		ob1.getPercentage();
		System.out.println("Percentage of CSE students: "+ob1.percentage);
		NonCSE ob2= new NonCSE(icp,dsa,en);
		ob2.getPercentage();
		System.out.println("Percentage of NonCSE students: "+ob2.percentage);
	}
}