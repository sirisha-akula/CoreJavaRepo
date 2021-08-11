package Problems;

public class AmstrongNumber {

	public static void main(String[] args) {
		// 153 = 1*1*1 + 5*5*5 + 3*3*3 => 1+125+27 =>153
		amstrongmethod(163);
	}
		
	public static void amstrongmethod(	int n ) {
		int c = 0, a,temp;
		temp =n;
		while(n!=0) {
			a= n%10;
			n =n/10;
			c= c+(a*a*a);
		}
		if(temp == c) {
			System.out.println("Amstrong number");
		}else {
			System.out.println("not a Amstrong number");
		}
	
	}

}
