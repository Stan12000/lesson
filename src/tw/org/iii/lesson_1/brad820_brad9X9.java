package tw.org.iii.lesson_1;

public class brad820_brad9X9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int a=2,b=1,c,d;
	for(d=0;d<2;d++){
		for(b=1;b<=9;b++){
		   for(a=2;a <=5 ;a++){
			 int newa = a + d *4;
			  c = newa * b;
			  System.out.print(newa + "X" + b + "=" + c + "\t");
		      }
		   System.out.println();
		   }
		System.out.println();
	}
		
		
		
	}

}
