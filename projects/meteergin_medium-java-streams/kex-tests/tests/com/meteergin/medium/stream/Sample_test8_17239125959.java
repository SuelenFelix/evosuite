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

public class Sample_test8_17239125959 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1592;

    public Sample_test8_17239125959() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term1592 = newInstance(Class.forName("com.meteergin.medium.stream.Sample"));
        Object term1593 = newInstance(Class.forName("java.util.Arrays$ArrayList"));
        Object[] term1594 = (Object[]) newArray("com.meteergin.medium.stream.User", 7);
        Object term1595 = newInstance(Class.forName("com.meteergin.medium.stream.User"));
        Object term1601 = newInstance(Class.forName("com.meteergin.medium.stream.User"));
        Object term1607 = newInstance(Class.forName("com.meteergin.medium.stream.User"));
        Object term1613 = newInstance(Class.forName("com.meteergin.medium.stream.User"));
        Object term1619 = newInstance(Class.forName("com.meteergin.medium.stream.User"));
        Object term1625 = newInstance(Class.forName("com.meteergin.medium.stream.User"));
        Object term1631 = newInstance(Class.forName("com.meteergin.medium.stream.User"));
        setLongField(term1595, term1595.getClass(), "id", 1L);
        setField(term1595, term1595.getClass(), "firstName", "");
        setField(term1595, term1595.getClass(), "lastName", "");
        setIntField(term1595, term1595.getClass(), "age", 37);
        setField(term1595, term1595.getClass(), "nationality", "");
        setElement(term1594, 0, term1595);
        setLongField(term1601, term1601.getClass(), "id", 2L);
        setField(term1601, term1601.getClass(), "firstName", "");
        setField(term1601, term1601.getClass(), "lastName", "");
        setIntField(term1601, term1601.getClass(), "age", 11);
        setField(term1601, term1601.getClass(), "nationality", "");
        setElement(term1594, 1, term1601);
        setLongField(term1607, term1607.getClass(), "id", 3L);
        setField(term1607, term1607.getClass(), "firstName", "");
        setField(term1607, term1607.getClass(), "lastName", "");
        setIntField(term1607, term1607.getClass(), "age", 7);
        setField(term1607, term1607.getClass(), "nationality", "");
        setElement(term1594, 2, term1607);
        setLongField(term1613, term1613.getClass(), "id", 4L);
        setField(term1613, term1613.getClass(), "firstName", "");
        setField(term1613, term1613.getClass(), "lastName", "");
        setIntField(term1613, term1613.getClass(), "age", 77);
        setField(term1613, term1613.getClass(), "nationality", "");
        setElement(term1594, 3, term1613);
        setLongField(term1619, term1619.getClass(), "id", 5L);
        setField(term1619, term1619.getClass(), "firstName", "");
        setField(term1619, term1619.getClass(), "lastName", "");
        setIntField(term1619, term1619.getClass(), "age", 23);
        setField(term1619, term1619.getClass(), "nationality", "");
        setElement(term1594, 4, term1619);
        setLongField(term1625, term1625.getClass(), "id", 6L);
        setField(term1625, term1625.getClass(), "firstName", "");
        setField(term1625, term1625.getClass(), "lastName", "");
        setIntField(term1625, term1625.getClass(), "age", 11);
        setField(term1625, term1625.getClass(), "nationality", "");
        setElement(term1594, 5, term1625);
        setLongField(term1631, term1631.getClass(), "id", 7L);
        setField(term1631, term1631.getClass(), "firstName", "");
        setField(term1631, term1631.getClass(), "lastName", "");
        setIntField(term1631, term1631.getClass(), "age", 37);
        setField(term1631, term1631.getClass(), "nationality", "");
        setElement(term1594, 6, term1631);
        setField(term1593, term1593.getClass(), "a", term1594);
        setIntField(term1593, term1593.getClass(), "modCount", 0);
        setField(term1592, term1592.getClass(), "userList", term1593);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.meteergin.medium.stream.Sample");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "test8", argTypes, term1592, args);
    }

};


