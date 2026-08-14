package util;

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
import static util.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;

public class StackUsingLinkedList_pop_16898836322 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2275;

    public StackUsingLinkedList_pop_16898836322() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term2275 = newInstance(Class.forName("util.StackUsingLinkedList"));
        Object term2276 = newInstance(Class.forName("util.ListNode"));
        Object term2278 = newInstance(Class.forName("util.ListNode"));
        Object term2280 = newInstance(Class.forName("util.ListNode"));
        Object term2282 = newInstance(Class.forName("util.ListNode"));
        setIntField(term2276, term2276.getClass(), "val", -1114668574);
        setIntField(term2278, term2278.getClass(), "val", 514511037);
        setIntField(term2280, term2280.getClass(), "val", 1713573821);
        setIntField(term2282, term2282.getClass(), "val", 1956590498);
        setField(term2282, term2282.getClass(), "next", null);
        setField(term2280, term2280.getClass(), "next", term2282);
        setField(term2278, term2278.getClass(), "next", term2280);
        setField(term2276, term2276.getClass(), "next", term2278);
        setField(term2275, term2275.getClass(), "head", term2276);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("util.StackUsingLinkedList");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "pop", argTypes, term2275, args);
    }

};


