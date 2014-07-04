package com.arhatech.java.ds.custom_data_structures.impl;

import com.arhatech.java.ds.custom_data_structures.interfaces.Stack;
import com.arhatech.java.exceptions.StackEmptyException;
import com.arhatech.java.exceptions.StackFullException;

/**
 * @author ankit.
 */
public class FixedArrayStack implements Stack{
    private static final int DEFAULT_CAPACITY = 1024;
    private final int MAX_CAPACITY;

    private Object[] stack;
    private int stackTop = -1;

    /**
     * Creates an Array Based stack with default capacity of 1024 elements
     */
    public FixedArrayStack(){
        this(DEFAULT_CAPACITY);
    }

    public FixedArrayStack(int maxCapacity){
        MAX_CAPACITY = maxCapacity;
        stack = new Object[MAX_CAPACITY];
    }

    @Override
    public int size() {
        return stackTop +1;
    }

    @Override
    public boolean isEmpty() {
        return (stackTop <0);
    }

    @Override
    public Object top() throws StackEmptyException {
        if(isEmpty()){
            throw new StackEmptyException("The Stack Stack has no elements");
        }

        return stack[stackTop];
    }

    @Override
    public void push(Object element) throws StackFullException{
        if(size()== MAX_CAPACITY){
            throw new StackFullException("Stack has no more space");
        }

        stack[++stackTop] = element;
    }

    @Override
    public Object pop() throws StackEmptyException {
        if(isEmpty()){
            throw new StackEmptyException("The Stack has no elements to pop");
        }
        Object topElement = stack[stackTop];
        stack[stackTop--] = null;
        return topElement;
    }
}
