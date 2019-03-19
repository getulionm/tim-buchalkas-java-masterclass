package introductiontounittestingwithjunit.junitchallenge;

import org.junit.*;

import static org.junit.Assert.*;

public class UtilitiesTest {
    private Utilities util;
    private static int testCaseCount;

    @Before
    public void setup(){
        util = new Utilities();
        System.out.println("@Before creates the util instance before every test case");
    }

    @BeforeClass
    public static void BeforeClass(){
        System.out.println("@BeforeClass. Test Case Count = "+ testCaseCount++);
    }


    @Test
    public void everyNthChar() {
        char inputArray[] = {'h','e','l','l','o'};
        char outputArray[] = {'e','l'};
        assertArrayEquals(outputArray, util.everyNthChar(inputArray, 2));
    }

    @Test
    public void everyNthChar_nIsGreaterThanString() {
        char inputArray[] = {'b','y','e'};
        assertArrayEquals(inputArray, util.everyNthChar(inputArray, 5));
    }

    @Test
    public void removePairs() {
        assertEquals("ABCDEF", util.removePairs("AABCDDEFF"));
        assertEquals("ABCABDEF", util.removePairs("ABCCABDEEF"));
        assertNull("Did not get null returned when argument passed was null", util.removePairs(null));
        assertEquals("A", util.removePairs("A"));
        assertEquals("", util.removePairs(""));
    }

    @Test
    public void converter() {
        assertEquals(300, util.converter(10,5));
    }

    @Test (expected = ArithmeticException.class)
    public void converter_arithmeticException(){
        util.converter(10,0);
        fail("Should have thrown an ArithmeticException");
    }

    @Test
    public void nullIfOddLength() {
        assertNotNull(util.nullIfOddLength("Even"));
        assertNull(util.nullIfOddLength("Odd"));
    }

    @After
    public void tearDown(){
        System.out.println("@After adds a count to the Test Case Count = "+ testCaseCount++);
    }

    @AfterClass
    public static void afterClass(){
        System.out.println("@AfterClass. Test Case Count = "+ testCaseCount++);
    }

}