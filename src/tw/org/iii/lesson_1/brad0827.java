package tw.org.iii.lesson_1;

public class brad0827 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		TWId id1 = new TWId(1);
		System.out.println(id1.getId());
		
		
		if(TWId.isRight(id1.getId())){
			System.out.println("OK");
		}else{
			System.out.println("XX");
		}
		
		
		//TWId myId = new TWId("A123456789");
		//TWId urId = new TWId("B234567890");
		
		//System.out.println(myId.getId());
		//System.out.println(urId.getGender()?"男生":"女生");
		//System.out.println(myId.getArea());

	}

}
