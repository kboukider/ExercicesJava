package programminghubgoogle.filehandling;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;

public class ReadBinaryFile {

	public static void main(String[] args) {
		String fileName = "C:\\Users\\kouce\\OneDrive\\Bureau\\kokojava\\bonjour.txt";
		FileInputStream inputStream = null;
		try {
			byte[] buffer = new byte[1000];
			inputStream = new FileInputStream(fileName);

			int total = 0;
			int nRead = 0;
			while ((nRead = inputStream.read(buffer)) != -1) {
				System.out.println(new String(buffer));
				total += nRead;
			}
			System.out.println("Read " + total + " bytes");

		} catch (FileNotFoundException ex) {
			System.out.println("Unable to open file " + fileName + " ");
		} catch (IOException ex) {
			System.out.println("Error reading file " + fileName + "");
		} finally {
			try {
				if (inputStream != null) {
					inputStream.close();
				}
			} catch (IOException e) {
				// TODO: handle exception
			}
		}
	}
}
