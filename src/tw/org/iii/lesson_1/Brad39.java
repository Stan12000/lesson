package tw.org.iii.lesson_1;

public class Brad39 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Brad391 obj1 = new Brad391();
		Brad392 obj2 = new Brad393();
		Brad393 obj3 = new Brad393();
		Brad393 obj4 = (Brad393)obj2;
		obj2.m2();
		obj4.m3();
	}

}
class Brad391{
	void m1(){}
	void m2(){}
}
abstract class Brad392{
	Brad392(){System.out.println("Brad392()");}
	void m1(){System.out.println("Brad392():m1");}
	abstract void m2();
}
class Brad393 extends Brad392{
	void m2(){System.out.println("Brad392:m2");}
	void m3(){System.out.println("Brad392:m3");}
}

final class Brad394{
	
}