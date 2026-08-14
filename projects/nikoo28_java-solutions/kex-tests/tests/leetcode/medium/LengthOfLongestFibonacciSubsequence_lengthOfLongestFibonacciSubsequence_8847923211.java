package leetcode.medium;

import java.lang.Throwable;
import java.lang.IllegalStateException;
import org.junit.Test;
import org.junit.Rule;
import org.junit.rules.Timeout;
import java.util.concurrent.TimeUnit;
import org.junit.Before;
import java.lang.Class;
import java.lang.reflect.Method;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.stream.Stream;
import java.util.stream.Collectors;
import static leetcode.medium.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;

public class LengthOfLongestFibonacciSubsequence_lengthOfLongestFibonacciSubsequence_8847923211 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term4671;
     Object term4672;

    public LengthOfLongestFibonacciSubsequence_lengthOfLongestFibonacciSubsequence_8847923211() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term4671 = newInstance(Class.forName("leetcode.medium.LengthOfLongestFibonacciSubsequence"));
        term4672 = (int[]) newIntArray(9);
        setIntElement(term4672, 0, 594705497);
        setIntElement(term4672, 1, -600102466);
        setIntElement(term4672, 2, -899986714);
        setIntElement(term4672, 3, 1307244466);
        setIntElement(term4672, 4, -252262096);
        setIntElement(term4672, 5, -37129068);
        setIntElement(term4672, 6, -861014847);
        setIntElement(term4672, 7, 2132934139);
        setIntElement(term4672, 8, -1261824381);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("leetcode.medium.LengthOfLongestFibonacciSubsequence");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Array.newInstance(int.class, 0).getClass();
        Object[] args = new Object[1];
        args[0] = term4672;
        callMethod(klass, "lengthOfLongestFibonacciSubsequence", argTypes, term4671, args);
    }

};


