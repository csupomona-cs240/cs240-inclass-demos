package edu.cpp.cs240;

/**
 * This is a simple Hash Table implementation.
 *
 * Note: this implementation is not complete. When
 * all the spaces are filled with elements, its capacity
 * has to be increased and the old elements have to be
 * copied with the right hashing function.
 *
 * @author yusun
 *
 */
public class IntHashTableImpl implements IntHashTable {

	private IntHashEntry[] dataArray;
	private int size;

	public IntHashTableImpl() {
		dataArray = new IntHashEntry[100];
		size = 0;
	}

	private int hash(int key) {
		return key % dataArray.length;
	}

	@Override
	public void put(int key, int value) {
		IntHashEntry entry = new IntHashEntry(key, value);
		int indexToPut = hash(key);
		while(dataArray[indexToPut] != null && dataArray[indexToPut].getKey() != key) {
			indexToPut = (indexToPut + 1) % dataArray.length;
		}
		dataArray[indexToPut] = entry;
		size++;
	}

	@Override
	public Integer get(int key) {
		int indexToGet = hash(key);
		while(dataArray[indexToGet] != null && dataArray[indexToGet].getKey() != key) {
			indexToGet = (indexToGet + 1) % dataArray.length;
		}
		IntHashEntry entry = dataArray[indexToGet];
		if (entry == null) {
			return null;
		}
		return entry.getValue();
	}

	@Override
	public int size() {
		return size;
	}

	@Override
	public void remove(int key) {
		int indexToRemove = hash(key);
		while(dataArray[indexToRemove] != null && dataArray[indexToRemove].getKey() != key) {
			indexToRemove = (indexToRemove + 1) % dataArray.length;
		}
		dataArray[indexToRemove] = null;
		size--;
	}

	public String toString() {
		String res = "";
		for(IntHashEntry entry : dataArray) {
			if (entry != null) {
				res += entry.getKey() + " = " + entry.getValue() + "\n";
			}
		}
		return res;
	}
}
