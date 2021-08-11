package FileHandling;
import java.io.File;
import java.util.Arrays;

public class PrintFilesInDirectory {
/*
 * to print all files and folders in Directory in sorted order.
 */
	
	public static void main(String[] args) {
   
		String path = "/Users/sirishaakula/Downloads";
		
		File file = new File(path);
		
	File downloadDir[] = file.listFiles();
	
	Arrays.sort(downloadDir); //to sort the array
	
	for(File e : downloadDir) {
		if(e.isFile()) {
			System.out.println("File " + e.getName() + " " + e.getAbsolutePath());
		}else if(e.isDirectory()) { //here Directory means folder
			System.out.println("Directory " + e.getName() + " " + e.getAbsolutePath());

		}else {
			System.out.println("Unknown " + e.getName() + " " + e.getAbsolutePath());
		}
	}

	}

}
