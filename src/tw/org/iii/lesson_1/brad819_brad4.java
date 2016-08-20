package tw.org.iii.lesson_1;

import javax.swing.JOptionPane;

public class brad819_brad4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String strYear = JOptionPane.showInputDialog("Year");
		String strMonth = JOptionPane.showInputDialog("Month");
		
		int intYear = Integer.parseInt(strYear);
		int intMonth = Integer.parseInt(strMonth);
		
		
		
		System.out.println(strYear+"/"+strMonth);

	}

}
