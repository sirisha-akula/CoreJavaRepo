package JDK8Features;

@FunctionalInterface
public interface WebPage {
	
	//SAM : Single Abstract Method and this type of interface is called functional interface. 
	//And Lambda will be applied on SAM.
	
	
	public void header(String value , int age);
	
	//after jdk 1.8 they introduced static methods and default methods but only one abstract method in Functional Interface.
	
	public static void test() {
		
	}

    public static void test4() {
		
	}
	
    default void test2() {
		
	}
	

	default void test3() {
		
	}
}
