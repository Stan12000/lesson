package tw.org.iii.lesson_1;

public class brad827_4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		brad827  obj1 = new brad827(2);
		brad302  obj2 = new brad302(100);
		
	}
	
}

class brad827{
//	brad827(){
//		System.out.println("a");
//	}
	brad827(int a){
		System.out.println("b");
	}
	brad827(byte a){
		System.out.println("c");
	}
}

class brad302 extends brad827{
 brad302(){
	super(1);
	System.out.println("D");
    }
 brad302(int a){
	 this();
		System.out.println("e");
 } 
 brad302(String b){
	 this(1);
		System.out.println("f");
 }
}
