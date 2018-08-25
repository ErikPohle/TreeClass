import java.util.*;

public class MusicLibrary {
	private HashMap<Integer, Integer> library = new HashMap<Integer, Integer>();
	
	public void buildHashMap(String name, int val) {
		if(!library.containsKey(hashCode(name))) {
			library.put(hashCode(name), val);
		}
		else {
			collision();
		}
	}
	
	public int getWords(String name) {
		if(!library.containsKey(hashCode(name))) {
			return -1;
		}
		else {
			return library.get(hashCode(name));
		}
	}
	
	public int hashCode(String name) {
		int hash = 0;
		for(int i = 0; i < name.length(); i++) {
			hash += Character.getNumericValue(Character.toLowerCase(name.charAt(i)));
		}
		return hash;
	}
	
	public void collision() {
		System.out.println("COLLIDED");
	}
}
