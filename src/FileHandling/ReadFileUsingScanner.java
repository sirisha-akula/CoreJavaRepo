package FileHandling;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class ReadFileUsingScanner {

	public static void main(String[] args) {
		String path = "/Users/sirishaakula/Documents/newfile.text";
		Scanner sc = null;
		
		try {
			File file = new File(path);
			sc = new Scanner(file);
			
			System.out.println("File content is below: ");
			
		while(sc.hasNextLine()) {
			System.out.println(sc.nextLine());
		}
			
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		finally {
			try {
			sc.close();
				
			} catch (Exception e) {
				e.printStackTrace();
			}
	}
	}

}
