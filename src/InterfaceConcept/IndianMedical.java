package InterfaceConcept;

public interface IndianMedical {
	
	public void gynecServices();
	
	public void childServices();
	
	
	//this is static method and static methods cannot be overriden
	public static void covidServices() {
		System.out.println("Indian covid services");
	}

	default void pcrTest() {
	 System.out.println("PCR Test");
	
	}
}
