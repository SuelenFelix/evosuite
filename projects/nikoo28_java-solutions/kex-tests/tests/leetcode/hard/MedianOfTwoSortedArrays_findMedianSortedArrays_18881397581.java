package leetcode.hard;

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
import static leetcode.hard.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;

public class MedianOfTwoSortedArrays_findMedianSortedArrays_18881397581 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term229;
     Object term230;
     Object term234;

    public MedianOfTwoSortedArrays_findMedianSortedArrays_18881397581() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term229 = newInstance(Class.forName("leetcode.hard.MedianOfTwoSortedArrays"));
        term230 = (int[]) newIntArray(3);
        setIntElement(term230, 0, 335112684);
        setIntElement(term230, 1, 1551099402);
        setIntElement(term230, 2, -2027534003);
        term234 = (int[]) newIntArray(4);
        setIntElement(term234, 0, 1063420942);
        setIntElement(term234, 1, 1375330971);
        setIntElement(term234, 2, -478195677);
        setIntElement(term234, 3, 972867650);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("leetcode.hard.MedianOfTwoSortedArrays");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Array.newInstance(int.class, 0).getClass();
        argTypes[1] = Array.newInstance(int.class, 0).getClass();
        Object[] args = new Object[2];
        args[0] = term230;
        args[1] = term234;
        callMethod(klass, "findMedianSortedArrays", argTypes, term229, args);
    }

};


