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
     Object term513;
     Object term514;
     Object term515;

    public MinimumWindowSubstring_isDesirable_13962426692() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term513 = newInstance(Class.forName("leetcode.hard.MinimumWindowSubstring"));
        term514 = (int[]) newIntArray(0);
        term515 = (int[]) newIntArray(9);
        setIntElement(term515, 0, -1888585309);
        setIntElement(term515, 1, 683666002);
        setIntElement(term515, 2, 1596213415);
        setIntElement(term515, 3, -268815336);
        setIntElement(term515, 4, -1210583429);
        setIntElement(term515, 5, -663691365);
        setIntElement(term515, 6, 339854490);
        setIntElement(term515, 7, -615654495);
        setIntElement(term515, 8, -1476117762);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("leetcode.hard.MinimumWindowSubstring");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Array.newInstance(int.class, 0).getClass();
        argTypes[1] = Array.newInstance(int.class, 0).getClass();
        Object[] args = new Object[2];
        args[0] = term514;
        args[1] = term515;
        callMethod(klass, "isDesirable", argTypes, term513, args);
    }

};


