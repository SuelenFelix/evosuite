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

public class Sample_test2_17239068293 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1316;

    public Sample_test2_17239068293() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term1316 = newInstance(Class.forName("com.meteergin.medium.stream.Sample"));
        Object term1317 = newInstance(Class.forName("java.util.Arrays$ArrayList"));
        Object[] term1318 = (Object[]) newArray("com.meteergin.medium.stream.User", 7);
        Object term1319 = newInstance(Class.forName("com.meteergin.medium.stream.User"));
        Object term1325 = newInstance(Class.forName("com.meteergin.medium.stream.User"));
        Object term1331 = newInstance(Class.forName("com.meteergin.medium.stream.User"));
        Object term1337 = newInstance(Class.forName("com.meteergin.medium.stream.User"));
        Object term1343 = newInstance(Class.forName("com.meteergin.medium.stream.User"));
        Object term1349 = newInstance(Class.forName("com.meteergin.medium.stream.User"));
        Object term1355 = newInstance(Class.forName("com.meteergin.medium.stream.User"));
        setLongField(term1319, term1319.getClass(), "id", 1L);
        setField(term1319, term1319.getClass(), "firstName", "");
        setField(term1319, term1319.getClass(), "lastName", "");
        setIntField(term1319, term1319.getClass(), "age", 37);
        setField(term1319, term1319.getClass(), "nationality", "");
        setElement(term1318, 0, term1319);
        setLongField(term1325, term1325.getClass(), "id", 2L);
        setField(term1325, term1325.getClass(), "firstName", "");
        setField(term1325, term1325.getClass(), "lastName", "");
        setIntField(term1325, term1325.getClass(), "age", 11);
        setField(term1325, term1325.getClass(), "nationality", "");
        setElement(term1318, 1, term1325);
        setLongField(term1331, term1331.getClass(), "id", 3L);
        setField(term1331, term1331.getClass(), "firstName", "");
        setField(term1331, term1331.getClass(), "lastName", "");
        setIntField(term1331, term1331.getClass(), "age", 7);
        setField(term1331, term1331.getClass(), "nationality", "");
        setElement(term1318, 2, term1331);
        setLongField(term1337, term1337.getClass(), "id", 4L);
        setField(term1337, term1337.getClass(), "firstName", "");
        setField(term1337, term1337.getClass(), "lastName", "");
        setIntField(term1337, term1337.getClass(), "age", 77);
        setField(term1337, term1337.getClass(), "nationality", "");
        setElement(term1318, 3, term1337);
        setLongField(term1343, term1343.getClass(), "id", 5L);
        setField(term1343, term1343.getClass(), "firstName", "");
        setField(term1343, term1343.getClass(), "lastName", "");
        setIntField(term1343, term1343.getClass(), "age", 23);
        setField(term1343, term1343.getClass(), "nationality", "");
        setElement(term1318, 4, term1343);
        setLongField(term1349, term1349.getClass(), "id", 6L);
        setField(term1349, term1349.getClass(), "firstName", "");
        setField(term1349, term1349.getClass(), "lastName", "");
        setIntField(term1349, term1349.getClass(), "age", 11);
        setField(term1349, term1349.getClass(), "nationality", "");
        setElement(term1318, 5, term1349);
        setLongField(term1355, term1355.getClass(), "id", 7L);
        setField(term1355, term1355.getClass(), "firstName", "");
        setField(term1355, term1355.getClass(), "lastName", "");
        setIntField(term1355, term1355.getClass(), "age", 37);
        setField(term1355, term1355.getClass(), "nationality", "");
        setElement(term1318, 6, term1355);
        setField(term1317, term1317.getClass(), "a", term1318);
        setIntField(term1317, term1317.getClass(), "modCount", 0);
        setField(term1316, term1316.getClass(), "userList", term1317);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.meteergin.medium.stream.Sample");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "test2", argTypes, term1316, args);
    }

};


