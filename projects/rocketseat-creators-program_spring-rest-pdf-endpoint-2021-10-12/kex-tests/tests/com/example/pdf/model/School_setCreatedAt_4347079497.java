package com.example.pdf.model;

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
import static com.example.pdf.model.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;

public class School_setCreatedAt_4347079497 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term3064;
     Object term3099;

    public School_setCreatedAt_4347079497() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term3064 = newInstance(Class.forName("com.example.pdf.model.School"));
        Object term3089 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term3090 = newInstance(Class.forName("java.time.LocalDate"));
        Object term3094 = newInstance(Class.forName("java.time.LocalTime"));
        setField(term3064, term3064.getClass(), "id", "iNwOJRBEjp");
        setField(term3064, term3064.getClass(), "name", "XylxrMBraH");
        setIntField(term3090, term3090.getClass(), "year", 2018);
        setShortField(term3090, term3090.getClass(), "month", (short) 7);
        setShortField(term3090, term3090.getClass(), "day", (short) 12);
        setField(term3089, term3089.getClass(), "date", term3090);
        setByteField(term3094, term3094.getClass(), "hour", (byte) 1);
        setByteField(term3094, term3094.getClass(), "minute", (byte) 3);
        setByteField(term3094, term3094.getClass(), "second", (byte) 47);
        setIntField(term3094, term3094.getClass(), "nano", 2729929);
        setField(term3089, term3089.getClass(), "time", term3094);
        setField(term3064, term3064.getClass(), "createdAt", term3089);
        term3099 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term3100 = newInstance(Class.forName("java.time.LocalDate"));
        Object term3104 = newInstance(Class.forName("java.time.LocalTime"));
        setIntField(term3100, term3100.getClass(), "year", 2015);
        setShortField(term3100, term3100.getClass(), "month", (short) 12);
        setShortField(term3100, term3100.getClass(), "day", (short) 23);
        setField(term3099, term3099.getClass(), "date", term3100);
        setByteField(term3104, term3104.getClass(), "hour", (byte) 14);
        setByteField(term3104, term3104.getClass(), "minute", (byte) 17);
        setByteField(term3104, term3104.getClass(), "second", (byte) 50);
        setIntField(term3104, term3104.getClass(), "nano", 325544804);
        setField(term3099, term3099.getClass(), "time", term3104);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.example.pdf.model.School");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.time.LocalDateTime");
        Object[] args = new Object[1];
        args[0] = term3099;
        callMethod(klass, "setCreatedAt", argTypes, term3064, args);
    }

};


