package leetcode;

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
import static leetcode.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;

public class NextGreaterElement1_nextGreaterElement_16233817461 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term5212;
     Object term5213;
     Object term5223;

    public NextGreaterElement1_nextGreaterElement_16233817461() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term5212 = newInstance(Class.forName("leetcode.NextGreaterElement1"));
        term5213 = (int[]) newIntArray(9);
        setIntElement(term5213, 0, 613256157);
        setIntElement(term5213, 1, 454242689);
        setIntElement(term5213, 2, 1798354517);
        setIntElement(term5213, 3, -1495693617);
        setIntElement(term5213, 4, -890538258);
        setIntElement(term5213, 5, -1085899912);
        setIntElement(term5213, 6, -1458980236);
        setIntElement(term5213, 7, 890505372);
        setIntElement(term5213, 8, 2044137055);
        term5223 = (int[]) newIntArray(5);
        setIntElement(term5223, 0, -1452324619);
        setIntElement(term5223, 1, -1121709274);
        setIntElement(term5223, 2, -532304223);
        setIntElement(term5223, 3, 666218293);
        setIntElement(term5223, 4, 1737876343);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("leetcode.NextGreaterElement1");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Array.newInstance(int.class, 0).getClass();
        argTypes[1] = Array.newInstance(int.class, 0).getClass();
        Object[] args = new Object[2];
        args[0] = term5213;
        args[1] = term5223;
        callMethod(klass, "nextGreaterElement", argTypes, term5212, args);
    }

};


