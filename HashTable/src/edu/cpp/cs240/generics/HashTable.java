package edu.cpp.cs240.generics;

public interface HashTable<K, V> {

	public void put(K key, V value);

	public V get(K key);

	public int size();

	public void remove(K key);

}
