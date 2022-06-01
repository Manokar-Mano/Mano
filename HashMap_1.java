package Map_1;

import java.util.HashMap;

public class HashMap_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashMap<Integer, String>number=new HashMap<>();
		
		//add method
		number.put(1,"java");
		number.put(2,"python");
		number.put(3,"javaScript");
		System.out.println(number);
		
		//get method
		String st=number.get(2);
		System.out.println(st);
		
		//using keyset
		
		System.out.println(number.keySet());
		//using values
		System.out.println(number.values());
		
		//entryset
		System.out.println(number.entrySet());
		
		//change element with key
		number.replace(2, "C++");
		System.out.println(number);
		
		//remove method
		String value=number.remove(2);
		System.out.println(value);
		
		System.out.println(number);
		
		
		
		
		
		
		

	}

}
