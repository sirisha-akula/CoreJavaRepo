package Problems;

public class FibonacciSeries {
// 0 1 1 2 3 5 8 13 21 34
	public static void main(String[] args) {
		int num = 0 , num1 = 1, sum = 0;
		
		for(int i = 1 ; i <=10; i++) {
			System.out.println(num);
			sum = num+num1;
			num = num1;
			num1 = sum;
			
		}
		
	}

}
