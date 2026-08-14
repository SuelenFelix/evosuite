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
     Object term13236;
     Object term13237;
     Object term13247;

    public MergeTwoSortedLists_mergeTwoLists_13497221471() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term13236 = newInstance(Class.forName("leetcode.MergeTwoSortedLists"));
        term13237 = newInstance(Class.forName("util.ListNode"));
        Object term13239 = newInstance(Class.forName("util.ListNode"));
        Object term13241 = newInstance(Class.forName("util.ListNode"));
        Object term13243 = newInstance(Class.forName("util.ListNode"));
        Object term13245 = newInstance(Class.forName("util.ListNode"));
        setIntField(term13237, term13237.getClass(), "val", 6456997);
        setIntField(term13239, term13239.getClass(), "val", -797269627);
        setIntField(term13241, term13241.getClass(), "val", -224331928);
        setIntField(term13243, term13243.getClass(), "val", -587857163);
        setIntField(term13245, term13245.getClass(), "val", -2018093075);
        setField(term13245, term13245.getClass(), "next", null);
        setField(term13243, term13243.getClass(), "next", term13245);
        setField(term13241, term13241.getClass(), "next", term13243);
        setField(term13239, term13239.getClass(), "next", term13241);
        setField(term13237, term13237.getClass(), "next", term13239);
        term13247 = newInstance(Class.forName("util.ListNode"));
        Object term13249 = newInstance(Class.forName("util.ListNode"));
        Object term13251 = newInstance(Class.forName("util.ListNode"));
        Object term13253 = newInstance(Class.forName("util.ListNode"));
        Object term13255 = newInstance(Class.forName("util.ListNode"));
        setIntField(term13247, term13247.getClass(), "val", -673356166);
        setIntField(term13249, term13249.getClass(), "val", 1876812694);
        setIntField(term13251, term13251.getClass(), "val", 461068473);
        setIntField(term13253, term13253.getClass(), "val", -1833298266);
        setIntField(term13255, term13255.getClass(), "val", 746372422);
        setField(term13255, term13255.getClass(), "next", null);
        setField(term13253, term13253.getClass(), "next", term13255);
        setField(term13251, term13251.getClass(), "next", term13253);
        setField(term13249, term13249.getClass(), "next", term13251);
        setField(term13247, term13247.getClass(), "next", term13249);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("leetcode.MergeTwoSortedLists");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("util.ListNode");
        argTypes[1] = Class.forName("util.ListNode");
        Object[] args = new Object[2];
        args[0] = term13237;
        args[1] = term13247;
        callMethod(klass, "mergeTwoLists", argTypes, term13236, args);
    }

};


