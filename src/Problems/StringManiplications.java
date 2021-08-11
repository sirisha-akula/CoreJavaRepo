package Problems;

public class StringManiplications {

	public static void main(String[] args) {
		String str = "The rains have started here in shimla snow";
		String str1 = "The Rains have started here in shimla snow";
		
		System.out.println(str.length()); //it gives length of string
		
		System.out.println(str.charAt(10)); //it gives character at 10th index
		
		System.out.println(str.indexOf('s')); //it gives index of character 's';
		
		System.out.println(str.indexOf('s', (str.indexOf('s')+1)));
		
		System.out.println(str.indexOf('s', (str.indexOf('s'+1)+1)));
		
		System.out.println(str.lastIndexOf('s'));
		
		System.out.println(str.indexOf("have"));
		
		System.out.println(str.indexOf('s', (str.indexOf('s'+1)+1)));
		
		System.out.println(str.indexOf("hello")); //-1 if string(hello) is not present it returns -1
	
		//string comparison
		System.out.println(str.equals(str1)); //it returns false, as java is case sensitive
		
		System.out.println(str.equalsIgnoreCase(str1)); //it returns true
		
		//substring:
		System.out.println(str.substring(0, 8));//Substring: it returns small String from long string.it starts from 0 index and gives till 8 characters
		
        //trim:
		String str2 = "  Hello world   ";
		System.out.println(str2.trim()); //it trims only before and after spaces
		
		System.out.println(str2.replace(" " , ""));
		
		String date = "27-02-2021";
		System.out.println(date.replace("-", "/"));
		
		//split
		String test ="This_is_beautiful_day";
		String testval[] = test.split("_");
		
		for(String s : testval) {
			System.out.println(s);
		}
		
		for(int i =0 ;i<testval.length;i++) {
			System.out.println(testval[i]);
		}
		
		
		String s2 = "Test";
		System.out.println(s2.concat(date)); //Test27-02-2021
		System.out.println(s2.concat("I")); //TestI
		
		String x = "Hello";
		String y = "World";
		float a = 12.30f;
		float b = 23.87f;
		
		System.out.println(x+y); //HelloWorld
		System.out.println(a+b);//36.17
		System.out.println(x+y+a+b);//HelloWorld12.0323.87
		System.out.println(a+b+x+y);//36.17HelloWorld
		System.out.println(x+y+(a+b));//HelloWorld36.17
		

		
		
	}

}
