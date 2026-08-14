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

public class CycleDetection_detectCycleMergePoint_7272131144 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term34;
     Object term35;

    public CycleDetection_detectCycleMergePoint_7272131144() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term34 = newInstance(Class.forName("hackerrank.datastructures.linkedlists.CycleDetection"));
        term35 = newInstance(Class.forName("util.ListNode"));
        Object term37 = newInstance(Class.forName("util.ListNode"));
        Object term39 = newInstance(Class.forName("util.ListNode"));
        Object term41 = newInstance(Class.forName("util.ListNode"));
        Object term43 = newInstance(Class.forName("util.ListNode"));
        setIntField(term35, term35.getClass(), "val", -203030934);
        setIntField(term37, term37.getClass(), "val", -1179120542);
        setIntField(term39, term39.getClass(), "val", -73683645);
        setIntField(term41, term41.getClass(), "val", -226514366);
        setIntField(term43, term43.getClass(), "val", 1193880199);
        setField(term43, term43.getClass(), "next", null);
        setField(term41, term41.getClass(), "next", term43);
        setField(term39, term39.getClass(), "next", term41);
        setField(term37, term37.getClass(), "next", term39);
        setField(term35, term35.getClass(), "next", term37);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("hackerrank.datastructures.linkedlists.CycleDetection");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("util.ListNode");
        Object[] args = new Object[1];
        args[0] = term35;
        callMethod(klass, "detectCycleMergePoint", argTypes, term34, args);
    }

};


