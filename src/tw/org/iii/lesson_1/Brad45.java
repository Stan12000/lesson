package tw.org.iii.lesson_1;

import java.io.File;

public class Brad45 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		File dir2 = new File("dir1/dir3/dir4/dir5/dir6");
		if(!dir2.exists()){			
				if(dir2.mkdirs()){
					System.out.println("Create dir2 OK");
				}
			
		}
		
	}

}
