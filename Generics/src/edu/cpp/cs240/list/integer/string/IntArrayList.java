package edu.cpp.cs240.list.integer.string;

/**
 * The implementation of the integer list interface
 * using arrays.
 *
 * @author yusun
 *
 */
public class IntArrayList implements StringList {

    private String[] data;
    private int size;

    public IntArrayList() {
            data = new String[10];
            size = 0;
    }

    public IntArrayList(int capacity) {
        data = new String[capacity];
        size = 0;
    }

    /**
     * Double the capacity of the array.
     *
     * Note: this method is private, because we do
     * not want the users to know the internal details
     * on how we scale and increase the capacity.
     */
    private void increaseDataCapacity() {
        String[] newData = new String[data.length * 2];
        for(int i = 0; i < data.length; i++) {
            newData[i] = data[i];
        }
        data = newData;
    }

    /**
     * Appends value at end of list
     */
    public void add(String value) {
        // if the array is full, we need to
        // increase the capacity
        if (size == data.length) {
            increaseDataCapacity();
        }
        data[size] = value;
        size++;
    }

    /**
     * Inserts given value just before the given index,
     * shifting subsequent values to the right
     */
    public void add(int index, String value) {
        if (index < size) {
            // if the array is full, we need to
            // increase the capacity
            if (size == data.length) {
                increaseDataCapacity();
            }
            // shift all the elements to the right by 1,
            // so that we can add the
            for(int i = size; i > index; i--) {
                data[i] = data[i - 1];
            }
            data[index] = value;
            size++;
        } else {
            throw new RuntimeException("Out of the list boundary.");
        }
    }

    /**
     * Removes all elements of the list
     */
    public void clear() {
        size = 0;
    }

    /**
     * Returns first index where given value is found in list (-1 if not found)
     */
    public int indexOf(String value) {
        for(int i = 0; i < size; i++) {
            if (data[i] == value) {
                return i;
            }
        }
        return -1;
    }

    /**
     * Returns the value at given index
     */
    public String get(int index) {
        if (index < size) {
            return data[index];
        } else {
            throw new RuntimeException("Out of the list boundary.");
        }
    }

    /**
     * Removes/returns value at given index, shifting subsequent values to the left
     */
    public void remove(int index) {
        if (index < size) {
            // shift all the element to the left by 1
            // so that we can remove the element at the index
            for(int i = index; i < size - 1; i++) {
                data[i] = data[i + 1];
            }
            size--;
        } else {
            throw new RuntimeException("Out of the list boundary.");
        }
    }

    /**
     * Replaces value at given index with given value
     */
    public void set(int index, String value) {
        if (index < size) {
            data[index] = value;
        } else {
            throw new RuntimeException("Out of the list boundary.");
        }
    }

    /**
     * Returns the number of elements in list
     */
    public int size() {
        return size;
    }

    /**
     * Returns a string representation of the list,
     * such as "[3, 42, -7, 15]"
     */
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append('[');
        for (int i = 0; i < size; i++) {
            sb.append(data[i]);
            if (i < size - 1) {
                sb.append(", ");
            }
        }
        sb.append(']').toString();
        return sb.toString();
    }
}
