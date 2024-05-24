package utilities;

import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;

public class ReadpropertyFile {
	public static void main(String[] args) throws IOException {
		FileReader fr = new FileReader("C:\\Users\\Anurag\\Documents\\eclipse-workspace\\LumaProject01\\src\\test\\resources\\congigfiles\\config.properties");
		Properties p = new Properties();
		p.load(fr);
		
		System.out.println(p.getProperty("browser"));
		System.out.println(p.getProperty("testurl"));
	}
}