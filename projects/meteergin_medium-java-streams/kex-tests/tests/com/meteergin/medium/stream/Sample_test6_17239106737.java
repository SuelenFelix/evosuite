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

public class Sample_test6_17239106737 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1500;

    public Sample_test6_17239106737() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term1500 = newInstance(Class.forName("com.meteergin.medium.stream.Sample"));
        Object term1501 = newInstance(Class.forName("java.util.Arrays$ArrayList"));
        Object[] term1502 = (Object[]) newArray("com.meteergin.medium.stream.User", 7);
        Object term1503 = newInstance(Class.forName("com.meteergin.medium.stream.User"));
        Object term1509 = newInstance(Class.forName("com.meteergin.medium.stream.User"));
        Object term1515 = newInstance(Class.forName("com.meteergin.medium.stream.User"));
        Object term1521 = newInstance(Class.forName("com.meteergin.medium.stream.User"));
        Object term1527 = newInstance(Class.forName("com.meteergin.medium.stream.User"));
        Object term1533 = newInstance(Class.forName("com.meteergin.medium.stream.User"));
        Object term1539 = newInstance(Class.forName("com.meteergin.medium.stream.User"));
        setLongField(term1503, term1503.getClass(), "id", 1L);
        setField(term1503, term1503.getClass(), "firstName", "");
        setField(term1503, term1503.getClass(), "lastName", "");
        setIntField(term1503, term1503.getClass(), "age", 37);
        setField(term1503, term1503.getClass(), "nationality", "");
        setElement(term1502, 0, term1503);
        setLongField(term1509, term1509.getClass(), "id", 2L);
        setField(term1509, term1509.getClass(), "firstName", "");
        setField(term1509, term1509.getClass(), "lastName", "");
        setIntField(term1509, term1509.getClass(), "age", 11);
        setField(term1509, term1509.getClass(), "nationality", "");
        setElement(term1502, 1, term1509);
        setLongField(term1515, term1515.getClass(), "id", 3L);
        setField(term1515, term1515.getClass(), "firstName", "");
        setField(term1515, term1515.getClass(), "lastName", "");
        setIntField(term1515, term1515.getClass(), "age", 7);
        setField(term1515, term1515.getClass(), "nationality", "");
        setElement(term1502, 2, term1515);
        setLongField(term1521, term1521.getClass(), "id", 4L);
        setField(term1521, term1521.getClass(), "firstName", "");
        setField(term1521, term1521.getClass(), "lastName", "");
        setIntField(term1521, term1521.getClass(), "age", 77);
        setField(term1521, term1521.getClass(), "nationality", "");
        setElement(term1502, 3, term1521);
        setLongField(term1527, term1527.getClass(), "id", 5L);
        setField(term1527, term1527.getClass(), "firstName", "");
        setField(term1527, term1527.getClass(), "lastName", "");
        setIntField(term1527, term1527.getClass(), "age", 23);
        setField(term1527, term1527.getClass(), "nationality", "");
        setElement(term1502, 4, term1527);
        setLongField(term1533, term1533.getClass(), "id", 6L);
        setField(term1533, term1533.getClass(), "firstName", "");
        setField(term1533, term1533.getClass(), "lastName", "");
        setIntField(term1533, term1533.getClass(), "age", 11);
        setField(term1533, term1533.getClass(), "nationality", "");
        setElement(term1502, 5, term1533);
        setLongField(term1539, term1539.getClass(), "id", 7L);
        setField(term1539, term1539.getClass(), "firstName", "");
        setField(term1539, term1539.getClass(), "lastName", "");
        setIntField(term1539, term1539.getClass(), "age", 37);
        setField(term1539, term1539.getClass(), "nationality", "");
        setElement(term1502, 6, term1539);
        setField(term1501, term1501.getClass(), "a", term1502);
        setIntField(term1501, term1501.getClass(), "modCount", 0);
        setField(term1500, term1500.getClass(), "userList", term1501);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.meteergin.medium.stream.Sample");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "test6", argTypes, term1500, args);
    }

};


