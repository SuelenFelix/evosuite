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

public class RemoveLinkedListElements_removeElements_7204434391 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2224;
     Object term2225;
     Object term2235;

    public RemoveLinkedListElements_removeElements_7204434391() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term2224 = newInstance(Class.forName("leetcode.easy.RemoveLinkedListElements"));
        term2225 = newInstance(Class.forName("util.ListNode"));
        Object term2227 = newInstance(Class.forName("util.ListNode"));
        Object term2229 = newInstance(Class.forName("util.ListNode"));
        Object term2231 = newInstance(Class.forName("util.ListNode"));
        Object term2233 = newInstance(Class.forName("util.ListNode"));
        setIntField(term2225, term2225.getClass(), "val", 947897214);
        setIntField(term2227, term2227.getClass(), "val", 1496340209);
        setIntField(term2229, term2229.getClass(), "val", -1748391876);
        setIntField(term2231, term2231.getClass(), "val", 43258317);
        setIntField(term2233, term2233.getClass(), "val", 1707220033);
        setField(term2233, term2233.getClass(), "next", null);
        setField(term2231, term2231.getClass(), "next", term2233);
        setField(term2229, term2229.getClass(), "next", term2231);
        setField(term2227, term2227.getClass(), "next", term2229);
        setField(term2225, term2225.getClass(), "next", term2227);
        term2235 = new Integer(888506903);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("leetcode.easy.RemoveLinkedListElements");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("util.ListNode");
        argTypes[1] = int.class;
        Object[] args = new Object[2];
        args[0] = term2225;
        args[1] = term2235;
        callMethod(klass, "removeElements", argTypes, term2224, args);
    }

};


