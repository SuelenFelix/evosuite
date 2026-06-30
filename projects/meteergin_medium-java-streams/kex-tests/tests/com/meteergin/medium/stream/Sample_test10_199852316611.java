package com.meteergin.medium.stream;

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
import static com.meteergin.medium.stream.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;

public class Sample_test10_199852316611 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1684;

    public Sample_test10_199852316611() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term1684 = newInstance(Class.forName("com.meteergin.medium.stream.Sample"));
        Object term1685 = newInstance(Class.forName("java.util.Arrays$ArrayList"));
        Object[] term1686 = (Object[]) newArray("com.meteergin.medium.stream.User", 7);
        Object term1687 = newInstance(Class.forName("com.meteergin.medium.stream.User"));
        Object term1693 = newInstance(Class.forName("com.meteergin.medium.stream.User"));
        Object term1699 = newInstance(Class.forName("com.meteergin.medium.stream.User"));
        Object term1705 = newInstance(Class.forName("com.meteergin.medium.stream.User"));
        Object term1711 = newInstance(Class.forName("com.meteergin.medium.stream.User"));
        Object term1717 = newInstance(Class.forName("com.meteergin.medium.stream.User"));
        Object term1723 = newInstance(Class.forName("com.meteergin.medium.stream.User"));
        setLongField(term1687, term1687.getClass(), "id", 1L);
        setField(term1687, term1687.getClass(), "firstName", "");
        setField(term1687, term1687.getClass(), "lastName", "");
        setIntField(term1687, term1687.getClass(), "age", 37);
        setField(term1687, term1687.getClass(), "nationality", "");
        setElement(term1686, 0, term1687);
        setLongField(term1693, term1693.getClass(), "id", 2L);
        setField(term1693, term1693.getClass(), "firstName", "");
        setField(term1693, term1693.getClass(), "lastName", "");
        setIntField(term1693, term1693.getClass(), "age", 11);
        setField(term1693, term1693.getClass(), "nationality", "");
        setElement(term1686, 1, term1693);
        setLongField(term1699, term1699.getClass(), "id", 3L);
        setField(term1699, term1699.getClass(), "firstName", "");
        setField(term1699, term1699.getClass(), "lastName", "");
        setIntField(term1699, term1699.getClass(), "age", 7);
        setField(term1699, term1699.getClass(), "nationality", "");
        setElement(term1686, 2, term1699);
        setLongField(term1705, term1705.getClass(), "id", 4L);
        setField(term1705, term1705.getClass(), "firstName", "");
        setField(term1705, term1705.getClass(), "lastName", "");
        setIntField(term1705, term1705.getClass(), "age", 77);
        setField(term1705, term1705.getClass(), "nationality", "");
        setElement(term1686, 3, term1705);
        setLongField(term1711, term1711.getClass(), "id", 5L);
        setField(term1711, term1711.getClass(), "firstName", "");
        setField(term1711, term1711.getClass(), "lastName", "");
        setIntField(term1711, term1711.getClass(), "age", 23);
        setField(term1711, term1711.getClass(), "nationality", "");
        setElement(term1686, 4, term1711);
        setLongField(term1717, term1717.getClass(), "id", 6L);
        setField(term1717, term1717.getClass(), "firstName", "");
        setField(term1717, term1717.getClass(), "lastName", "");
        setIntField(term1717, term1717.getClass(), "age", 11);
        setField(term1717, term1717.getClass(), "nationality", "");
        setElement(term1686, 5, term1717);
        setLongField(term1723, term1723.getClass(), "id", 7L);
        setField(term1723, term1723.getClass(), "firstName", "");
        setField(term1723, term1723.getClass(), "lastName", "");
        setIntField(term1723, term1723.getClass(), "age", 37);
        setField(term1723, term1723.getClass(), "nationality", "");
        setElement(term1686, 6, term1723);
        setField(term1685, term1685.getClass(), "a", term1686);
        setIntField(term1685, term1685.getClass(), "modCount", 0);
        setField(term1684, term1684.getClass(), "userList", term1685);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.meteergin.medium.stream.Sample");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "test10", argTypes, term1684, args);
    }

};


