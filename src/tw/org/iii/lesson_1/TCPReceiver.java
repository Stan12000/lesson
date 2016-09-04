package tw.org.iii.lesson_1;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

public class TCPReceiver {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	try {
		ServerSocket server =new ServerSocket(6666);
		Socket socket = server.accept();
		
		BufferedInputStream bin =new BufferedInputStream(socket.getInputStream());
		BufferedOutputStream bout = 
				new BufferedOutputStream(new FileOutputStream("upload/brad.jpg"));
		
		int b;
		while( (b=bin.read())!=-1){
			bout.write(b);
		}
		
		bin.close();
		bout.flush();
		bout.close();
		
		server.close();
		System.out.println("OK");
		} catch (Exception e) {
			System.out.println(e.toString());
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
//		ServerSocket server;
//		try {
//			server = new ServerSocket(6666);
//			System.out.println("before");
//		    Socket socket = server.accept();
//		    InputStream in =socket.getInputStream();
//		    InputStreamReader irs =new InputStreamReader(in);
//		    BufferedReader reader =new BufferedReader(irs);
//		    
//		    
//		    int c; StringBuffer sb =new StringBuffer();
//		    while((c=reader.read())!=-1){
//		    	sb.append((char)c);
//		    }
//		    
//		    System.out.println("after");
//		    server.close();
//		    System.out.println(sb);
//			
//		} catch (IOException e) {
//
//		}

		
	}

}
