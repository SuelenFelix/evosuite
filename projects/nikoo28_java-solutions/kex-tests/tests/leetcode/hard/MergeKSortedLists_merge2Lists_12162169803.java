package leetcode.hard;

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
import static leetcode.hard.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;

public class MergeKSortedLists_merge2Lists_12162169803 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term201;
     Object term202;
     Object term212;

    public MergeKSortedLists_merge2Lists_12162169803() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term201 = newInstance(Class.forName("leetcode.hard.MergeKSortedLists"));
        term202 = newInstance(Class.forName("util.ListNode"));
        Object term204 = newInstance(Class.forName("util.ListNode"));
        Object term206 = newInstance(Class.forName("util.ListNode"));
        Object term208 = newInstance(Class.forName("util.ListNode"));
        Object term210 = newInstance(Class.forName("util.ListNode"));
        setIntField(term202, term202.getClass(), "val", -1048298087);
        setIntField(term204, term204.getClass(), "val", 292681826);
        setIntField(term206, term206.getClass(), "val", 458147407);
        setIntField(term208, term208.getClass(), "val", -184153539);
        setIntField(term210, term210.getClass(), "val", 493620644);
        setField(term210, term210.getClass(), "next", null);
        setField(term208, term208.getClass(), "next", term210);
        setField(term206, term206.getClass(), "next", term208);
        setField(term204, term204.getClass(), "next", term206);
        setField(term202, term202.getClass(), "next", term204);
        term212 = newInstance(Class.forName("util.ListNode"));
        Object term214 = newInstance(Class.forName("util.ListNode"));
        Object term216 = newInstance(Class.forName("util.ListNode"));
        Object term218 = newInstance(Class.forName("util.ListNode"));
        Object term220 = newInstance(Class.forName("util.ListNode"));
        setIntField(term212, term212.getClass(), "val", 1225272962);
        setIntField(term214, term214.getClass(), "val", 1324040357);
        setIntField(term216, term216.getClass(), "val", -1588772968);
        setIntField(term218, term218.getClass(), "val", -93135961);
        setIntField(term220, term220.getClass(), "val", -112921587);
        setField(term220, term220.getClass(), "next", null);
        setField(term218, term218.getClass(), "next", term220);
        setField(term216, term216.getClass(), "next", term218);
        setField(term214, term214.getClass(), "next", term216);
        setField(term212, term212.getClass(), "next", term214);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("leetcode.hard.MergeKSortedLists");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("util.ListNode");
        argTypes[1] = Class.forName("util.ListNode");
        Object[] args = new Object[2];
        args[0] = term202;
        args[1] = term212;
        callMethod(klass, "merge2Lists", argTypes, term201, args);
    }

};


