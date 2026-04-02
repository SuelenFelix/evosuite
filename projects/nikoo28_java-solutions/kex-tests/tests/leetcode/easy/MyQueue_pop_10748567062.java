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

public class MyQueue_pop_10748567062 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1462;

    public MyQueue_pop_10748567062() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term1462 = newInstance(Class.forName("leetcode.easy.MyQueue"));
        Object term1463 = newInstance(Class.forName("java.util.Stack"));
        Object[] term1464 = (Object[]) newArray("java.lang.Object", 10);
        Object term1468 = newInstance(Class.forName("java.util.Stack"));
        Object[] term1469 = (Object[]) newArray("java.lang.Object", 10);
        setField(term1463, term1463.getClass(), "elementData", term1464);
        setIntField(term1463, term1463.getClass(), "elementCount", 0);
        setIntField(term1463, term1463.getClass(), "capacityIncrement", 0);
        setIntField(term1463, term1463.getClass(), "modCount", 0);
        setField(term1462, term1462.getClass(), "input", term1463);
        setField(term1468, term1468.getClass(), "elementData", term1469);
        setIntField(term1468, term1468.getClass(), "elementCount", 0);
        setIntField(term1468, term1468.getClass(), "capacityIncrement", 0);
        setIntField(term1468, term1468.getClass(), "modCount", 0);
        setField(term1462, term1462.getClass(), "output", term1468);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("leetcode.easy.MyQueue");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "pop", argTypes, term1462, args);
    }

};


