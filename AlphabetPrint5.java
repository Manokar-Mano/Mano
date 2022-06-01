package Mano;

public class AlphabetPrint5 {

	public static void main(String[] args) {
		
	 int row=5;
	  
	 char ch='E';
				
	  while(ch!='@')
		
	  {
		for(int i=row;i>0;i--)
			
		{
		
			for(int j=0;j<i;j++) {
			System.out.print(ch);
				
			}
			  System.out.println();
				
			  ch--;
					
		}
					
					
       }
						
	}				
}			
				
				
			
		

