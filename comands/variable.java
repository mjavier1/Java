package incrementa_decrementa;

public class variable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			int x=0;
				int y=0;
				System.out.println("x add " + x +"  and " + y);
			x++;
			System.out.println("x++ resultado in "+ x);
			System.out.println("Resetting x back to 0.");
			x=0;
			y=x++;
			System.out.println("y = x++ (postfix) results in:");
			System.out.println("x is " + x);
			 System.out.println("y is " + y);
			 System.out.println("_____________________");

			 y = ++x;
			 System.out.println("y = ++x (prefix) results in:");
			  System.out.println("x is "+ x);
			  System.out.println("y is " + y);
			  System.out.println("______________________");
				
				
				
				
	}

}
