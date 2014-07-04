package com.arhatech.java.ds.questions;

import com.arhatech.java.utils.CommonUtils;
import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import static org.junit.Assert.assertTrue;

/**
 * @author ankit.
 */
public class TestSpanStockPrice {
    private static final Logger logger = LoggerFactory.getLogger(TestSpanStockPrice.class);

    @Test
    public void testSpanPrice(){
        logger.debug("Testing the span price");
        Integer[] testArray = new Integer[]{4,12,6,3,7,4,8,9,12,5,3,14,6,19};

        logger.debug("Testing with array: " + CommonUtils.arrayToStringPresentation(testArray));

        Integer[] expectedArray = new Integer[]{ 1,2,1,1,3,1,5,6,9,1,1,12,1,14 };
        Integer[] actualArray = SpanStockPrice.findPriceSpan(testArray);
        assertTrue("Testing: ", CommonUtils.compareArray(expectedArray,actualArray));

        logger.debug(CommonUtils.arrayToStringPresentation(actualArray));

    }
}
