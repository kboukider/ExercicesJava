package programminghubgoogle.filehandling;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class CopFileUsingCharacterStrem {

	public static void main(String[] args) throws IOException {
		FileReader in = null;
		FileWriter out = null;

		try {
			in = new FileReader("C:\\Users\\kouce\\OneDrive\\Bureau\\input.txt");
			out = new FileWriter("C:\\\\Users\\\\kouce\\\\OneDrive\\\\Bureau\\output.txt");

			int c;
			while ((c = in.read()) != -1) {
				out.write(c);
			}
		} finally {
			if (in != null) {
				in.close();
			}
			if (out != null) {
				out.close();
			}
		}
	}

}
