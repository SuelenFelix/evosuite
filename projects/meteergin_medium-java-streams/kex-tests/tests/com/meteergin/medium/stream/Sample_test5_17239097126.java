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

public class Sample_test5_17239097126 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1454;

    public Sample_test5_17239097126() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term1454 = newInstance(Class.forName("com.meteergin.medium.stream.Sample"));
        Object term1455 = newInstance(Class.forName("java.util.Arrays$ArrayList"));
        Object[] term1456 = (Object[]) newArray("com.meteergin.medium.stream.User", 7);
        Object term1457 = newInstance(Class.forName("com.meteergin.medium.stream.User"));
        Object term1463 = newInstance(Class.forName("com.meteergin.medium.stream.User"));
        Object term1469 = newInstance(Class.forName("com.meteergin.medium.stream.User"));
        Object term1475 = newInstance(Class.forName("com.meteergin.medium.stream.User"));
        Object term1481 = newInstance(Class.forName("com.meteergin.medium.stream.User"));
        Object term1487 = newInstance(Class.forName("com.meteergin.medium.stream.User"));
        Object term1493 = newInstance(Class.forName("com.meteergin.medium.stream.User"));
        setLongField(term1457, term1457.getClass(), "id", 1L);
        setField(term1457, term1457.getClass(), "firstName", "");
        setField(term1457, term1457.getClass(), "lastName", "");
        setIntField(term1457, term1457.getClass(), "age", 37);
        setField(term1457, term1457.getClass(), "nationality", "");
        setElement(term1456, 0, term1457);
        setLongField(term1463, term1463.getClass(), "id", 2L);
        setField(term1463, term1463.getClass(), "firstName", "");
        setField(term1463, term1463.getClass(), "lastName", "");
        setIntField(term1463, term1463.getClass(), "age", 11);
        setField(term1463, term1463.getClass(), "nationality", "");
        setElement(term1456, 1, term1463);
        setLongField(term1469, term1469.getClass(), "id", 3L);
        setField(term1469, term1469.getClass(), "firstName", "");
        setField(term1469, term1469.getClass(), "lastName", "");
        setIntField(term1469, term1469.getClass(), "age", 7);
        setField(term1469, term1469.getClass(), "nationality", "");
        setElement(term1456, 2, term1469);
        setLongField(term1475, term1475.getClass(), "id", 4L);
        setField(term1475, term1475.getClass(), "firstName", "");
        setField(term1475, term1475.getClass(), "lastName", "");
        setIntField(term1475, term1475.getClass(), "age", 77);
        setField(term1475, term1475.getClass(), "nationality", "");
        setElement(term1456, 3, term1475);
        setLongField(term1481, term1481.getClass(), "id", 5L);
        setField(term1481, term1481.getClass(), "firstName", "");
        setField(term1481, term1481.getClass(), "lastName", "");
        setIntField(term1481, term1481.getClass(), "age", 23);
        setField(term1481, term1481.getClass(), "nationality", "");
        setElement(term1456, 4, term1481);
        setLongField(term1487, term1487.getClass(), "id", 6L);
        setField(term1487, term1487.getClass(), "firstName", "");
        setField(term1487, term1487.getClass(), "lastName", "");
        setIntField(term1487, term1487.getClass(), "age", 11);
        setField(term1487, term1487.getClass(), "nationality", "");
        setElement(term1456, 5, term1487);
        setLongField(term1493, term1493.getClass(), "id", 7L);
        setField(term1493, term1493.getClass(), "firstName", "");
        setField(term1493, term1493.getClass(), "lastName", "");
        setIntField(term1493, term1493.getClass(), "age", 37);
        setField(term1493, term1493.getClass(), "nationality", "");
        setElement(term1456, 6, term1493);
        setField(term1455, term1455.getClass(), "a", term1456);
        setIntField(term1455, term1455.getClass(), "modCount", 0);
        setField(term1454, term1454.getClass(), "userList", term1455);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.meteergin.medium.stream.Sample");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "test5", argTypes, term1454, args);
    }

};


