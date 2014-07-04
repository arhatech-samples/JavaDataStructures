package com.arhatech.java.ds.custom_data_structures.interfaces;

import com.arhatech.java.exceptions.StackEmptyException;

/**
 * @author ankit.
 */
public interface Stack {

    //Accessor Methods
    public int size();
    public boolean isEmpty();
    public Object top() throws StackEmptyException;

    //Update Methods
    public void push(Object element);
    public Object pop() throws StackEmptyException;
}
