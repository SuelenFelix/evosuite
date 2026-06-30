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

public class Sample_test7_17239116348 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1546;

    public Sample_test7_17239116348() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term1546 = newInstance(Class.forName("com.meteergin.medium.stream.Sample"));
        Object term1547 = newInstance(Class.forName("java.util.Arrays$ArrayList"));
        Object[] term1548 = (Object[]) newArray("com.meteergin.medium.stream.User", 7);
        Object term1549 = newInstance(Class.forName("com.meteergin.medium.stream.User"));
        Object term1555 = newInstance(Class.forName("com.meteergin.medium.stream.User"));
        Object term1561 = newInstance(Class.forName("com.meteergin.medium.stream.User"));
        Object term1567 = newInstance(Class.forName("com.meteergin.medium.stream.User"));
        Object term1573 = newInstance(Class.forName("com.meteergin.medium.stream.User"));
        Object term1579 = newInstance(Class.forName("com.meteergin.medium.stream.User"));
        Object term1585 = newInstance(Class.forName("com.meteergin.medium.stream.User"));
        setLongField(term1549, term1549.getClass(), "id", 1L);
        setField(term1549, term1549.getClass(), "firstName", "");
        setField(term1549, term1549.getClass(), "lastName", "");
        setIntField(term1549, term1549.getClass(), "age", 37);
        setField(term1549, term1549.getClass(), "nationality", "");
        setElement(term1548, 0, term1549);
        setLongField(term1555, term1555.getClass(), "id", 2L);
        setField(term1555, term1555.getClass(), "firstName", "");
        setField(term1555, term1555.getClass(), "lastName", "");
        setIntField(term1555, term1555.getClass(), "age", 11);
        setField(term1555, term1555.getClass(), "nationality", "");
        setElement(term1548, 1, term1555);
        setLongField(term1561, term1561.getClass(), "id", 3L);
        setField(term1561, term1561.getClass(), "firstName", "");
        setField(term1561, term1561.getClass(), "lastName", "");
        setIntField(term1561, term1561.getClass(), "age", 7);
        setField(term1561, term1561.getClass(), "nationality", "");
        setElement(term1548, 2, term1561);
        setLongField(term1567, term1567.getClass(), "id", 4L);
        setField(term1567, term1567.getClass(), "firstName", "");
        setField(term1567, term1567.getClass(), "lastName", "");
        setIntField(term1567, term1567.getClass(), "age", 77);
        setField(term1567, term1567.getClass(), "nationality", "");
        setElement(term1548, 3, term1567);
        setLongField(term1573, term1573.getClass(), "id", 5L);
        setField(term1573, term1573.getClass(), "firstName", "");
        setField(term1573, term1573.getClass(), "lastName", "");
        setIntField(term1573, term1573.getClass(), "age", 23);
        setField(term1573, term1573.getClass(), "nationality", "");
        setElement(term1548, 4, term1573);
        setLongField(term1579, term1579.getClass(), "id", 6L);
        setField(term1579, term1579.getClass(), "firstName", "");
        setField(term1579, term1579.getClass(), "lastName", "");
        setIntField(term1579, term1579.getClass(), "age", 11);
        setField(term1579, term1579.getClass(), "nationality", "");
        setElement(term1548, 5, term1579);
        setLongField(term1585, term1585.getClass(), "id", 7L);
        setField(term1585, term1585.getClass(), "firstName", "");
        setField(term1585, term1585.getClass(), "lastName", "");
        setIntField(term1585, term1585.getClass(), "age", 37);
        setField(term1585, term1585.getClass(), "nationality", "");
        setElement(term1548, 6, term1585);
        setField(term1547, term1547.getClass(), "a", term1548);
        setIntField(term1547, term1547.getClass(), "modCount", 0);
        setField(term1546, term1546.getClass(), "userList", term1547);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.meteergin.medium.stream.Sample");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "test7", argTypes, term1546, args);
    }

};


