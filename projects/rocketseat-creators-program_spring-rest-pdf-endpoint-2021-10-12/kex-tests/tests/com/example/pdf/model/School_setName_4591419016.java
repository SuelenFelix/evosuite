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

public class School_setName_4591419016 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2987;

    public School_setName_4591419016() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term2987 = newInstance(Class.forName("com.example.pdf.model.School"));
        Object term3012 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term3013 = newInstance(Class.forName("java.time.LocalDate"));
        Object term3017 = newInstance(Class.forName("java.time.LocalTime"));
        setField(term2987, term2987.getClass(), "id", "RYdKCNNMBR");
        setField(term2987, term2987.getClass(), "name", "yGtHPyvYiQ");
        setIntField(term3013, term3013.getClass(), "year", 2023);
        setShortField(term3013, term3013.getClass(), "month", (short) 7);
        setShortField(term3013, term3013.getClass(), "day", (short) 16);
        setField(term3012, term3012.getClass(), "date", term3013);
        setByteField(term3017, term3017.getClass(), "hour", (byte) 3);
        setByteField(term3017, term3017.getClass(), "minute", (byte) 1);
        setByteField(term3017, term3017.getClass(), "second", (byte) 19);
        setIntField(term3017, term3017.getClass(), "nano", 488629554);
        setField(term3012, term3012.getClass(), "time", term3017);
        setField(term2987, term2987.getClass(), "createdAt", term3012);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.example.pdf.model.School");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "MvRIxilFMJ";
        callMethod(klass, "setName", argTypes, term2987, args);
    }

};


