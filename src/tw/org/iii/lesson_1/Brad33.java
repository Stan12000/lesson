package tw.org.iii.lesson_1;

public class Brad33 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Brad332 obj =new Brad332();
		obj.m1(3);
		obj.m2();
		
	}

}



class Brad331{
	
	int a;
	void m1(){System.out.println("Brad331:m1()"+ a++);}
}

class Brad332 extends Brad331{
	//void m1(){
	//	super.m1();
	//	System.out.println("Brad332:m1()");}
	int a;
	void m1(int a){
		super.m1();
		a++;
		System.out.println("BRad332:m1(int)"+this.a);
	}
	void m2(){System.out.println("Brad332:m2()");}
}
