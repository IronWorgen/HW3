package org.example;

import java.util.Iterator;
import java.util.Spliterator;
import java.util.function.Consumer;

public class myList<T> implements Iterable<T> {
    private class Iterator<T> implements java.util.Iterator<T> {
        private int index = 0;

        @Override
        public boolean hasNext() {
            return index<count;
        }

        @Override
        public T next() {
            if (hasNext()){
                return (T)arr[index++];
            }else {
                throw new RuntimeException();
            }

        }
    }


    Object[] arr;

    Iterator<T> iterator = new Iterator<>();
    int count;

    public myList() {
        arr = new Object[1];
        count = 0;

    }

    void add(T item) {
        if (count == arr.length) {
            Object[] newArr = new Object[arr.length * 2];
            System.arraycopy(arr, 0, newArr, 0, arr.length);
            arr = newArr;
        }
        arr[count++] = item;
    }

    @Override
    public java.util.Iterator<T> iterator() {
        return iterator;
    }

    @Override
    public void forEach(Consumer<? super T> action) {
        Iterable.super.forEach(action);
    }

    @Override
    public Spliterator<T> spliterator() {
        return Iterable.super.spliterator();
    }
}
