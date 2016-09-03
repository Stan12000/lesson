package tw.org.iii.lesson_1;

import java.io.File;

public class Brad46 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub


		
		File[] roots =File.listRoots();
		for(File root:roots){
			System.out.println(root.getAbsolutePath());
		}
		
	}

}
