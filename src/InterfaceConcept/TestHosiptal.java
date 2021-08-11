package InterfaceConcept;

public class TestHosiptal {

	public static void main(String[] args) {
		
		
		ApolloHospital ap = new ApolloHospital();
		ap.chestServices();
		ap.childServices();
		ap.getPatientHistory();
		System.out.println(USMedical.min_fee);
		
		USMedical us = new ApolloHospital(); //we can do top casting/up casting by creating object of apollohosiptal with 'us' interface object variable.
		//top -casting: child class object can be referred by parent interface reference variable
		us.oncologyServices();
		us.orthopedicServices();
		us.physioServices();
		USMedical.services_911();
		
		
		us.intership();
		ap.intership();
		
		IndianMedical.covidServices();
		
		UKMedical uk = new ApolloHospital();
		uk.entServices();
		uk.xrayServices();
		
		//down casting is not possible as we cannot create object of interface,it gives class cast exception
		//ApolloHospital ap1 = new USMedical();
		
		
		
		
	}

}
