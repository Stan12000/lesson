package tw.org.iii.lesson_1;

public class brad820_brad13 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] p =new int[9];
		int[] a =new int[6];
		for( int i=0; i<100; i++){
			int point = (int)(Math.random()*6);
			p[(point>=6?point-3:point)]++;
		}


		for(int i=0; i<p.length;i++){
			System.out.println((i+1)+":"+p[i]);
		}
	}

}
