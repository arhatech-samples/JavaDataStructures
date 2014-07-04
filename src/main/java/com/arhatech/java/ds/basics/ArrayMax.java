package com.arhatech.java.ds.basics;

import com.arhatech.java.exceptions.BadArgumentException;

/**
 * This Class is used to provide an maximum element within an array. *
 * @author ankit.
 */
public class ArrayMax {

    public static Integer maxInt(Integer[] intArray){
        if(intArray == null){
            throw new BadArgumentException("Array Cannot be Null");
        }

        int currentMax = intArray[0];
        for (int i = 0; i < intArray.length; i++) {
            if (currentMax < intArray[i]) {
                currentMax = intArray[i];
            }
        }
        return currentMax;
    }
}
