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

public class Sample_test3_17239077904 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1362;

    public Sample_test3_17239077904() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term1362 = newInstance(Class.forName("com.meteergin.medium.stream.Sample"));
        Object term1363 = newInstance(Class.forName("java.util.Arrays$ArrayList"));
        Object[] term1364 = (Object[]) newArray("com.meteergin.medium.stream.User", 7);
        Object term1365 = newInstance(Class.forName("com.meteergin.medium.stream.User"));
        Object term1371 = newInstance(Class.forName("com.meteergin.medium.stream.User"));
        Object term1377 = newInstance(Class.forName("com.meteergin.medium.stream.User"));
        Object term1383 = newInstance(Class.forName("com.meteergin.medium.stream.User"));
        Object term1389 = newInstance(Class.forName("com.meteergin.medium.stream.User"));
        Object term1395 = newInstance(Class.forName("com.meteergin.medium.stream.User"));
        Object term1401 = newInstance(Class.forName("com.meteergin.medium.stream.User"));
        setLongField(term1365, term1365.getClass(), "id", 1L);
        setField(term1365, term1365.getClass(), "firstName", "");
        setField(term1365, term1365.getClass(), "lastName", "");
        setIntField(term1365, term1365.getClass(), "age", 37);
        setField(term1365, term1365.getClass(), "nationality", "");
        setElement(term1364, 0, term1365);
        setLongField(term1371, term1371.getClass(), "id", 2L);
        setField(term1371, term1371.getClass(), "firstName", "");
        setField(term1371, term1371.getClass(), "lastName", "");
        setIntField(term1371, term1371.getClass(), "age", 11);
        setField(term1371, term1371.getClass(), "nationality", "");
        setElement(term1364, 1, term1371);
        setLongField(term1377, term1377.getClass(), "id", 3L);
        setField(term1377, term1377.getClass(), "firstName", "");
        setField(term1377, term1377.getClass(), "lastName", "");
        setIntField(term1377, term1377.getClass(), "age", 7);
        setField(term1377, term1377.getClass(), "nationality", "");
        setElement(term1364, 2, term1377);
        setLongField(term1383, term1383.getClass(), "id", 4L);
        setField(term1383, term1383.getClass(), "firstName", "");
        setField(term1383, term1383.getClass(), "lastName", "");
        setIntField(term1383, term1383.getClass(), "age", 77);
        setField(term1383, term1383.getClass(), "nationality", "");
        setElement(term1364, 3, term1383);
        setLongField(term1389, term1389.getClass(), "id", 5L);
        setField(term1389, term1389.getClass(), "firstName", "");
        setField(term1389, term1389.getClass(), "lastName", "");
        setIntField(term1389, term1389.getClass(), "age", 23);
        setField(term1389, term1389.getClass(), "nationality", "");
        setElement(term1364, 4, term1389);
        setLongField(term1395, term1395.getClass(), "id", 6L);
        setField(term1395, term1395.getClass(), "firstName", "");
        setField(term1395, term1395.getClass(), "lastName", "");
        setIntField(term1395, term1395.getClass(), "age", 11);
        setField(term1395, term1395.getClass(), "nationality", "");
        setElement(term1364, 5, term1395);
        setLongField(term1401, term1401.getClass(), "id", 7L);
        setField(term1401, term1401.getClass(), "firstName", "");
        setField(term1401, term1401.getClass(), "lastName", "");
        setIntField(term1401, term1401.getClass(), "age", 37);
        setField(term1401, term1401.getClass(), "nationality", "");
        setElement(term1364, 6, term1401);
        setField(term1363, term1363.getClass(), "a", term1364);
        setIntField(term1363, term1363.getClass(), "modCount", 0);
        setField(term1362, term1362.getClass(), "userList", term1363);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.meteergin.medium.stream.Sample");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "test3", argTypes, term1362, args);
    }

};


