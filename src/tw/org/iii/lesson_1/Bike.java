package tw.org.iii.lesson_1;

public class Bike {
//field
private	double speed;
static int count;
  //constructor 
  Bike(){
	  count++;
	  speed = 1;
	  System.out.println("Bike()"+ speed);
  }

    //method
	void  upSpeed(){
		speed = speed<1?1:speed*1.2;
	}
	
	void downSpeed(){
		speed = speed<1?1:speed*0.7;
		
	}

	double getSpeed(){
		return speed;
	}
	
}
