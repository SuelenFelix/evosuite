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
import java.lang.Integer;

public class LongestSubarraySumEqualsK_longestSubarray_16533456621 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term4288;
     Object term4289;
     Object term4293;

    public LongestSubarraySumEqualsK_longestSubarray_16533456621() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term4288 = newInstance(Class.forName("leetcode.medium.LongestSubarraySumEqualsK"));
        term4289 = (int[]) newIntArray(3);
        setIntElement(term4289, 0, 735987104);
        setIntElement(term4289, 1, -1784072578);
        setIntElement(term4289, 2, 2011764585);
        term4293 = new Integer(-860680764);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("leetcode.medium.LongestSubarraySumEqualsK");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Array.newInstance(int.class, 0).getClass();
        argTypes[1] = int.class;
        Object[] args = new Object[2];
        args[0] = term4289;
        args[1] = term4293;
        callMethod(klass, "longestSubarray", argTypes, term4288, args);
    }

};


