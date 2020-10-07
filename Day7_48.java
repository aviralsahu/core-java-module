abstract class Processor{
	 double data ;
	void showData() {
		System.out.println("Data : "+data);
	}
	abstract void process();
}

class Factorial extends Processor{
	void process() {
		Scanner sc = new Scanner (System.in);
		System.out.println("Enter the number :");
		int num = sc.nextInt();
		
		int fact = 1 ;
		for(int i = 1 ; i <= num ; i++) {
			fact = fact * i ;
		}
		
		data = fact ;
	}
}

class Circle extends Processor{
	void process() {
		Scanner sc = new Scanner (System.in);
		System.out.println("Enter the number :");
		int r = sc.nextInt();
		
		double area = 3.14 * r * r;
		
		data = area ;
		
	}
}



public class Ques48 {

	public static void main(String[] args) {
		Processor f = new Factorial();
		f.process();
		f.showData();
		
		Processor c = new Circle();
		c.process();
		c.showData();

	}

}

