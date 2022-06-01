package Mano;

public class RecursionReverse {

	public static void main(String[] args) {
		
	
	String s[]="i love india".split(" ");
	
				
	String a=" ";
	for(int i=s.length-1;i>=0;i--)     
	{
		
	a+=s[i]+" ";
	}
	
	System.out.println(a.substring(0, a.length()-1));
	
	}
	

	}
	

	


