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

public class Task_getGoals_186002139010 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2151;

    public Task_getGoals_186002139010() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term2151 = newInstance(Class.forName("com.maciejwalkowiak.paseq.Task"));
        Object[] term2154 = (Object[]) newArray("java.lang.String", 2);
        Object term2179 = newInstance(Class.forName("com.maciejwalkowiak.paseq.Exec"));
        setBooleanField(term2151, term2151.getClass(), "async", true);
        setBooleanField(term2151, term2151.getClass(), "wait", true);
        setElement(term2154, 0, "jiKYgYHqIS");
        setElement(term2154, 1, "DfISiziTgG");
        setField(term2151, term2151.getClass(), "goals", term2154);
        setField(term2179, term2179.getClass(), "command", "XqgfKFvPSD");
        setField(term2179, term2179.getClass(), "directory", "JiVRgTZvKc");
        setField(term2151, term2151.getClass(), "exec", term2179);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.maciejwalkowiak.paseq.Task");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getGoals", argTypes, term2151, args);
    }

};


