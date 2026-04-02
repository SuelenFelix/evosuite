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

public class RemoveNthNodeFromEndOfList_removeNthFromEnd_14263221061 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term378;
     Object term379;
     Object term389;

    public RemoveNthNodeFromEndOfList_removeNthFromEnd_14263221061() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term378 = newInstance(Class.forName("leetcode.medium.RemoveNthNodeFromEndOfList"));
        term379 = newInstance(Class.forName("util.ListNode"));
        Object term381 = newInstance(Class.forName("util.ListNode"));
        Object term383 = newInstance(Class.forName("util.ListNode"));
        Object term385 = newInstance(Class.forName("util.ListNode"));
        Object term387 = newInstance(Class.forName("util.ListNode"));
        setIntField(term379, term379.getClass(), "val", -2095575670);
        setIntField(term381, term381.getClass(), "val", 1225272962);
        setIntField(term383, term383.getClass(), "val", 1324040357);
        setIntField(term385, term385.getClass(), "val", -1588772968);
        setIntField(term387, term387.getClass(), "val", -93135961);
        setField(term387, term387.getClass(), "next", null);
        setField(term385, term385.getClass(), "next", term387);
        setField(term383, term383.getClass(), "next", term385);
        setField(term381, term381.getClass(), "next", term383);
        setField(term379, term379.getClass(), "next", term381);
        term389 = new Integer(1265463001);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("leetcode.medium.RemoveNthNodeFromEndOfList");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("util.ListNode");
        argTypes[1] = int.class;
        Object[] args = new Object[2];
        args[0] = term379;
        args[1] = term389;
        callMethod(klass, "removeNthFromEnd", argTypes, term378, args);
    }

};


