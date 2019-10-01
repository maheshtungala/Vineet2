package inputoutput;
import java.io.*;
public class FR {

	public static void main(String[] args) throws IOException {
		FileReader fr = new FileReader("E:\\mahesh.doc");
	    int i=0;
	    while((i=fr.read())!=-1){
	    	System.out.print((char)i);
	    }
     fr.close();
	}

}
