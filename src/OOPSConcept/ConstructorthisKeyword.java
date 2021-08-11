package OOPSConcept;

/*Constructor is called once object is created(instantiated)
 * it is used to initialize values for global/class variables using "this" keyword
 * for example we want to create 50 employee data(name age, salary, address) 
 * we declare the class/global variables and using this keyword we can initialize the class/global variables 
 * inside the constructor.And whenever object is created  with values, 
 * constructor will be called and class/global variables are initialized.
 */
public class ConstructorthisKeyword {
	
	//class variables
	String name;
	int age;

	public ConstructorthisKeyword(int age, String name)//local variables of constructor
	{
		this.name = name; ////now we have initialized class/global variables using this keyword(this.name) to local variables of constructor
		this.age = age;
		System.out.println(age);
		System.out.println(name);
	}

	public static void main(String[] args) {
		ConstructorthisKeyword obj = new ConstructorthisKeyword(1, "Arjun");
		ConstructorthisKeyword obj1 = new ConstructorthisKeyword(3, "Srivihaan");
		ConstructorthisKeyword obj2 = new ConstructorthisKeyword(4, "Vishnu");
		ConstructorthisKeyword obj3 = new ConstructorthisKeyword(2, "Harika");
		
		
	}

}
