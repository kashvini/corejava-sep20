package test;

public class primenumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num = 47;
		for(int i=1;i<=num/2;i++)
		{
		//conditional for non prime number
			if(num % i == 0) 
			{
				System.out.println(num+ "is a prime number.");
			}
			else
			{
				System.out.println(num + "is a not prime number");
			}
		}
		

	}

}
