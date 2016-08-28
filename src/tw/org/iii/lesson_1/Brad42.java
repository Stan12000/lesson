package tw.org.iii.lesson_1;

import java.lang.instrument.IllegalClassFormatException;

import javax.xml.datatype.DatatypeConfigurationException;

public class Brad42 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		bird b1 = new bird();
		try{
		b1.setleg(3);
		System.out.println(b1.leg);
	}catch(RuntimeException re){
		System.out.println("ccccccccc");		
	}
		Brad421 obj1 = new Brad421();
		try{
		obj1.m1(2);
		}catch(IllegalClassFormatException re){}
	    catch(DatatypeConfigurationException re){}
		
		
		Brad422 obj2 =new Brad422();
		obj2.m1(2);
  }
}
class bird{
	int leg;
	void setleg(int n){
		if(n<0||n>2){
			throw new RuntimeException();
		}
		leg = n ;
	}
}
class Brad421{
	void m1(int n) throws  IllegalClassFormatException,DatatypeConfigurationException{
		if(n<0){
			
			throw new IllegalClassFormatException();	
		}else if(n>100){
			throw new DatatypeConfigurationException();
		}
		
	}
}

class Brad422 extends Brad421{
	void m1(int n){
		int a =10, b=3;
		try{
			int c= a/b;
			return;
			}catch(RuntimeException re){
				System.out.println("catch");
			}finally{
				System.out.println("finally");
			}
		    System.out.println("OK");
	}
}
