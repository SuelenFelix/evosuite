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

public class Student_setEmail_198011929111 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1750;

    public Student_setEmail_198011929111() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term1750 = newInstance(Class.forName("com.example.pdf.model.Student"));
        Object term1799 = newInstance(Class.forName("java.time.LocalDate"));
        Object term1803 = newInstance(Class.forName("com.example.pdf.model.School"));
        Object term1828 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term1829 = newInstance(Class.forName("java.time.LocalDate"));
        Object term1833 = newInstance(Class.forName("java.time.LocalTime"));
        Object term1838 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term1839 = newInstance(Class.forName("java.time.LocalDate"));
        Object term1843 = newInstance(Class.forName("java.time.LocalTime"));
        setField(term1750, term1750.getClass(), "id", "TJmVBGfTML");
        setField(term1750, term1750.getClass(), "name", "tPlsykYBqO");
        setField(term1750, term1750.getClass(), "email", "bLPjGVBhlX");
        setField(term1750, term1750.getClass(), "password", "whBvTVIIlC");
        setIntField(term1799, term1799.getClass(), "year", 2020);
        setShortField(term1799, term1799.getClass(), "month", (short) 5);
        setShortField(term1799, term1799.getClass(), "day", (short) 14);
        setField(term1750, term1750.getClass(), "birthday", term1799);
        setField(term1803, term1803.getClass(), "id", "IgRJUzaCwW");
        setField(term1803, term1803.getClass(), "name", "JUmudUmaaV");
        setIntField(term1829, term1829.getClass(), "year", 2023);
        setShortField(term1829, term1829.getClass(), "month", (short) 3);
        setShortField(term1829, term1829.getClass(), "day", (short) 7);
        setField(term1828, term1828.getClass(), "date", term1829);
        setByteField(term1833, term1833.getClass(), "hour", (byte) 21);
        setByteField(term1833, term1833.getClass(), "minute", (byte) 15);
        setByteField(term1833, term1833.getClass(), "second", (byte) 43);
        setIntField(term1833, term1833.getClass(), "nano", 639721472);
        setField(term1828, term1828.getClass(), "time", term1833);
        setField(term1803, term1803.getClass(), "createdAt", term1828);
        setField(term1750, term1750.getClass(), "school", term1803);
        setIntField(term1839, term1839.getClass(), "year", 2015);
        setShortField(term1839, term1839.getClass(), "month", (short) 3);
        setShortField(term1839, term1839.getClass(), "day", (short) 10);
        setField(term1838, term1838.getClass(), "date", term1839);
        setByteField(term1843, term1843.getClass(), "hour", (byte) 23);
        setByteField(term1843, term1843.getClass(), "minute", (byte) 34);
        setByteField(term1843, term1843.getClass(), "second", (byte) 44);
        setIntField(term1843, term1843.getClass(), "nano", 587322824);
        setField(term1838, term1838.getClass(), "time", term1843);
        setField(term1750, term1750.getClass(), "createdAt", term1838);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.example.pdf.model.Student");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "KoyGrUJeJW";
        callMethod(klass, "setEmail", argTypes, term1750, args);
    }

};


