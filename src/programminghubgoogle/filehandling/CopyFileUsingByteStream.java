package programminghubgoogle.filehandling;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class CopyFileUsingByteStream {

	public static void main(String[] args) throws IOException {
		FileInputStream in = null;
		FileOutputStream out = null;
		try {
			in = new FileInputStream("C:\\Users\\kouce\\OneDrive\\Bureau\\input.txt");
			out = new FileOutputStream("C:\\\\Users\\\\kouce\\\\OneDrive\\\\Bureau\\output.txt");
			
			int c;
			while((c = in.read()) !=-1) {
				out.write(c);
			}
		} finally {
			if(in != null) {
				in.close();
			}
			if(out !=null) {
				out.close();
			}
		}
	}
}
