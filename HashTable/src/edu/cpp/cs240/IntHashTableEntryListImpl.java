package edu.cpp.cs240;

/**
 * This is a Hash Table implementation using
 * linked list entries.
 *
 * Note: this implementation is not complete. When
 * all the spaces are filled with elements, its capacity
 * has to be increased and the old elements have to be
 * copied with the right hashing function.
 *
 * @author yusun
 *
 */
public class IntHashTableEntryListImpl implements IntHashTable {

	private IntHashEntry[] dataArray;
	private int size;

	public IntHashTableEntryListImpl() {
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
		IntHashEntry cursor = dataArray[indexToPut];
		if (cursor != null) {
			while(cursor.getNext() != null && cursor.getKey() != key) {
				cursor = cursor.getNext();
			}
			if (cursor.getKey() != key) {
				cursor.setNext(entry);
			} else {
				cursor.setValue(value);
			}
		} else {
			dataArray[indexToPut] = entry;
		}
		size++;
	}

	@Override
	public Integer get(int key) {
		int indexToGet = hash(key);
		IntHashEntry cursor = dataArray[indexToGet];
		while(cursor != null && cursor.getKey() != key) {
			cursor = cursor.getNext();
		}
		if (cursor == null) {
			return null;
		}
		return cursor.getValue();
	}

	@Override
	public int size() {
		return size;
	}

	@Override
	public void remove(int key) {
		int indexToRemove = hash(key);
		IntHashEntry cursor = dataArray[indexToRemove];
		IntHashEntry prev = null;
		while(cursor != null && cursor.getKey() != key) {
			prev = cursor;
			cursor = cursor.getNext();
		}
		if (cursor != null) {
			if (prev == null) {
				dataArray[indexToRemove] = cursor.getNext();
			} else {
				prev.setNext(cursor.getNext());
			}
			size--;
		}
	}

	public String toString() {
		String res = "";
		for(IntHashEntry entry : dataArray) {
			if (entry != null) {
				IntHashEntry cursor = entry;
				while(cursor != null) {
					res += cursor.getKey() + " = " + cursor.getValue() + "\n";
					cursor = cursor.getNext();
				}
			}
		}
		return res;
	}
}
