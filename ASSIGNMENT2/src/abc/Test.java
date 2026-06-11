package abc;

public class Test extends Student {
 public int mark1,mark2;
 
   public void inputDetails(String name,int roll, int n,int r)
   {
	  super.inputDetails(name,roll);
	  mark1=n;
	  mark2=r;
   }
   public void showDetails()
   {
	  super.showDetails();
	  System.out.println("Mark1: "+mark1);
	  System.out.println("Mark2: "+mark2);

   }
}
