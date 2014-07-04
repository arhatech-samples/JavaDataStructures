package com.arhatech.java.ds.basics;

import com.arhatech.java.exceptions.BadArgumentException;

/**
 * @author ankit.
 */
public class PrefixAverage {

    public static Integer[] average1(Integer[] baseArray){
        if(baseArray == null){
            throw new BadArgumentException("Array Argument Cannot be null");
        }

        Integer[] prefixArray = new Integer[baseArray.length];
        for (int i = 0; i < baseArray.length; i++) {
            int sum = 0;
            for(int j = 0; j <= i; j++){
                sum = sum + baseArray[j];
            }
            prefixArray[i] = sum/(i+1);
        }
        return prefixArray;
    }


    public static Integer[] average2(Integer[] baseArray){
        if(baseArray == null){
            throw new BadArgumentException("Array Argument Cannot be null");
        }
        Integer[] prefixArray = new Integer[baseArray.length];
        int sum = 0;
        for (int i = 0; i < baseArray.length; i++) {
            sum = sum + baseArray[i];
            prefixArray[i] = sum/(i+1);
        }
        return prefixArray;
    }
}
