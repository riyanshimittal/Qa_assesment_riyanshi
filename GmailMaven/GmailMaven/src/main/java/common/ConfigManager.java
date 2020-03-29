package common;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class ConfigManager {
	
	static Properties prop = new Properties();
	public static Properties getProp() {
		return prop;
	}
	public static void setProp(Properties prop) {
		ConfigManager.prop = prop;
	}
	public static void loadProperties() throws IOException {
		FileInputStream input = new FileInputStream("C:\\Users\\riyanshi.mittal\\eclipse-workspace\\GmailMaven\\config.properties");
		prop.load(input);
	
	}

}
