package test;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Collections;
public class Listexample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub  
		ArrayList<String> list = new ArrayList <String> ();
		list.add("Ashvini");
		list.add("Kunchala");
		System.out.println(list);
	 System.out.println(list.get(1));
	 for (int i=0;i<list.size();i++) {
		System.out.println(list.get(i));
	 }
	 Iterator <String> itr =list .iterator();
	 while(itr.hasNext()) {
		 System.out.println(itr.next());
	 }
	 for (String data:list) {
		 System.out.println(data);
		 
	 }
	 Collections.sort(list);
	 Collections.reverse(list);
	 System.out.println(list);
	 
	}

}
