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
import java.lang.Object;

public class MinStack_pop_15581038922 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term3434;

    public MinStack_pop_15581038922() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term3434 = newInstance(Class.forName("leetcode.MinStack"));
        Object term3435 = newInstance(Class.forName("java.util.Stack"));
        Object[] term3436 = (Object[]) newArray("java.lang.Object", 10);
        Object term3440 = newInstance(Class.forName("java.util.Stack"));
        Object[] term3441 = (Object[]) newArray("java.lang.Object", 10);
        setField(term3435, term3435.getClass(), "elementData", term3436);
        setIntField(term3435, term3435.getClass(), "elementCount", 0);
        setIntField(term3435, term3435.getClass(), "capacityIncrement", 0);
        setIntField(term3435, term3435.getClass(), "modCount", 0);
        setField(term3434, term3434.getClass(), "mStack", term3435);
        setField(term3440, term3440.getClass(), "elementData", term3441);
        setIntField(term3440, term3440.getClass(), "elementCount", 0);
        setIntField(term3440, term3440.getClass(), "capacityIncrement", 0);
        setIntField(term3440, term3440.getClass(), "modCount", 0);
        setField(term3434, term3434.getClass(), "mMinStack", term3440);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("leetcode.MinStack");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "pop", argTypes, term3434, args);
    }

};


