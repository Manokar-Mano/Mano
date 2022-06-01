package Mano;

public class stringOfOddLength {

	public static void main(String[] args) {
		
	String s="12345";
						
	int d=s.length();
	char ch[][]=new char[d][d];
				
	for(int i=0;i<d;i++)
				
	ch[i][i]=s.charAt(i);
				
				
	for(int i=(d-1),j=0;j<d;j++,i--)
				
	ch[i][j]=s.charAt(j);
				
	for(int i=0;i<d;i++)
	
	{
	
		for(int j=0;j<d;j++) {
					
		System.out.print(ch[i][j]);
		
		}
		
		System.out.println();
					
		}
	}

 }
	

	


