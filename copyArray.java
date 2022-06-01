package Mano;

public class copyArray {

	public static void main(String[] args) {
		int ary[]= {1,2,3,4,5,6};
		int ary1[]=new int[ary.length];
		
		for(int i=0;i<ary.length;i++)
		{
		ary1[i]=ary[i];

		}
		for(int i=0;i<ary.length;i++) {
			System.out.println(ary1[i]+" ");
			
		    }
		}

}
