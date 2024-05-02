package collection;

import java.util.ArrayList;

public class ArrayListClear {

	public static void main(String[] args) {
		ArrayList obj = new ArrayList();
		
		obj.add("abc");
		obj.add("def");
		obj.add("xyz");
		
		obj.clear();
		
		System.out.println(obj);

	}

}
