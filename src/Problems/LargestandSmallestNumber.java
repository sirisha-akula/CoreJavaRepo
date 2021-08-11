package Problems;

import java.util.Arrays;

public class LargestandSmallestNumber {

	public static void main(String[] args) {
		// largest and smallest number in array
		int numbers[] = {-12,-34,0,1,-5676,-90};
		int largest = numbers[0];
		int smallest = numbers[0];
		
		
		for(int i=0; i<numbers.length; i++) {
			if(numbers[i]>largest) {
				largest = numbers[i];
			}else if(numbers[i]<smallest){
				smallest = numbers[i];
			}
		}
		System.out.println("\n given array is:" +Arrays.toString(numbers));
		System.out.println("Largest number is " +largest);
		System.out.println("Smallest number is " +smallest);

	}

}
