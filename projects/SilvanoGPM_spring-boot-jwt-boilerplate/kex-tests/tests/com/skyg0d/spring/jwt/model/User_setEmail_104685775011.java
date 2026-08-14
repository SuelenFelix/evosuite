package com.skyg0d.spring.jwt.model;

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
import static com.skyg0d.spring.jwt.model.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.util.HashMap;
import java.util.Map;
import java.lang.Object;
import java.util.Set;
import java.util.Collection;
import java.util.HashSet;

public class User_setEmail_104685775011 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2093;

    public User_setEmail_104685775011() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term2131 = new HashMap();
        Set<Object> term2201 =  ((Map) term2131).keySet();
        HashSet term2130 = new HashSet((Collection<? extends Object>) term2201);
        term2093 = newInstance(Class.forName("com.skyg0d.spring.jwt.model.User"));
        Object term2136 = newInstance(Class.forName("java.util.UUID"));
        Object term2139 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term2140 = newInstance(Class.forName("java.time.LocalDate"));
        Object term2144 = newInstance(Class.forName("java.time.LocalTime"));
        Object term2149 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term2150 = newInstance(Class.forName("java.time.LocalDate"));
        Object term2154 = newInstance(Class.forName("java.time.LocalTime"));
        setField(term2093, term2093.getClass(), "username", "IoAlmYsBwc");
        setField(term2093, term2093.getClass(), "email", "TEParAifyi");
        setField(term2093, term2093.getClass(), "password", "OWDIEULEFu");
        setField(term2093, term2093.getClass(), "roles", term2130);
        setLongField(term2136, term2136.getClass(), "mostSigBits", -1154553077993834885L);
        setLongField(term2136, term2136.getClass(), "leastSigBits", -2850532706972744550L);
        setField(term2093, term2093.getClass(), "id", term2136);
        setIntField(term2140, term2140.getClass(), "year", 2011);
        setShortField(term2140, term2140.getClass(), "month", (short) 6);
        setShortField(term2140, term2140.getClass(), "day", (short) 26);
        setField(term2139, term2139.getClass(), "date", term2140);
        setByteField(term2144, term2144.getClass(), "hour", (byte) 22);
        setByteField(term2144, term2144.getClass(), "minute", (byte) 39);
        setByteField(term2144, term2144.getClass(), "second", (byte) 11);
        setIntField(term2144, term2144.getClass(), "nano", 686293604);
        setField(term2139, term2139.getClass(), "time", term2144);
        setField(term2093, term2093.getClass(), "createdAt", term2139);
        setIntField(term2150, term2150.getClass(), "year", 2012);
        setShortField(term2150, term2150.getClass(), "month", (short) 7);
        setShortField(term2150, term2150.getClass(), "day", (short) 21);
        setField(term2149, term2149.getClass(), "date", term2150);
        setByteField(term2154, term2154.getClass(), "hour", (byte) 13);
        setByteField(term2154, term2154.getClass(), "minute", (byte) 41);
        setByteField(term2154, term2154.getClass(), "second", (byte) 44);
        setIntField(term2154, term2154.getClass(), "nano", 394467282);
        setField(term2149, term2149.getClass(), "time", term2154);
        setField(term2093, term2093.getClass(), "updatedAt", term2149);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.skyg0d.spring.jwt.model.User");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "dWRymuLBtr";
        callMethod(klass, "setEmail", argTypes, term2093, args);
    }

};


