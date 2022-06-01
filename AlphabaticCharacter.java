package Mano;

public class AlphabaticCharacter {

	public static void main(String[] args) {
		int point1=67;
		int point2=39;
		int point3=83;
		
		boolean checkAlp1=Character.isAlphabetic(point1);
		if(checkAlp1) {
			System.out.println("point"+point1+"is an alphabet");
		}
		else {
			System.out.println("point"+point2+"is not an alphabet");
		}
		boolean checkAlp2=Character.isAlphabetic(point2);
		if(checkAlp2) {
			System.out.println("point"+point2+"is an alphabet");
		}
		else {
			System.out.println("point"+point2+"is not an alphabet");
		}
		boolean checkAlp3=Character.isAlphabetic(point3);
		if(checkAlp3) {
			System.out.println("point"+point3+"is an alphabet");
		}
		else {
			System.out.println("point"+point3+"is not an alphabet");
		}

	}

}
