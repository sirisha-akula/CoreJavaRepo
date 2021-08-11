package Problems;

import java.util.Arrays;

public class SecondLargeinArray {

	public static void main(String[] args) {
		// smallest Number in Array
		int numbers[] = {100,-7,-67,-34,-1,-23,-56};
		
		int size = numbers.length;
		
		//sort array using Arrays.sort() method
		Arrays.sort(numbers);
		System.out.println("second largest number in array:" +numbers[size-2]);
	
		
	}

}
