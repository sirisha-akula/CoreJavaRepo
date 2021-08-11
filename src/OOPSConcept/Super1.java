package OOPSConcept;

/*Inside the constructor we cannot have two super keywords,
 * always super keyword should be first statement in constructor.
 * Superkeyword	is used to call parent class constructor, if we pass no value then super(); default constructor
 * is called ,if we pass single value super(int i) single value constructor is called.
 */
public class Super1 extends SuperKeywords{
	
	public Super1() {
		super();
	}
	
	public Super1(int i) {
		super(i);
	}

	public Super1(String i, String j) {
		super(i,j);
		
	}
	public static void main(String[] args) {
		Super1 obj = new Super1();
		Super1 obj1 = new Super1(12);
		Super1 obj2 = new Super1("Kittu", "Arjun");
	}

}
