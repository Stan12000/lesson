package tw.org.iii.lesson_1;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;

public class Brad49{

	public static void main(String[] args) {

		File f1 = new File("dir1/brad03.txt");
		try {
			FileOutputStream fout =new FileOutputStream(f1,true);
			fout.write("hello,Brad2".getBytes());
			
			fout.flush();
			fout.close();
			System.out.println("OK");
		} catch (Exception e) {
			// TODO Auto-generated catch block
		    System.out.println(e.toString());
		}
		
	
		
	}

}
