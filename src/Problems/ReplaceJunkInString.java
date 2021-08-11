package Problems;

public class ReplaceJunkInString {

	public static void main(String[] args) {
		//Using Regular expression [^a-zA-Z0-9]
		
		String s = "%%$$##$## 43334 %@^^&* Testing $%$@#$*() Automation";
		s = s.replaceAll("[^a-zA-Z0-9]", "");
		System.out.println(s);
	}

}
