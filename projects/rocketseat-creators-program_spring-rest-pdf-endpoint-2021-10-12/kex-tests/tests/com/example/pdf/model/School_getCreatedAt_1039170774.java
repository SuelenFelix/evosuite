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

public class School_getCreatedAt_1039170774 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2855;

    public School_getCreatedAt_1039170774() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term2855 = newInstance(Class.forName("com.example.pdf.model.School"));
        Object term2880 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term2881 = newInstance(Class.forName("java.time.LocalDate"));
        Object term2885 = newInstance(Class.forName("java.time.LocalTime"));
        setField(term2855, term2855.getClass(), "id", "ZVecLZMLHF");
        setField(term2855, term2855.getClass(), "name", "fztQhjqwdP");
        setIntField(term2881, term2881.getClass(), "year", 2010);
        setShortField(term2881, term2881.getClass(), "month", (short) 1);
        setShortField(term2881, term2881.getClass(), "day", (short) 17);
        setField(term2880, term2880.getClass(), "date", term2881);
        setByteField(term2885, term2885.getClass(), "hour", (byte) 13);
        setByteField(term2885, term2885.getClass(), "minute", (byte) 5);
        setByteField(term2885, term2885.getClass(), "second", (byte) 51);
        setIntField(term2885, term2885.getClass(), "nano", 362260580);
        setField(term2880, term2880.getClass(), "time", term2885);
        setField(term2855, term2855.getClass(), "createdAt", term2880);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.example.pdf.model.School");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getCreatedAt", argTypes, term2855, args);
    }

};


