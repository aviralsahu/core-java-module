public class Day4_29 
{

	public static void main(String[] args) {
		int a[] = {2,5,9,6};
		int b[] = {3,6,9,7,};
		int c[] = {1,8,2,5,3,7};
		
		int arr[][] = new int[3][];
		arr[0]=a;
		arr[1]=b;
		arr[2]=c;
		
		int countA = 0;
		
		
		for(int ar[] : arr) {
			countA++;
			int countB = 0;
			for(int e : ar) {
				countB++;
				
			}
			System.out.println("Total number of elemnts in 1D array are :  "+countB);
		}
		System.out.println("Total number of 1D arrays are : "+countA);

	}

}
