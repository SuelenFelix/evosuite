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

public class ReverseALinkedList_reverseWithoutExtraSpace_12716066921 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term49;
     Object term50;

    public ReverseALinkedList_reverseWithoutExtraSpace_12716066921() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term49 = newInstance(Class.forName("hackerrank.datastructures.linkedlists.ReverseALinkedList"));
        term50 = newInstance(Class.forName("util.ListNode"));
        Object term52 = newInstance(Class.forName("util.ListNode"));
        Object term54 = newInstance(Class.forName("util.ListNode"));
        Object term56 = newInstance(Class.forName("util.ListNode"));
        Object term58 = newInstance(Class.forName("util.ListNode"));
        setIntField(term50, term50.getClass(), "val", 1962444399);
        setIntField(term52, term52.getClass(), "val", 767834723);
        setIntField(term54, term54.getClass(), "val", -602026508);
        setIntField(term56, term56.getClass(), "val", -157887805);
        setIntField(term58, term58.getClass(), "val", 1876565163);
        setField(term58, term58.getClass(), "next", null);
        setField(term56, term56.getClass(), "next", term58);
        setField(term54, term54.getClass(), "next", term56);
        setField(term52, term52.getClass(), "next", term54);
        setField(term50, term50.getClass(), "next", term52);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("hackerrank.datastructures.linkedlists.ReverseALinkedList");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("util.ListNode");
        Object[] args = new Object[1];
        args[0] = term50;
        callMethod(klass, "reverseWithoutExtraSpace", argTypes, term49, args);
    }

};


