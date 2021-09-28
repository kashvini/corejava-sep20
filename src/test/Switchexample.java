package test;

public class Switchexample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int age =19;
		switch(age)
		{
		case 18:
		case 19:
			System.out.println("Eligable");
			break;
		case 17:
			System.out.println("will be for eligablenext year");
			break;
		case 15:
			System.out.println("Not eligable");
			break;
			default:
				System.out.println("Default");

	}

}
}