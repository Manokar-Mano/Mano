package Map_1;

import java.util.LinkedHashMap;

public class Linked_HashMap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		LinkedHashMap<String, Integer>evennumbers=new LinkedHashMap<>();
		
		//using put method
		evennumbers.put("Two", 2);
		evennumbers.put("four", 4);
        System.out.println(evennumbers);
        
        //putIfAbsent method
        
        evennumbers.putIfAbsent("Six", 6);
        System.out.println(evennumbers);

      //using keyset
		
      		System.out.println(evennumbers.keySet());
      		//using values
      		System.out.println(evennumbers.values());
      		
      		//entryset
      		System.out.println(evennumbers.entrySet());
      		
      		//get method
      		
      		int value=evennumbers.get("four");
      		System.out.println(value);
      		
      	//remove method
    		int values=evennumbers.remove("Two");
    		System.out.println(value);
    		
    		System.out.println(evennumbers);
    		

	}
}
