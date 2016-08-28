package tw.org.iii.lesson_1;

public class brad41 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a= 10, b= 0;
		int[] c={1,2,3};
		try{
		System.out.println(a/b);
		System.out.println(c[3]);
		}catch(ArithmeticException ae){
			System.out.println("Brad");
		}catch(RuntimeException re){
			System.out.println("BIG");
		
	//	}catch(ArrayIndexOutOfBoundsException e2){
	//		System.out.println("III");
		}
		System.out.println("OK");

	}

}
