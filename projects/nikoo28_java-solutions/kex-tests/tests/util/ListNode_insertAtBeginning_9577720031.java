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

public class ListNode_insertAtBeginning_9577720031 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term200;
     Object term210;
     Object term220;

    public ListNode_insertAtBeginning_9577720031() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term200 = newInstance(Class.forName("util.ListNode"));
        Object term202 = newInstance(Class.forName("util.ListNode"));
        Object term204 = newInstance(Class.forName("util.ListNode"));
        Object term206 = newInstance(Class.forName("util.ListNode"));
        Object term208 = newInstance(Class.forName("util.ListNode"));
        setIntField(term200, term200.getClass(), "val", -602026508);
        setIntField(term202, term202.getClass(), "val", -157887805);
        setIntField(term204, term204.getClass(), "val", 1876565163);
        setIntField(term206, term206.getClass(), "val", -817164822);
        setIntField(term208, term208.getClass(), "val", -1016503459);
        setField(term208, term208.getClass(), "next", null);
        setField(term206, term206.getClass(), "next", term208);
        setField(term204, term204.getClass(), "next", term206);
        setField(term202, term202.getClass(), "next", term204);
        setField(term200, term200.getClass(), "next", term202);
        term210 = newInstance(Class.forName("util.ListNode"));
        Object term212 = newInstance(Class.forName("util.ListNode"));
        Object term214 = newInstance(Class.forName("util.ListNode"));
        Object term216 = newInstance(Class.forName("util.ListNode"));
        Object term218 = newInstance(Class.forName("util.ListNode"));
        setIntField(term210, term210.getClass(), "val", -1786399638);
        setIntField(term212, term212.getClass(), "val", 2055867847);
        setIntField(term214, term214.getClass(), "val", -1048298087);
        setIntField(term216, term216.getClass(), "val", 292681826);
        setIntField(term218, term218.getClass(), "val", 458147407);
        setField(term218, term218.getClass(), "next", null);
        setField(term216, term216.getClass(), "next", term218);
        setField(term214, term214.getClass(), "next", term216);
        setField(term212, term212.getClass(), "next", term214);
        setField(term210, term210.getClass(), "next", term212);
        term220 = new Integer(-1371869594);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("util.ListNode");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("util.ListNode");
        argTypes[1] = int.class;
        Object[] args = new Object[2];
        args[0] = term210;
        args[1] = term220;
        callMethod(klass, "insertAtBeginning", argTypes, term200, args);
    }

};


