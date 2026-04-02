package leetcode.easy;

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
import static leetcode.easy.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;

public class IntersectionOfTwoLinkedLists_getIntersectionNode_11702684062 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term749;
     Object term750;
     Object term760;

    public IntersectionOfTwoLinkedLists_getIntersectionNode_11702684062() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term749 = newInstance(Class.forName("leetcode.easy.IntersectionOfTwoLinkedLists"));
        term750 = newInstance(Class.forName("util.ListNode"));
        Object term752 = newInstance(Class.forName("util.ListNode"));
        Object term754 = newInstance(Class.forName("util.ListNode"));
        Object term756 = newInstance(Class.forName("util.ListNode"));
        Object term758 = newInstance(Class.forName("util.ListNode"));
        setIntField(term750, term750.getClass(), "val", -1731761810);
        setIntField(term752, term752.getClass(), "val", 197109649);
        setIntField(term754, term754.getClass(), "val", -1239406390);
        setIntField(term756, term756.getClass(), "val", 1557431527);
        setIntField(term758, term758.getClass(), "val", -1504890659);
        setField(term758, term758.getClass(), "next", null);
        setField(term756, term756.getClass(), "next", term758);
        setField(term754, term754.getClass(), "next", term756);
        setField(term752, term752.getClass(), "next", term754);
        setField(term750, term750.getClass(), "next", term752);
        term760 = newInstance(Class.forName("util.ListNode"));
        Object term762 = newInstance(Class.forName("util.ListNode"));
        Object term764 = newInstance(Class.forName("util.ListNode"));
        Object term766 = newInstance(Class.forName("util.ListNode"));
        Object term768 = newInstance(Class.forName("util.ListNode"));
        setIntField(term760, term760.getClass(), "val", -1896376975);
        setIntField(term762, term762.getClass(), "val", 729658803);
        setIntField(term764, term764.getClass(), "val", 114754804);
        setIntField(term766, term766.getClass(), "val", 1687361082);
        setIntField(term768, term768.getClass(), "val", 584893196);
        setField(term768, term768.getClass(), "next", null);
        setField(term766, term766.getClass(), "next", term768);
        setField(term764, term764.getClass(), "next", term766);
        setField(term762, term762.getClass(), "next", term764);
        setField(term760, term760.getClass(), "next", term762);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("leetcode.easy.IntersectionOfTwoLinkedLists");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("util.ListNode");
        argTypes[1] = Class.forName("util.ListNode");
        Object[] args = new Object[2];
        args[0] = term750;
        args[1] = term760;
        callMethod(klass, "getIntersectionNode", argTypes, term749, args);
    }

};


