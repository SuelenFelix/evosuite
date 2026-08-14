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

public class User_setRoles_21050173413 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2331;
     Object term2397;

    public User_setRoles_21050173413() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term2369 = new HashMap();
        Set<Object> term2433 =  ((Map) term2369).keySet();
        HashSet term2368 = new HashSet((Collection<? extends Object>) term2433);
        term2331 = newInstance(Class.forName("com.skyg0d.spring.jwt.model.User"));
        Object term2374 = newInstance(Class.forName("java.util.UUID"));
        Object term2377 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term2378 = newInstance(Class.forName("java.time.LocalDate"));
        Object term2382 = newInstance(Class.forName("java.time.LocalTime"));
        Object term2387 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term2388 = newInstance(Class.forName("java.time.LocalDate"));
        Object term2392 = newInstance(Class.forName("java.time.LocalTime"));
        setField(term2331, term2331.getClass(), "username", "xrwlQZdwCp");
        setField(term2331, term2331.getClass(), "email", "IDCWpPLRkE");
        setField(term2331, term2331.getClass(), "password", "nyiiPDVjAc");
        setField(term2331, term2331.getClass(), "roles", term2368);
        setLongField(term2374, term2374.getClass(), "mostSigBits", -7738503207562305297L);
        setLongField(term2374, term2374.getClass(), "leastSigBits", 3825396310311739952L);
        setField(term2331, term2331.getClass(), "id", term2374);
        setIntField(term2378, term2378.getClass(), "year", 2022);
        setShortField(term2378, term2378.getClass(), "month", (short) 6);
        setShortField(term2378, term2378.getClass(), "day", (short) 20);
        setField(term2377, term2377.getClass(), "date", term2378);
        setByteField(term2382, term2382.getClass(), "hour", (byte) 7);
        setByteField(term2382, term2382.getClass(), "minute", (byte) 57);
        setByteField(term2382, term2382.getClass(), "second", (byte) 37);
        setIntField(term2382, term2382.getClass(), "nano", 90374877);
        setField(term2377, term2377.getClass(), "time", term2382);
        setField(term2331, term2331.getClass(), "createdAt", term2377);
        setIntField(term2388, term2388.getClass(), "year", 2023);
        setShortField(term2388, term2388.getClass(), "month", (short) 2);
        setShortField(term2388, term2388.getClass(), "day", (short) 16);
        setField(term2387, term2387.getClass(), "date", term2388);
        setByteField(term2392, term2392.getClass(), "hour", (byte) 3);
        setByteField(term2392, term2392.getClass(), "minute", (byte) 18);
        setByteField(term2392, term2392.getClass(), "second", (byte) 56);
        setIntField(term2392, term2392.getClass(), "nano", 733017887);
        setField(term2387, term2387.getClass(), "time", term2392);
        setField(term2331, term2331.getClass(), "updatedAt", term2387);
        HashMap term2398 = new HashMap();
        Set<Object> term2434 =  ((Map) term2398).keySet();
        term2397 = new HashSet((Collection<? extends Object>) term2434);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.skyg0d.spring.jwt.model.User");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.util.Set");
        Object[] args = new Object[1];
        args[0] = term2397;
        callMethod(klass, "setRoles", argTypes, term2331, args);
    }

};


