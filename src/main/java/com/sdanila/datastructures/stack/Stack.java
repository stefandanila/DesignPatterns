package com.sdanila.datastructures.stack;


public class Stack<T> {
    private final int maxSize = 512;
    private final T[] values = (T[]) new Object[maxSize];
    private int top = -1;

    public Stack() {

    }

    public T push(T object) throws Exception {
        if (top >= maxSize - 1) {
            throw new Exception("Stack is full");
        }
        top++;
        values[top] = object;
        return values[top];
    }

    public T peek() throws Exception {
        if (top == -1) {
            throw new Exception("Stack is empty");
        }
        return values[top];
    }

    public T pop() throws Exception {
        if (top == -1) {
            throw new Exception("Stack is empty");
        }
        T object = values[top];
        top--;
        return object;
    }

    public boolean isEmpty() {
        return top == -1;
    }

    public void empty() {
        top = -1;
    }
}

class TestStack {
    public static void main(String[] args) throws Exception {
        Stack<String> myStringStack = new Stack<>();

        for (int i = 0; i < 512; i++) {
            myStringStack.push("Abc" + i);
        }

        try {
            myStringStack.push("Abc-");
        } catch (Exception e) {
            System.out.println(e);
        }


        for (int i = 0; i < 512; i++) {
            System.out.println(myStringStack.peek());
            System.out.println(myStringStack.pop());
        }

        try {
            myStringStack.peek();
        } catch (Exception e) {
            System.out.println(e);
        }

        try {
            myStringStack.pop();
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}

