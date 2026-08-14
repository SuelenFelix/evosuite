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

public class IntersectionOfTwoLinkedLists_getIntersectionNodeSet_17554340901 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term728;
     Object term729;
     Object term739;

    public IntersectionOfTwoLinkedLists_getIntersectionNodeSet_17554340901() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term728 = newInstance(Class.forName("leetcode.easy.IntersectionOfTwoLinkedLists"));
        term729 = newInstance(Class.forName("util.ListNode"));
        Object term731 = newInstance(Class.forName("util.ListNode"));
        Object term733 = newInstance(Class.forName("util.ListNode"));
        Object term735 = newInstance(Class.forName("util.ListNode"));
        Object term737 = newInstance(Class.forName("util.ListNode"));
        setIntField(term729, term729.getClass(), "val", -227365013);
        setIntField(term731, term731.getClass(), "val", 11724947);
        setIntField(term733, term733.getClass(), "val", 1953277050);
        setIntField(term735, term735.getClass(), "val", 1283079251);
        setIntField(term737, term737.getClass(), "val", -523949691);
        setField(term737, term737.getClass(), "next", null);
        setField(term735, term735.getClass(), "next", term737);
        setField(term733, term733.getClass(), "next", term735);
        setField(term731, term731.getClass(), "next", term733);
        setField(term729, term729.getClass(), "next", term731);
        term739 = newInstance(Class.forName("util.ListNode"));
        Object term741 = newInstance(Class.forName("util.ListNode"));
        Object term743 = newInstance(Class.forName("util.ListNode"));
        Object term745 = newInstance(Class.forName("util.ListNode"));
        Object term747 = newInstance(Class.forName("util.ListNode"));
        setIntField(term739, term739.getClass(), "val", -1002370457);
        setIntField(term741, term741.getClass(), "val", -2014576105);
        setIntField(term743, term743.getClass(), "val", 1296895584);
        setIntField(term745, term745.getClass(), "val", 628918458);
        setIntField(term747, term747.getClass(), "val", -1274456137);
        setField(term747, term747.getClass(), "next", null);
        setField(term745, term745.getClass(), "next", term747);
        setField(term743, term743.getClass(), "next", term745);
        setField(term741, term741.getClass(), "next", term743);
        setField(term739, term739.getClass(), "next", term741);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("leetcode.easy.IntersectionOfTwoLinkedLists");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("util.ListNode");
        argTypes[1] = Class.forName("util.ListNode");
        Object[] args = new Object[2];
        args[0] = term729;
        args[1] = term739;
        callMethod(klass, "getIntersectionNodeSet", argTypes, term728, args);
    }

};


