package tw.org.iii.lesson_1;

public class Brad35 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Brad354 car = new Brad354();
		Brad352 t1 = new Brad352();
		Brad353 t2 = new Brad353();
		car.m1(t1);
	}

}


interface Brad351{
	void m1();
	void m2();
	
}

class Brad352 implements Brad351 {
	public void m1(){System.out.println("Brad352:m1()");}
	public void m2(){System.out.println("Brad352:m2()");}
	void m3(){System.out.println("Brab351:m3()");}
}

class Brad353 implements Brad351{
	public void m1(){System.out.println("Brad353:m1()");}
	public void m2(){System.out.println("Brad353:m2()");}
	void m4(){System.out.println("Brab353:m4()");}
	
}

class Brad354{
	void m1(Brad352 obj1){
		obj1.m1();
		obj1.m2();
	}
	void m1(Brad353 obj1){
		obj1.m1();
		obj1.m2();
	}
}