
public class ArraysConcept {

	public static void main(String[] args) {
		// Array: used to store the similar datatype values --Static Array
		//int array
		//0 --> Lowest index, n-1-->higest index
		//One dimensional array
		
		int i[] = new int[4];
		i[0] = 1;
		i[1] =2;
		i[2] =3;
		i[3] =4;
		
		//to print
		System.out.println(i[2]); //o/p: 3
		
		char j[] = {'a','b','c','d'};
		System.out.println(j[1]); //b
		
		String s[] = new String[2];
		s[0]= "Kittu";
		s[1]= "Arjun";
		
		/*disadvantages: 
		 * 1.Size of array is fixed: to overcome this problem we have collections--ArrayList, HashTable--dynamic arrays
		 * 2.Stores only similar type of data--to achieve this we use Object array--Object is a class.
		 */
		
		Object o[] = new Object[4];
		o[0] = "Akula";
		o[1] = 7;
		o[2] ='M';
		o[3]= true;
		System.out.println(o[0]);//Akula
		System.out.println(o[1]);//7
		System.out.println(o[2]);//M
		System.out.println(o[3]);//true
		
		for(int k=0;k<o.length;k++) {
			System.out.println(o[k]);
		}
		
	}

}
