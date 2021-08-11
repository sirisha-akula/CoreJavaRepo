
public class TwoDimensionalArrays {

	public static void main(String[] args) {
		
String s[][]= new String[3][3]; //3 rows, 3 cols
s[0][0] = "Hyderabad";
s[0][1] = "Banglore";
s[0][2] = "pune";

s[1][0] = "Kolkata";
s[1][1] = "chennai";
s[1][2] = "cochin";

s[2][0] = "Dargling";
s[2][1] = "Jaipur";
s[2][2] = "Jahnsi";

//to get no of rows
System.out.println(s.length);//3 rows

//to get no of cols
System.out.println(s[0].length);// 3 cols

//to print 
System.out.println(s[1][0]);
System.out.println(s[0][2]);
System.out.println(s[2][1]);

//to print all the rows and cols of 2D array we use Loops

for(int i =0; i<s.length;i++) {
	for(int j= 0; j<s[0].length; j++) {
		System.out.println(s[i][j]);
	}
}

	}

}
