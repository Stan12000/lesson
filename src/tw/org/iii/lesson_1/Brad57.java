package tw.org.iii.lesson_1;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

public class Brad57 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Brad573 obj =new Brad573();
		try {
			ObjectOutputStream oout =
					new ObjectOutputStream(
							new FileOutputStream("dir1/brad57"));
			oout.writeObject(obj);
			oout.flush();
			oout.close();
			System.out.println("OK1");
		} catch (IOException e) {
		}
		System.out.println("---------------------");
		
		try {
			ObjectInputStream oin = new
					ObjectInputStream(
							new FileInputStream("dir1/brad57"));
			
			
			Brad573 obj2 =(Brad573)(oin.readObject());
			
			oin.close();
			System.out.println("OK");
			
		} catch (Exception e) {
		
		}
		
		
	}

}

class Brad571{
	Brad571(){System.out.println("Brad571()");}
}
class Brad572 extends Brad571{
	Brad572(){System.out.println("Brad572()");}
} 

class Brad573 extends Brad572 implements Serializable{
	Brad573(){System.out.println("Brad573()");}
}