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
import java.lang.Integer;

public class MyQueue_push_21399645411 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1449;
     Object term1460;

    public MyQueue_push_21399645411() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term1449 = newInstance(Class.forName("leetcode.easy.MyQueue"));
        Object term1450 = newInstance(Class.forName("java.util.Stack"));
        Object[] term1451 = (Object[]) newArray("java.lang.Object", 10);
        Object term1455 = newInstance(Class.forName("java.util.Stack"));
        Object[] term1456 = (Object[]) newArray("java.lang.Object", 10);
        setField(term1450, term1450.getClass(), "elementData", term1451);
        setIntField(term1450, term1450.getClass(), "elementCount", 0);
        setIntField(term1450, term1450.getClass(), "capacityIncrement", 0);
        setIntField(term1450, term1450.getClass(), "modCount", 0);
        setField(term1449, term1449.getClass(), "input", term1450);
        setField(term1455, term1455.getClass(), "elementData", term1456);
        setIntField(term1455, term1455.getClass(), "elementCount", 0);
        setIntField(term1455, term1455.getClass(), "capacityIncrement", 0);
        setIntField(term1455, term1455.getClass(), "modCount", 0);
        setField(term1449, term1449.getClass(), "output", term1455);
        term1460 = new Integer(-2005784375);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("leetcode.easy.MyQueue");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term1460;
        callMethod(klass, "push", argTypes, term1449, args);
    }

};


