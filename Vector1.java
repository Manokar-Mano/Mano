package Collection;

import java.util.Vector;

public class Vector1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Vector<String>animals=new Vector<>();
		
		   //add method
	       animals.add("dog");
	       animals.add("cat");
	       animals.add("cow");
	       System.out.println(animals);
	       
	       //index method
	       animals.add(2, "monkey");
	       System.out.println(animals);
	       
	       //get element
	       String st=animals.get(2);
	       System.out.println(st);
	       
	       

	}

}
