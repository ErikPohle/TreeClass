
public class HashEntry {
	private String key;
	private String val;
	
	HashEntry(String key, String val) {
		this.key = key;
		this.val = val;
	}
	
	public String getKey() {
		return this.key;
	}
	
	public String getValue() {
		return this.val;
	}
	
	public void setVal(String val) {
		this.val = val;
	}
}
