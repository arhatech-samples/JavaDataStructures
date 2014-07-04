package com.arhatech.java.ds.sorting;

import com.arhatech.java.exceptions.BadArgumentException;
import com.arhatech.java.utils.CommonUtils;
import org.junit.*;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import static org.junit.Assert.assertTrue;

/**
 * @author ankit.
 */
public class TestInsertionSort {
    private static final Logger logger = LoggerFactory.getLogger(TestInsertionSort.class);

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
    public void testInsertionSortForNull() {
        logger.debug("@Test - testEmptyCollection");
        InsertionSort.sort(null);
    }

    @Test
    public void testInsertionSortWithValidData() {
        logger.debug("@Test - testing Insertion Sort for valid data items");
        arrayInteger = new Integer[]{2,5,3,6,2,65,77,32,65,99,23,43};

        Integer[] expectedArray = new Integer[]{2,2,3,5,6,23,32,43,65,65,77,99};

        Integer[] actualArray = InsertionSort.sort(arrayInteger);

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
