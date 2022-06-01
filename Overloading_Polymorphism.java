package Polymorphism_;
class Pattern{
	public void display() {
		for(int i=0;i<5;i++) {
			System.out.print("* ");
		}
	}
	public void display(String name) {
		for(int i=0;i<5;i++) {
			System.out.print(name);
		}
		
	}
}

public class Overloading_Polymorphism {

	public static void main(String[] args) {
		Pattern p=new Pattern();
		p.display();
		System.out.println("\n");
		p.display("Mano ");
		System.out.println("\n");
		

	}

}
