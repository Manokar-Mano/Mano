package Mano;

public class leftRotateElementsArray {

	public static void main(String[] args) {
		int[]ar=new int[] {1,2,3,4,5};
		int n=3;
		
		System.out.println("original array:");
		for(int i=0;i<ar.length;i++) {
			
			System.out.println(ar[i]+" ");
		
		}
		for(int i=0;i<n;i++) {
			int j,first;
			first=ar[0];
			for(j=0;j<ar.length-1;j++) {
				
				ar[j]=ar[j+1];
			}
			ar[j]=first;
		}
		System.out.println();
		System.out.println("Array after left rotation:");
		for(int i=0;i<ar.length;i++) {
			System.out.println(ar[i]+" ");
		}
		

	}

}
