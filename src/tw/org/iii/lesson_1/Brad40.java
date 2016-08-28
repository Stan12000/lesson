package tw.org.iii.lesson_1;

public class Brad40 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Brad401 obj1 = new Brad401();
		Brad402 obj2 = new Brad402();
		Brad401 obj3 = new Brad402();
//		Brad402 obj4 = new Brad401();

		obj1.m1();
		obj2.m1();
		obj3.m1();
	}

}

class Brad401{
	int a=1;
	void m1(){System.out.println("brad401:m1()"+a);}
}
class Brad402 extends Brad401{
	int a=2;
	void m1(){System.out.println("brad402:m1"+a);}
}