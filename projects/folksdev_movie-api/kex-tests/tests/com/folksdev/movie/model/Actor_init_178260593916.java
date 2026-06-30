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

public class Actor_init_178260593916 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term33937;
     Object enum115;

    public Actor_init_178260593916() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term33937 = newInstance(Class.forName("java.time.LocalDate"));
        setIntField(term33937, term33937.getClass(), "year", 2016);
        setShortField(term33937, term33937.getClass(), "month", (short) 9);
        setShortField(term33937, term33937.getClass(), "day", (short) 1);
        Class<? extends Object> term33970 = Class.forName((String) "com.folksdev.movie.model.Gender");
        Field term33969 = ((Class) term33970).getDeclaredField((String) "MALE");
        ((Field) term33969).setAccessible(true);
        enum115 = ((Field) term33969).get((Object) null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.folksdev.movie.model.Actor");
        Class<?>[] argTypes = new Class<?>[4];
        argTypes[0] = Class.forName("java.lang.String");
        argTypes[1] = Class.forName("java.lang.String");
        argTypes[2] = Class.forName("java.time.LocalDate");
        argTypes[3] = Class.forName("com.folksdev.movie.model.Gender");
        Object[] args = new Object[4];
        args[0] = "hFUzxlerfo";
        args[1] = "SSClrWPMGg";
        args[2] = term33937;
        args[3] = enum115;
        Object instance = callConstructor(klass, argTypes, args);
    }

};


