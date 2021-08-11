package InterfaceConcept;

public class TestShape extends Shapeabstract{

	public static void main(String[] args) {
		Shapeabstract s1 = new TestShape();
		
	}

	@Override
	public void drawing() {
        System.out.println("test drawing");		
	}

}
