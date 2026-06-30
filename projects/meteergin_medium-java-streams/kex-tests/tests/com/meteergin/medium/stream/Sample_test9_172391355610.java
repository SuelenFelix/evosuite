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

public class Sample_test9_172391355610 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1638;

    public Sample_test9_172391355610() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term1638 = newInstance(Class.forName("com.meteergin.medium.stream.Sample"));
        Object term1639 = newInstance(Class.forName("java.util.Arrays$ArrayList"));
        Object[] term1640 = (Object[]) newArray("com.meteergin.medium.stream.User", 7);
        Object term1641 = newInstance(Class.forName("com.meteergin.medium.stream.User"));
        Object term1647 = newInstance(Class.forName("com.meteergin.medium.stream.User"));
        Object term1653 = newInstance(Class.forName("com.meteergin.medium.stream.User"));
        Object term1659 = newInstance(Class.forName("com.meteergin.medium.stream.User"));
        Object term1665 = newInstance(Class.forName("com.meteergin.medium.stream.User"));
        Object term1671 = newInstance(Class.forName("com.meteergin.medium.stream.User"));
        Object term1677 = newInstance(Class.forName("com.meteergin.medium.stream.User"));
        setLongField(term1641, term1641.getClass(), "id", 1L);
        setField(term1641, term1641.getClass(), "firstName", "");
        setField(term1641, term1641.getClass(), "lastName", "");
        setIntField(term1641, term1641.getClass(), "age", 37);
        setField(term1641, term1641.getClass(), "nationality", "");
        setElement(term1640, 0, term1641);
        setLongField(term1647, term1647.getClass(), "id", 2L);
        setField(term1647, term1647.getClass(), "firstName", "");
        setField(term1647, term1647.getClass(), "lastName", "");
        setIntField(term1647, term1647.getClass(), "age", 11);
        setField(term1647, term1647.getClass(), "nationality", "");
        setElement(term1640, 1, term1647);
        setLongField(term1653, term1653.getClass(), "id", 3L);
        setField(term1653, term1653.getClass(), "firstName", "");
        setField(term1653, term1653.getClass(), "lastName", "");
        setIntField(term1653, term1653.getClass(), "age", 7);
        setField(term1653, term1653.getClass(), "nationality", "");
        setElement(term1640, 2, term1653);
        setLongField(term1659, term1659.getClass(), "id", 4L);
        setField(term1659, term1659.getClass(), "firstName", "");
        setField(term1659, term1659.getClass(), "lastName", "");
        setIntField(term1659, term1659.getClass(), "age", 77);
        setField(term1659, term1659.getClass(), "nationality", "");
        setElement(term1640, 3, term1659);
        setLongField(term1665, term1665.getClass(), "id", 5L);
        setField(term1665, term1665.getClass(), "firstName", "");
        setField(term1665, term1665.getClass(), "lastName", "");
        setIntField(term1665, term1665.getClass(), "age", 23);
        setField(term1665, term1665.getClass(), "nationality", "");
        setElement(term1640, 4, term1665);
        setLongField(term1671, term1671.getClass(), "id", 6L);
        setField(term1671, term1671.getClass(), "firstName", "");
        setField(term1671, term1671.getClass(), "lastName", "");
        setIntField(term1671, term1671.getClass(), "age", 11);
        setField(term1671, term1671.getClass(), "nationality", "");
        setElement(term1640, 5, term1671);
        setLongField(term1677, term1677.getClass(), "id", 7L);
        setField(term1677, term1677.getClass(), "firstName", "");
        setField(term1677, term1677.getClass(), "lastName", "");
        setIntField(term1677, term1677.getClass(), "age", 37);
        setField(term1677, term1677.getClass(), "nationality", "");
        setElement(term1640, 6, term1677);
        setField(term1639, term1639.getClass(), "a", term1640);
        setIntField(term1639, term1639.getClass(), "modCount", 0);
        setField(term1638, term1638.getClass(), "userList", term1639);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.meteergin.medium.stream.Sample");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "test9", argTypes, term1638, args);
    }

};


