package tw.org.iii.lesson_1;
class Bike2 {
//field
private	double speed;
static int count;
  //constructor 
  Bike2(){
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
