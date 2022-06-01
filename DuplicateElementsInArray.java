package Mano;

public class DuplicateElementsInArray {

	public static void main(String[] args) {
		int ara[]= {1,2,3,4,2,3,5,5,7,6};
		for(int i=0;i<ara.length;i++) 
		{
			for(int j=i+1;j<ara.length;j++)
				
			{
				if(ara[i]==ara[j])
				
				{
					System.out.println(ara[j]);
				}
			}
		}

	}

}
