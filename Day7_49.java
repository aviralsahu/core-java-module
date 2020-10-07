interface Taxable{
	double salesTax = 0.07;
	double incomeTax = 0.105;
	//double totaltax;
	void calcTax();
	
}

class Emp implements Taxable{
	int id ; 
	String name ;
	double salary;
	Emp(int id , String name , double salary){
		this.id = id ; 
		this.name = name ;
		this.salary = salary;
	}
	
	
	
	void setSalary(double salary ) {
		this.salary = salary;
	}
	
	
	public void calcTax() {
		
		double it = salary * incomeTax;
		
		
		System.out.println("Id : "+id);
		System.out.println("Name : "+name);
		System.out.println("Salary : "+salary);
		System.out.println("Tax is : " +it);
	}
}

class Product implements Taxable{
	int pid;
	double price ; 
	double quantity;
    Product(int pid, double price, double quantity) {
		this.pid = pid;
		this.price = price;
		this.quantity = quantity;
	}
    
  
	public void calcTax() {
		
		double st = price * salesTax;
		
		System.out.println("Product Id : "+pid);
		System.out.println("Price : "+price);
		System.out.println("Quantity : "+quantity);
		System.out.println("Tax is : " +st);
		
	}
	
}


public class Ques49 {

	public static void main(String[] args) {
		Emp e = new Emp(1,"cdacaish",25000);
		e.calcTax();
		System.out.println("----------------------------------");
		Product p = new Product(23,500,4);
		p.calcTax();

	}

}
