package leetcode;

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
import static leetcode.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;

public class ReverseLinkedList_reverseList_9100715221 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term10639;
     Object term10640;

    public ReverseLinkedList_reverseList_9100715221() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term10639 = newInstance(Class.forName("leetcode.ReverseLinkedList"));
        term10640 = newInstance(Class.forName("util.ListNode"));
        Object term10642 = newInstance(Class.forName("util.ListNode"));
        Object term10644 = newInstance(Class.forName("util.ListNode"));
        Object term10646 = newInstance(Class.forName("util.ListNode"));
        Object term10648 = newInstance(Class.forName("util.ListNode"));
        setIntField(term10640, term10640.getClass(), "val", 406945977);
        setIntField(term10642, term10642.getClass(), "val", 493657684);
        setIntField(term10644, term10644.getClass(), "val", 1882655922);
        setIntField(term10646, term10646.getClass(), "val", 1314996390);
        setIntField(term10648, term10648.getClass(), "val", 1367703658);
        setField(term10648, term10648.getClass(), "next", null);
        setField(term10646, term10646.getClass(), "next", term10648);
        setField(term10644, term10644.getClass(), "next", term10646);
        setField(term10642, term10642.getClass(), "next", term10644);
        setField(term10640, term10640.getClass(), "next", term10642);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("leetcode.ReverseLinkedList");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("util.ListNode");
        Object[] args = new Object[1];
        args[0] = term10640;
        callMethod(klass, "reverseList", argTypes, term10639, args);
    }

};


