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

public class CycleDetection_hasCycleFloyd_18789875782 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term12;
     Object term13;

    public CycleDetection_hasCycleFloyd_18789875782() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term12 = newInstance(Class.forName("hackerrank.datastructures.linkedlists.CycleDetection"));
        term13 = newInstance(Class.forName("util.ListNode"));
        Object term15 = newInstance(Class.forName("util.ListNode"));
        Object term17 = newInstance(Class.forName("util.ListNode"));
        Object term19 = newInstance(Class.forName("util.ListNode"));
        Object term21 = newInstance(Class.forName("util.ListNode"));
        setIntField(term13, term13.getClass(), "val", 1725571209);
        setIntField(term15, term15.getClass(), "val", -522618178);
        setIntField(term17, term17.getClass(), "val", 1134449235);
        setIntField(term19, term19.getClass(), "val", -883034806);
        setIntField(term21, term21.getClass(), "val", 1585847225);
        setField(term21, term21.getClass(), "next", null);
        setField(term19, term19.getClass(), "next", term21);
        setField(term17, term17.getClass(), "next", term19);
        setField(term15, term15.getClass(), "next", term17);
        setField(term13, term13.getClass(), "next", term15);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("hackerrank.datastructures.linkedlists.CycleDetection");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("util.ListNode");
        Object[] args = new Object[1];
        args[0] = term13;
        callMethod(klass, "hasCycleFloyd", argTypes, term12, args);
    }

};


