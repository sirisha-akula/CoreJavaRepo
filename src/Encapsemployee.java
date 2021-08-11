
public class Encapsemployee {

	//how to implement Encapsulation
	//1. create private data variables so that these vars cannot be accessed outside of class.
	//we define private variables for high level security in java we use encapsulation.

	private int ssn;
	private String empname;
	private float empsal;
	
	public static void main(String[] args) {
		
		Encapsemployee obj = new Encapsemployee();
	
		obj.setSsn(12121);
		obj.setempname("Sai");
		obj.setempsal(100000.00f);
		
		System.out.println(obj.getSsn());
		System.out.println(obj.empname);
		System.out.println(obj.empsal);
	}
	
	//2.getter and setter methods:to get and set the values of these fields.
	//its not compulsory to define set and get method always just define private variables for high level security

	public int getSsn() {
		return ssn;
	}
	
	public void setSsn(int ssn) {
		this.ssn=ssn;
	}
	
	public String getempName() {
		return empname;
	}
	
	public void setempname(String empname) {
		this.empname=empname;
	}
	
	public float getempsal() {
		return empsal;
	}
	
	public void setempsal(float empsal) {
		this.empsal=empsal;
	}
	
	
}
