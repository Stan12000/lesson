package tw.org.iii.lesson_1;

public class Brad43 {
//Exception call stack
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Brad433 obj3 = new Brad433();
		try{
		obj3.m3();
		}catch(Exception re){}
	}

}
class Brad431 {
	void m1() throws Exception{
		throw new Exception();
	}
}

class Brad432 extends Brad431{
	void m2() throws Exception{
		m1();
	}
}

class Brad433 extends Brad432{
	void m3() throws Exception{
		m2();
	}
}