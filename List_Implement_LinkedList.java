package Collection;

import java.util.LinkedList;
import java.util.List;

public class List_Implement_LinkedList {

	public static void main(String[] args) {
		
LinkedList<Integer>numbers=new LinkedList<>();
//add element to list
numbers.add(1);
numbers.add(2);
numbers.add(3);
System.out.println("List :"+numbers);

//Access element from the list
int number=numbers.get(2);
System.out.println("Access: "+number);
//use index method
int index=numbers.indexOf(3);
System.out.println("Position: "+index);


//Remove element from the list

int removednumber=numbers.remove(1);
System.out.println("Remove: "+removednumber);




	}

}
