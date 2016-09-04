package tw.org.iii.lesson_1;

import java.util.Iterator;
import java.util.TreeSet;

public class Brad62 {

	public static void main(String[] args) {
		
		TreeSet set =new TreeSet();
		
		int c;
		while(set.size()<6){
			set.add((int)(Math.random()*49+1));
			
			
		}
		
		System.out.println(set);
		Iterator it = set.iterator();
		while(it.hasNext()){
			Object obj = it.next();
			System.out.println((int)obj);
		}
		System.out.println("---------");
		for(Object obj :set){
			System.out.println((int)obj);
		}
		
		
		
	}

}
