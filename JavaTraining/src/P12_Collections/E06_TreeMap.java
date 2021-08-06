package P12_Collections;

import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class E06_TreeMap {

	public static void main(String[] args) {
		
		Map<String, Object> info = new TreeMap<>();
		
		info.put("first_name", "Juan");
		info.put("last_name", "Sosa");
		info.put("active", false);
		info.put("age", 35);
		info.put("height", 1.72);
		info.put("gender", 'M');
		
		info.put("active", true);
		
		Set<String> fields = info.keySet();
		
		for(String field : fields) {
			System.out.println(field + " : " + info.get(field));
		}
		
	}

}
