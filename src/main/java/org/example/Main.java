package org.example;

public class Main {
    public static void main(String[] args) {

        myList<Employ> list = new myList<>();
        list.add(new Employ("работник"));
        list.add(new Manager("manager"));

        for (Employ item : list) {
            System.out.println(item);
        }

    }

    //task 3
    private static <T> boolean compare(T[] arr1, T[] arr2) {
        if (arr1.length != arr2.length) {
            return false;
        }
        for (int i = 0; i < arr2.length; i++) {
            if (!arr1[i].equals(arr2[i])) {
                return false;
            }
        }
        return true;
    }

    //task 4
    private static class Pair<T, V> {
        T first;
        V second;

        public Pair(T first, V second) {
            this.first = first;
            this.second = second;
        }

        public T getFirst() {
            return first;
        }

        public void setFirst(T first) {
            this.first = first;
        }

        public V getSecond() {
            return second;
        }

        public void setSecond(V second) {
            this.second = second;
        }

        @Override
        public String toString() {
            return "first=" + first +", second=" + second;

        }
    }

    static class Employ {
        String name;

        public Employ(String name) {
            this.name = name;
        }

        @Override
        public String toString() {
            return name;
        }
    }

    static class Manager extends Employ {
        public Manager(String name) {
            super(name);
        }

        @Override
        public String toString() {
            return super.toString();
        }
    }
}