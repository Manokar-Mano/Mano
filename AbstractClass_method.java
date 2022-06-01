package Abstraction;
abstract class language{
	//method of abstract class
	public void display() {
		System.out.println("This is java");
	}
}

public  class AbstractClass_method extends language {

	public static void main(String[] args) {
		// create object in AbstractClass_method
		AbstractClass_method a=new AbstractClass_method();
		a.display();

	}

}
