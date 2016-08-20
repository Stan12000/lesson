package tw.org.iii.lesson_1;

public class brad820_brad13 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] p =new int[9];
		int[] a =new int[6];
		for( int i=0; i<100; i++){
			int point = (int)(Math.random()*9);
			p[point]++;
		}
a[0] = p[0];
a[1] = p[1];
a[2] = p[2];
a[3] = p[3]+p[6];
a[4] = p[4]+p[7];
a[5] = p[5] +p[8];

		for(int i=0; i<a.length;i++){
			System.out.println((i+1)+":"+a[i]);
		}
	}

}
