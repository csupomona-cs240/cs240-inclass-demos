package edu.cpp.cs240;

/**
 * The interface that specifies the common operations
 * needed for an integer list.
 *
 * @author yusun
 *
 */
public interface IntList {

    public void add(int value);

    public void add(int index, int value);

    public void remove(int index);

    public int size();

    public int indexOf(int value);

    public int get(int index);

    public void set(int index, int value);

    public String toString();

    public void clear();

}
