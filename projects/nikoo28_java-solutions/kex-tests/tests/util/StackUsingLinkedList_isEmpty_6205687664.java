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

public class StackUsingLinkedList_isEmpty_6205687664 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2293;

    public StackUsingLinkedList_isEmpty_6205687664() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term2293 = newInstance(Class.forName("util.StackUsingLinkedList"));
        Object term2294 = newInstance(Class.forName("util.ListNode"));
        Object term2296 = newInstance(Class.forName("util.ListNode"));
        Object term2298 = newInstance(Class.forName("util.ListNode"));
        Object term2300 = newInstance(Class.forName("util.ListNode"));
        setIntField(term2294, term2294.getClass(), "val", -1428063820);
        setIntField(term2296, term2296.getClass(), "val", -1271375703);
        setIntField(term2298, term2298.getClass(), "val", 1136208236);
        setIntField(term2300, term2300.getClass(), "val", -1220630391);
        setField(term2300, term2300.getClass(), "next", null);
        setField(term2298, term2298.getClass(), "next", term2300);
        setField(term2296, term2296.getClass(), "next", term2298);
        setField(term2294, term2294.getClass(), "next", term2296);
        setField(term2293, term2293.getClass(), "head", term2294);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("util.StackUsingLinkedList");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "isEmpty", argTypes, term2293, args);
    }

};


