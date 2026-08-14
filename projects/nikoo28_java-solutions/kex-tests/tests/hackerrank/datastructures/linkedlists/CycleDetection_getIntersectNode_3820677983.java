package hackerrank.datastructures.linkedlists;

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
import static hackerrank.datastructures.linkedlists.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;

public class CycleDetection_getIntersectNode_3820677983 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term23;
     Object term24;

    public CycleDetection_getIntersectNode_3820677983() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term23 = newInstance(Class.forName("hackerrank.datastructures.linkedlists.CycleDetection"));
        term24 = newInstance(Class.forName("util.ListNode"));
        Object term26 = newInstance(Class.forName("util.ListNode"));
        Object term28 = newInstance(Class.forName("util.ListNode"));
        Object term30 = newInstance(Class.forName("util.ListNode"));
        Object term32 = newInstance(Class.forName("util.ListNode"));
        setIntField(term24, term24.getClass(), "val", -655067527);
        setIntField(term26, term26.getClass(), "val", -6029667);
        setIntField(term28, term28.getClass(), "val", -2068769794);
        setIntField(term30, term30.getClass(), "val", -117576464);
        setIntField(term32, term32.getClass(), "val", -1007160944);
        setField(term32, term32.getClass(), "next", null);
        setField(term30, term30.getClass(), "next", term32);
        setField(term28, term28.getClass(), "next", term30);
        setField(term26, term26.getClass(), "next", term28);
        setField(term24, term24.getClass(), "next", term26);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("hackerrank.datastructures.linkedlists.CycleDetection");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("util.ListNode");
        Object[] args = new Object[1];
        args[0] = term24;
        callMethod(klass, "getIntersectNode", argTypes, term23, args);
    }

};


