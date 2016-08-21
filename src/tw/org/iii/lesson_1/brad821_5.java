package tw.org.iii.lesson_1;

public class brad821_5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Bike myBike,urBike;
		myBike = new Bike();
		urBike = new Bike();
		System.out.println(myBike.getSpeed());
		System.out.println(urBike.getSpeed());
		System.out.println("-----");
		myBike.upSpeed();
		myBike.upSpeed();
		System.out.println(myBike.getSpeed());
		System.out.println("-----");
		for(int i=0;i<14;i++)
		{
			myBike.upSpeed();
			
		}
		System.out.println(myBike.getSpeed());
	}

}
