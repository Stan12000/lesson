package tw.org.iii.lesson_1;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.net.SocketException;
import java.net.UnknownHostException;

public class Brad59 {

	public static void main(String[] args) {
		String data ="Hello,world";
		byte[] sendDAta = data.getBytes();
		try {
			DatagramSocket socket =new DatagramSocket();
			DatagramPacket packet = new DatagramPacket(sendDAta, sendDAta.length,
					InetAddress.getByName("10.2.12.138"),8888);

				socket.send(packet);
				socket.close();
				System.out.println("send ok");
				
		} catch (SocketException e) {
		
		} catch (UnknownHostException e) {
		
		}catch (IOException e) {
			
			}
		
		
	}

}
