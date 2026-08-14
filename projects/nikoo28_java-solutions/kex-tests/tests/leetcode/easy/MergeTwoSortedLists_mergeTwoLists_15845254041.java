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

public class MergeTwoSortedLists_mergeTwoLists_15845254041 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2800;
     Object term2801;
     Object term2811;

    public MergeTwoSortedLists_mergeTwoLists_15845254041() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term2800 = newInstance(Class.forName("leetcode.easy.MergeTwoSortedLists"));
        term2801 = newInstance(Class.forName("util.ListNode"));
        Object term2803 = newInstance(Class.forName("util.ListNode"));
        Object term2805 = newInstance(Class.forName("util.ListNode"));
        Object term2807 = newInstance(Class.forName("util.ListNode"));
        Object term2809 = newInstance(Class.forName("util.ListNode"));
        setIntField(term2801, term2801.getClass(), "val", -380787857);
        setIntField(term2803, term2803.getClass(), "val", 319853052);
        setIntField(term2805, term2805.getClass(), "val", -1097563716);
        setIntField(term2807, term2807.getClass(), "val", 1572907769);
        setIntField(term2809, term2809.getClass(), "val", 1608016787);
        setField(term2809, term2809.getClass(), "next", null);
        setField(term2807, term2807.getClass(), "next", term2809);
        setField(term2805, term2805.getClass(), "next", term2807);
        setField(term2803, term2803.getClass(), "next", term2805);
        setField(term2801, term2801.getClass(), "next", term2803);
        term2811 = newInstance(Class.forName("util.ListNode"));
        Object term2813 = newInstance(Class.forName("util.ListNode"));
        Object term2815 = newInstance(Class.forName("util.ListNode"));
        Object term2817 = newInstance(Class.forName("util.ListNode"));
        Object term2819 = newInstance(Class.forName("util.ListNode"));
        setIntField(term2811, term2811.getClass(), "val", -20614472);
        setIntField(term2813, term2813.getClass(), "val", 1126618861);
        setIntField(term2815, term2815.getClass(), "val", 947449400);
        setIntField(term2817, term2817.getClass(), "val", -763799087);
        setIntField(term2819, term2819.getClass(), "val", 1207142014);
        setField(term2819, term2819.getClass(), "next", null);
        setField(term2817, term2817.getClass(), "next", term2819);
        setField(term2815, term2815.getClass(), "next", term2817);
        setField(term2813, term2813.getClass(), "next", term2815);
        setField(term2811, term2811.getClass(), "next", term2813);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("leetcode.easy.MergeTwoSortedLists");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("util.ListNode");
        argTypes[1] = Class.forName("util.ListNode");
        Object[] args = new Object[2];
        args[0] = term2801;
        args[1] = term2811;
        callMethod(klass, "mergeTwoLists", argTypes, term2800, args);
    }

};


