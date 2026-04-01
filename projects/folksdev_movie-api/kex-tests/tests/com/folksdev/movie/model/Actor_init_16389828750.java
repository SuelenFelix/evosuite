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
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.Collection;
import java.util.HashSet;

public class Actor_init_16389828750 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term30107;
     Object enum99;
     Object term30121;

    public Actor_init_16389828750() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term30107 = newInstance(Class.forName("java.time.LocalDate"));
        setIntField(term30107, term30107.getClass(), "year", 2023);
        setShortField(term30107, term30107.getClass(), "month", (short) 11);
        setShortField(term30107, term30107.getClass(), "day", (short) 13);
        Class<? extends Object> term30148 = Class.forName((String) "com.folksdev.movie.model.Gender");
        Field term30147 = ((Class) term30148).getDeclaredField((String) "FEMALE");
        ((Field) term30147).setAccessible(true);
        enum99 = ((Field) term30147).get((Object) null);
        HashMap term30122 = new HashMap();
        Set<Object> term30327 =  ((Map) term30122).keySet();
        term30121 = new HashSet((Collection<? extends Object>) term30327);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.folksdev.movie.model.Actor");
        Class<?>[] argTypes = new Class<?>[5];
        argTypes[0] = Class.forName("java.lang.String");
        argTypes[1] = Class.forName("java.lang.String");
        argTypes[2] = Class.forName("java.time.LocalDate");
        argTypes[3] = Class.forName("com.folksdev.movie.model.Gender");
        argTypes[4] = Class.forName("java.util.Set");
        Object[] args = new Object[5];
        args[0] = "qSfmbHSpyF";
        args[1] = "nfLAMGBNLz";
        args[2] = term30107;
        args[3] = enum99;
        args[4] = term30121;
        Object instance = callConstructor(klass, argTypes, args);
    }

};


