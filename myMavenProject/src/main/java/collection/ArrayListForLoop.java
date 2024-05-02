package collection;

import java.util.ArrayList;

public class ArrayListForLoop {

	public static void main(String[] args) {
		
		ArrayList <String> obj = new ArrayList <String> ();
		
		obj.add("ABC");
		obj.add("DEF");
		obj.add("XYZ");
		
		for(int i=0; i<obj.size(); i++) {
			
			System.out.println(obj.get(i));
		}

	}

}
