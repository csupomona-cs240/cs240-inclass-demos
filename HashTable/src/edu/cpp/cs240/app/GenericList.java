package edu.cpp.cs240.app;

/**
 * The interface that specifies the common operations
 * needed for an integer list.
 *
 * @author yusun
 *
 */
public interface GenericList<T> {

    public void add(T value);

    public void add(int index, T value);

    public void remove(int index);

    public int size();

    public int indexOf(T value);

    public T get(int index);

    public void set(int index, T value);

    public String toString();

    public void clear();

}
