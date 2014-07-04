package com.arhatech.java.utils;

import com.arhatech.java.exceptions.BadOperationException;

/**
 * @author ankit.
 */
public class CommonUtils {

    public static boolean compareArray(Integer[] expectedArray, Integer[] actualArray){
        if(expectedArray.length != actualArray.length){
            return false;
        }

        for(int i = 0; i < expectedArray.length; i++){
            if(expectedArray[i] != actualArray[i]){
                return false;
            }
        }
        return true;
    }

    public static void printArray(Integer[] baseArray){
        for (int i = 0; i < baseArray.length; i++) {
            System.out.print(baseArray[i]+",");
        }
        System.out.println();
    }

    public static String arrayToStringPresentation(Integer[] baseArray){
        String temp = "{ ";
        for (int i = 0; i < baseArray.length; i++) {
            temp = temp + baseArray[i] + (i!=(baseArray.length-1)?",":"");
        }
        temp = temp+  " }";
        return temp;
    }


    public static void copyArray(Object[] output, Object[] input) throws BadOperationException {
        if(output.length < input.length){
            throw new BadOperationException("Cannot Copy Content into Array smaller in size to that of original");
        }

        for (int i = 0; i < input.length; i++) {
            output[i] = input[i];
        }
    }
}
