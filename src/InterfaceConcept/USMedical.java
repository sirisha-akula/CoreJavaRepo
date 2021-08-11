package InterfaceConcept;

/* Object of Interfaces cannot be created
 * only method declaration---method prototype--no method body --Abstract methods
 * cannot create static prototype method in interface(bcoz we cannot override static methods) but Interface variables
 * are static and final bydefault
 * We can achieve 100% abstraction--i.e method with no method body
 * */
 
public interface USMedical extends WHO{
	
	int min_fee = 100;
	public void physioServices();
	public void oncologyServices();
	public void orthopedicServices();
	
	//from JDK 1.8 static methods are allowed in Interface but with method body
	//static method with method body //cannot override Static methods
	public static void services_911() {
		System.out.println("911 services");
		
	}
	
	
	//from jdk 1.8 default methods are allowed with method body
	default void intership() {
		System.out.println("us--- Parent default method");
	}

}
