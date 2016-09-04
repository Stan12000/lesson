package tw.org.iii.lesson_1;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.OutputStream;
import java.net.InetAddress;
import java.net.Socket;

public class TCPCLient {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// 1. read from local filesystem
		long start =System.currentTimeMillis();
	   
//		try {
//		
//		
//		File sendFile = new File("dir1/123.jpg");
//		byte[] sendBuf =new byte[(int)sendFile.length()];
//	
//			BufferedInputStream bin = new BufferedInputStream(new FileInputStream(sendFile));
//			bin.read(sendBuf);
//			bin.close();
//			
//			//2.send by TCP
//			
//			Socket client =new Socket(InetAddress.getByName("10.2.12.138"),6666);
//			BufferedOutputStream bout = new BufferedOutputStream(client.getOutputStream());
//			
//			bout.write(sendBuf);
//			bout.flush();
//			bout.close();
//			client.close();
//			
//			System.out.println("OK");
//			System.out.println(System.currentTimeMillis()-start);
//		} catch (Exception e) {
//		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		try {
			
			Socket client = new Socket(InetAddress.getByName("10.2.12.138"),6666);
			
			OutputStream out = client.getOutputStream(); //輸出串流
			BufferedOutputStream bout =new BufferedOutputStream(client.getOutputStream());//輸出串流
			
			BufferedInputStream bin = new BufferedInputStream( //本地讀黨
					new FileInputStream("dir1/123.jpg"));
			int b;
			while( (b=bin.read()) !=-1){
				bout.write(b);
			}
			bin.close();
			bout.flush();
			bout.close();
			client.close();
			System.out.println("sent ok!");
			System.out.println(System.currentTimeMillis()-start);
		} catch (Exception e) {
			System.out.println(e.toString());
		}
	
	
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	
//		try {
//			Socket socket = new Socket(InetAddress.getByName("10.2.12.138"),7777);
//			OutputStream out = socket.getOutputStream();
//			out.write("hey hey嘿嘿嘿!".getBytes());
//			out.flush();
//			out.close();
//			socket.close();
//			System.out.println("OK");
//		} catch (IOException e) {
//			System.out.println(e.toString());
//		}
		
	}

}
