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
import java.util.ArrayList;

public class OnlineStockSpan_calculateSpans_13527782172 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term572;
     Object term577;

    public OnlineStockSpan_calculateSpans_13527782172() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term573 = new ArrayList();
        term572 = newInstance(Class.forName("leetcode.medium.OnlineStockSpan"));
        setField(term572, term572.getClass(), "list", term573);
        term577 = (int[]) newIntArray(3);
        setIntElement(term577, 0, -25637976);
        setIntElement(term577, 1, 1555897383);
        setIntElement(term577, 2, 202001407);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("leetcode.medium.OnlineStockSpan");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Array.newInstance(int.class, 0).getClass();
        Object[] args = new Object[1];
        args[0] = term577;
        callMethod(klass, "calculateSpans", argTypes, term572, args);
    }

};


