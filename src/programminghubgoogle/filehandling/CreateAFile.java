package programminghubgoogle.filehandling;

import java.io.File;

public class CreateAFile {

	public static void main(String[] args) {
		try {
			if(new File("C:\\Users\\kouce\\OneDrive\\Bureau\\kokojava\\bonjour.txt").createNewFile()) {
				System.out.println("Successfully created File.");
			} else {
				System.out.println("Failed to create file.");
			}
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}

	}

}
