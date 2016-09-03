package tw.org.iii.lesson_1;

import java.io.File;
import java.io.IOException;

public class Brad44  {



	public static void main(String[] args)  {
		// TODO Auto-generated method stub


		File f1 = new File("dir1/brad02.txt");
		if(f1.isFile()){
			System.out.println("OK");
		}else{
			try {
				if(f1.createNewFile()){
					System.out.println("create OK");
				}else{
					System.out.println("creat fail");
				}
			} catch (IOException e){
				System.out.println(e.toString());
			}
		}
		//System.out.println(f1.getAbsolutePath());
	}

}
