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

public class MergeKSortedLists_mergeKLists_20417398961 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term157;
     Object term158;

    public MergeKSortedLists_mergeKLists_20417398961() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term157 = newInstance(Class.forName("leetcode.hard.MergeKSortedLists"));
        term158 = (Object[]) newArray("util.ListNode", 5);
        Object term159 = newInstance(Class.forName("util.ListNode"));
        Object term161 = newInstance(Class.forName("util.ListNode"));
        Object term163 = newInstance(Class.forName("util.ListNode"));
        Object term165 = newInstance(Class.forName("util.ListNode"));
        Object term167 = newInstance(Class.forName("util.ListNode"));
        Object term169 = newInstance(Class.forName("util.ListNode"));
        Object term171 = newInstance(Class.forName("util.ListNode"));
        Object term173 = newInstance(Class.forName("util.ListNode"));
        Object term175 = newInstance(Class.forName("util.ListNode"));
        setIntField(term159, term159.getClass(), "val", -73683645);
        setIntField(term161, term161.getClass(), "val", -226514366);
        setIntField(term163, term163.getClass(), "val", 1193880199);
        setIntField(term165, term165.getClass(), "val", -1087774327);
        setField(term165, term165.getClass(), "next", null);
        setField(term163, term163.getClass(), "next", term165);
        setField(term161, term161.getClass(), "next", term163);
        setField(term159, term159.getClass(), "next", term161);
        setElement(term158, 0, term159);
        setIntField(term167, term167.getClass(), "val", 1962444399);
        setIntField(term169, term169.getClass(), "val", 767834723);
        setIntField(term171, term171.getClass(), "val", 679763016);
        setField(term171, term171.getClass(), "next", term167);
        setField(term169, term169.getClass(), "next", term171);
        setField(term167, term167.getClass(), "next", term169);
        setElement(term158, 1, term167);
        setElement(term158, 2, term159);
        setIntField(term173, term173.getClass(), "val", -469968304);
        setIntField(term175, term175.getClass(), "val", -1145578966);
        setField(term175, term175.getClass(), "next", term171);
        setField(term173, term173.getClass(), "next", term175);
        setElement(term158, 3, term173);
        setElement(term158, 4, term165);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("leetcode.hard.MergeKSortedLists");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Array.newInstance(Class.forName("util.ListNode"), 0).getClass();
        Object[] args = new Object[1];
        args[0] = term158;
        callMethod(klass, "mergeKLists", argTypes, term157, args);
    }

};


