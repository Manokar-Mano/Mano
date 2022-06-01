package Mano;

public class smallElementArray {

	public static void main(String[] args) {
		int[]ar=new int[] {25,11,12,5,80,56};
		int min=ar[0];
		for(int i=0;i<ar.length;i++) {
			
			if(ar[i]<min)
			min=ar[i];
				
		}

	System.out.println("smallest element present in given array:"+min);
	

	}

}
