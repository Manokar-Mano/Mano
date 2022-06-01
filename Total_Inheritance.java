package Inheritance;

//Single Inheritance
/*class GrandFather{
	void name() {
		System.out.println("My GrandFather Name :Manikam");
	}
}
	class Father extends GrandFather{
		void Age() {
			System.out.println("Father Age is :35");
		}
		
	}


public class Total_Inheritance {
	public static void main(String[]args) {
		Father f=new Father();
		f.Age();
		f.name();
	}

}*/

//Multilevel Inheritance
/*class GrandFather{
	void name() {
		System.out.println("My GrandFather Name :Manikam");
	}
}
	class Father extends GrandFather{
		void Age() {
			System.out.println("Father Age is :35");
		}
		
	}
	class Child extends Father{
		void play() {
			System.out.println("Child playing cricket");
		}
	}
	public class Total_Inheritance {
		public static void main(String[]args) {
			Child c=new Child();
			c.play();
			c.Age();
			c.name();
		}

	}*/
	//Hierachical Inheritance
	class GrandFather{
		void name() {
			System.out.println("My GrandFather Name :Manikam");
		}
	}
		class Father extends GrandFather{
			void Age() {
				System.out.println("Father Age is :35");
			}
			
		}
		class Child extends GrandFather{
			void play() {
				System.out.println("Child playing cricket");
			}
		}
		public class Total_Inheritance {
			public static void main(String[]args) {
				Child c=new Child();
				c.play();
				c.name();
			}

		}


