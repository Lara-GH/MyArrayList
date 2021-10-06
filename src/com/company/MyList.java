package com.company;

public interface MyList<E> {

    void add(E e);

    void add(E e, int index);

    void clear();

    E get(int index);

    int indexOf(E e);

    E remove(int index);

    boolean remove(E e);

    E set(E e, int index);

    int size();
}
