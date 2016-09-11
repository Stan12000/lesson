package tw.org.iii.lesson_1;

public class Brad64 {

	public static void main(String[] args) {
		

	}
	
	interface Brad641{
		void m1();
	}
	

	interface Brad642{
		
	}
	
	interface Brad643 extends Brad641, Brad642{
		void m3();
	}
	
	class Brad644 implements Brad643{
		public void m1(){};
		public void m3(){};
	}
}
