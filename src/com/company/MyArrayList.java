package com.company;

import java.util.ArrayList;

public class MyArrayList<E> implements MyList<E> {
    private ArrayList<E> list;

    public MyArrayList() {
        list = new ArrayList<>();
    }

    @Override
    public void add(E e) {
        list.add(e);
    }

    @Override
    public void add(E e, int index) {
        list.add(index, e);
    }

    @Override
    public void clear() {
        list.clear();
    }

    @Override
    public E get(int index) {
        return list.get(index);
    }

    @Override
    public int indexOf(E e) {
        return list.indexOf(e);
    }

    @Override
    public E remove(int index) {
        return list.remove(index);
    }

    @Override
    public boolean remove(E e) {
        return list.remove(e);
    }

    @Override
    public E set(E e, int index) {
        return list.set(index, e);
    }

    @Override
    public int size() {
        return list.size();
    }
}
