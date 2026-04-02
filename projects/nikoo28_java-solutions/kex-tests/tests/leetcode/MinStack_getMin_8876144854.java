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

public class MinStack_getMin_8876144854 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term3456;

    public MinStack_getMin_8876144854() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term3456 = newInstance(Class.forName("leetcode.MinStack"));
        Object term3457 = newInstance(Class.forName("java.util.Stack"));
        Object[] term3458 = (Object[]) newArray("java.lang.Object", 10);
        Object term3462 = newInstance(Class.forName("java.util.Stack"));
        Object[] term3463 = (Object[]) newArray("java.lang.Object", 10);
        setField(term3457, term3457.getClass(), "elementData", term3458);
        setIntField(term3457, term3457.getClass(), "elementCount", 0);
        setIntField(term3457, term3457.getClass(), "capacityIncrement", 0);
        setIntField(term3457, term3457.getClass(), "modCount", 0);
        setField(term3456, term3456.getClass(), "mStack", term3457);
        setField(term3462, term3462.getClass(), "elementData", term3463);
        setIntField(term3462, term3462.getClass(), "elementCount", 0);
        setIntField(term3462, term3462.getClass(), "capacityIncrement", 0);
        setIntField(term3462, term3462.getClass(), "modCount", 0);
        setField(term3456, term3456.getClass(), "mMinStack", term3462);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("leetcode.MinStack");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getMin", argTypes, term3456, args);
    }

};


