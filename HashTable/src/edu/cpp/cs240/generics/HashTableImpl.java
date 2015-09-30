package edu.cpp.cs240.generics;

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
public class HashTableImpl<K, V> implements HashTable<K, V> {

	private static final int TABLE_CAPACITY = 100;

	private HashEntry<K, V>[] dataArray;
	private int size;

	public HashTableImpl() {
		dataArray = new HashEntry[TABLE_CAPACITY];
		size = 0;
	}

	private int hash(K key) {
		System.out.println(key + " " + Math.abs(key.hashCode()) % dataArray.length);
		return Math.abs(key.hashCode()) % dataArray.length;
	}

	@Override
	public void put(K key, V value) {
		HashEntry<K, V> entry = new HashEntry<K, V>(key, value);
		int indexToPut = hash(key);
		HashEntry<K, V> cursor = dataArray[indexToPut];
		if (cursor != null) {
			HashEntry<K, V> prev = null;
			while(cursor != null && !cursor.getKey().equals(key)) {
				prev = cursor;
				cursor = cursor.getNext();
			}
			if (cursor == null) {
				prev.setNext(entry);
			} else {
				cursor.setValue(value);
			}
		} else {
			dataArray[indexToPut] = entry;
		}
		size++;
	}

	@Override
	public V get(K key) {
		int indexToGet = hash(key);
		HashEntry<K, V> cursor = dataArray[indexToGet];
		while(cursor != null && !cursor.getKey().equals(key)) {
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
	public void remove(K key) {
		int indexToRemove = hash(key);
		HashEntry<K, V> cursor = dataArray[indexToRemove];
		HashEntry<K, V> prev = null;
		while(cursor != null && !cursor.getKey().equals(key)) {
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
		for(HashEntry<K, V> entry : dataArray) {
			if (entry != null) {
				HashEntry<K, V> cursor = entry;
				while(cursor != null) {
					res += cursor.getKey() + " = " + cursor.getValue() + "\n";
					cursor = cursor.getNext();
				}
			}
		}
		return res;
	}
}
