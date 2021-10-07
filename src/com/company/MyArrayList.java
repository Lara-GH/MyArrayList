package com.company;

import java.util.Collection;

public class MyArrayList<E> implements MyList<E> {

    private Object[] values;

    private int size;

    private final static int DEFAULT_SIZE = 10;

    private int arraySize = DEFAULT_SIZE;

    public MyArrayList() {
        values = new Object[DEFAULT_SIZE];
    }

    public MyArrayList(Collection<? extends E> c) {
        if (c.size() > 0) {
            values = c.toArray();
            size = values.length;
            arraySize = size;
            resize();
        }
    }

    public MyArrayList(int initialCapasity) {
        values = new Object[initialCapasity];
    }

    private void resize() {
        if (size >= arraySize) {
            Object[] newValues = new Object[size * 3 / 2 + 1];
            System.arraycopy(values, 0, newValues, 0, size);
            values = newValues;
        }
        if (size >= DEFAULT_SIZE && size < arraySize / 4) {
            Object[] newValues = new Object[size * 3 / 2 + 1];
            System.arraycopy(values, 0, newValues, 0, size);
            values = newValues;
        }
    }

    @Override
    public void add(E e) {
        resize();
        values[size] = e;
        size++;
    }

    @Override
    public void add(E e, int index) {
        resize();
        System.arraycopy(values, index, values, index + 1, size - index);
        values[index] = e;
        ++size;
    }

    @Override
    public void clear() {
        for (int i = 0; i < size; i++) {
            values[i] = null;
        }
        size = 0;
    }

    @Override
    public Object get(int index) {
        if (index < size && index >= 0) {
            return values[index];
        } else {
            throw new IndexOutOfBoundsException();
        }
    }

    @Override
    public int indexOf(E e) {
        for (int i = 0; i < size; i++) {
            if (values[i].equals(e)) {
                return i;
            }
        }
        return -1;
    }

    @Override
    public void remove(int index) {
        if (index > size) {
            throw new IndexOutOfBoundsException();
        }
        System.arraycopy(values, index + 1, values, index, size - index - 1);
        values[--size] = null;
        resize();
    }

    @Override
    public void remove(E e) {
        int index = indexOf(e);
        if (index >= 0) {
            System.arraycopy(values, index + 1, values, index, size - index - 1);
            size--;
            values[size] = null;
        }
    }

    @Override
    public Object set(E e, int index) {
        if (index >= size) {
            throw new IndexOutOfBoundsException();
        }
        Object unchangedO = values[index];
        values[index] = e;
        return unchangedO;
    }

    @Override
    public int size() {
        return size;
    }
}
