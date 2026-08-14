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

public class MinStack_top_11832971503 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1378;

    public MinStack_top_11832971503() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term1378 = newInstance(Class.forName("leetcode.medium.MinStack"));
        Object term1379 = newInstance(Class.forName("java.util.Stack"));
        Object[] term1380 = (Object[]) newArray("java.lang.Object", 10);
        Object term1384 = newInstance(Class.forName("java.util.Stack"));
        Object[] term1385 = (Object[]) newArray("java.lang.Object", 10);
        setField(term1379, term1379.getClass(), "elementData", term1380);
        setIntField(term1379, term1379.getClass(), "elementCount", 0);
        setIntField(term1379, term1379.getClass(), "capacityIncrement", 0);
        setIntField(term1379, term1379.getClass(), "modCount", 0);
        setField(term1378, term1378.getClass(), "stack", term1379);
        setField(term1384, term1384.getClass(), "elementData", term1385);
        setIntField(term1384, term1384.getClass(), "elementCount", 0);
        setIntField(term1384, term1384.getClass(), "capacityIncrement", 0);
        setIntField(term1384, term1384.getClass(), "modCount", 0);
        setField(term1378, term1378.getClass(), "minStack", term1384);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("leetcode.medium.MinStack");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "top", argTypes, term1378, args);
    }

};


