package programminghubgoogle.filehandling;

import java.io.File;

public class DeleteAFile {

	public static boolean deleteFile(String filename) {
		boolean exists = new File(filename).delete();
		return exists;
	}
	
	public static void test(String type, String filename) {
		System.out.println("The following " + type + " called "+ filename + (deleteFile(filename)?"xas deleted.":"does not exist."));
	}
	
	public static void main(String[] args) {
		test("file", "C:\\Users\\kouce\\OneDrive\\Bureau\\kokojava\\bonjour.txt");
	}

}
