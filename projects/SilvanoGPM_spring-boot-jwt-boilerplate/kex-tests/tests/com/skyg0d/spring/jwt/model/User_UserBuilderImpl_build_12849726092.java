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

public class User_UserBuilderImpl_build_12849726092 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term4372;

    public User_UserBuilderImpl_build_12849726092() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term4410 = new HashMap();
        Set<Object> term4468 =  ((Map) term4410).keySet();
        HashSet term4409 = new HashSet((Collection<? extends Object>) term4468);
        term4372 = newInstance(Class.forName("com.skyg0d.spring.jwt.model.User$UserBuilderImpl"));
        Object term4415 = newInstance(Class.forName("java.util.UUID"));
        Object term4418 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term4419 = newInstance(Class.forName("java.time.LocalDate"));
        Object term4423 = newInstance(Class.forName("java.time.LocalTime"));
        Object term4428 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term4429 = newInstance(Class.forName("java.time.LocalDate"));
        Object term4433 = newInstance(Class.forName("java.time.LocalTime"));
        setField(term4372, term4372.getClass(), "username", "fhkbdRViHi");
        setField(term4372, term4372.getClass(), "email", "uWHnvSvaPl");
        setField(term4372, term4372.getClass(), "password", "kBdSllIBVz");
        setField(term4372, term4372.getClass(), "roles", term4409);
        setLongField(term4415, term4415.getClass(), "mostSigBits", -8652538484981166496L);
        setLongField(term4415, term4415.getClass(), "leastSigBits", 2701184207686293431L);
        setField(term4372, term4372.getClass(), "id", term4415);
        setIntField(term4419, term4419.getClass(), "year", 2020);
        setShortField(term4419, term4419.getClass(), "month", (short) 5);
        setShortField(term4419, term4419.getClass(), "day", (short) 12);
        setField(term4418, term4418.getClass(), "date", term4419);
        setByteField(term4423, term4423.getClass(), "hour", (byte) 0);
        setByteField(term4423, term4423.getClass(), "minute", (byte) 15);
        setByteField(term4423, term4423.getClass(), "second", (byte) 24);
        setIntField(term4423, term4423.getClass(), "nano", 250257744);
        setField(term4418, term4418.getClass(), "time", term4423);
        setField(term4372, term4372.getClass(), "createdAt", term4418);
        setIntField(term4429, term4429.getClass(), "year", 2013);
        setShortField(term4429, term4429.getClass(), "month", (short) 9);
        setShortField(term4429, term4429.getClass(), "day", (short) 19);
        setField(term4428, term4428.getClass(), "date", term4429);
        setByteField(term4433, term4433.getClass(), "hour", (byte) 12);
        setByteField(term4433, term4433.getClass(), "minute", (byte) 29);
        setByteField(term4433, term4433.getClass(), "second", (byte) 28);
        setIntField(term4433, term4433.getClass(), "nano", 244069764);
        setField(term4428, term4428.getClass(), "time", term4433);
        setField(term4372, term4372.getClass(), "updatedAt", term4428);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.skyg0d.spring.jwt.model.User$UserBuilderImpl");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "build", argTypes, term4372, args);
    }

};


