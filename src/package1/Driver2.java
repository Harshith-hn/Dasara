package package1;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class Driver2 extends Child{
	public static void main(String [] args) throws IOException {
		Parent p1= new Child();
		System.out.println(p1);
		Properties prop= new Properties();
		FileInputStream fis= new FileInputStream(System.getProperty("user.dir")+"\\src\\package1\\data.properties");
		prop.load(fis);
		String ipAddress = prop.getProperty("ipAddress");
		String port= prop.getProperty("port");
		String AndroidDeviceName=  prop.getProperty("AndroidDeviceName");
		System.out.println(ipAddress);
		System.out.println(port);
		System.out.println(AndroidDeviceName);
	}

}
