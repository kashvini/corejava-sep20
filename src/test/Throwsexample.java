package test;

public class Throwsexample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	Throwsexample obj= new Throwsexample();
	obj. calculator();
	}
	public void calculator (){
		try {
			add();
			
		}catch (InterruptedException e) {
			e.printStackTrace();
			
		}
	

	}
	public void add() throws InterruptedException{
		System.out.println("Inside method1 ");
	}

}
