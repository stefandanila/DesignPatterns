package com.sdanila.datastructures.queue;

public class Queue<T> {
    private static final int MAX_SIZE = 512;
    private T[] items = (T[]) new Object[MAX_SIZE];
    private int first = 0;
    private int last = 0;

    public Queue() {

    }

    public void add(T object) throws Exception {
        //conditions for not overlapping first with last
        boolean reachedEnd = last >= MAX_SIZE - 1;
        boolean spaceInFront = first > 1;
        boolean doesNotOverlap = first <= last || first - last > 1;

        if (reachedEnd && spaceInFront && doesNotOverlap) {
            last = 0;
        } else if(reachedEnd){
            throw new Exception("Queue is full");
        }
        items[last] = object;
        last++;
    }

    public T remove() throws Exception {
        if(first == last) {
            throw new Exception("Queue is empty");
        }

        if(first >= MAX_SIZE -1) {
            first = 0;
        }

        T object = items[first];
        first++;
        return object;
    }
}

class TestQueue {
    public static void main(String[] args) throws Exception {
        Queue<String> queue = new Queue<>();
        for (int i = 0; i < 511; i++) {
            queue.add("Abc" + i);
        }

        try {
            queue.add("Abc-");
        } catch (Exception e) {
            System.out.println(e);
        }

        for (int i = 0; i < 511; i++) {
            System.out.println(queue.remove());
        }

        try {
            queue.remove();
        } catch (Exception e) {
            System.out.println(e);
        }

        for (int i = 0; i < 250; i++) {
            queue.add("Abc" + i);
        }

        for (int i = 0; i < 100; i++) {
            System.out.println(queue.remove());
        }

        for (int i = 0; i < 250; i++) {
            queue.add("Abc" + i);
        }

        for (int i = 0; i < 400; i++) {
            System.out.println(queue.remove());
        }

        queue.add("ceva");
        queue.remove();

        try {
            queue.remove();
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
