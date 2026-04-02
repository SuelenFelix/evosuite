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

public class MaximumProductAfterKIncrements_maximumProduct_8336487881 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1406;
     Object term1407;
     Object term1415;

    public MaximumProductAfterKIncrements_maximumProduct_8336487881() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term1406 = newInstance(Class.forName("leetcode.medium.MaximumProductAfterKIncrements"));
        term1407 = (int[]) newIntArray(7);
        setIntElement(term1407, 0, 877649659);
        setIntElement(term1407, 1, -1332748804);
        setIntElement(term1407, 2, 1774507971);
        setIntElement(term1407, 3, -1420269858);
        setIntElement(term1407, 4, -2119545015);
        setIntElement(term1407, 5, 1272542218);
        setIntElement(term1407, 6, 1209799204);
        term1415 = new Integer(1094107751);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("leetcode.medium.MaximumProductAfterKIncrements");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Array.newInstance(int.class, 0).getClass();
        argTypes[1] = int.class;
        Object[] args = new Object[2];
        args[0] = term1407;
        args[1] = term1415;
        callMethod(klass, "maximumProduct", argTypes, term1406, args);
    }

};


