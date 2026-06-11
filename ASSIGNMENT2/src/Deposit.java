
public class Deposit {
    long principal;
    int time;
    double rate,totalAmt;
    Deposit()
    {
    }
    Deposit(long a, int b,double c)
    {
    	principal=a;
    	time=b;
    	rate=c;
    }
    Deposit(long a,int b)
    {
    	principal=a;
    	rate=12.8;
    	time=b;
    }
    Deposit(long a,double b)
    {
    	principal=a;
    	rate=b;
    	time=5;
    }
    void display ()
    {
    	System.out.println("The Principal Amount :"+principal);
    	System.out.println("The Time period :"+time);
    	System.out.println("The Rate :"+rate);
    	System.out.println("The Total Amount :"+totalAmt);
    }
    void calcAmt()
    {
    	totalAmt=principal+(principal*rate*time)/100;
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
