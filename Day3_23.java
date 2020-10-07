import java.util.*;

public class Day3_23 {
	

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter size of Array : ");
		int n = sc.nextInt();
		int ar[] = new int[n];
		for(int i = 0 ; i < ar.length ;i++) {
			System.out.println("Insert "+(i+1)+" element : ");
			ar[i] = sc.nextInt();
		}
		int ar2[]= new int[n];
		int k = 0;
		for(int i = ar.length-1; i > -1 ; i--) {
			
			ar2[k] = ar[i];
			k++;
		}
		
		System.out.println("Array : ");
		for(int i=0; i < ar.length ; i++) {
			System.out.print(ar[i]+" ");
		}
		System.out.println("");
		System.out.println("Reversed array : ");
		for(int i=0; i < ar2.length ; i++) {
			System.out.print(ar2[i]+" ");
		}
		
		
		

	}
