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

public class MinStack_top_15581726443 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term3445;

    public MinStack_top_15581726443() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term3445 = newInstance(Class.forName("leetcode.MinStack"));
        Object term3446 = newInstance(Class.forName("java.util.Stack"));
        Object[] term3447 = (Object[]) newArray("java.lang.Object", 10);
        Object term3451 = newInstance(Class.forName("java.util.Stack"));
        Object[] term3452 = (Object[]) newArray("java.lang.Object", 10);
        setField(term3446, term3446.getClass(), "elementData", term3447);
        setIntField(term3446, term3446.getClass(), "elementCount", 0);
        setIntField(term3446, term3446.getClass(), "capacityIncrement", 0);
        setIntField(term3446, term3446.getClass(), "modCount", 0);
        setField(term3445, term3445.getClass(), "mStack", term3446);
        setField(term3451, term3451.getClass(), "elementData", term3452);
        setIntField(term3451, term3451.getClass(), "elementCount", 0);
        setIntField(term3451, term3451.getClass(), "capacityIncrement", 0);
        setIntField(term3451, term3451.getClass(), "modCount", 0);
        setField(term3445, term3445.getClass(), "mMinStack", term3451);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("leetcode.MinStack");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "top", argTypes, term3445, args);
    }

};


