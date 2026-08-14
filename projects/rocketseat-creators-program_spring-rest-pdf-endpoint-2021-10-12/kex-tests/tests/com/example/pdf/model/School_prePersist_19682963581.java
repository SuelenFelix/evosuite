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

public class School_prePersist_19682963581 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2690;

    public School_prePersist_19682963581() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term2690 = newInstance(Class.forName("com.example.pdf.model.School"));
        Object term2715 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term2716 = newInstance(Class.forName("java.time.LocalDate"));
        Object term2720 = newInstance(Class.forName("java.time.LocalTime"));
        setField(term2690, term2690.getClass(), "id", "AWRooQKkdW");
        setField(term2690, term2690.getClass(), "name", "vjxIhXHxGR");
        setIntField(term2716, term2716.getClass(), "year", 2010);
        setShortField(term2716, term2716.getClass(), "month", (short) 6);
        setShortField(term2716, term2716.getClass(), "day", (short) 14);
        setField(term2715, term2715.getClass(), "date", term2716);
        setByteField(term2720, term2720.getClass(), "hour", (byte) 6);
        setByteField(term2720, term2720.getClass(), "minute", (byte) 22);
        setByteField(term2720, term2720.getClass(), "second", (byte) 20);
        setIntField(term2720, term2720.getClass(), "nano", 25133051);
        setField(term2715, term2715.getClass(), "time", term2720);
        setField(term2690, term2690.getClass(), "createdAt", term2715);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.example.pdf.model.School");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "prePersist", argTypes, term2690, args);
    }

};


