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

public class Student_init_5188441830 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term37;
     Object term41;

    public Student_init_5188441830() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term37 = newInstance(Class.forName("java.time.LocalDate"));
        setIntField(term37, term37.getClass(), "year", 2012);
        setShortField(term37, term37.getClass(), "month", (short) 8);
        setShortField(term37, term37.getClass(), "day", (short) 25);
        term41 = newInstance(Class.forName("com.example.pdf.model.School"));
        Object term66 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term67 = newInstance(Class.forName("java.time.LocalDate"));
        Object term71 = newInstance(Class.forName("java.time.LocalTime"));
        setField(term41, term41.getClass(), "id", "xxtlPwDYFs");
        setField(term41, term41.getClass(), "name", "jJCZpVmanW");
        setIntField(term67, term67.getClass(), "year", 2012);
        setShortField(term67, term67.getClass(), "month", (short) 8);
        setShortField(term67, term67.getClass(), "day", (short) 25);
        setField(term66, term66.getClass(), "date", term67);
        setByteField(term71, term71.getClass(), "hour", (byte) 5);
        setByteField(term71, term71.getClass(), "minute", (byte) 20);
        setByteField(term71, term71.getClass(), "second", (byte) 50);
        setIntField(term71, term71.getClass(), "nano", 345595912);
        setField(term66, term66.getClass(), "time", term71);
        setField(term41, term41.getClass(), "createdAt", term66);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.example.pdf.model.Student");
        Class<?>[] argTypes = new Class<?>[5];
        argTypes[0] = Class.forName("java.lang.String");
        argTypes[1] = Class.forName("java.lang.String");
        argTypes[2] = Class.forName("java.lang.String");
        argTypes[3] = Class.forName("java.time.LocalDate");
        argTypes[4] = Class.forName("com.example.pdf.model.School");
        Object[] args = new Object[5];
        args[0] = "PAEBtnZtTD";
        args[1] = "sjlJAEtRrb";
        args[2] = "MuLcgQHgqz";
        args[3] = term37;
        args[4] = term41;
        Object instance = callConstructor(klass, argTypes, args);
    }

};


