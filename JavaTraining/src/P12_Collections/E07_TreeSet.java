package P12_Collections;

import java.util.Set;
import java.util.TreeSet;

public class E07_TreeSet {

	public static void main(String[] args) {
		
		Set<String> names = new TreeSet<>();
		
		names.add("Pepe");
		names.add("Juan");
		names.add("Luis");
		names.add("Juan");
		names.add("Luis");
		
		for(String name : names) {
			System.out.println(name);
		}
		
	}

}
