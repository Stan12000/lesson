package tw.org.iii.lesson_1;

public class brad827_5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String a = "0123";
		System.out.println(a.concat(a));
		
	StringBuffer sb1 = new StringBuffer();
	sb1.append("1234567890");
		System.out.println(sb1);
		System.out.println(sb1);
	sb1.append("1234567890");
	System.out.println(sb1.capacity());
	sb1.append("1234567890");
	System.out.println(sb1.capacity());
	}

}
