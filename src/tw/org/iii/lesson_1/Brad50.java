package tw.org.iii.lesson_1;

import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

import javax.swing.JButton;
import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;


public class Brad50 extends JFrame  {
	private JButton open, save, exit;
	private JTextArea edit;
	private int count;
    private File openFile;
    
	public Brad50(){
		super("My Window App");
		
		open = new JButton("Open");
		save = new JButton("Save");
		exit = new JButton("Exit");
		edit = new JTextArea();
		
		JScrollPane jsp =new JScrollPane(edit);
		
		setLayout(new BorderLayout());
		JPanel top = new JPanel(new FlowLayout(FlowLayout.LEFT));
		top.add(open);top.add(save);top.add(exit);
		add(top, BorderLayout.NORTH);
		add(jsp, BorderLayout.CENTER);
		
		
		open.addActionListener(new ActionListener() {
		
			@Override
			public void actionPerformed(ActionEvent e) {
				doOpen();
				
			}
			
		});

		save.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				doSave();
				
			}
		});
		setSize(640, 480);
		setVisible(true);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
	   }
		

	private void doOpen(){
		JFileChooser jfc = new JFileChooser();
		if(jfc.showOpenDialog(this)==JFileChooser.APPROVE_OPTION){
			 openFile =jfc.getSelectedFile();
			System.out.println(openFile.getAbsolutePath());
			readFile();
		}
	}
	
	private void doSave(){
		if(openFile != null){
			try {
				FileWriter writer = new FileWriter(openFile);
				
				writer.write(edit.getText());
				writer.flush();
				writer.close();
			} catch (Exception e) {
				
			}
		}
	}
	
	private void readFile(){
		FileReader reader;
		try {
			reader = new FileReader(openFile);
			int c;
			while((c=reader.read())!=-1){
				edit.append(" "+(char)c);
			}
		} catch (Exception e) {
		}
		
	}
	
	public static void main(String[] args) {
		new Brad50();
		//File f1 = new File("dir1/brad02.txt");
	}
}
	
