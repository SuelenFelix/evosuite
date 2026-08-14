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
import java.lang.Integer;

public class MinStack_push_994570171 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1354;
     Object term1365;

    public MinStack_push_994570171() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term1354 = newInstance(Class.forName("leetcode.medium.MinStack"));
        Object term1355 = newInstance(Class.forName("java.util.Stack"));
        Object[] term1356 = (Object[]) newArray("java.lang.Object", 10);
        Object term1360 = newInstance(Class.forName("java.util.Stack"));
        Object[] term1361 = (Object[]) newArray("java.lang.Object", 10);
        setField(term1355, term1355.getClass(), "elementData", term1356);
        setIntField(term1355, term1355.getClass(), "elementCount", 0);
        setIntField(term1355, term1355.getClass(), "capacityIncrement", 0);
        setIntField(term1355, term1355.getClass(), "modCount", 0);
        setField(term1354, term1354.getClass(), "stack", term1355);
        setField(term1360, term1360.getClass(), "elementData", term1361);
        setIntField(term1360, term1360.getClass(), "elementCount", 0);
        setIntField(term1360, term1360.getClass(), "capacityIncrement", 0);
        setIntField(term1360, term1360.getClass(), "modCount", 0);
        setField(term1354, term1354.getClass(), "minStack", term1360);
        term1365 = new Integer(-1268314569);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("leetcode.medium.MinStack");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term1365;
        callMethod(klass, "push", argTypes, term1354, args);
    }

};


