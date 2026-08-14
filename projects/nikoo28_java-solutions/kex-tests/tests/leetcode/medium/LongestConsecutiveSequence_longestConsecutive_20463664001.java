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

public class LongestConsecutiveSequence_longestConsecutive_20463664001 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term4776;
     Object term4777;

    public LongestConsecutiveSequence_longestConsecutive_20463664001() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term4776 = newInstance(Class.forName("leetcode.medium.LongestConsecutiveSequence"));
        term4777 = (int[]) newIntArray(3);
        setIntElement(term4777, 0, -1749591213);
        setIntElement(term4777, 1, 1703093401);
        setIntElement(term4777, 2, 47607734);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("leetcode.medium.LongestConsecutiveSequence");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Array.newInstance(int.class, 0).getClass();
        Object[] args = new Object[1];
        args[0] = term4777;
        callMethod(klass, "longestConsecutive", argTypes, term4776, args);
    }

};


