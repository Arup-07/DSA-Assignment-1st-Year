
public class Q1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      int n= Integer.parseInt(args[0]);
      int c=0;
      while(n/2>=2)
      {
    	  c++;
    	  n/=2;
      }
      c-=1;
      System.out.println(c);
	}

}
