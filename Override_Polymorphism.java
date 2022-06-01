package Polymorphism_;
class Ball{
	public void playing() {
		System.out.println("Common Playing Ball");
	}
}
class CricketBall extends Ball{
	@Override
	public void playing()  {
		System.out.println("Cricket Playing Ball");
		
		
	}
}

public class Override_Polymorphism {

public static void main(String[] args) {
	CricketBall C=new CricketBall();
	C.playing();
	Ball B=new Ball();
	B.playing();
		

	}

}
