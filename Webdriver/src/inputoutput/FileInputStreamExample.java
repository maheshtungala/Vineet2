package inputoutput;
import java.io.*;
public class FileInputStreamExample {

	public static void main(String[] args) throws IOException {
		FileInputStream fin = new 
				 FileInputStream("E:\\mahesh.txt");
		int i=0;
		while((i=fin.read())!=-1){
			System.out.print((char)i);
		}
      fin.close();
	}

}
