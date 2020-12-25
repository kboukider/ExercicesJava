package programminghubgoogle.filehandling;

import java.io.File;

public class CreateADirectory {

	public static void main(String[] args) {
		
		if(new File("C:\\Users\\kouce\\OneDrive\\Bureau\\kokojava").mkdir()) {
			System.out.println("Successfully created directory.");
		} else {
			System.out.println("Failed to create directory.");
		}

	}

}
