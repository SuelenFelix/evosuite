package leetcode;

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
import static leetcode.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;

public class MergeTwoSortedLists_mergeTwoLists_13497221471 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term12631;
     Object term12632;
     Object term12642;

    public MergeTwoSortedLists_mergeTwoLists_13497221471() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term12631 = newInstance(Class.forName("leetcode.MergeTwoSortedLists"));
        term12632 = newInstance(Class.forName("util.ListNode"));
        Object term12634 = newInstance(Class.forName("util.ListNode"));
        Object term12636 = newInstance(Class.forName("util.ListNode"));
        Object term12638 = newInstance(Class.forName("util.ListNode"));
        Object term12640 = newInstance(Class.forName("util.ListNode"));
        setIntField(term12632, term12632.getClass(), "val", -1878319299);
        setIntField(term12634, term12634.getClass(), "val", -690862846);
        setIntField(term12636, term12636.getClass(), "val", 805027262);
        setIntField(term12638, term12638.getClass(), "val", 717389178);
        setIntField(term12640, term12640.getClass(), "val", -1265226052);
        setField(term12640, term12640.getClass(), "next", null);
        setField(term12638, term12638.getClass(), "next", term12640);
        setField(term12636, term12636.getClass(), "next", term12638);
        setField(term12634, term12634.getClass(), "next", term12636);
        setField(term12632, term12632.getClass(), "next", term12634);
        term12642 = newInstance(Class.forName("util.ListNode"));
        Object term12644 = newInstance(Class.forName("util.ListNode"));
        Object term12646 = newInstance(Class.forName("util.ListNode"));
        Object term12648 = newInstance(Class.forName("util.ListNode"));
        Object term12650 = newInstance(Class.forName("util.ListNode"));
        setIntField(term12642, term12642.getClass(), "val", -97405660);
        setIntField(term12644, term12644.getClass(), "val", 872278468);
        setIntField(term12646, term12646.getClass(), "val", -1003390920);
        setIntField(term12648, term12648.getClass(), "val", -2052568448);
        setIntField(term12650, term12650.getClass(), "val", 664155196);
        setField(term12650, term12650.getClass(), "next", null);
        setField(term12648, term12648.getClass(), "next", term12650);
        setField(term12646, term12646.getClass(), "next", term12648);
        setField(term12644, term12644.getClass(), "next", term12646);
        setField(term12642, term12642.getClass(), "next", term12644);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("leetcode.MergeTwoSortedLists");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("util.ListNode");
        argTypes[1] = Class.forName("util.ListNode");
        Object[] args = new Object[2];
        args[0] = term12632;
        args[1] = term12642;
        callMethod(klass, "mergeTwoLists", argTypes, term12631, args);
    }

};


