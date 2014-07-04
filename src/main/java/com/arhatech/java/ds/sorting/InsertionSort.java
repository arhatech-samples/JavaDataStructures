package com.arhatech.java.ds.sorting;

import com.arhatech.java.exceptions.BadArgumentException;

/**
 * @author ankit.
 */
public class InsertionSort {

    public static Integer[] sort(Integer[] baseArray){
        if(baseArray == null){
            throw new BadArgumentException("Array Cannot be Null");
        }

        for (int j = 1; j < baseArray.length; j++) {
            int key = baseArray[j];
            int i = j-1;
            while (i > 0 && baseArray[i] > key){
                baseArray[i+1] = baseArray[i];
                i--;
            }
            baseArray[i+1] = key;
        }

        return baseArray;
    }
}
