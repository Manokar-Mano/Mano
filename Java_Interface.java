package Interface_;

//create interface
interface Size{
	void getName(String name);
}
//class implement interface
class Language implements Size{
	
	//implement abstract method

	@Override
	public void getName(String name) {
		System.out.println(name);
		
		
	}
	
}

public class Java_Interface {

	public static void main(String[] args) {
		Language l=new Language();
		l.getName("Java");
		

	}

}




