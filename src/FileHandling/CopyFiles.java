package FileHandling;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class CopyFiles {
/*1.Copy a file and create a different file in the same location.

   2.To Read data from a file and write it onto another file 
 */
	public static void main(String[] args) {
		File file = new File("/Users/sirishaakula/Documents/Selenium/DailyNotes/demo.rtf");
		File opfile = new File("/Users/sirishaakula/Documents/Selenium/DailyNotes/demo copy.rtf");

		
		FileInputStream fip= null; //to read the file we use "FileInputStream"
		FileOutputStream  fop = null; //to write the file we use "FileOutputStream"
		
		try {
			fip = new FileInputStream(file);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		
		try {
			fop = new FileOutputStream(opfile);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		
		try {
			System.out.println(fip.available()); //it prints no. of bytes available in the file.
		} catch (IOException e) {
		   e.printStackTrace();
		}
		
		int i = 0;
		try {
			while((i = fip.read())!= -1){
				fop.write(i);
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		finally {
			if(fip != null) {
			try {
				fip.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
			
			if(fop != null) {
				try {
					fop.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
			}
			
		}
	}

}
