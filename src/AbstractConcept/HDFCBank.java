package AbstractConcept;

public class HDFCBank extends Bank{

	public static void main(String[] args) {
		
		HDFCBank obj = new HDFCBank();
		obj.carloan();
		obj.homeloan();
	}

	@Override
	public void homeloan() {
		System.out.println("HDFC hoemloan");
		
	}

	@Override
	public int carloan() {
		System.out.println("hdfc carloan");
		return 0;
		
	}

}
