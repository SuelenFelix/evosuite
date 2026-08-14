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

public class Role_setName_2491652636 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1105;
     Object enum3;

    public Role_setName_2491652636() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term1143 = Class.forName((String) "com.skyg0d.spring.jwt.model.ERole");
        Field term1142 = ((Class) term1143).getDeclaredField((String) "ROLE_USER");
        ((Field) term1142).setAccessible(true);
        enum3 = ((Field) term1142).get((Object) null);
        term1105 = newInstance(Class.forName("com.skyg0d.spring.jwt.model.Role"));
        Object term1119 = newInstance(Class.forName("java.util.UUID"));
        Object term1122 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term1123 = newInstance(Class.forName("java.time.LocalDate"));
        Object term1127 = newInstance(Class.forName("java.time.LocalTime"));
        Object term1132 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term1133 = newInstance(Class.forName("java.time.LocalDate"));
        Object term1137 = newInstance(Class.forName("java.time.LocalTime"));
        setField(term1105, term1105.getClass(), "name", enum3);
        setLongField(term1119, term1119.getClass(), "mostSigBits", 6617340557564669657L);
        setLongField(term1119, term1119.getClass(), "leastSigBits", 1439298019805881866L);
        setField(term1105, term1105.getClass(), "id", term1119);
        setIntField(term1123, term1123.getClass(), "year", 2010);
        setShortField(term1123, term1123.getClass(), "month", (short) 1);
        setShortField(term1123, term1123.getClass(), "day", (short) 17);
        setField(term1122, term1122.getClass(), "date", term1123);
        setByteField(term1127, term1127.getClass(), "hour", (byte) 13);
        setByteField(term1127, term1127.getClass(), "minute", (byte) 5);
        setByteField(term1127, term1127.getClass(), "second", (byte) 51);
        setIntField(term1127, term1127.getClass(), "nano", 362260580);
        setField(term1122, term1122.getClass(), "time", term1127);
        setField(term1105, term1105.getClass(), "createdAt", term1122);
        setIntField(term1133, term1133.getClass(), "year", 2010);
        setShortField(term1133, term1133.getClass(), "month", (short) 9);
        setShortField(term1133, term1133.getClass(), "day", (short) 28);
        setField(term1132, term1132.getClass(), "date", term1133);
        setByteField(term1137, term1137.getClass(), "hour", (byte) 6);
        setByteField(term1137, term1137.getClass(), "minute", (byte) 4);
        setByteField(term1137, term1137.getClass(), "second", (byte) 54);
        setIntField(term1137, term1137.getClass(), "nano", 604713782);
        setField(term1132, term1132.getClass(), "time", term1137);
        setField(term1105, term1105.getClass(), "updatedAt", term1132);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.skyg0d.spring.jwt.model.Role");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.skyg0d.spring.jwt.model.ERole");
        Object[] args = new Object[1];
        args[0] = enum3;
        callMethod(klass, "setName", argTypes, term1105, args);
    }

};


