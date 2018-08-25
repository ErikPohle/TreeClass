
public class Main {
	public static void main(String[] args) {
		MusicLibrary myMusic = new MusicLibrary();
		myMusic.buildHashMap("Rap God" , 1560);
		myMusic.buildHashMap("zzmm", 1);
		System.out.println(myMusic.getWords("Rap Gad"));		
		System.out.println(myMusic.getWords("zzmm") + " " + myMusic.hashCode("zzmm"));		
		System.out.println(myMusic.getWords("Rap God") + " " + myMusic.hashCode("Rap God"));

	}
}
