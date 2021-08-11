package OOPSConcept;

public class Car {

	int model;
	int wheels;
	
	public static void main(String[] args) {
		// a, b, c -->are the Object reference variables.
		//new keyword is used to create object.
		//new Car();-->this is the Object of Car class.

		Car a = new Car();
		Car b = new Car();
		Car c = new Car();
		
		a.model = 2011;
		a.wheels =4;
		
		b.model=2020;
		b.wheels=3;
		
		c.model=2018;
		c.wheels=2;
		
		System.out.println(a.model);
		System.out.println(a.wheels);
		
		System.out.println(b.model);
		System.out.println(b.wheels);
		
		System.out.println(c.model);
		System.out.println(c.wheels);
	}

}
