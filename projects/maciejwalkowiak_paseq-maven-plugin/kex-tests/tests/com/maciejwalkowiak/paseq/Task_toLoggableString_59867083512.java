package com.maciejwalkowiak.paseq;

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
import static com.maciejwalkowiak.paseq.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;

public class Task_toLoggableString_59867083512 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2359;

    public Task_toLoggableString_59867083512() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term2359 = newInstance(Class.forName("com.maciejwalkowiak.paseq.Task"));
        Object[] term2362 = (Object[]) newArray("java.lang.String", 1);
        Object term2375 = newInstance(Class.forName("com.maciejwalkowiak.paseq.Exec"));
        setBooleanField(term2359, term2359.getClass(), "async", false);
        setBooleanField(term2359, term2359.getClass(), "wait", false);
        setElement(term2362, 0, "vjxIhXHxGR");
        setField(term2359, term2359.getClass(), "goals", term2362);
        setField(term2375, term2375.getClass(), "command", "QXzGXbEXMu");
        setField(term2375, term2375.getClass(), "directory", "qxSDVejjiY");
        setField(term2359, term2359.getClass(), "exec", term2375);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.maciejwalkowiak.paseq.Task");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "toLoggableString", argTypes, term2359, args);
    }

};


