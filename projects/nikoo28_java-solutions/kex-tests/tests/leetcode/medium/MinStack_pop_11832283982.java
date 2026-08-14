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

public class MinStack_pop_11832283982 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1367;

    public MinStack_pop_11832283982() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term1367 = newInstance(Class.forName("leetcode.medium.MinStack"));
        Object term1368 = newInstance(Class.forName("java.util.Stack"));
        Object[] term1369 = (Object[]) newArray("java.lang.Object", 10);
        Object term1373 = newInstance(Class.forName("java.util.Stack"));
        Object[] term1374 = (Object[]) newArray("java.lang.Object", 10);
        setField(term1368, term1368.getClass(), "elementData", term1369);
        setIntField(term1368, term1368.getClass(), "elementCount", 0);
        setIntField(term1368, term1368.getClass(), "capacityIncrement", 0);
        setIntField(term1368, term1368.getClass(), "modCount", 0);
        setField(term1367, term1367.getClass(), "stack", term1368);
        setField(term1373, term1373.getClass(), "elementData", term1374);
        setIntField(term1373, term1373.getClass(), "elementCount", 0);
        setIntField(term1373, term1373.getClass(), "capacityIncrement", 0);
        setIntField(term1373, term1373.getClass(), "modCount", 0);
        setField(term1367, term1367.getClass(), "minStack", term1373);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("leetcode.medium.MinStack");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "pop", argTypes, term1367, args);
    }

};


