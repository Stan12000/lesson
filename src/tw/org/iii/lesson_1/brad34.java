package tw.org.iii.lesson_1;

import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextArea;

public class brad34  extends JFrame implements ActionListener {
	private JButton open,save,exit;
	private JTextArea edit;
	int count=0;
	
	
	
	
	
	public brad34(){
		super("My Window App");
		
		open = new JButton("open");
		save = new JButton("save");
		exit = new JButton("exit");
		edit = new JTextArea();
		
		setLayout(new BorderLayout());
		
		JPanel top =new JPanel(new FlowLayout(FlowLayout.LEFT));
		top.add(open);top.add(save);top.add(exit);
		
		add(top,BorderLayout.NORTH);
		add(edit,BorderLayout.CENTER);
		

		
		open.addActionListener(this);
		save.addActionListener(this);
		open.addActionListener(new Mylistener());
		open.addActionListener(new tw.org.iii.lesson_1.Mylistener());
		open.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				doOpen();
			}
		});
		
		
		setSize(640, 480);
		setVisible(true);	
		setDefaultCloseOperation(EXIT_ON_CLOSE);

			
	}
	private void doOpen(){
		System.out.println("InnerListener");
	}

	class Mylistener implements ActionListener{

		@Override
		public void actionPerformed(ActionEvent e) {
			// TODO Auto-generated method stub
			System.out.println("MyListener2"+count++);
			
		}
		   	   
	   }
	
	
	public static void main(String[] args) {
		
		new brad34();	
		
	}

	@Override
	public void actionPerformed(ActionEvent event) {
		// TODO Auto-generated method stub
		if(event.getSource().equals(open)){
		System.out.println("open");
	}else if(save.equals(event.getSource())){
		System.out.println("save");
		}
	}

}

class Mylistener implements ActionListener{

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		System.out.println("MyListener");
		
	}
	   	   
   }