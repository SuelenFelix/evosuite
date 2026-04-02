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

public class AddTwoNumbers_addTwoNumbers_15919529541 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term11118;
     Object term11119;
     Object term11129;

    public AddTwoNumbers_addTwoNumbers_15919529541() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term11118 = newInstance(Class.forName("leetcode.AddTwoNumbers"));
        term11119 = newInstance(Class.forName("util.ListNode"));
        Object term11121 = newInstance(Class.forName("util.ListNode"));
        Object term11123 = newInstance(Class.forName("util.ListNode"));
        Object term11125 = newInstance(Class.forName("util.ListNode"));
        Object term11127 = newInstance(Class.forName("util.ListNode"));
        setIntField(term11119, term11119.getClass(), "val", -1658031378);
        setIntField(term11121, term11121.getClass(), "val", -863483345);
        setIntField(term11123, term11123.getClass(), "val", -1722702406);
        setIntField(term11125, term11125.getClass(), "val", 549278914);
        setIntField(term11127, term11127.getClass(), "val", -1490125498);
        setField(term11127, term11127.getClass(), "next", null);
        setField(term11125, term11125.getClass(), "next", term11127);
        setField(term11123, term11123.getClass(), "next", term11125);
        setField(term11121, term11121.getClass(), "next", term11123);
        setField(term11119, term11119.getClass(), "next", term11121);
        term11129 = newInstance(Class.forName("util.ListNode"));
        Object term11131 = newInstance(Class.forName("util.ListNode"));
        Object term11133 = newInstance(Class.forName("util.ListNode"));
        Object term11135 = newInstance(Class.forName("util.ListNode"));
        Object term11137 = newInstance(Class.forName("util.ListNode"));
        setIntField(term11129, term11129.getClass(), "val", -184659375);
        setIntField(term11131, term11131.getClass(), "val", 629005618);
        setIntField(term11133, term11133.getClass(), "val", -2006508013);
        setIntField(term11135, term11135.getClass(), "val", 974951631);
        setIntField(term11137, term11137.getClass(), "val", -942202284);
        setField(term11137, term11137.getClass(), "next", null);
        setField(term11135, term11135.getClass(), "next", term11137);
        setField(term11133, term11133.getClass(), "next", term11135);
        setField(term11131, term11131.getClass(), "next", term11133);
        setField(term11129, term11129.getClass(), "next", term11131);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("leetcode.AddTwoNumbers");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("util.ListNode");
        argTypes[1] = Class.forName("util.ListNode");
        Object[] args = new Object[2];
        args[0] = term11119;
        args[1] = term11129;
        callMethod(klass, "addTwoNumbers", argTypes, term11118, args);
    }

};


