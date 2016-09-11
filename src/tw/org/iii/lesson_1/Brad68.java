package tw.org.iii.lesson_1;

public class Brad68 {

	public static void main(String[] args) {
	
		Brad681 obj1 = new Brad681("A",200);
		Brad681 obj2 = new Brad681("B",150);
		Brad682 obj3 = new Brad682("c",50);
		Thread t3= new Thread(obj3); 
		obj1.start();
		obj2.start();
		t3.start();

	}

}
class Brad681 extends Thread {
	private String name;
	private int delay;
	Brad681(String name,int delay){this.name =name; this.delay=delay;}
	
	@Override
	public void run() {
		for(int i=0; i<10;i++){
			System.out.println(name+":"+i);
			try {
				Thread.sleep(100);
			} catch (InterruptedException e) {
			}
		}
		
	}
	
}
class Brad682 implements Runnable {
	private String name;
	private int delay;
	Brad682(String name,int delay){this.name =name; this.delay=delay;}
	@Override
	public void run() {
		for(int i=0; i<10;i++){
			System.out.println(name+":"+i);
			try {
				Thread.sleep(100);
			} catch (InterruptedException e) {
			}
		}
		
	}
	
}