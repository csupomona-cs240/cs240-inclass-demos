package edu.cpp.cs240.list.generics;

/**
 * The implementation of the integer list interface
 * using Linked List.
 *
 * @author yusun
 *
 */
public class GenericSLinkedList<T> implements GenericList<T> {

    private Node<T> head;
    private Node<T> tail;
    private int size;

    public GenericSLinkedList() {
        size = 0;
    }

    public void add(T value) {
        Node<T> newNode = new Node<T>(value, null);

        // check if the list is empty
        if (head != null) {
            tail.setNext(newNode);
        } else {
            head = newNode;
        }
        tail = newNode;
        size++;
    }

    public void add(int index, T value) {
        if (index < size()) {
            // create the new node
            Node<T> newNode = new Node<T>(value, null);

            // check if we want to add it in the beginning
            if (index == 0) {
                newNode.setNext(head);
                head = newNode;
            } else {
                Node<T> prev = head;
                for(int i = 0; i < index - 1; i++) {
                    prev = prev.getNext();
                }
                newNode.setNext(prev.getNext());
                prev.setNext(newNode);
            }
            size++;
        } else {
            throw new RuntimeException("Index out of bound.");
        }
    }

    public void remove(int index) {
        if (index < size()) {
            // check if it is the first element to remove
            if (index == 0) {
                head = head.getNext();
                if (head == null) {
                    tail = null;
                }
            } else {
                Node<T> prev = head;
                for(int i = 0; i < index - 1; i++) {
                    prev = prev.getNext();
                }
                prev.setNext(prev.getNext().getNext());

                if (index == size() - 1) {
                    tail = prev;
                }
            }

            size--;
        } else {
            throw new RuntimeException("Index out of bound.");
        }
    }

    public int size() {
        return size;
    }

    public int indexOf(T value) {
        int index = 0;
        Node<T> cursor = head;
        while(cursor != null) {
            if (cursor.getValue() == value) {
                return index;
            }
            cursor = cursor.getNext();
            index++;
        }
        return -1;
    }

    public T get(int index) {
        if (index < size()) {
            Node<T> cursor = head;
            for(int i = 0 ; i < index; i++) {
                cursor = cursor.getNext();
            }
            return cursor.getValue();
        } else {
            throw new RuntimeException("Index out of bound.");
        }

    }

    public void set(int index, T value) {
        if (index < size()) {
            Node<T> cursor = head;
            for(int i = 0 ; i < index; i++) {
                cursor = cursor.getNext();
            }
            cursor.setValue(value);
        } else {
            throw new RuntimeException("Index out of bound.");
        }
    }

    public String toString() {
        String res = "[";
        Node<T> cursor = head;
        while(cursor != null) {
            res += cursor.getValue();
            cursor = cursor.getNext();
            if (cursor != null) {
                res += ",";
            }
        }
        res += "]";
        return res;
    }

    public void clear() {
        head = null;
        tail = null;
        size = 0;
    }
}
