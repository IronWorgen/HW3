package org.example;

import lombok.RequiredArgsConstructor;

import java.util.function.Consumer;


@RequiredArgsConstructor
public class Iterator<T> implements java.util.Iterator<T> {
    int currentIndex = 0;
    private final T[] arr;

    @Override
    public boolean hasNext() {
        return currentIndex < arr.length;
    }

    @Override
    public T next() {
        return arr[currentIndex++];
    }


}
