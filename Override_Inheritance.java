package Inheritance;
//super class
class HeroBike{
	public void brake() {
		System.out.println("Good Control");
	}
}
//subclass
class HondaBike extends HeroBike{
	//override()
	
	@Override
	public void brake() {
		System.out.println("Bad Control");
	}
	//new method in subclass
	public void handle() {
		System.out.println("Good control");
	   }
	}


public class Override_Inheritance {
	public static void main(String[]args) {
		HondaBike H=new HondaBike();
	//call HondaBike method
		H.brake();
		H.handle();
	}

}
