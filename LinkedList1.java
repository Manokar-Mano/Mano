package Collection;

import java.util.LinkedList;

public class LinkedList1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       LinkedList<String>animal=new LinkedList<>();
       
      //add method
       animal.add("dog");
       animal.add("cat");
       animal.add("cow");
       System.out.println(animal);
       
       //add() method with the index
       animal.add(1,"horse");
       System.out.println(animal);
       
       //get element
       String st=animal.get(2);
       System.out.println(st);
       
       //set() method
       animal.set(3, "lion");
       System.out.println(animal);
       
       //remove method
       
       String str=animal.remove(1);
       System.out.println(str);
       System.out.println(animal);
	}

}
