package FileHandling;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class ReadFileUsingFileReader {

	public static void main(String[] args) {
		String path = "/Users/sirishaakula/Documents/newfile.text";
		FileReader fr = null;
		
		try {
			File file = new File(path);
			 fr = new FileReader(file);
			
			System.out.println("File content is below: ");
			
			int c = 0;
			while((c=fr.read()) != -1) {
				System.out.print((char)c);
			}
			
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		finally {
			try {
				fr.close();
				
			} catch (IOException e) {
				e.printStackTrace();
			}
	}

	}

}
