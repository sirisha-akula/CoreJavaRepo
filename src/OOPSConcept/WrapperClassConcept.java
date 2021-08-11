package OOPSConcept;

public class WrapperClassConcept {

	public static void main(String[] args) {
		// Wrapper Class--Integer, Long, Float, Double, boolean, char --these wrapper classes are final and immutable.
		//we use wrapper classes for data conversion.

		String s = "100";
		System.out.println(s+20);
		
		//data conversion from String to Integer
		int i = Integer.parseInt(s);
		System.out.println(i+20);
		
		String s1 ="123749393";
		System.out.println(s1+1);
		
		//data conversion from String to Long
		long l = Long.parseLong(s1);
		System.out.println(l+1);
		
		//data conversion from String to Double
		String s2 = "123.45";
		Double d = Double.parseDouble(s2);
		System.out.println(d+10);
		
		//data conversion from String to Double
		String s3 = "11.45";
		Float f = Float.parseFloat(s3);
		System.out.println(f+10.0f);
		

		//data conversion from String to boolean
		String s4 = "true";
		boolean b = Boolean.parseBoolean(s4);
		System.out.println(b);
		
		//int to String
		int j = 201;
		System.out.println(j+20);
		
		String str = String.valueOf(j);
		System.out.println(j+20);
		
		//double to string
		double dl = 199.99;
		System.out.println(dl+19);
		
		String str1 = String.valueOf(dl);
		System.out.println(str1+19);
		
		//boolean to String
		boolean b1 = false;
		System.out.println(b1);
		
		String str2 = String.valueOf(b1);
		System.out.println(b1+"hi");
		
		//char to String
		char c = 'A';
		System.out.println(c);
		
		String str3 = String.valueOf(c);
		System.out.println(str3+"hello");
		
		String str4 = "100A"; //it gives invalid NumberFormatException for "100A";
		int z = Integer.parseInt(str4);
		System.out.println(z+10);
		
		
	}

}
