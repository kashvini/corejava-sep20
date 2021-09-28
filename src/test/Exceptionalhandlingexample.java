package test;

public class Exceptionalhandlingexample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a=10;
		int b[] = {1,2,23};
		
		try {
		System.out.println(b[1]);
		}
		
		catch(NullPointerException e)
		{
			e.printStackTrace();
			System.out.println("Inside Nulll pointer");
		}
		catch(ArithmeticException e)
		{
			e.printStackTrace();
			System.out.println("Inside og gernic");
			
			
		}

	}

}
