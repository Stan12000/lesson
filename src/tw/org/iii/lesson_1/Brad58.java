package tw.org.iii.lesson_1;

import java.net.InetAddress;
import java.net.UnknownHostException;

public class Brad58 {

	public static void main(String[] args) {
		
		try {
			InetAddress[] ips = InetAddress.getAllByName("www.microsoft.com.tw");
		for(InetAddress ip:ips){
		  System.out.println(ip.getHostAddress());
		}
		} catch (UnknownHostException e) {
	        System.out.println("NO");
		}
	}

}
