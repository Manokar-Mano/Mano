package Inheritance;
//super class
class DioBike{
	public void brake() {
		System.out.println("Good Control");
	}
}
//subclass
class DukeBike extends DioBike{
	//override()
	
	@Override
	public void brake() {
		super.brake();
		System.out.println("Bad Control");
	}
	//new method in subclass
	public void handle() {
		System.out.println("High control");
	   }
	}

    public class SuperKeyword_Inheritance {
	public static void main(String[]args) {
		DukeBike d=new DukeBike();
	//call HondaBike method
		d.brake();
		d.handle();
	}

}


