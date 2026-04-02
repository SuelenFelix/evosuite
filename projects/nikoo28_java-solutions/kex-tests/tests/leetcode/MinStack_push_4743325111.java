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
import java.lang.Integer;

public class MinStack_push_4743325111 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term3421;
     Object term3432;

    public MinStack_push_4743325111() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term3421 = newInstance(Class.forName("leetcode.MinStack"));
        Object term3422 = newInstance(Class.forName("java.util.Stack"));
        Object[] term3423 = (Object[]) newArray("java.lang.Object", 10);
        Object term3427 = newInstance(Class.forName("java.util.Stack"));
        Object[] term3428 = (Object[]) newArray("java.lang.Object", 10);
        setField(term3422, term3422.getClass(), "elementData", term3423);
        setIntField(term3422, term3422.getClass(), "elementCount", 0);
        setIntField(term3422, term3422.getClass(), "capacityIncrement", 0);
        setIntField(term3422, term3422.getClass(), "modCount", 0);
        setField(term3421, term3421.getClass(), "mStack", term3422);
        setField(term3427, term3427.getClass(), "elementData", term3428);
        setIntField(term3427, term3427.getClass(), "elementCount", 0);
        setIntField(term3427, term3427.getClass(), "capacityIncrement", 0);
        setIntField(term3427, term3427.getClass(), "modCount", 0);
        setField(term3421, term3421.getClass(), "mMinStack", term3427);
        term3432 = new Integer(-1428063820);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("leetcode.MinStack");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term3432;
        callMethod(klass, "push", argTypes, term3421, args);
    }

};


