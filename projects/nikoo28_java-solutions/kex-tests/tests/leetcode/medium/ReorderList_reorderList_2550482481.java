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

public class ReorderList_reorderList_2550482481 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term588;
     Object term589;

    public ReorderList_reorderList_2550482481() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term588 = newInstance(Class.forName("leetcode.medium.ReorderList"));
        term589 = newInstance(Class.forName("util.ListNode"));
        Object term591 = newInstance(Class.forName("util.ListNode"));
        Object term593 = newInstance(Class.forName("util.ListNode"));
        Object term595 = newInstance(Class.forName("util.ListNode"));
        Object term597 = newInstance(Class.forName("util.ListNode"));
        setIntField(term589, term589.getClass(), "val", 158873461);
        setIntField(term591, term591.getClass(), "val", -430151637);
        setIntField(term593, term593.getClass(), "val", -1697741339);
        setIntField(term595, term595.getClass(), "val", 98922530);
        setIntField(term597, term597.getClass(), "val", -1388471422);
        setField(term597, term597.getClass(), "next", null);
        setField(term595, term595.getClass(), "next", term597);
        setField(term593, term593.getClass(), "next", term595);
        setField(term591, term591.getClass(), "next", term593);
        setField(term589, term589.getClass(), "next", term591);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("leetcode.medium.ReorderList");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("util.ListNode");
        Object[] args = new Object[1];
        args[0] = term589;
        callMethod(klass, "reorderList", argTypes, term588, args);
    }

};


