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
import java.lang.Integer;

public class StackUsingLinkedList_push_6097375831 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2264;
     Object term2273;

    public StackUsingLinkedList_push_6097375831() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term2264 = newInstance(Class.forName("util.StackUsingLinkedList"));
        Object term2265 = newInstance(Class.forName("util.ListNode"));
        Object term2267 = newInstance(Class.forName("util.ListNode"));
        Object term2269 = newInstance(Class.forName("util.ListNode"));
        Object term2271 = newInstance(Class.forName("util.ListNode"));
        setIntField(term2265, term2265.getClass(), "val", 330043745);
        setIntField(term2267, term2267.getClass(), "val", -509349195);
        setIntField(term2269, term2269.getClass(), "val", -1639041228);
        setIntField(term2271, term2271.getClass(), "val", 2027686272);
        setField(term2271, term2271.getClass(), "next", null);
        setField(term2269, term2269.getClass(), "next", term2271);
        setField(term2267, term2267.getClass(), "next", term2269);
        setField(term2265, term2265.getClass(), "next", term2267);
        setField(term2264, term2264.getClass(), "head", term2265);
        term2273 = new Integer(1862841859);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("util.StackUsingLinkedList");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term2273;
        callMethod(klass, "push", argTypes, term2264, args);
    }

};


