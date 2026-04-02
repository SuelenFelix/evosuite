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

public class ReverseLinkedListII_reverseBetween_19686655221 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1115;
     Object term1116;
     Object term1126;
     Object term1128;

    public ReverseLinkedListII_reverseBetween_19686655221() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term1115 = newInstance(Class.forName("leetcode.medium.ReverseLinkedListII"));
        term1116 = newInstance(Class.forName("util.ListNode"));
        Object term1118 = newInstance(Class.forName("util.ListNode"));
        Object term1120 = newInstance(Class.forName("util.ListNode"));
        Object term1122 = newInstance(Class.forName("util.ListNode"));
        Object term1124 = newInstance(Class.forName("util.ListNode"));
        setIntField(term1116, term1116.getClass(), "val", 2058711405);
        setIntField(term1118, term1118.getClass(), "val", 1743683601);
        setIntField(term1120, term1120.getClass(), "val", -945116798);
        setIntField(term1122, term1122.getClass(), "val", 1593461795);
        setIntField(term1124, term1124.getClass(), "val", 515182546);
        setField(term1124, term1124.getClass(), "next", null);
        setField(term1122, term1122.getClass(), "next", term1124);
        setField(term1120, term1120.getClass(), "next", term1122);
        setField(term1118, term1118.getClass(), "next", term1120);
        setField(term1116, term1116.getClass(), "next", term1118);
        term1126 = new Integer(306847454);
        term1128 = new Integer(1745276158);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("leetcode.medium.ReverseLinkedListII");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Class.forName("util.ListNode");
        argTypes[1] = int.class;
        argTypes[2] = int.class;
        Object[] args = new Object[3];
        args[0] = term1116;
        args[1] = term1126;
        args[2] = term1128;
        callMethod(klass, "reverseBetween", argTypes, term1115, args);
    }

};


