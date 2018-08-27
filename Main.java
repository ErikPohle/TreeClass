
public class Main {
	public static void main(String[] args) {
		HashTable myTable = new HashTable();
		myTable.insert("Rap God", "7");
		myTable.insert("Viva La Vida", "10");
		myTable.insert("My Hero", "5");	
		myTable.insert("It's Friday", "1");
		System.out.println(myTable.getVal("Rap God"));
		myTable.setRating("Rap God", "9");
		System.out.println(myTable.getVal("Rap God"));		
		System.out.println(myTable.getVal("My Hero"));
		System.out.println(myTable.getVal("It's Friday"));
		System.out.println(myTable);
	}
}
