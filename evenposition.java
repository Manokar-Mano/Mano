package Mano;

public class evenposition {

	public static void main(String[] args) {
		int[]ar=new int[]{1,2,3,4,5};
		
		System.out.println("Elements of given array present on even position:");
		for(int i=1;i<ar.length;i=i+2) {
			System.out.println(ar[i]);
		}
		
	
	}
}
