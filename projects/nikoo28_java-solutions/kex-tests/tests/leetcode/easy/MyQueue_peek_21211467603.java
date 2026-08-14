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

public class MyQueue_peek_21211467603 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1473;

    public MyQueue_peek_21211467603() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term1473 = newInstance(Class.forName("leetcode.easy.MyQueue"));
        Object term1474 = newInstance(Class.forName("java.util.Stack"));
        Object[] term1475 = (Object[]) newArray("java.lang.Object", 10);
        Object term1479 = newInstance(Class.forName("java.util.Stack"));
        Object[] term1480 = (Object[]) newArray("java.lang.Object", 10);
        setField(term1474, term1474.getClass(), "elementData", term1475);
        setIntField(term1474, term1474.getClass(), "elementCount", 0);
        setIntField(term1474, term1474.getClass(), "capacityIncrement", 0);
        setIntField(term1474, term1474.getClass(), "modCount", 0);
        setField(term1473, term1473.getClass(), "input", term1474);
        setField(term1479, term1479.getClass(), "elementData", term1480);
        setIntField(term1479, term1479.getClass(), "elementCount", 0);
        setIntField(term1479, term1479.getClass(), "capacityIncrement", 0);
        setIntField(term1479, term1479.getClass(), "modCount", 0);
        setField(term1473, term1473.getClass(), "output", term1479);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("leetcode.easy.MyQueue");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "peek", argTypes, term1473, args);
    }

};


