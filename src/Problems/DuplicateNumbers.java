package Problems;

import java.util.HashSet;
import java.util.Set;

public class DuplicateNumbers {

	public static void main(String[] args) {
		int a[] = {1, 2,3, 3, 4, 5};
		
		for(int i = 0; i<a.length;i++) {
			for(int j = i+1; j<a.length;j++) {
				if(a[i] == a[j]) {
					System.out.println("Duplicate number is: " +a[i]);
				}
			}	}
			System.out.println("******************");
			
			//Using Hashset
			Set<Integer> num= new HashSet<Integer>();
			for(Integer n : a) {
				if(num.add(n)== false) {
					System.out.println("Duplicate number is: " +n);
				}
			}

			System.out.println("******************");
			
			
		}
	}


