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
import java.lang.Integer;

public class ListNode_insertAtEnd_20507047412 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term222;
     Object term232;
     Object term242;

    public ListNode_insertAtEnd_20507047412() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term222 = newInstance(Class.forName("util.ListNode"));
        Object term224 = newInstance(Class.forName("util.ListNode"));
        Object term226 = newInstance(Class.forName("util.ListNode"));
        Object term228 = newInstance(Class.forName("util.ListNode"));
        Object term230 = newInstance(Class.forName("util.ListNode"));
        setIntField(term222, term222.getClass(), "val", -2095575670);
        setIntField(term224, term224.getClass(), "val", 1225272962);
        setIntField(term226, term226.getClass(), "val", 1324040357);
        setIntField(term228, term228.getClass(), "val", -1588772968);
        setIntField(term230, term230.getClass(), "val", -93135961);
        setField(term230, term230.getClass(), "next", null);
        setField(term228, term228.getClass(), "next", term230);
        setField(term226, term226.getClass(), "next", term228);
        setField(term224, term224.getClass(), "next", term226);
        setField(term222, term222.getClass(), "next", term224);
        term232 = newInstance(Class.forName("util.ListNode"));
        Object term234 = newInstance(Class.forName("util.ListNode"));
        Object term236 = newInstance(Class.forName("util.ListNode"));
        Object term238 = newInstance(Class.forName("util.ListNode"));
        Object term240 = newInstance(Class.forName("util.ListNode"));
        setIntField(term232, term232.getClass(), "val", 1265463001);
        setIntField(term234, term234.getClass(), "val", 335112684);
        setIntField(term236, term236.getClass(), "val", 1551099402);
        setIntField(term238, term238.getClass(), "val", -2027534003);
        setIntField(term240, term240.getClass(), "val", 1063420942);
        setField(term240, term240.getClass(), "next", null);
        setField(term238, term238.getClass(), "next", term240);
        setField(term236, term236.getClass(), "next", term238);
        setField(term234, term234.getClass(), "next", term236);
        setField(term232, term232.getClass(), "next", term234);
        term242 = new Integer(1240914516);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("util.ListNode");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("util.ListNode");
        argTypes[1] = int.class;
        Object[] args = new Object[2];
        args[0] = term232;
        args[1] = term242;
        callMethod(klass, "insertAtEnd", argTypes, term222, args);
    }

};


