package com.arhatech.java.ds.custom_data_structures;

import com.arhatech.java.ds.custom_data_structures.impl.FixedArrayStack;
import com.arhatech.java.ds.custom_data_structures.interfaces.Stack;
import com.arhatech.java.exceptions.StackEmptyException;
import com.arhatech.java.exceptions.StackFullException;
import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import static org.junit.Assert.assertTrue;

/**
 * @author ankit.
 */
public class TestFixedArrayStack {

    private static final Logger logger = LoggerFactory.getLogger(TestFixedArrayStack.class);

    Stack stack;

    @Test
    public void testStackCreation(){
        logger.debug("Testing Stack Creation");
        stack = new FixedArrayStack();
        String testData = new String("Hello");

        assertTrue("Positive TestCase: ", stack.isEmpty()==true);

        logger.debug("Testing Stack push operation");
        stack.push(testData);

        //After Pushing data to stack
        logger.debug("Testing Stack top operation");
        assertTrue("Positive TestCase: ", testData.equals(stack.top()));

        logger.debug("Testing Stack size");
        assertTrue("Positive TestCase: ", 1==stack.size());

        //After Popping Out the value
        logger.debug("Testing Stack pop operation");
        assertTrue("Positive TestCase: ", testData.equals(stack.pop()));

        assertTrue("Positive TestCase: ", stack.isEmpty()==true);
    }

    @Test(expected = StackEmptyException.class)
    public void testStackPopForEmptyStack(){
        logger.debug("Testing Stack Empty Exception Condition");
        stack = new FixedArrayStack();
        stack.pop();
    }

    @Test(expected = StackFullException.class)
    public void testStackPushForFullStack(){
        logger.debug("Testing Stack Full Exception Condition");
        stack = new FixedArrayStack(1);
        String testData = new String("Hello");
        String newData = new String("Hello");

        stack.push(testData);
        stack.push(newData);

    }

}
