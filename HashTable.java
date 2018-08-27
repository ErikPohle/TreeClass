import java.util.*;

public class HashTable {
	private HashEntry[] table;
	private int size = 100;
	
	HashTable() {
		this.table = new HashEntry[size];
	}
	
	public String getVal(String key) {
		int index = this.getIndex(key);
		//System.out.println("Key: " + key + " Index: " + index);
		HashEntry chosenEntry = table[index];
		return chosenEntry.getValue();
	}
	
	public void insert(String key, String val) {
		int index = this.getIndex(key);
		HashEntry keyAndVal = new HashEntry(key, val);
		if(table[index] == null) {
			table[index] = keyAndVal;
		}
		else {
			
			//Collision so rehash
			rehash();
		}
	}
	
	public void setRating(String key, String val) {
		int index = this.getIndex(key);
		HashEntry chosenEntry = table[index];
		chosenEntry.setVal(val);
	}
	
	public String toString() {
		String musicLibrary = "";
		for(HashEntry x : table) {
			if(x != null) {
				musicLibrary += "----------\n";
				musicLibrary += "Song Name: " + x.getKey() + "\n";
				musicLibrary += "Rating: " + x.getValue();
				musicLibrary += "\n";
			}
			
		}
		return musicLibrary + "----------\n";
	}
	
	private int getIndex(String key) {
		int hash = 7;
		for(int i = 0; i < key.length(); i++) {
			hash = (hash * 31 + key.charAt(i)) % size;
		}
		return hash;
	}
	
	private void rehash() {
		this.size = size * 2;
		int hash = 7;
		HashEntry[] newTable = new HashEntry[size];
		for(int i = 0; i < table.length; i++) {
			if(table[i] != null) {
				HashEntry keyAndVal = new HashEntry(table[i].getKey(), table[i].getValue());
				int index = getIndex(table[i].getKey());
				newTable[index] = keyAndVal;
			}
		}
		this.table = newTable;
	}
}
