package com.arhatech.java.ds.basics;

import com.arhatech.java.exceptions.BadArgumentException;
import org.junit.*;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import static org.junit.Assert.assertTrue;

/**
 *
 * @author ankit.
 */

public class TestArrayMax {

    private static final Logger logger = LoggerFactory.getLogger(TestArrayMax.class);
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
    public void testArrayMaxForNull() {
        logger.debug("@Test - testEmptyCollection");
        ArrayMax.maxInt(null);
    }

    @Test
    public void testArrayMaxWithValidData() {
        logger.debug("@Test - testing max array for valid data items");
        arrayInteger = new Integer[]{2,5,3,6,2,65,77,32,65,99,23,43};

        int expectedMax = 99;
        int actualMax =  ArrayMax.maxInt(arrayInteger);
        assertTrue("Positive Case: ", expectedMax == actualMax);
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