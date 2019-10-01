package inputoutput;
import java.io.*;
public class FileOutputStreamExample {

	public static void main(String[] args) throws IOException {
		FileOutputStream fout = new FileOutputStream("E:\\mahesh.txt");
		
		String s = "Vineet is a student of Selenium!";
		byte []b=s.getBytes();
		
		fout.write(b);
		
		fout.close();

	}

}
