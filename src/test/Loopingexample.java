package test;

public class Loopingexample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i; 
		int[] array1= {10,20,30,43,56};
		String str1="clean india  green india";
		for (i=1;i<=10;i++)
		{
			System.out.println(i);
			
		}
		for (i=0;i<array1.length;i++)
		{
			System.out.println(i);
		}
		for (i=array1.length-1;i>0;i--)
		{
			System.out.println(i);
		}
		for (int values:array1)
		{
			System.out.println(values);
		}
		for (int a:array1)
		{
      System.out.println(a);
	}
		for (int j=0;j<str1.length();j++)
		{
			System.out.println(str1.charAt(j));
		
	int x=10;
	while(x<=10)
	{
		System.out.println(x);
	x=x+1;
		
	}
	
	int n1=2345;
	while(n1>0)
	{
	int r= n1%10;
	System.out.println(r);
	 n1 = n1/10;
	}
}
	}
}
