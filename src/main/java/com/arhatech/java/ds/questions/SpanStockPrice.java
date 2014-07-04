package com.arhatech.java.ds.questions;

import com.arhatech.java.ds.custom_data_structures.impl.GrowableArrayStack;
import com.arhatech.java.ds.custom_data_structures.interfaces.Stack;
import com.arhatech.java.exceptions.BadArgumentException;

/**
 * @question: The span Si of a stock price on a certain day is the maximum number of consecutive days(up to the current day) the
 *            price of the stock has been less than or equal to price on the day i.
 *            So given as input an n-element array P of numbers such that P[i] is the price of stock on day i,
 *            compute as output an n-element array S of numbers such that S[i] is the span of the stock on day i.
 *
 * @author ankit.
 */
public class SpanStockPrice {

    public static Integer[] findPriceSpan(Integer[] stockPrice){
        if(stockPrice==null || stockPrice.length==0){
            throw new BadArgumentException("Input Cannot be null or empty");
        }

        Stack tempStack = new GrowableArrayStack(5);

        Integer[] priceSpan = new Integer[stockPrice.length];

        for (int i = 0; i < stockPrice.length; i++) {
            int h =0;
            boolean done = false;

            while(!(done || tempStack.isEmpty())){
                if(stockPrice[i] >= stockPrice[(Integer)tempStack.top()]){
                    tempStack.pop();
                }else{
                    done = true;
                }
            }

            if(tempStack.isEmpty()){
                h = -1;
            }else{
                h = (Integer)tempStack.top();
            }

            priceSpan[i] = i - h;

            tempStack.push(new Integer(i));

        }
        return priceSpan;
    }
}
