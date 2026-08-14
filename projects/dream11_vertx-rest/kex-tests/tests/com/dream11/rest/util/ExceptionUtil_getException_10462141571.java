package com.dream11.rest.util;

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
import static com.dream11.rest.util.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;

public class ExceptionUtil_getException_10462141571 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2597;

    public ExceptionUtil_getException_10462141571() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term2597 = (Object[]) newArray("java.lang.Object", 6);
        Object term2598 = newInstance(Class.forName("java.lang.Object"));
        Object term2599 = newInstance(Class.forName("java.lang.Object"));
        Object term2600 = newInstance(Class.forName("java.lang.Object"));
        Object term2601 = newInstance(Class.forName("java.lang.Object"));
        Object term2602 = newInstance(Class.forName("java.lang.Object"));
        Object term2603 = newInstance(Class.forName("java.lang.Object"));
        setElement(term2597, 0, term2598);
        setElement(term2597, 1, term2599);
        setElement(term2597, 2, term2600);
        setElement(term2597, 3, term2601);
        setElement(term2597, 4, term2602);
        setElement(term2597, 5, term2603);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.dream11.rest.util.ExceptionUtil");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.dream11.rest.exception.RestError");
        argTypes[1] = Array.newInstance(Class.forName("java.lang.Object"), 0).getClass();
        Object[] args = new Object[2];
        args[0] = null;
        args[1] = term2597;
        callMethod(klass, "getException", argTypes, null, args);
    }

};


