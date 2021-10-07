package com.company;

public interface MyList<E> {

    void add(E e);

    void add(E e, int index);

    void clear();

    Object get(int index);

    int indexOf(E e);

    void remove(int index);

    void remove(E e);

    Object set(E e, int index);

    int size();
}
