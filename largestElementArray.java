package Mano;

public class largestElementArray {

	public static void main(String[] args) {
		int[]ar=new int[] {25,11,12,5,80,56};
		int max=ar[0];
		for(int i=0;i<ar.length;i++) {
			
			if(ar[i]>max)
			max=ar[i];
				
		}

	System.out.println("Largest element present in given array:"+max);
	}
}
