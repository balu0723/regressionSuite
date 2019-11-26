package practice_selenium;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Properties;
import java.util.Set;

public class ReadingDataFromPropertyFile {
	
	public static void main(String[] args) {
		
		
	}

	public static HashMap<String,String> getProperty(String filePath) {
		LinkedHashMap<String,String> testCaseData = new LinkedHashMap<>();
		FileReader file;
		try {
			file = new FileReader(filePath);
			Properties prop = new Properties();
			prop.load(file);
			Set<Entry<Object, Object>>  values = prop.entrySet();
			for (Entry<Object, Object> entry : values) {
				String key = (String)entry.getKey();
				String value = (String)entry.getValue();
				testCaseData.put(key, value);
			}
		} catch ( IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
		return testCaseData;   
	}
		
		
}
