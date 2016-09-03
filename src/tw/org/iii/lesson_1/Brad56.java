package tw.org.iii.lesson_1;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

public class Brad56 {

	public static void main(String[] args) {
		
		try {
			ObjectInputStream oin =
					new ObjectInputStream(
							new FileInputStream("dir1/student.brad"));
			
				Object obj1 =oin.readObject();
				Student s1 =(Student)obj1;
				Student s2 = (Student)(oin.readObject());
			oin.close();
			System.out.println(s1.name+":"+s1.calTotal());
			System.out.println(s2.name+":"+s2.calTotal());
		} catch (Exception e) {               //沒有直系關西
			System.out.println(e.toString());
		
		
	   }
	}
 }
