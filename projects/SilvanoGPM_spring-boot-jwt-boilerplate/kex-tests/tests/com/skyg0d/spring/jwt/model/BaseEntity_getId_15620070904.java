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
import java.lang.Object;

public class BaseEntity_getId_15620070904 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term128;

    public BaseEntity_getId_15620070904() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term128 = newInstance(Class.forName("com.skyg0d.spring.jwt.model.BaseEntity"));
        Object term129 = newInstance(Class.forName("java.util.UUID"));
        Object term132 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term133 = newInstance(Class.forName("java.time.LocalDate"));
        Object term137 = newInstance(Class.forName("java.time.LocalTime"));
        Object term142 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term143 = newInstance(Class.forName("java.time.LocalDate"));
        Object term147 = newInstance(Class.forName("java.time.LocalTime"));
        setLongField(term129, term129.getClass(), "mostSigBits", -5476826692763582090L);
        setLongField(term129, term129.getClass(), "leastSigBits", -872011222785455006L);
        setField(term128, term128.getClass(), "id", term129);
        setIntField(term133, term133.getClass(), "year", 2012);
        setShortField(term133, term133.getClass(), "month", (short) 2);
        setShortField(term133, term133.getClass(), "day", (short) 19);
        setField(term132, term132.getClass(), "date", term133);
        setByteField(term137, term137.getClass(), "hour", (byte) 8);
        setByteField(term137, term137.getClass(), "minute", (byte) 4);
        setByteField(term137, term137.getClass(), "second", (byte) 43);
        setIntField(term137, term137.getClass(), "nano", 114930008);
        setField(term132, term132.getClass(), "time", term137);
        setField(term128, term128.getClass(), "createdAt", term132);
        setIntField(term143, term143.getClass(), "year", 2017);
        setShortField(term143, term143.getClass(), "month", (short) 6);
        setShortField(term143, term143.getClass(), "day", (short) 8);
        setField(term142, term142.getClass(), "date", term143);
        setByteField(term147, term147.getClass(), "hour", (byte) 0);
        setByteField(term147, term147.getClass(), "minute", (byte) 18);
        setByteField(term147, term147.getClass(), "second", (byte) 55);
        setIntField(term147, term147.getClass(), "nano", 680586717);
        setField(term142, term142.getClass(), "time", term147);
        setField(term128, term128.getClass(), "updatedAt", term142);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.skyg0d.spring.jwt.model.BaseEntity");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getId", argTypes, term128, args);
    }

};


