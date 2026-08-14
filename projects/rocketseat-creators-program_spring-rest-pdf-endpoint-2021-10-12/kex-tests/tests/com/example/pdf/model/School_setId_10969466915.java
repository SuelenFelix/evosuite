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

public class School_setId_10969466915 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2910;

    public School_setId_10969466915() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term2910 = newInstance(Class.forName("com.example.pdf.model.School"));
        Object term2935 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term2936 = newInstance(Class.forName("java.time.LocalDate"));
        Object term2940 = newInstance(Class.forName("java.time.LocalTime"));
        setField(term2910, term2910.getClass(), "id", "eVpkWxjuki");
        setField(term2910, term2910.getClass(), "name", "SJiQaLvSKv");
        setIntField(term2936, term2936.getClass(), "year", 2010);
        setShortField(term2936, term2936.getClass(), "month", (short) 9);
        setShortField(term2936, term2936.getClass(), "day", (short) 28);
        setField(term2935, term2935.getClass(), "date", term2936);
        setByteField(term2940, term2940.getClass(), "hour", (byte) 6);
        setByteField(term2940, term2940.getClass(), "minute", (byte) 4);
        setByteField(term2940, term2940.getClass(), "second", (byte) 54);
        setIntField(term2940, term2940.getClass(), "nano", 604713782);
        setField(term2935, term2935.getClass(), "time", term2940);
        setField(term2910, term2910.getClass(), "createdAt", term2935);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.example.pdf.model.School");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "OEXDRUKcFl";
        callMethod(klass, "setId", argTypes, term2910, args);
    }

};


