package Mano;
import java.util.Scanner;
public class SplitRollno {

	public static void main(String[] args) {
		int n;
		Scanner sc=new Scanner(System.in);

		n=sc.nextInt();
		int rollno[]=new int[n];
		
		for(int i=0;i<n;i++) {
			rollno[i]=sc.nextInt();
			
		}
	
		
		System.out.println("group 1");
		for(int i=0;i<n;) {
			
			System.out.println(rollno[i]);
			i=i+4;
		}
		
		
			System.out.println("group 2");
		for(int i=1;i<n;) {
			System.out.println(rollno[i]);
			i=i+4;
		}
		System.out.println("group 3");
		for(int i=2;i<n;) {
			System.out.println(rollno[i]);
			i=i+4;
		}
		
		System.out.println("group 4");
		for(int i=3;i<n;) {
			System.out.println(rollno[i]);
			i=i+4;
		}
	}
	

}
