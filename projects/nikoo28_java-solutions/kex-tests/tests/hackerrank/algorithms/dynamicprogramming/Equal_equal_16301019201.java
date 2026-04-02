package hackerrank.algorithms.dynamicprogramming;

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
import static hackerrank.algorithms.dynamicprogramming.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;

public class Equal_equal_16301019201 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term21;
     Object term22;

    public Equal_equal_16301019201() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term21 = newInstance(Class.forName("hackerrank.algorithms.dynamicprogramming.Equal"));
        term22 = (int[]) newIntArray(9);
        setIntElement(term22, 0, 568599855);
        setIntElement(term22, 1, 1162663216);
        setIntElement(term22, 2, 1484323161);
        setIntElement(term22, 3, 391863371);
        setIntElement(term22, 4, -1922583790);
        setIntElement(term22, 5, -616727354);
        setIntElement(term22, 6, -1955890973);
        setIntElement(term22, 7, -2038273078);
        setIntElement(term22, 8, 1227103734);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("hackerrank.algorithms.dynamicprogramming.Equal");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Array.newInstance(int.class, 0).getClass();
        Object[] args = new Object[1];
        args[0] = term22;
        callMethod(klass, "equal", argTypes, term21, args);
    }

};


