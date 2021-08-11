package OOPSConcept;

public final class FinalConcept {

	public static void main(String[] args) {
		/* To prevent inheritance: we use final keyword "public final class FinalConcept", 
		 * so that parent class cannot be inherited.
		to prevent MethodOverriding : if we dont want specific method to be overridden we use final keyword
		on that particular method "public final void start()"
		final keyword is used to declare constant values,i.e we cannot change the value. ex: final int i = 10; */
		
	final int min_bal =100;
		
		
	}
	//final is keyword, Finalize  is a method, finally is block.
	//Finalize: comes before garbage collector system.gc();and it deallocates all null/no reference objects.
	
	public final void start() {
		System.out.println("We cannot override final methods");
	}

}
