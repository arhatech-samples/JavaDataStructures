package com.arhatech.java.ds.custom_data_structures.impl;

import com.arhatech.java.ds.custom_data_structures.interfaces.Stack;
import com.arhatech.java.exceptions.StackEmptyException;
import com.arhatech.java.utils.CommonUtils;

/**
 *
 * @author ankit.
 */

//TODO Improve the resize method so that poping reduces the stack size.
public class GrowableArrayStack implements Stack{
    private static final int DEFAULT_CAPACITY = 1024;
    private int maxCapacity;

    private Object[] stack;
    private int stackTop = -1;

    /**
     * Creates an Array Based stack with default capacity of 1024 elements
     */
    public GrowableArrayStack(){
        this(DEFAULT_CAPACITY);
    }

    public GrowableArrayStack(int maxCapacity){
        this.maxCapacity = maxCapacity;
        stack = new Object[this.maxCapacity];
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
    public void push(Object element) {
        if(size()== maxCapacity){
            resizeStack();
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

    private void resizeStack(){
        maxCapacity = maxCapacity*2;
        Object[] newStack = new Object[maxCapacity];

        CommonUtils.copyArray(newStack, stack);
        stack = newStack;
    }
}
