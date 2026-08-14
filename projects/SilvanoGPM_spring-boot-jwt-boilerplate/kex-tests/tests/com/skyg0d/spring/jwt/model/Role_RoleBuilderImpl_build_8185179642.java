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

public class Role_RoleBuilderImpl_build_8185179642 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2681;

    public Role_RoleBuilderImpl_build_8185179642() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term2724 = Class.forName((String) "com.skyg0d.spring.jwt.model.ERole");
        Field term2723 = ((Class) term2724).getDeclaredField((String) "ROLE_MODERATOR");
        ((Field) term2723).setAccessible(true);
        Object enum5 = ((Field) term2723).get((Object) null);
        term2681 = newInstance(Class.forName("com.skyg0d.spring.jwt.model.Role$RoleBuilderImpl"));
        Object term2700 = newInstance(Class.forName("java.util.UUID"));
        Object term2703 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term2704 = newInstance(Class.forName("java.time.LocalDate"));
        Object term2708 = newInstance(Class.forName("java.time.LocalTime"));
        Object term2713 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term2714 = newInstance(Class.forName("java.time.LocalDate"));
        Object term2718 = newInstance(Class.forName("java.time.LocalTime"));
        setField(term2681, term2681.getClass(), "name", enum5);
        setLongField(term2700, term2700.getClass(), "mostSigBits", 5953383087795962419L);
        setLongField(term2700, term2700.getClass(), "leastSigBits", 7994303628307559416L);
        setField(term2681, term2681.getClass(), "id", term2700);
        setIntField(term2704, term2704.getClass(), "year", 2016);
        setShortField(term2704, term2704.getClass(), "month", (short) 2);
        setShortField(term2704, term2704.getClass(), "day", (short) 25);
        setField(term2703, term2703.getClass(), "date", term2704);
        setByteField(term2708, term2708.getClass(), "hour", (byte) 8);
        setByteField(term2708, term2708.getClass(), "minute", (byte) 54);
        setByteField(term2708, term2708.getClass(), "second", (byte) 40);
        setIntField(term2708, term2708.getClass(), "nano", 124525896);
        setField(term2703, term2703.getClass(), "time", term2708);
        setField(term2681, term2681.getClass(), "createdAt", term2703);
        setIntField(term2714, term2714.getClass(), "year", 2029);
        setShortField(term2714, term2714.getClass(), "month", (short) 1);
        setShortField(term2714, term2714.getClass(), "day", (short) 10);
        setField(term2713, term2713.getClass(), "date", term2714);
        setByteField(term2718, term2718.getClass(), "hour", (byte) 8);
        setByteField(term2718, term2718.getClass(), "minute", (byte) 46);
        setByteField(term2718, term2718.getClass(), "second", (byte) 35);
        setIntField(term2718, term2718.getClass(), "nano", 58807194);
        setField(term2713, term2713.getClass(), "time", term2718);
        setField(term2681, term2681.getClass(), "updatedAt", term2713);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.skyg0d.spring.jwt.model.Role$RoleBuilderImpl");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "build", argTypes, term2681, args);
    }

};


