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

public class CycleDetection_hasCycleHashSet_10254946621 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1;
     Object term2;

    public CycleDetection_hasCycleHashSet_10254946621() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term1 = newInstance(Class.forName("hackerrank.datastructures.linkedlists.CycleDetection"));
        term2 = newInstance(Class.forName("util.ListNode"));
        Object term4 = newInstance(Class.forName("util.ListNode"));
        Object term6 = newInstance(Class.forName("util.ListNode"));
        Object term8 = newInstance(Class.forName("util.ListNode"));
        Object term10 = newInstance(Class.forName("util.ListNode"));
        setIntField(term2, term2.getClass(), "val", 568599855);
        setIntField(term4, term4.getClass(), "val", 1162663216);
        setIntField(term6, term6.getClass(), "val", 1484323161);
        setIntField(term8, term8.getClass(), "val", 391863371);
        setIntField(term10, term10.getClass(), "val", -1922583790);
        setField(term10, term10.getClass(), "next", null);
        setField(term8, term8.getClass(), "next", term10);
        setField(term6, term6.getClass(), "next", term8);
        setField(term4, term4.getClass(), "next", term6);
        setField(term2, term2.getClass(), "next", term4);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("hackerrank.datastructures.linkedlists.CycleDetection");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("util.ListNode");
        Object[] args = new Object[1];
        args[0] = term2;
        callMethod(klass, "hasCycleHashSet", argTypes, term1, args);
    }

};


