package InterfaceConcept;

public abstract class Shapeabstract {
	//cannot create object of abstract class.
	//we can achieve 0(no abstract methods) to 100%(all abstract methods) abstraction using abstract class
	//abstraction means hiding the  logic
	int color;
	
	//abstract method
	public abstract void drawing();
	
	//non-abstract method
	public void fillMethod() {
		System.out.println("fill method");
	}

}
