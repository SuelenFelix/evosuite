package com.bslota.optimisticapi;

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
import static com.bslota.optimisticapi.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;

public class OptimisticApiApplication_main_13452835161 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term6925;

    public OptimisticApiApplication_main_13452835161() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term6925 = (Object[]) newArray("java.lang.String", 5);
        setElement(term6925, 0, "XylxrMBraH");
        setElement(term6925, 1, "pORebkoRdD");
        setElement(term6925, 2, "mXGCWJDOqA");
        setElement(term6925, 3, "dpNsDgfPso");
        setElement(term6925, 4, "hCWPJQKpdc");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.bslota.optimisticapi.OptimisticApiApplication");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Array.newInstance(Class.forName("java.lang.String"), 0).getClass();
        Object[] args = new Object[1];
        args[0] = term6925;
        callMethod(klass, "main", argTypes, null, args);
    }

};


