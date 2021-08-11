package OOPSConcept;

public class MethodOverloading {

	public static void main(String[] args) {
		// We can also override main method--in general we dont use it
		//Cannot create a method inside a method.
		//duplicate method---same method name with same number of arguments are not allowed.
		
		//method overloading: When method name is same with different arguments/input parameters and different 
		//datatypes within the same class.
		
		MethodOverloading obj = new MethodOverloading();
		obj.sum();
		obj.sum(100);
		obj.sum(12.22);
		obj.sum(10, 20);
	}
	
	public void sum() {
		System.out.println("Sum method--Zero Parameters");
	}
	
	public void sum(int i) {
		System.out.println("Sum method--one Parameter");
		System.out.println(i);
	}

	public void sum(double d) {
		System.out.println("Sum method--one Parameter");
		System.out.println(d);
	}
	
	public void sum(int x, int y) {
		System.out.println("Sum method--two Parameters");
		System.out.println(x+y);
	}

}
