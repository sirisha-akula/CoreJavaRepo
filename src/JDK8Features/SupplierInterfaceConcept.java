package JDK8Features;

import java.util.function.Supplier;

public class SupplierInterfaceConcept {

	public static void main(String[] args) {
		// takes no argument and gives result
		getText(() -> "Java");
		getText(() -> "World");
		getText(() -> "Automation");
		

	}
	
	public static void getText(Supplier<String> text) {
		System.out.println(text.get().length());
	}

}
