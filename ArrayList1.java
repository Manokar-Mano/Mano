package Collection;

import java.util.ArrayList;

public class ArrayList1 {

	public static void main(String[] args) {
		ArrayList<String>language=new ArrayList<>(); 
		
		//Add method
		language.add("Tamil");
		language.add("English");
		language.add("Maths");
		language.add("Science");
		language.add("Hindi");
		System.out.println("ArrayList"+language);
		
		
		//get element from arraylist
		
		String st=language.get(2);
		System.out.println("Element index 2 : "+st);
		
		//Change element of the Arraylist
		
		language.set(3, "Social Science");
		System.out.println("Modified: "+language);
		
	    //Remove method
		String str=language.remove(2);
		System.out.println("Removed Element : "+str);
		
		
		//iterate useing for-each loop
		
		for(String sub:language) {
			System.out.print(sub);
			System.out.print(" ");
		}
		
		
		
		

	}

}
