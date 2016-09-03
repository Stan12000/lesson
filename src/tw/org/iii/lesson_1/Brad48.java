package tw.org.iii.lesson_1;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;

public class Brad48{

	public static void main(String[] args) {

		File f1 = new File("dir1/brad01.txt");
		FileReader reader;
		try {
			reader = new FileReader(f1);
			int c;
			while((c=reader.read())!=-1){
				System.out.print((char)c);
			}
			reader.close();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			
		}
		
	
		
	}

}
