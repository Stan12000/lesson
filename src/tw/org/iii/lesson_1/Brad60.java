package tw.org.iii.lesson_1;

import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.net.SocketException;

import com.sun.jmx.snmp.InetAddressAcl;

public class Brad60 {

	public static void main(String[] args) {
		byte[] buf = new byte[1024];
		
		
		try{
			DatagramSocket socket =new DatagramSocket(8875);
			DatagramPacket packet =new DatagramPacket(buf, buf.length);
			System.out.println("BEFORE");
			socket.receive(packet);
			System.out.println("after");
			socket.close();
			InetAddress urip = packet.getAddress();
			System.out.println("OK"+urip.getHostAddress());
		} catch (Exception e) {
			System.out.println(e.toString());
		}
		
	}

}
