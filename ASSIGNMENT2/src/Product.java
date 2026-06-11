import java.util.*;
public class Product {
	String prodID;
	double price;
	int quantity;
    static double totalPrice;
    Product()
    {
    	
    }
    Product(String a,double p,int q )
    {
    	prodID=a;
    	price=p;
    	quantity=q;
    }
    void display()
    {
    	System.out.println("Prouct ID:"+prodID);
    	System.out.println("Price:"+price);
    	System.out.println("Quantity:"+quantity);
    	System.out.println("Prouct ID:"+prodID);
    }
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		// TODO Auto-generated method stub
		//System.out.println("En");
   /*   Product o1= new Product();
       Product o2= new Product();
       Product o3= new Product();
       Product o4= new Product();
       Product o5= new Product();*/
       for(int i=1;i<=5;i++)
       {
    	   System.out.println("Enter the product ID:");
    	   String  a=sc.nextLine();
    	   System.out.println("Enter tye price of the product:");
    	   double b=sc.nextDouble();
       }
      /* o1.display();
       o2.display();
       o3.display();
       o4.display();
       o5.display();*/

       


	}

}
