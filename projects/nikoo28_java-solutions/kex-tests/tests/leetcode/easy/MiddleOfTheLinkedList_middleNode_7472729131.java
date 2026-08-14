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

public class MiddleOfTheLinkedList_middleNode_7472729131 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1986;
     Object term1987;

    public MiddleOfTheLinkedList_middleNode_7472729131() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term1986 = newInstance(Class.forName("leetcode.easy.MiddleOfTheLinkedList"));
        term1987 = newInstance(Class.forName("util.ListNode"));
        Object term1989 = newInstance(Class.forName("util.ListNode"));
        Object term1991 = newInstance(Class.forName("util.ListNode"));
        Object term1993 = newInstance(Class.forName("util.ListNode"));
        Object term1995 = newInstance(Class.forName("util.ListNode"));
        setIntField(term1987, term1987.getClass(), "val", 320711637);
        setIntField(term1989, term1989.getClass(), "val", 1241164745);
        setIntField(term1991, term1991.getClass(), "val", 1723148410);
        setIntField(term1993, term1993.getClass(), "val", -920797484);
        setIntField(term1995, term1995.getClass(), "val", -1631697577);
        setField(term1995, term1995.getClass(), "next", null);
        setField(term1993, term1993.getClass(), "next", term1995);
        setField(term1991, term1991.getClass(), "next", term1993);
        setField(term1989, term1989.getClass(), "next", term1991);
        setField(term1987, term1987.getClass(), "next", term1989);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("leetcode.easy.MiddleOfTheLinkedList");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("util.ListNode");
        Object[] args = new Object[1];
        args[0] = term1987;
        callMethod(klass, "middleNode", argTypes, term1986, args);
    }

};


