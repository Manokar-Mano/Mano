package Interface_;
interface A{
	 void print();
}
interface B {
	void show();
	
}
public class Multiple_Interface implements A,B  {

	@Override
	public void show() {
		System.out.println("Hello");
		
	}

	@Override
	public void print() {
		System.out.println("Welcome");}
		public static void main(String[] args) {
			 Multiple_Interface m=new  Multiple_Interface();
			 m.print();
			 m.show();
		}
			
		
	}

