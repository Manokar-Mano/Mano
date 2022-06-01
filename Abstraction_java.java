package Abstraction;
abstract class MotorBike{
	abstract void brake(); 
    }
	class SportBike extends MotorBike{

		@Override
		//implement abstract method 
		 public void brake() {
			System.out.println("Sport Bike Brake");
		}
			
	}
	class NormalBike extends MotorBike{
		@Override
		//implement abstract method 
		 public void brake() {
			System.out.println("Normal Bike Brake");
		}
		
	}

public class Abstraction_java {

	public static void main(String[] args) {
		NormalBike N=new NormalBike();
		N.brake();
		SportBike S=new SportBike();
		S.brake();

	}

}
