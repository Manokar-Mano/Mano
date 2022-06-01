package Polymorphism_;
class Triangle{
	public void size() {
		System.out.println("Size is Triangle");
	}
}
class circle extends Triangle{
	public void size() {
		System.out.println("Size is Circle");
		
	}
}
class Square{
	public void size() {
		System.out.println("Size is Square");
	}
}

public class JavaPolymorphism {

	public static void main(String[] args) {
		circle c=new circle();
		c.size();
		Square s=new Square();
		s.size();

	}

}
