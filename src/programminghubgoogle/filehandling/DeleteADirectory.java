package programminghubgoogle.filehandling;

import java.io.File;

public class DeleteADirectory {

	public static boolean deletFile(String filename) {
		boolean exists = new File(filename).delete();
		return exists;
	}
	
	public static void test(String type, String filename) {
		System.out.println("The following "+ type + " caleed " + filename + (deletFile(filename)? "was delted." : "does not exist."));
	}
	
	public static void main(String[] args) {
		
		test("directory", File.separator + "docs" + File.separator);
	
	}

}
