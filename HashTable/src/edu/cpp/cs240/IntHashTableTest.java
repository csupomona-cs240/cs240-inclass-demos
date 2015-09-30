package edu.cpp.cs240;

public class IntHashTableTest {

	public static void main(String[] args) {

		//IntHashTable hashTable = new IntHashTableImpl();
		IntHashTable hashTable = new IntHashTableEntryListImpl();
		hashTable.put(5432, 123213);
		hashTable.put(9877, 443233);
		hashTable.put(2872, 654233);
		hashTable.put(100, 22232);

		System.out.println(hashTable.size());
		System.out.println(hashTable);

		System.out.println(hashTable.get(2872));
		System.out.println(hashTable.get(100));
		System.out.println(hashTable.get(10022313));
		System.out.println();

		hashTable.remove(100);
		System.out.println(hashTable);

		hashTable.put(45872, 444233);
		hashTable.put(35872, 444233);
		hashTable.put(25872, 444233);
		hashTable.put(15872, 444233);
		System.out.println(hashTable);

		hashTable.remove(25872);
		System.out.println(hashTable);
	}
}
