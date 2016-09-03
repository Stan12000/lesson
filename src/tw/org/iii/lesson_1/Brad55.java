package tw.org.iii.lesson_1;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.Serializable;

public class Brad55 {

	public static void main(String[] args) {
	
		Student s1 =new Student(new PM(),"Dave",90,50,75);
		Student s2 =new Student(new PM(), "Tony",80,85,95);
		
		System.out.println(s1.calTotal());
		System.out.println(s1.calAvg());
		
	
		try {
			ObjectOutputStream oout =
					new ObjectOutputStream(
							new FileOutputStream("dir1/student.brad"));
			
			oout.writeObject(s1);
			oout.writeObject(s2);
			oout.flush();
			oout.close();
			
		} catch (IOException e) {
			System.out.println(e.toString());
		}
		
		
	}
}

class Student implements Serializable{
	int ch; 
	transient int eng;
	int math;
	String name;
	PM pm;
	Student(PM pm,String name,int ch,int eng,int math){
		this.name = name;
		this.ch =ch;
		this.eng=eng;
		this.math=math;
		this.pm=pm;
	}
	int calTotal(){return ch+eng+math;}
	double calAvg(){return calTotal()/3.0;}
	
}

class PM implements Serializable{
	
}