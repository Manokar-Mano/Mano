package Collection;

import java.util.ArrayList;
import java.util.List;

public class List_Implement_ArrayList {

	public static void main(String[] args) {
		
     List<Integer>numbers= new ArrayList<>();
    
     //add element to list
     numbers.add(1);
     numbers.add(2);
     numbers.add(3);
     System.out.println("List :"+numbers);
     
     //Access element from the list
     int number=numbers.get(2);
     System.out.println("Access: "+number);
     
     //Remove element from the list
     
     int removednumber=numbers.remove(1);
     System.out.println("Remove: "+removednumber);
     
     
     
	}

}
