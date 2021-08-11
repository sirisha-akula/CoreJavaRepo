package OOPSConcept;

public class FinallyConcept {

	/*finally block code is always executed with try catch block. code in finally will be executed irrespective of 
	 * exception occurred or not. 
	 *  */
	public static void main(String[] args) {
		test1();
		test2();
	}
	
	public static void test1() {
		try {
			System.out.println("try block"); throw new RuntimeException("test");
		}
		catch(Exception e){
			System.out.println("inside catch block");
		}
		
		finally {
			System.out.println("inside finally block");
		}
		
	}
	
	public static void test2() {
		try {
			System.out.println("try test2 block");
		}
		finally {
			System.out.println("finally test2 block");
		}
		
	}

}
