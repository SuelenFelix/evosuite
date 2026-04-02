package hackerrank.datastructures.linkedlists;

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
import static hackerrank.datastructures.linkedlists.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;

public class ReverseALinkedList_reverseWithStack_9694642482 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term60;
     Object term61;

    public ReverseALinkedList_reverseWithStack_9694642482() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term60 = newInstance(Class.forName("hackerrank.datastructures.linkedlists.ReverseALinkedList"));
        term61 = newInstance(Class.forName("util.ListNode"));
        Object term63 = newInstance(Class.forName("util.ListNode"));
        Object term65 = newInstance(Class.forName("util.ListNode"));
        Object term67 = newInstance(Class.forName("util.ListNode"));
        Object term69 = newInstance(Class.forName("util.ListNode"));
        setIntField(term61, term61.getClass(), "val", 1632125673);
        setIntField(term63, term63.getClass(), "val", 454281060);
        setIntField(term65, term65.getClass(), "val", -1786399638);
        setIntField(term67, term67.getClass(), "val", 2055867847);
        setIntField(term69, term69.getClass(), "val", -1048298087);
        setField(term69, term69.getClass(), "next", null);
        setField(term67, term67.getClass(), "next", term69);
        setField(term65, term65.getClass(), "next", term67);
        setField(term63, term63.getClass(), "next", term65);
        setField(term61, term61.getClass(), "next", term63);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("hackerrank.datastructures.linkedlists.ReverseALinkedList");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("util.ListNode");
        Object[] args = new Object[1];
        args[0] = term61;
        callMethod(klass, "reverseWithStack", argTypes, term60, args);
    }

};


