
public class Employeedata {
	
	//how to implement Encapsulation
	//1. create private data variables so that these vars cannot be accessed outside of class.
	//we define private variables for high level security in java we use encapsulation.

	private int ssn;
	private String empName;
	private int empage;
	
	public static void main(String[] args) {
		
		Employeedata obj = new Employeedata();
		obj.setEmpage(47);
		obj.setEmpName("Tom");
		obj.setSsn(123);
		
	System.out.println(obj.getSsn());
	System.out.println(obj.getEmpage());
	System.out.println(obj.getEmpage());
		
	}
    //2.getter and setter methods:to get and set the values of these fields.
	//its not compulsory to define set and get method always just define private variables for high level security
	
	public int getSsn() {
		return ssn;
	}

	public void setSsn(int ssn) {
		this.ssn = ssn;
	}

	public String getEmpName() {
		return empName;
	}

	public void setEmpName(String empName) {
		this.empName = empName;
	}

	public int getEmpage() {
		return empage;
	}

	public void setEmpage(int empage) {
		this.empage = empage;
	}

}
