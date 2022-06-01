package Mano;
import java.util.Scanner;
public class ReverseNumber3 {

	public static void main(String[] args) {
		
		int i,rem,cal=0;
		
		Scanner sc=new Scanner(System.in);
		
		i=sc.nextInt();
		
		int temp=i;
				
		while(i!=0) {
				
			rem=i%10;
				
			cal=(cal*10)+rem;
				
			i=i/10;
				
		}
				
		System.out.println(cal);
				
		System.out.println(temp);
				
		int result=temp-cal;
				
		System.out.println(result);
			
	}

		
}



