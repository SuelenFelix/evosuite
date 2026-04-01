package com.folksdev.movie.model;

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
import static com.folksdev.movie.model.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.String;
import java.lang.Object;

public class Actor_init_206992865617 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term34153;
     Object enum116;

    public Actor_init_206992865617() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term34153 = newInstance(Class.forName("java.time.LocalDate"));
        setIntField(term34153, term34153.getClass(), "year", 2025);
        setShortField(term34153, term34153.getClass(), "month", (short) 10);
        setShortField(term34153, term34153.getClass(), "day", (short) 29);
        Class<? extends Object> term34179 = Class.forName((String) "com.folksdev.movie.model.Gender");
        Field term34178 = ((Class) term34179).getDeclaredField((String) "UNKNOWN");
        ((Field) term34178).setAccessible(true);
        enum116 = ((Field) term34178).get((Object) null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.folksdev.movie.model.Actor");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Class.forName("java.lang.String");
        argTypes[1] = Class.forName("java.time.LocalDate");
        argTypes[2] = Class.forName("com.folksdev.movie.model.Gender");
        Object[] args = new Object[3];
        args[0] = "pWwlfpmeFT";
        args[1] = term34153;
        args[2] = enum116;
        Object instance = callConstructor(klass, argTypes, args);
    }

};


