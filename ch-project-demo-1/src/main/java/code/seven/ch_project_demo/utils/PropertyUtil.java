package code.seven.ch_project_demo.utils;

import java.io.InputStream;
import java.util.Properties;

@Deprecated
public class PropertyUtil {
	private static Properties properties;
	static {
		try {
			InputStream inputStream = PropertyUtil.class.getClassLoader().getResourceAsStream("sys.properties");
			try {
				properties = new Properties();
				properties.load(inputStream);
			} catch (Exception e) {
				e.printStackTrace();
			} finally {
				inputStream.close();
			}
		} catch (Exception e) {

		}
	}

	public static String getProperty(String key) {
		return properties.getProperty(key);
	}

}