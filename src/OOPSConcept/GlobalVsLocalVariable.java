package OOPSConcept;

public class GlobalVsLocalVariable {

	//GlobalVariable or class Variables
	String name = "Arjun";
	int age = 1;
	
	public static void main(String[] args) {
		
		float weight = 9.6f; //local variable for this method.
		System.out.println(weight);
		
		GlobalVsLocalVariable obj = new GlobalVsLocalVariable();
		
		System.out.println(obj.name);
		System.out.println(obj.age);
		obj.gender();
	}
	
	public void gender() {
		char c = 'M'; //local variable for this method.
		System.out.println(c);
	}

}
