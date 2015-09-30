package edu.cpp.cs240;

public class IntArrayList implements IntList {

	private int[] data;
	private int size;

	public IntArrayList() {
		data = new int[10];
		size = 0;
	}


	public void add(int value) {
		// if we don't have enough capacity in the array
		if (size >= data.length) {
			increaseCapacity();
		}
		data[ size ] = value;
		size++;
	}

	private void increaseCapacity() {
		// allocate a new array
		int[] newData = new int[data.length * 2];
		// copy the old data
		for(int i = 0; i < size; i++) {
			newData[i] = data[i];
		}
		// update the array reference
		data = newData;
	}

	public void add(int index, int value) {
		if (index >= size) {
			throw new RuntimeException("The index is out of bound.");
		}

		if (index >= data.length) {
			increaseCapacity();
		}

		// shift the array first
		for(int i = size - 1; i >= index ; i--) {
			data[ i + 1 ] = data[ i ];
		}

		// add the new value
		data[ index ] = value;

		// increase the size
		size++;
	}

	public void remove(int index) {
		if (index < 0 || index >= size) {
			throw new RuntimeException("Invalid index to rmeove");
		}

		// shift the element
		for(int i = index; i < size; i++) {
			data[ i ] = data[i + 1];
		}

		// decrease the size
		size--;
	}

	public int indexOf(int value) {
		for(int i = 0; i < size; i++) {
			if (data[i] == value) {
				return i;
			}
		}
		return -1;
	}

	public int get(int index) {
		if (index < 0 || index >= size) {
			throw new RuntimeException("Invalid index to rmeove");
		}
		return data[ index ];
	}

	public void set(int index, int value) {
		if (index < 0 || index >= size) {
			throw new RuntimeException("Invalid index to rmeove");
		}
		data[ index ] = value;
	}

	public int size() {
		return size;
	}

	public void clear() {
		size = 0;
	}

	public String toString() {
		String res = "[";
		for(int i = 0; i < size; i++) {
			res = res + data[i];
			if (i < size - 1) {
				res += ",";
			}
		}
		res = res + "]";
		return res;
	}

}
