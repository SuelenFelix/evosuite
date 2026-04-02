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

public class MaximumProductSubarray_maxProduct_18302371241 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2790;
     Object term2791;

    public MaximumProductSubarray_maxProduct_18302371241() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term2790 = newInstance(Class.forName("leetcode.medium.MaximumProductSubarray"));
        term2791 = (int[]) newIntArray(5);
        setIntElement(term2791, 0, -2023791789);
        setIntElement(term2791, 1, 353974456);
        setIntElement(term2791, 2, -485108462);
        setIntElement(term2791, 3, 1418551216);
        setIntElement(term2791, 4, -626779272);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("leetcode.medium.MaximumProductSubarray");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Array.newInstance(int.class, 0).getClass();
        Object[] args = new Object[1];
        args[0] = term2791;
        callMethod(klass, "maxProduct", argTypes, term2790, args);
    }

};


