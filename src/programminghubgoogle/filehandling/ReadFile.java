package programminghubgoogle.filehandling;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class ReadFile {

	public static void main(String[] args) {
		String fileName = "C:\\Users\\kouce\\OneDrive\\Bureau\\kokojava\\bonjour.txt";
		String line = null;
		
		BufferedReader bufferedReader = null;
		
		try {
			FileReader fileReader = new FileReader(fileName);
			bufferedReader = new BufferedReader(fileReader);
			while ((line = bufferedReader.readLine()) != null) {
				System.out.println(line);
				
			}
		} catch (FileNotFoundException ex) {
			System.out.println("Unable to open file " + fileName + " ");
		}
		catch (IOException e) {
			System.out.println("Error reading file " + fileName + " ");
		}
		finally {
			try {
				if(bufferedReader != null) {
					bufferedReader.close();
				}
			} catch (IOException ex) {
			}
		}
	}

}
