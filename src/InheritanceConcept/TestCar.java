package InheritanceConcept;

public class TestCar {

	public static void main(String[] args) {
		
		BMW b= new BMW(); //Static polymorphism or Compile time polymorphism
		b.engine();
		b.start();
		b.stop();
		b.theftSafety();
		
		System.out.println("*************");
		
		Car c = new Car();
		c.engine();
		c.start();
		c.stop();
		c.refuel();
		
		System.out.println("*************");
		//Top Casting: Child class object can be referred by parent class reference variable --Dynamic polymorphism or runtime polymorphism
		
		Car c1 = new BMW();
		c1.engine();
		c1.start();
		c1.stop();
		c1.refuel();
		
		//Down Casting
		BMW b1 = (BMW)new Car(); //it gives ClassCast Exception
		b1.theftSafety();
		b1.engine();
		b1.start();
		b1.stop();
		
	}

}
