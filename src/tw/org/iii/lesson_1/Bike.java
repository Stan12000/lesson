package tw.org.iii.lesson_1;

public class Bike {
//field
private	double speed;

  //constructor 
  Bike(){
	  speed = 1;
	  System.out.println("Bike()");
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
