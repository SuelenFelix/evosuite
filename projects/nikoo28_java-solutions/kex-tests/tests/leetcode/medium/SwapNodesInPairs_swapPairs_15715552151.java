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

public class SwapNodesInPairs_swapPairs_15715552151 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term600;
     Object term601;

    public SwapNodesInPairs_swapPairs_15715552151() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term600 = newInstance(Class.forName("leetcode.medium.SwapNodesInPairs"));
        term601 = newInstance(Class.forName("util.ListNode"));
        Object term603 = newInstance(Class.forName("util.ListNode"));
        Object term605 = newInstance(Class.forName("util.ListNode"));
        Object term607 = newInstance(Class.forName("util.ListNode"));
        Object term609 = newInstance(Class.forName("util.ListNode"));
        setIntField(term601, term601.getClass(), "val", 11724947);
        setIntField(term603, term603.getClass(), "val", 1953277050);
        setIntField(term605, term605.getClass(), "val", 1283079251);
        setIntField(term607, term607.getClass(), "val", -523949691);
        setIntField(term609, term609.getClass(), "val", 1398204340);
        setField(term609, term609.getClass(), "next", null);
        setField(term607, term607.getClass(), "next", term609);
        setField(term605, term605.getClass(), "next", term607);
        setField(term603, term603.getClass(), "next", term605);
        setField(term601, term601.getClass(), "next", term603);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("leetcode.medium.SwapNodesInPairs");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("util.ListNode");
        Object[] args = new Object[1];
        args[0] = term601;
        callMethod(klass, "swapPairs", argTypes, term600, args);
    }

};


