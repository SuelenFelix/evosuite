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

public class ListNode_deleteAtEnd_18965050395 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term288;
     Object term298;

    public ListNode_deleteAtEnd_18965050395() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term288 = newInstance(Class.forName("util.ListNode"));
        Object term290 = newInstance(Class.forName("util.ListNode"));
        Object term292 = newInstance(Class.forName("util.ListNode"));
        Object term294 = newInstance(Class.forName("util.ListNode"));
        Object term296 = newInstance(Class.forName("util.ListNode"));
        setIntField(term288, term288.getClass(), "val", -375014958);
        setIntField(term290, term290.getClass(), "val", 1107176718);
        setIntField(term292, term292.getClass(), "val", 480137250);
        setIntField(term294, term294.getClass(), "val", -341152642);
        setIntField(term296, term296.getClass(), "val", -2015854073);
        setField(term296, term296.getClass(), "next", null);
        setField(term294, term294.getClass(), "next", term296);
        setField(term292, term292.getClass(), "next", term294);
        setField(term290, term290.getClass(), "next", term292);
        setField(term288, term288.getClass(), "next", term290);
        term298 = newInstance(Class.forName("util.ListNode"));
        Object term300 = newInstance(Class.forName("util.ListNode"));
        Object term302 = newInstance(Class.forName("util.ListNode"));
        Object term304 = newInstance(Class.forName("util.ListNode"));
        Object term306 = newInstance(Class.forName("util.ListNode"));
        setIntField(term298, term298.getClass(), "val", 71190297);
        setIntField(term300, term300.getClass(), "val", 1202361360);
        setIntField(term302, term302.getClass(), "val", -2015048153);
        setIntField(term304, term304.getClass(), "val", -2063457669);
        setIntField(term306, term306.getClass(), "val", -1222006000);
        setField(term306, term306.getClass(), "next", null);
        setField(term304, term304.getClass(), "next", term306);
        setField(term302, term302.getClass(), "next", term304);
        setField(term300, term300.getClass(), "next", term302);
        setField(term298, term298.getClass(), "next", term300);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("util.ListNode");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("util.ListNode");
        Object[] args = new Object[1];
        args[0] = term298;
        callMethod(klass, "deleteAtEnd", argTypes, term288, args);
    }

};


