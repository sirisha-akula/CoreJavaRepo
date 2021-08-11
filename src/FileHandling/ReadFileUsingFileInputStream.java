package FileHandling;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

public class ReadFileUsingFileInputStream {

	/*
	 * Read the file using FileInputStream
	 */
	public static void main(String[] args) {
		String path = "/Users/sirishaakula/Documents/newfile.text";
		FileInputStream fip = null;
		
		try {
			File file = new File(path);
			fip = new FileInputStream(file);
			
			System.out.println("file content is :");
			
			int c = 0;
			while((c = fip.read()) != -1) {
				System.out.print((char)c);
				
			}
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		finally {
			try {
				fip.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}

}
