package tw.org.iii.lesson_1;

import java.io.BufferedReader;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.InetAddress;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;

public class Brad61 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		try {
			URL url = new URL("http://pdfmyurl.com/?url=http://yahoo.com.tw");
			HttpURLConnection conn = (HttpURLConnection)url.openConnection();
			conn.connect();
//			BufferedReader reader =
//					new BufferedReader(
//							new InputStreamReader(
//									conn.getInputStream()));
//			String line;
//			while((line =reader.readLine())!=null){
//				System.out.println(line);
//			}
			
			InputStream in =conn.getInputStream();
			FileOutputStream fout = new FileOutputStream("upload/brad1.pdf");
			int b;
			while((b=in.read())!=-1){
				fout.write(b);
			}
			
			fout.flush();
			fout.close();
			in.close();
			System.out.println("OK");
		} catch (Exception e) {
			System.out.println(e.toString());

		}
		
		
	}

}
