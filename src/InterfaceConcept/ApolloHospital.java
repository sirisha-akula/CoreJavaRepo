package InterfaceConcept;

public class ApolloHospital extends GlobalPatient implements USMedical, UKMedical, IndianMedical {


	@Override //@Override means this method are overrided.
	public void physioServices() {
		System.out.println("Apollo-phsioservices");		
	}

	@Override
	public void oncologyServices() {
		System.out.println("Apollo-oncologyservices");		
		
	}

	@Override
	public void orthopedicServices() {
		System.out.println("Apollo-orthoservices");		
		
	}

	@Override
	public void entServices() {
		System.out.println("Apollo-entservices");		
		
	}

	@Override
	public void xrayServices() {
		System.out.println("Apollo-xrayservices");		
		
	}

	@Override
	public void gynecServices() {
		System.out.println("Apollo-xrayservices");		
		
	}

	@Override
	public void childServices() {
	System.out.println("Apollo-xrayservices");
		
	}
	
	@Override //this method coming from WHO interface
	public void coronaServices() {
      System.out.println(" corona vacine");		
	}
	
	//non-overriden methods
	public void chestServices() {
		System.out.println("Apollo Chest Services");
	}
	
	public void emergencyServices() {
		System.out.println("Apollo Emergency Services");
	}

	public static void covidServices() {
		System.out.println("IndianMedical- CovidServices");
	}
	
	 public  void intership() {
		 System.out.println("ChildClass- Default method");
}}
