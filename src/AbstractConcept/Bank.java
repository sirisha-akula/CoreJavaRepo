package AbstractConcept;
/*Hiding the implementation logic means Abstraction, abstract class can have both abstract and non-abstract methods
 * abstract class can also have only non-abstract methods or abstract methods.But if it has single abstract method also
 * then the class should be declared as abstract class.
 * We cannot create object of abstract classes.
 * Interface- we can achieve 100% abstraction, Abstract class-0-100% abstraction (partial abstraction)
 * if u want to hide only some logic(methods) then u can go for abstract classes( partial abstraction)
 */

public abstract class Bank {

	int age = 10; //non-static var
	static int salary = 100;//static var
	final int min_bal=500;//final var
	
	public abstract void homeloan(); //abstract method ---no method body
	
	public abstract int carloan(); //abstract method
	
	public void credit() { //non-abstract method
		System.out.println("this is credit card");
	}
	
	
	public String debit(String s) {//non-abstract method
		System.out.println("this is string value: "+s);
		return s;
	}
	
	}


