package leetcode.easy;

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
import static leetcode.easy.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;

public class MyQueue_empty_14894368904 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1484;

    public MyQueue_empty_14894368904() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term1484 = newInstance(Class.forName("leetcode.easy.MyQueue"));
        Object term1485 = newInstance(Class.forName("java.util.Stack"));
        Object[] term1486 = (Object[]) newArray("java.lang.Object", 10);
        Object term1490 = newInstance(Class.forName("java.util.Stack"));
        Object[] term1491 = (Object[]) newArray("java.lang.Object", 10);
        setField(term1485, term1485.getClass(), "elementData", term1486);
        setIntField(term1485, term1485.getClass(), "elementCount", 0);
        setIntField(term1485, term1485.getClass(), "capacityIncrement", 0);
        setIntField(term1485, term1485.getClass(), "modCount", 0);
        setField(term1484, term1484.getClass(), "input", term1485);
        setField(term1490, term1490.getClass(), "elementData", term1491);
        setIntField(term1490, term1490.getClass(), "elementCount", 0);
        setIntField(term1490, term1490.getClass(), "capacityIncrement", 0);
        setIntField(term1490, term1490.getClass(), "modCount", 0);
        setField(term1484, term1484.getClass(), "output", term1490);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("leetcode.easy.MyQueue");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "empty", argTypes, term1484, args);
    }

};


