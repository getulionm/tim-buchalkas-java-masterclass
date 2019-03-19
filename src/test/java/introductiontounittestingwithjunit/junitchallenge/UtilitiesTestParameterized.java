package introductiontounittestingwithjunit.junitchallenge;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import java.util.Arrays;
import java.util.Collection;
import static org.junit.Assert.assertEquals;

@RunWith(Parameterized.class)
public class UtilitiesTestParameterized {
    private Utilities util;
    private String input;
    private String output;
    private static int testCaseCount;

    public UtilitiesTestParameterized(String input, String output) {
        this.input = input;
        this.output = output;
    }

    @Before
    public void setup() throws Exception {
        util = new Utilities();
        System.out.println("@Before creates the util instance before every test case");
    }

    @Parameterized.Parameters
    public static Collection<Object[]> testConditions() {
        return Arrays.asList(new Object[][]{
                {"ABCDEFF", "ABCDEF"},
                {"AB88EFFG", "AB8EFG"},
                {"112233445566", "123456"},
                {"ZYZQQB", "ZYZQB"},
                {"A", "A"}
        });
    }

    @Test
    public void removePairs() {
        assertEquals(output, util.removePairs(input));
    }

    @After
    public void tearDown() throws Exception {
        System.out.println("@After adds a count to the Test Case Count = "+ testCaseCount++);
    }
}