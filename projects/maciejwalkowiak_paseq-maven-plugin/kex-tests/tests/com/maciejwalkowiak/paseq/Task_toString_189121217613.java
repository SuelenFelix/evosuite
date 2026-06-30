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

public class Task_toString_189121217613 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2430;

    public Task_toString_189121217613() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term2430 = newInstance(Class.forName("com.maciejwalkowiak.paseq.Task"));
        Object[] term2433 = (Object[]) newArray("java.lang.String", 0);
        Object term2434 = newInstance(Class.forName("com.maciejwalkowiak.paseq.Exec"));
        setBooleanField(term2430, term2430.getClass(), "async", true);
        setBooleanField(term2430, term2430.getClass(), "wait", true);
        setField(term2430, term2430.getClass(), "goals", term2433);
        setField(term2434, term2434.getClass(), "command", "xBsXSDjXYK");
        setField(term2434, term2434.getClass(), "directory", "sEnIVFtZuQ");
        setField(term2430, term2430.getClass(), "exec", term2434);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.maciejwalkowiak.paseq.Task");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "toString", argTypes, term2430, args);
    }

};


