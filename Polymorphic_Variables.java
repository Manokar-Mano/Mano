package Polymorphism_;
class Balll{
	public void playing() {
		System.out.println("Common Playing Ball");
	}
}
class FoottBall extends Balll{
	@Override
	public void playing()  {
		System.out.println("Football Playing Ball");
		
		
	}
}

public class Polymorphic_Variables {

	public static void main(String[] args) {
		//declare an object variable
		Balll B1;
		//create object in Ball
		B1=new Balll();
		B1.playing();
		//create object in CricketBall
		B1=new FoottBall();
		B1.playing();
	}

}
