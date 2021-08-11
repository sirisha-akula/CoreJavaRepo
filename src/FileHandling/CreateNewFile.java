package FileHandling;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Scanner;

public class CreateNewFile {

	public static void main(String[] args) {

//		String path = "/Users/sirishaakula/Documents/Selenium/DailyNotes/test.text";
//		File file = new File(path);
//		
//		try {
//			Boolean flag = file.createNewFile();
//			if(flag) {
//				System.out.println("file is created");
//			}else {
//				System.out.println("file is not created");
//			}
//		} catch (IOException e) {
//			e.printStackTrace();
//		}
		
//		//FileOutputStream along with scanner:
//		try {
//			
//			Scanner sc = new Scanner(System.in);
//			
//			System.out.println("Enter the file name with location path");
//			String filename = sc.nextLine();
//			
//			FileOutputStream fos = new FileOutputStream(filename, true);
//			
//			System.out.println("Enter the file content");
//			String content = sc.nextLine();
//			
//			//String content cannot be directly written into a file. It needs to be converted into bytes
//			byte b[] = content.getBytes();  
//			
//			fos.write(b);
//			fos.close();
//			System.out.println("file is saved on the given location");
//			
//		} catch (IOException e) {
//			System.out.println("Exception ocurred");
//			e.printStackTrace();
//		}
//		//3. java nio package
		try {
			Path pathLocation =	Paths.get("/Users/sirishaakula/Documents/Selenium/DailyNotes/newfile.text");
				Path newPath = Files.createFile(pathLocation);
				
				System.out.println("new file is created " + newPath);
				
				String data = "This is file handling concepts in java, using nio package creating file & writing data onto file";
				byte b1[]=data.getBytes();
				Files.write(newPath, b1);	
				
				
			} catch (IOException e) {
				System.out.println("exception occurred...");
				e.printStackTrace();
			}
	
	}

}
