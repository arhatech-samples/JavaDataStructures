package com.arhatech.java.ds.basics;

import com.arhatech.java.exceptions.BadArgumentException;
import com.arhatech.java.utils.CommonUtils;
import org.junit.*;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import static org.junit.Assert.assertTrue;

/**
 * @author ankit.
 */
public class TestPrefixAverage {

    private static final Logger logger = LoggerFactory.getLogger(TestPrefixAverage.class);
    Integer[] arrayInteger;

    @BeforeClass
    public static void oneTimeSetUp() {
        // one-time initialization code
        logger.debug("@BeforeClass - oneTimeSetUp");
    }


    @Before
    public void setUp() {
        arrayInteger = new Integer[]{2,5,3,6,2,65,77,32,65,99,23,43};
        logger.debug("@Before - setUp");
    }

    @Test(expected = BadArgumentException.class)
    public void testPrefixAverage1ForNull(){
        PrefixAverage.average1(null);
    }

    @Test(expected = BadArgumentException.class)
    public void testPrefixAverage2ForNull(){
        PrefixAverage.average2(null);
    }

    @Test
    public void testPrefixAverage1(){
        logger.debug("@Test - testing Prefix Average for valid data items");
        arrayInteger = new Integer[]{2,5,3,6,2,65,77,32,65,99,23,43};

        Integer[] expectedArray = new Integer[]{2,3,3,4,3,13,22,24,28,35,34,35};

        Integer[] actualArray = PrefixAverage.average1(arrayInteger);

        assertTrue("Positive Case: ", CommonUtils.compareArray(expectedArray, actualArray));

    }

    @Test
    public void testPrefixAverage2(){
        logger.debug("@Test - testing Prefix Average for valid data items");
        arrayInteger = new Integer[]{2,5,3,6,2,65,77,32,65,99,23,43};

        Integer[] expectedArray = new Integer[]{2,3,3,4,3,13,22,24,28,35,34,35};

        Integer[] actualArray = PrefixAverage.average2(arrayInteger);

        assertTrue("Positive Case: ", CommonUtils.compareArray(expectedArray, actualArray));

    }

    @After
    public void tearDown() {
        logger.debug("@After - tearDown");
        arrayInteger = null;
    }


    @AfterClass
    public static void oneTimeTearDown() {
        // one-time cleanup code
        logger.debug("@AfterClass - oneTimeTearDown");
    }
}
