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

public class School_getName_21159488273 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2800;

    public School_getName_21159488273() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term2800 = newInstance(Class.forName("com.example.pdf.model.School"));
        Object term2825 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term2826 = newInstance(Class.forName("java.time.LocalDate"));
        Object term2830 = newInstance(Class.forName("java.time.LocalTime"));
        setField(term2800, term2800.getClass(), "id", "xBsXSDjXYK");
        setField(term2800, term2800.getClass(), "name", "sEnIVFtZuQ");
        setIntField(term2826, term2826.getClass(), "year", 2024);
        setShortField(term2826, term2826.getClass(), "month", (short) 4);
        setShortField(term2826, term2826.getClass(), "day", (short) 24);
        setField(term2825, term2825.getClass(), "date", term2826);
        setByteField(term2830, term2830.getClass(), "hour", (byte) 7);
        setByteField(term2830, term2830.getClass(), "minute", (byte) 2);
        setByteField(term2830, term2830.getClass(), "second", (byte) 51);
        setIntField(term2830, term2830.getClass(), "nano", 635502964);
        setField(term2825, term2825.getClass(), "time", term2830);
        setField(term2800, term2800.getClass(), "createdAt", term2825);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.example.pdf.model.School");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getName", argTypes, term2800, args);
    }

};


