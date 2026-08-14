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

public class PrintInReverse_reversePrintUsingStack_1600713881 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term73;
     Object term74;

    public PrintInReverse_reversePrintUsingStack_1600713881() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term73 = newInstance(Class.forName("hackerrank.datastructures.linkedlists.PrintInReverse"));
        term74 = newInstance(Class.forName("util.ListNode"));
        Object term76 = newInstance(Class.forName("util.ListNode"));
        Object term78 = newInstance(Class.forName("util.ListNode"));
        Object term80 = newInstance(Class.forName("util.ListNode"));
        Object term82 = newInstance(Class.forName("util.ListNode"));
        setIntField(term74, term74.getClass(), "val", 1596070772);
        setIntField(term76, term76.getClass(), "val", 97029295);
        setIntField(term78, term78.getClass(), "val", -1371869594);
        setIntField(term80, term80.getClass(), "val", -2095575670);
        setIntField(term82, term82.getClass(), "val", 1225272962);
        setField(term82, term82.getClass(), "next", null);
        setField(term80, term80.getClass(), "next", term82);
        setField(term78, term78.getClass(), "next", term80);
        setField(term76, term76.getClass(), "next", term78);
        setField(term74, term74.getClass(), "next", term76);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("hackerrank.datastructures.linkedlists.PrintInReverse");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("util.ListNode");
        Object[] args = new Object[1];
        args[0] = term74;
        callMethod(klass, "reversePrintUsingStack", argTypes, term73, args);
    }

};


