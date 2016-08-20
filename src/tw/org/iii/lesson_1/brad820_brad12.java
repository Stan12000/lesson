package tw.org.iii.lesson_1;

public class brad820_brad12 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        char[] c;
		int [] a;
		int b[];
		a = new int[7];
		a[2] = 12;
		a[5] = 4 ;
		a[6] = 100;
		for(int i=0; i<a.length;i++){
		System.out.println(a[i]);
	}
	
	    int[] d = new int[3];
	    int[] e = new int[]{1,2,3,5,7};
	    
	    for(int i = 0 ; i < e.length;i++){
	    	System.out.println(e[i]);
	    }
	    System.out.println("----");
	    int[] f = {1,2,3,4,5};
	    for(int i=0; i<f.length;i++){
	    	System.out.println(f[i]);
	    }
}
}