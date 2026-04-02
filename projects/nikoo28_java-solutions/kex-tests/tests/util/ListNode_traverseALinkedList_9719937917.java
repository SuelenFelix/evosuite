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

public class ListNode_traverseALinkedList_9719937917 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term330;
     Object term340;

    public ListNode_traverseALinkedList_9719937917() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term330 = newInstance(Class.forName("util.ListNode"));
        Object term332 = newInstance(Class.forName("util.ListNode"));
        Object term334 = newInstance(Class.forName("util.ListNode"));
        Object term336 = newInstance(Class.forName("util.ListNode"));
        Object term338 = newInstance(Class.forName("util.ListNode"));
        setIntField(term330, term330.getClass(), "val", -1002370457);
        setIntField(term332, term332.getClass(), "val", -2014576105);
        setIntField(term334, term334.getClass(), "val", 1296895584);
        setIntField(term336, term336.getClass(), "val", 628918458);
        setIntField(term338, term338.getClass(), "val", -1274456137);
        setField(term338, term338.getClass(), "next", null);
        setField(term336, term336.getClass(), "next", term338);
        setField(term334, term334.getClass(), "next", term336);
        setField(term332, term332.getClass(), "next", term334);
        setField(term330, term330.getClass(), "next", term332);
        term340 = newInstance(Class.forName("util.ListNode"));
        Object term342 = newInstance(Class.forName("util.ListNode"));
        Object term344 = newInstance(Class.forName("util.ListNode"));
        Object term346 = newInstance(Class.forName("util.ListNode"));
        Object term348 = newInstance(Class.forName("util.ListNode"));
        setIntField(term340, term340.getClass(), "val", -1731761810);
        setIntField(term342, term342.getClass(), "val", 197109649);
        setIntField(term344, term344.getClass(), "val", -1239406390);
        setIntField(term346, term346.getClass(), "val", 1557431527);
        setIntField(term348, term348.getClass(), "val", -1504890659);
        setField(term348, term348.getClass(), "next", null);
        setField(term346, term346.getClass(), "next", term348);
        setField(term344, term344.getClass(), "next", term346);
        setField(term342, term342.getClass(), "next", term344);
        setField(term340, term340.getClass(), "next", term342);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("util.ListNode");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("util.ListNode");
        Object[] args = new Object[1];
        args[0] = term340;
        callMethod(klass, "traverseALinkedList", argTypes, term330, args);
    }

};


