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
import java.lang.Integer;

public class MergeKSortedLists_mergeKListsHelper_20595539622 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term177;
     Object term178;
     Object term197;
     Object term199;

    public MergeKSortedLists_mergeKListsHelper_20595539622() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term177 = newInstance(Class.forName("leetcode.hard.MergeKSortedLists"));
        term178 = (Object[]) newArray("util.ListNode", 4);
        Object term179 = newInstance(Class.forName("util.ListNode"));
        Object term181 = newInstance(Class.forName("util.ListNode"));
        Object term183 = newInstance(Class.forName("util.ListNode"));
        Object term185 = newInstance(Class.forName("util.ListNode"));
        Object term187 = newInstance(Class.forName("util.ListNode"));
        Object term189 = newInstance(Class.forName("util.ListNode"));
        Object term191 = newInstance(Class.forName("util.ListNode"));
        Object term193 = newInstance(Class.forName("util.ListNode"));
        Object term195 = newInstance(Class.forName("util.ListNode"));
        setIntField(term179, term179.getClass(), "val", -602026508);
        setIntField(term181, term181.getClass(), "val", -157887805);
        setIntField(term183, term183.getClass(), "val", 1876565163);
        setIntField(term185, term185.getClass(), "val", -817164822);
        setField(term185, term185.getClass(), "next", null);
        setField(term183, term183.getClass(), "next", term185);
        setField(term181, term181.getClass(), "next", term183);
        setField(term179, term179.getClass(), "next", term181);
        setElement(term178, 0, term179);
        setIntField(term187, term187.getClass(), "val", 1632125673);
        setIntField(term189, term189.getClass(), "val", 454281060);
        setIntField(term191, term191.getClass(), "val", -14890619);
        setField(term191, term191.getClass(), "next", term187);
        setField(term189, term189.getClass(), "next", term191);
        setField(term187, term187.getClass(), "next", term189);
        setElement(term178, 1, term187);
        setElement(term178, 2, term179);
        setIntField(term193, term193.getClass(), "val", -1968847291);
        setIntField(term195, term195.getClass(), "val", 579005622);
        setField(term195, term195.getClass(), "next", term191);
        setField(term193, term193.getClass(), "next", term195);
        setElement(term178, 3, term193);
        term197 = new Integer(-1786399638);
        term199 = new Integer(2055867847);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("leetcode.hard.MergeKSortedLists");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Array.newInstance(Class.forName("util.ListNode"), 0).getClass();
        argTypes[1] = int.class;
        argTypes[2] = int.class;
        Object[] args = new Object[3];
        args[0] = term178;
        args[1] = term197;
        args[2] = term199;
        callMethod(klass, "mergeKListsHelper", argTypes, term177, args);
    }

};


