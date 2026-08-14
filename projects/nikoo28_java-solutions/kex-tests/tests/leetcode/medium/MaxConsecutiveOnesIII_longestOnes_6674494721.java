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

public class MaxConsecutiveOnesIII_longestOnes_6674494721 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2488;
     Object term2489;
     Object term2495;

    public MaxConsecutiveOnesIII_longestOnes_6674494721() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term2488 = newInstance(Class.forName("leetcode.medium.MaxConsecutiveOnesIII"));
        term2489 = (int[]) newIntArray(5);
        setIntElement(term2489, 0, -814977075);
        setIntElement(term2489, 1, 808614267);
        setIntElement(term2489, 2, 1611734632);
        setIntElement(term2489, 3, 868908117);
        setIntElement(term2489, 4, 1789351397);
        term2495 = new Integer(2145528170);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("leetcode.medium.MaxConsecutiveOnesIII");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Array.newInstance(int.class, 0).getClass();
        argTypes[1] = int.class;
        Object[] args = new Object[2];
        args[0] = term2489;
        args[1] = term2495;
        callMethod(klass, "longestOnes", argTypes, term2488, args);
    }

};


