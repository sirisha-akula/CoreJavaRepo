package OOPSConcept;

public class ConstructorConcept {
	/*Constructor is called once object is created(instantiated)
	 * it is used to initialize values for global/class variables using "this" keyword
	 */

	public ConstructorConcept() {
		System.out.println("default constructor");
	}
	
	public ConstructorConcept(int i) {
		System.out.println("Single parameter constructor");
		System.out.println("the value of i: "+i);
	}
	
	public ConstructorConcept(String x , String y) {
		System.out.println("Two parameters constructor");
		System.out.println("the value of x: "+x);
		System.out.println("the value of y: "+y);
	}
	public static void main(String[] args) {
		ConstructorConcept obj = new ConstructorConcept();
		ConstructorConcept obj1 = new ConstructorConcept(10);
		ConstructorConcept obj2 = new ConstructorConcept("abcd", "wxyz");
		
	}

}
