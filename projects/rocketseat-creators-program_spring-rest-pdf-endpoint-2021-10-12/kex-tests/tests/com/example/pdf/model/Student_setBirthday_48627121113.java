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

public class Student_setBirthday_48627121113 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2110;
     Object term2208;

    public Student_setBirthday_48627121113() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term2110 = newInstance(Class.forName("com.example.pdf.model.Student"));
        Object term2159 = newInstance(Class.forName("java.time.LocalDate"));
        Object term2163 = newInstance(Class.forName("com.example.pdf.model.School"));
        Object term2188 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term2189 = newInstance(Class.forName("java.time.LocalDate"));
        Object term2193 = newInstance(Class.forName("java.time.LocalTime"));
        Object term2198 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term2199 = newInstance(Class.forName("java.time.LocalDate"));
        Object term2203 = newInstance(Class.forName("java.time.LocalTime"));
        setField(term2110, term2110.getClass(), "id", "VgZnGoIFwQ");
        setField(term2110, term2110.getClass(), "name", "jUbSRrkrYZ");
        setField(term2110, term2110.getClass(), "email", "bWWfajKbEX");
        setField(term2110, term2110.getClass(), "password", "cAPeiZHKGJ");
        setIntField(term2159, term2159.getClass(), "year", 2012);
        setShortField(term2159, term2159.getClass(), "month", (short) 10);
        setShortField(term2159, term2159.getClass(), "day", (short) 1);
        setField(term2110, term2110.getClass(), "birthday", term2159);
        setField(term2163, term2163.getClass(), "id", "LvJFtLBaxj");
        setField(term2163, term2163.getClass(), "name", "PHvxnGHptP");
        setIntField(term2189, term2189.getClass(), "year", 2023);
        setShortField(term2189, term2189.getClass(), "month", (short) 9);
        setShortField(term2189, term2189.getClass(), "day", (short) 23);
        setField(term2188, term2188.getClass(), "date", term2189);
        setByteField(term2193, term2193.getClass(), "hour", (byte) 12);
        setByteField(term2193, term2193.getClass(), "minute", (byte) 55);
        setByteField(term2193, term2193.getClass(), "second", (byte) 58);
        setIntField(term2193, term2193.getClass(), "nano", 159178396);
        setField(term2188, term2188.getClass(), "time", term2193);
        setField(term2163, term2163.getClass(), "createdAt", term2188);
        setField(term2110, term2110.getClass(), "school", term2163);
        setIntField(term2199, term2199.getClass(), "year", 2028);
        setShortField(term2199, term2199.getClass(), "month", (short) 10);
        setShortField(term2199, term2199.getClass(), "day", (short) 1);
        setField(term2198, term2198.getClass(), "date", term2199);
        setByteField(term2203, term2203.getClass(), "hour", (byte) 17);
        setByteField(term2203, term2203.getClass(), "minute", (byte) 29);
        setByteField(term2203, term2203.getClass(), "second", (byte) 30);
        setIntField(term2203, term2203.getClass(), "nano", 845472306);
        setField(term2198, term2198.getClass(), "time", term2203);
        setField(term2110, term2110.getClass(), "createdAt", term2198);
        term2208 = newInstance(Class.forName("java.time.LocalDate"));
        setIntField(term2208, term2208.getClass(), "year", 2024);
        setShortField(term2208, term2208.getClass(), "month", (short) 1);
        setShortField(term2208, term2208.getClass(), "day", (short) 24);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.example.pdf.model.Student");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.time.LocalDate");
        Object[] args = new Object[1];
        args[0] = term2208;
        callMethod(klass, "setBirthday", argTypes, term2110, args);
    }

};


