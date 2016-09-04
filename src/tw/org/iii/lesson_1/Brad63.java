package tw.org.iii.lesson_1;

import java.util.LinkedList;

public class Brad63 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		LinkedList list =new LinkedList();
		list.add(12);
		list.add("Brad");
		list.add("Brad");
		list.add(12);
		list.add(2,"iii");
		//list.add(7,34);
		System.out.println(list.size());
		System.out.println(list);
		System.out.println(list.get(3));
		System.out.println("-------------------");
		for(Object obj :list){
			System.out.println(obj.toString());
		}
	}

}
