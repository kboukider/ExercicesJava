package programminghubgoogle.filehandling;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class WriteBinaryFile {

	public static void main(String[] args) {
		String fileName = "C:\\Users\\kouce\\OneDrive\\Bureau\\kokojava\\bonjour.txt";
		BufferedWriter bufferedWriter = null;
		try {
			
			FileWriter fileWriter = new FileWriter(fileName);
			bufferedWriter = new BufferedWriter(fileWriter);
			
			bufferedWriter.write("Bonjour tout le monde");
			bufferedWriter.write(" ici c'est un text");
			bufferedWriter.newLine();
			bufferedWriter.write("We are writing");
			bufferedWriter.write(" the text to the file");
			
			bufferedWriter.close();
		} catch (IOException ex) {
			System.out.println("Error writing to file " + fileName + " ");
		}
		finally {
			// Always close files.
			try {
				if(bufferedWriter != null) {
					bufferedWriter.close();
				}
			} catch (IOException e) {
				// TODO: handle exception
			}
		}

	}

}
