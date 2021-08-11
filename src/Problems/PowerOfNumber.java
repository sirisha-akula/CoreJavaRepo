package Problems;

public class PowerOfNumber {

	public static void main(String[] args) {
		//3^4 =>81
		int base = 3;
		int exponent = 4;
	    long result = 1;
		
	 while(exponent != 0) {
			result = result *= base; //result*base
			exponent--;
		}
		System.out.println(result); 
		
		/*for(int i = 1; i<=4; i--) {
			result = result*base;
		}
		System.out.println(result); */
		
		//System.out.println(Math.pow(base, exponent));
	}

}
