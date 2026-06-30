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

public class Sample_test1_17239058682 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1270;

    public Sample_test1_17239058682() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term1270 = newInstance(Class.forName("com.meteergin.medium.stream.Sample"));
        Object term1271 = newInstance(Class.forName("java.util.Arrays$ArrayList"));
        Object[] term1272 = (Object[]) newArray("com.meteergin.medium.stream.User", 7);
        Object term1273 = newInstance(Class.forName("com.meteergin.medium.stream.User"));
        Object term1279 = newInstance(Class.forName("com.meteergin.medium.stream.User"));
        Object term1285 = newInstance(Class.forName("com.meteergin.medium.stream.User"));
        Object term1291 = newInstance(Class.forName("com.meteergin.medium.stream.User"));
        Object term1297 = newInstance(Class.forName("com.meteergin.medium.stream.User"));
        Object term1303 = newInstance(Class.forName("com.meteergin.medium.stream.User"));
        Object term1309 = newInstance(Class.forName("com.meteergin.medium.stream.User"));
        setLongField(term1273, term1273.getClass(), "id", 1L);
        setField(term1273, term1273.getClass(), "firstName", "");
        setField(term1273, term1273.getClass(), "lastName", "");
        setIntField(term1273, term1273.getClass(), "age", 37);
        setField(term1273, term1273.getClass(), "nationality", "");
        setElement(term1272, 0, term1273);
        setLongField(term1279, term1279.getClass(), "id", 2L);
        setField(term1279, term1279.getClass(), "firstName", "");
        setField(term1279, term1279.getClass(), "lastName", "");
        setIntField(term1279, term1279.getClass(), "age", 11);
        setField(term1279, term1279.getClass(), "nationality", "");
        setElement(term1272, 1, term1279);
        setLongField(term1285, term1285.getClass(), "id", 3L);
        setField(term1285, term1285.getClass(), "firstName", "");
        setField(term1285, term1285.getClass(), "lastName", "");
        setIntField(term1285, term1285.getClass(), "age", 7);
        setField(term1285, term1285.getClass(), "nationality", "");
        setElement(term1272, 2, term1285);
        setLongField(term1291, term1291.getClass(), "id", 4L);
        setField(term1291, term1291.getClass(), "firstName", "");
        setField(term1291, term1291.getClass(), "lastName", "");
        setIntField(term1291, term1291.getClass(), "age", 77);
        setField(term1291, term1291.getClass(), "nationality", "");
        setElement(term1272, 3, term1291);
        setLongField(term1297, term1297.getClass(), "id", 5L);
        setField(term1297, term1297.getClass(), "firstName", "");
        setField(term1297, term1297.getClass(), "lastName", "");
        setIntField(term1297, term1297.getClass(), "age", 23);
        setField(term1297, term1297.getClass(), "nationality", "");
        setElement(term1272, 4, term1297);
        setLongField(term1303, term1303.getClass(), "id", 6L);
        setField(term1303, term1303.getClass(), "firstName", "");
        setField(term1303, term1303.getClass(), "lastName", "");
        setIntField(term1303, term1303.getClass(), "age", 11);
        setField(term1303, term1303.getClass(), "nationality", "");
        setElement(term1272, 5, term1303);
        setLongField(term1309, term1309.getClass(), "id", 7L);
        setField(term1309, term1309.getClass(), "firstName", "");
        setField(term1309, term1309.getClass(), "lastName", "");
        setIntField(term1309, term1309.getClass(), "age", 37);
        setField(term1309, term1309.getClass(), "nationality", "");
        setElement(term1272, 6, term1309);
        setField(term1271, term1271.getClass(), "a", term1272);
        setIntField(term1271, term1271.getClass(), "modCount", 0);
        setField(term1270, term1270.getClass(), "userList", term1271);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.meteergin.medium.stream.Sample");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "test1", argTypes, term1270, args);
    }

};


