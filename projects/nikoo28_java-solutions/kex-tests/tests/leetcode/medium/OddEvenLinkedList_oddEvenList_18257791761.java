package leetcode.medium;

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
import static leetcode.medium.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;

public class OddEvenLinkedList_oddEvenList_18257791761 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1342;
     Object term1343;

    public OddEvenLinkedList_oddEvenList_18257791761() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term1342 = newInstance(Class.forName("leetcode.medium.OddEvenLinkedList"));
        term1343 = newInstance(Class.forName("util.ListNode"));
        Object term1345 = newInstance(Class.forName("util.ListNode"));
        Object term1347 = newInstance(Class.forName("util.ListNode"));
        Object term1349 = newInstance(Class.forName("util.ListNode"));
        Object term1351 = newInstance(Class.forName("util.ListNode"));
        setIntField(term1343, term1343.getClass(), "val", 1074848808);
        setIntField(term1345, term1345.getClass(), "val", -146054762);
        setIntField(term1347, term1347.getClass(), "val", 798043553);
        setIntField(term1349, term1349.getClass(), "val", 533197381);
        setIntField(term1351, term1351.getClass(), "val", 1048271679);
        setField(term1351, term1351.getClass(), "next", null);
        setField(term1349, term1349.getClass(), "next", term1351);
        setField(term1347, term1347.getClass(), "next", term1349);
        setField(term1345, term1345.getClass(), "next", term1347);
        setField(term1343, term1343.getClass(), "next", term1345);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("leetcode.medium.OddEvenLinkedList");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("util.ListNode");
        Object[] args = new Object[1];
        args[0] = term1343;
        callMethod(klass, "oddEvenList", argTypes, term1342, args);
    }

};


