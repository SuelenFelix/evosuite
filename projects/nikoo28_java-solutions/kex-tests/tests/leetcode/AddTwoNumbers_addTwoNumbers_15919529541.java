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
     Object term11277;
     Object term11278;
     Object term11288;

    public AddTwoNumbers_addTwoNumbers_15919529541() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term11277 = newInstance(Class.forName("leetcode.AddTwoNumbers"));
        term11278 = newInstance(Class.forName("util.ListNode"));
        Object term11280 = newInstance(Class.forName("util.ListNode"));
        Object term11282 = newInstance(Class.forName("util.ListNode"));
        Object term11284 = newInstance(Class.forName("util.ListNode"));
        Object term11286 = newInstance(Class.forName("util.ListNode"));
        setIntField(term11278, term11278.getClass(), "val", -311300330);
        setIntField(term11280, term11280.getClass(), "val", 1160936971);
        setIntField(term11282, term11282.getClass(), "val", 1258846008);
        setIntField(term11284, term11284.getClass(), "val", 702866958);
        setIntField(term11286, term11286.getClass(), "val", 622731276);
        setField(term11286, term11286.getClass(), "next", null);
        setField(term11284, term11284.getClass(), "next", term11286);
        setField(term11282, term11282.getClass(), "next", term11284);
        setField(term11280, term11280.getClass(), "next", term11282);
        setField(term11278, term11278.getClass(), "next", term11280);
        term11288 = newInstance(Class.forName("util.ListNode"));
        Object term11290 = newInstance(Class.forName("util.ListNode"));
        Object term11292 = newInstance(Class.forName("util.ListNode"));
        Object term11294 = newInstance(Class.forName("util.ListNode"));
        Object term11296 = newInstance(Class.forName("util.ListNode"));
        setIntField(term11288, term11288.getClass(), "val", -371717995);
        setIntField(term11290, term11290.getClass(), "val", 1713005479);
        setIntField(term11292, term11292.getClass(), "val", -1948910444);
        setIntField(term11294, term11294.getClass(), "val", -1099061955);
        setIntField(term11296, term11296.getClass(), "val", -1672904007);
        setField(term11296, term11296.getClass(), "next", null);
        setField(term11294, term11294.getClass(), "next", term11296);
        setField(term11292, term11292.getClass(), "next", term11294);
        setField(term11290, term11290.getClass(), "next", term11292);
        setField(term11288, term11288.getClass(), "next", term11290);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("leetcode.AddTwoNumbers");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("util.ListNode");
        argTypes[1] = Class.forName("util.ListNode");
        Object[] args = new Object[2];
        args[0] = term11278;
        args[1] = term11288;
        callMethod(klass, "addTwoNumbers", argTypes, term11277, args);
    }

};


