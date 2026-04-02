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
import java.lang.Object;

public class NonOverlappingIntervals_eraseOverlapIntervals_17358991241 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2803;
     Object term2804;

    public NonOverlappingIntervals_eraseOverlapIntervals_17358991241() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term2803 = newInstance(Class.forName("leetcode.medium.NonOverlappingIntervals"));
        term2804 = (Object[]) newArray("[I", 3);
        int[] term2805 = (int[]) newIntArray(0);
        int[] term2806 = (int[]) newIntArray(1);
        int[] term2808 = (int[]) newIntArray(3);
        setElement(term2804, 0, term2805);
        setIntElement(term2806, 0, -1150062870);
        setElement(term2804, 1, term2806);
        setIntElement(term2808, 0, -886200503);
        setIntElement(term2808, 1, 1136393691);
        setIntElement(term2808, 2, -1288536479);
        setElement(term2804, 2, term2808);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("leetcode.medium.NonOverlappingIntervals");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Array.newInstance(Array.newInstance(int.class, 0).getClass(), 0).getClass();
        Object[] args = new Object[1];
        args[0] = term2804;
        callMethod(klass, "eraseOverlapIntervals", argTypes, term2803, args);
    }

};


