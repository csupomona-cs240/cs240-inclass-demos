package edu.cpp.cs240.list.integer.string;

/**
 * The interface that specifies the common operations
 * needed for an integer list.
 *
 * @author yusun
 *
 */
public interface StringList {

    public void add(String value);

    public void add(int index, String value);

    public void remove(int index);

    public int size();

    public int indexOf(String value);

    public String get(int index);

    public void set(int index, String value);

    public String toString();

    public void clear();

}
