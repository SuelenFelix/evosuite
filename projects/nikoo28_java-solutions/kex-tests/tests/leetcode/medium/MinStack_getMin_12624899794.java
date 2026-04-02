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

public class MinStack_getMin_12624899794 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1389;

    public MinStack_getMin_12624899794() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term1389 = newInstance(Class.forName("leetcode.medium.MinStack"));
        Object term1390 = newInstance(Class.forName("java.util.Stack"));
        Object[] term1391 = (Object[]) newArray("java.lang.Object", 10);
        Object term1395 = newInstance(Class.forName("java.util.Stack"));
        Object[] term1396 = (Object[]) newArray("java.lang.Object", 10);
        setField(term1390, term1390.getClass(), "elementData", term1391);
        setIntField(term1390, term1390.getClass(), "elementCount", 0);
        setIntField(term1390, term1390.getClass(), "capacityIncrement", 0);
        setIntField(term1390, term1390.getClass(), "modCount", 0);
        setField(term1389, term1389.getClass(), "stack", term1390);
        setField(term1395, term1395.getClass(), "elementData", term1396);
        setIntField(term1395, term1395.getClass(), "elementCount", 0);
        setIntField(term1395, term1395.getClass(), "capacityIncrement", 0);
        setIntField(term1395, term1395.getClass(), "modCount", 0);
        setField(term1389, term1389.getClass(), "minStack", term1395);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("leetcode.medium.MinStack");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getMin", argTypes, term1389, args);
    }

};


