package test;

public class Throwexample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int age=17;
      Throwexample obj = new Throwexample();
      try {
    	 obj.ageCheck (age);
      }catch (ArithmeticException e) {
      System.out.println("Exception");
	}
      System.out.println("after Exception");
	
	
}
	public void  ageCheck (int age) {
    if (age<18) {
    	throw new ArithmeticException("Age not allowed");
    }
	}
}