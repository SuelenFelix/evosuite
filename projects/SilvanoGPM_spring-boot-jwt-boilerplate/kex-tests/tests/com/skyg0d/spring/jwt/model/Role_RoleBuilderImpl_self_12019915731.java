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
import java.lang.String;
import java.lang.Object;

public class Role_RoleBuilderImpl_self_12019915731 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2445;

    public Role_RoleBuilderImpl_self_12019915731() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term2483 = Class.forName((String) "com.skyg0d.spring.jwt.model.ERole");
        Field term2482 = ((Class) term2483).getDeclaredField((String) "ROLE_USER");
        ((Field) term2482).setAccessible(true);
        Object enum4 = ((Field) term2482).get((Object) null);
        term2445 = newInstance(Class.forName("com.skyg0d.spring.jwt.model.Role$RoleBuilderImpl"));
        Object term2459 = newInstance(Class.forName("java.util.UUID"));
        Object term2462 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term2463 = newInstance(Class.forName("java.time.LocalDate"));
        Object term2467 = newInstance(Class.forName("java.time.LocalTime"));
        Object term2472 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term2473 = newInstance(Class.forName("java.time.LocalDate"));
        Object term2477 = newInstance(Class.forName("java.time.LocalTime"));
        setField(term2445, term2445.getClass(), "name", enum4);
        setLongField(term2459, term2459.getClass(), "mostSigBits", -3838084482494604218L);
        setLongField(term2459, term2459.getClass(), "leastSigBits", 3892018155439224435L);
        setField(term2445, term2445.getClass(), "id", term2459);
        setIntField(term2463, term2463.getClass(), "year", 2025);
        setShortField(term2463, term2463.getClass(), "month", (short) 3);
        setShortField(term2463, term2463.getClass(), "day", (short) 28);
        setField(term2462, term2462.getClass(), "date", term2463);
        setByteField(term2467, term2467.getClass(), "hour", (byte) 19);
        setByteField(term2467, term2467.getClass(), "minute", (byte) 56);
        setByteField(term2467, term2467.getClass(), "second", (byte) 52);
        setIntField(term2467, term2467.getClass(), "nano", 738558930);
        setField(term2462, term2462.getClass(), "time", term2467);
        setField(term2445, term2445.getClass(), "createdAt", term2462);
        setIntField(term2473, term2473.getClass(), "year", 2024);
        setShortField(term2473, term2473.getClass(), "month", (short) 2);
        setShortField(term2473, term2473.getClass(), "day", (short) 29);
        setField(term2472, term2472.getClass(), "date", term2473);
        setByteField(term2477, term2477.getClass(), "hour", (byte) 17);
        setByteField(term2477, term2477.getClass(), "minute", (byte) 54);
        setByteField(term2477, term2477.getClass(), "second", (byte) 21);
        setIntField(term2477, term2477.getClass(), "nano", 605973408);
        setField(term2472, term2472.getClass(), "time", term2477);
        setField(term2445, term2445.getClass(), "updatedAt", term2472);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.skyg0d.spring.jwt.model.Role$RoleBuilderImpl");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "self", argTypes, term2445, args);
    }

};


