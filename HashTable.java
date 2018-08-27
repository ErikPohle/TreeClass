import java.util.*;

public class HashTable {
	private final HashEntry[] table;
	private final int size = 100;
	
	HashTable() {
		this.table = new HashEntry[size];
	}
	
	public String getVal(String key) {
		int index = this.getIndex(key);
		HashEntry chosenEntry = table[index];
		return chosenEntry.getValue(key);
	}
	
	public void insert(String key, String val) {
		int index = this.getIndex(key);
		HashEntry keyAndVal = new HashEntry(key, val);
		table[index] = keyAndVal;
	}
	
	public void setRating(String key, String val) {
		int index = this.getIndex(key);
		HashEntry chosenEntry = table[index];
		chosenEntry.setVal(val);
	}
	
	private int getIndex(String key) {
		int hash = 7;
		for(int i = 0; i < key.length(); i++) {
			hash = (hash * 31 + key.charAt(i)) % size;
		}
		return hash;
	}
}
