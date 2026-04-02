package leetcode.medium;

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
import static leetcode.medium.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;

public class LinkedListCycleII_detectCycle_8636534831 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term4743;
     Object term4744;

    public LinkedListCycleII_detectCycle_8636534831() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term4743 = newInstance(Class.forName("leetcode.medium.LinkedListCycleII"));
        term4744 = newInstance(Class.forName("util.ListNode"));
        Object term4746 = newInstance(Class.forName("util.ListNode"));
        Object term4748 = newInstance(Class.forName("util.ListNode"));
        Object term4750 = newInstance(Class.forName("util.ListNode"));
        Object term4752 = newInstance(Class.forName("util.ListNode"));
        setIntField(term4744, term4744.getClass(), "val", -2003607923);
        setIntField(term4746, term4746.getClass(), "val", 1378805929);
        setIntField(term4748, term4748.getClass(), "val", 695052304);
        setIntField(term4750, term4750.getClass(), "val", -179937218);
        setIntField(term4752, term4752.getClass(), "val", 940896043);
        setField(term4752, term4752.getClass(), "next", null);
        setField(term4750, term4750.getClass(), "next", term4752);
        setField(term4748, term4748.getClass(), "next", term4750);
        setField(term4746, term4746.getClass(), "next", term4748);
        setField(term4744, term4744.getClass(), "next", term4746);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("leetcode.medium.LinkedListCycleII");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("util.ListNode");
        Object[] args = new Object[1];
        args[0] = term4744;
        callMethod(klass, "detectCycle", argTypes, term4743, args);
    }

};


