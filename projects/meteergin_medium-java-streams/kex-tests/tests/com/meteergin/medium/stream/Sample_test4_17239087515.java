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

public class Sample_test4_17239087515 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1408;

    public Sample_test4_17239087515() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term1408 = newInstance(Class.forName("com.meteergin.medium.stream.Sample"));
        Object term1409 = newInstance(Class.forName("java.util.Arrays$ArrayList"));
        Object[] term1410 = (Object[]) newArray("com.meteergin.medium.stream.User", 7);
        Object term1411 = newInstance(Class.forName("com.meteergin.medium.stream.User"));
        Object term1417 = newInstance(Class.forName("com.meteergin.medium.stream.User"));
        Object term1423 = newInstance(Class.forName("com.meteergin.medium.stream.User"));
        Object term1429 = newInstance(Class.forName("com.meteergin.medium.stream.User"));
        Object term1435 = newInstance(Class.forName("com.meteergin.medium.stream.User"));
        Object term1441 = newInstance(Class.forName("com.meteergin.medium.stream.User"));
        Object term1447 = newInstance(Class.forName("com.meteergin.medium.stream.User"));
        setLongField(term1411, term1411.getClass(), "id", 1L);
        setField(term1411, term1411.getClass(), "firstName", "");
        setField(term1411, term1411.getClass(), "lastName", "");
        setIntField(term1411, term1411.getClass(), "age", 37);
        setField(term1411, term1411.getClass(), "nationality", "");
        setElement(term1410, 0, term1411);
        setLongField(term1417, term1417.getClass(), "id", 2L);
        setField(term1417, term1417.getClass(), "firstName", "");
        setField(term1417, term1417.getClass(), "lastName", "");
        setIntField(term1417, term1417.getClass(), "age", 11);
        setField(term1417, term1417.getClass(), "nationality", "");
        setElement(term1410, 1, term1417);
        setLongField(term1423, term1423.getClass(), "id", 3L);
        setField(term1423, term1423.getClass(), "firstName", "");
        setField(term1423, term1423.getClass(), "lastName", "");
        setIntField(term1423, term1423.getClass(), "age", 7);
        setField(term1423, term1423.getClass(), "nationality", "");
        setElement(term1410, 2, term1423);
        setLongField(term1429, term1429.getClass(), "id", 4L);
        setField(term1429, term1429.getClass(), "firstName", "");
        setField(term1429, term1429.getClass(), "lastName", "");
        setIntField(term1429, term1429.getClass(), "age", 77);
        setField(term1429, term1429.getClass(), "nationality", "");
        setElement(term1410, 3, term1429);
        setLongField(term1435, term1435.getClass(), "id", 5L);
        setField(term1435, term1435.getClass(), "firstName", "");
        setField(term1435, term1435.getClass(), "lastName", "");
        setIntField(term1435, term1435.getClass(), "age", 23);
        setField(term1435, term1435.getClass(), "nationality", "");
        setElement(term1410, 4, term1435);
        setLongField(term1441, term1441.getClass(), "id", 6L);
        setField(term1441, term1441.getClass(), "firstName", "");
        setField(term1441, term1441.getClass(), "lastName", "");
        setIntField(term1441, term1441.getClass(), "age", 11);
        setField(term1441, term1441.getClass(), "nationality", "");
        setElement(term1410, 5, term1441);
        setLongField(term1447, term1447.getClass(), "id", 7L);
        setField(term1447, term1447.getClass(), "firstName", "");
        setField(term1447, term1447.getClass(), "lastName", "");
        setIntField(term1447, term1447.getClass(), "age", 37);
        setField(term1447, term1447.getClass(), "nationality", "");
        setElement(term1410, 6, term1447);
        setField(term1409, term1409.getClass(), "a", term1410);
        setIntField(term1409, term1409.getClass(), "modCount", 0);
        setField(term1408, term1408.getClass(), "userList", term1409);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.meteergin.medium.stream.Sample");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "test4", argTypes, term1408, args);
    }

};


