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

public class PrintInReverse_reversePrintUsingRecursion_14078627822 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term84;
     Object term85;

    public PrintInReverse_reversePrintUsingRecursion_14078627822() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term84 = newInstance(Class.forName("hackerrank.datastructures.linkedlists.PrintInReverse"));
        term85 = newInstance(Class.forName("util.ListNode"));
        Object term87 = newInstance(Class.forName("util.ListNode"));
        Object term89 = newInstance(Class.forName("util.ListNode"));
        Object term91 = newInstance(Class.forName("util.ListNode"));
        Object term93 = newInstance(Class.forName("util.ListNode"));
        setIntField(term85, term85.getClass(), "val", 287287233);
        setIntField(term87, term87.getClass(), "val", 962840079);
        setIntField(term89, term89.getClass(), "val", 1540719661);
        setIntField(term91, term91.getClass(), "val", 1265463001);
        setIntField(term93, term93.getClass(), "val", 335112684);
        setField(term93, term93.getClass(), "next", null);
        setField(term91, term91.getClass(), "next", term93);
        setField(term89, term89.getClass(), "next", term91);
        setField(term87, term87.getClass(), "next", term89);
        setField(term85, term85.getClass(), "next", term87);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("hackerrank.datastructures.linkedlists.PrintInReverse");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("util.ListNode");
        Object[] args = new Object[1];
        args[0] = term85;
        callMethod(klass, "reversePrintUsingRecursion", argTypes, term84, args);
    }

};


