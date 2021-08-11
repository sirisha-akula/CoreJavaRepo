package InheritanceConcept;

public class BMW extends Car{
	//When same method is present in parent class as well as in child class with same name and same no. of arguments is called 
	//Method Overriding
	
	public void start() {
		System.out.println("BMW--Start");
		
	}
	
	public void theftSafety() {
		System.out.println("BMW--theftSafety");

}
}