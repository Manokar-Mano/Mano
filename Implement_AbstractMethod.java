package Abstraction;
abstract class Animal{
	abstract void makeSound(); 
	public void eat() {
		System.out.println("I Can Eat");
	   }
	}
	class dog extends Animal{

		@Override
		//implement abstract method 
		 public void makeSound() {
			System.out.println("Bark bark");
		}
			
	}
		
	public class Implement_AbstractMethod {

	public static void main(String[] args) {
		dog d=new dog();
		d.makeSound();
		d.eat();
		

	}

}
