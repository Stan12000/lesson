package tw.org.iii.lesson_1;

import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

import javax.imageio.ImageIO;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class Brad66 extends JFrame{

	private MyPainter painter;
	private JButton clear,undo,redo,save,a,b;
	private MyClock clock;
	
	public Brad66(){
		
		painter = new MyPainter();
		setSize(800,600);
		setVisible(true);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		
		setLayout(new BorderLayout());
		add(painter,BorderLayout.CENTER);
		
		clear = new JButton("clear");
		undo =new JButton("undo");
		redo = new JButton("redo");
		save = new JButton("save");
		a = new JButton("a");
		b = new JButton("b"); 
		clock = new MyClock();
		JPanel top =new JPanel(new FlowLayout(FlowLayout.LEFT));
		top.add(clear);top.add(undo);top.add(redo);top.add(save);
		top.add(a);top.add(b);top.add(clock);
		add(top,BorderLayout.NORTH);
		

		setupEvent();
		
	}
	private void setupEvent() {
		clear.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				doClear();
			}
		});
		undo.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				doUndo();
				
			}
		});
		redo.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				doRedo();
			}
		});
		save.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				doSave();				
			}
		});
		a.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				doA();	
			}
		});
		b.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				doB();
			}
		});
	}
	protected void doB() {
		painter.Aserializable();
	}
	
	protected void doA() {
		painter.serializable();
	}
	protected void doSave() {
		BufferedImage bi =new BufferedImage(painter.getWidth(), painter.getHeight(), BufferedImage.TYPE_INT_ARGB);
		Graphics g =bi.createGraphics();
		painter.paint(g);
		g.dispose();
		try {
			ImageIO.write(bi, "png",new File("dir1/test.png"));
		} catch (IOException e) {
			e.printStackTrace();
		}
		
	}
	protected void doRedo() {
		painter.redo();
		
	}
	protected void doUndo() {
		painter.undo();
		
	}
	protected void doClear() {
		painter.clear();
		
	}
	public static void main(String[] args) {

		new Brad66();
		}

}
