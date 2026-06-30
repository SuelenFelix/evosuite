package com.prac.react.algorithm;

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
import static com.prac.react.algorithm.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Integer;

public class QuikSort_partition_14984384288 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term873;
     Object term874;
     Object term876;

    public QuikSort_partition_14984384288() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term873 = newInstance(Class.forName("com.prac.react.algorithm.QuikSort"));
        setField(term873, term873.getClass(), "logger", null);
        term874 = new Integer(0);
        term876 = new Integer(0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.prac.react.algorithm.QuikSort");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Class.forName("java.util.List");
        argTypes[1] = int.class;
        argTypes[2] = int.class;
        Object[] args = new Object[3];
        args[0] = null;
        args[1] = term874;
        args[2] = term876;
        callMethod(klass, "partition", argTypes, term873, args);
    }

};


