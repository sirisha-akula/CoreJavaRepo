package Problems;

public class ReverseString {

	public static void main(String[] args) {
		//diff btw String and String Buffer -->String is immutable and String Buffer is mutable.
		//In String class reverse() method is not there.
		
		String s = "Automation";
		int len = s.length(); //10--it gives length of string
		String rev= " ";
		
		
		for(int i = len-1; i>=0 ;i--) {
			rev = rev+s.charAt(i);
		}
		
		System.out.println(rev);
		
		//2.Using StringBuffer
		
		StringBuffer b = new StringBuffer(s);
		b.reverse();
		System.out.println(b);
	}

}
