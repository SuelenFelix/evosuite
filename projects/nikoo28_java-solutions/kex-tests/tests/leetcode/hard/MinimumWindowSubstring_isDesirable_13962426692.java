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

public class MinimumWindowSubstring_isDesirable_13962426692 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term458;
     Object term459;
     Object term460;

    public MinimumWindowSubstring_isDesirable_13962426692() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term458 = newInstance(Class.forName("leetcode.hard.MinimumWindowSubstring"));
        term459 = (int[]) newIntArray(0);
        term460 = (int[]) newIntArray(9);
        setIntElement(term460, 0, -1845499264);
        setIntElement(term460, 1, -505439934);
        setIntElement(term460, 2, -344842608);
        setIntElement(term460, 3, 941650513);
        setIntElement(term460, 4, 444029505);
        setIntElement(term460, 5, -1034506028);
        setIntElement(term460, 6, -1263114719);
        setIntElement(term460, 7, -894662986);
        setIntElement(term460, 8, 304775596);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("leetcode.hard.MinimumWindowSubstring");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Array.newInstance(int.class, 0).getClass();
        argTypes[1] = Array.newInstance(int.class, 0).getClass();
        Object[] args = new Object[2];
        args[0] = term459;
        args[1] = term460;
        callMethod(klass, "isDesirable", argTypes, term458, args);
    }

};


