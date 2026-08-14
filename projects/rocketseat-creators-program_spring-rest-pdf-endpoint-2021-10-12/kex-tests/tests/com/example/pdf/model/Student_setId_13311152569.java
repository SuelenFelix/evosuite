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

public class Student_setId_13311152569 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1390;

    public Student_setId_13311152569() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term1390 = newInstance(Class.forName("com.example.pdf.model.Student"));
        Object term1439 = newInstance(Class.forName("java.time.LocalDate"));
        Object term1443 = newInstance(Class.forName("com.example.pdf.model.School"));
        Object term1468 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term1469 = newInstance(Class.forName("java.time.LocalDate"));
        Object term1473 = newInstance(Class.forName("java.time.LocalTime"));
        Object term1478 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term1479 = newInstance(Class.forName("java.time.LocalDate"));
        Object term1483 = newInstance(Class.forName("java.time.LocalTime"));
        setField(term1390, term1390.getClass(), "id", "JDswTTCZHV");
        setField(term1390, term1390.getClass(), "name", "onpbIeEKoi");
        setField(term1390, term1390.getClass(), "email", "YRHGsAkhxb");
        setField(term1390, term1390.getClass(), "password", "ffYhPOzlUs");
        setIntField(term1439, term1439.getClass(), "year", 2017);
        setShortField(term1439, term1439.getClass(), "month", (short) 7);
        setShortField(term1439, term1439.getClass(), "day", (short) 22);
        setField(term1390, term1390.getClass(), "birthday", term1439);
        setField(term1443, term1443.getClass(), "id", "MLqYREekMl");
        setField(term1443, term1443.getClass(), "name", "ytSBIKXogI");
        setIntField(term1469, term1469.getClass(), "year", 2029);
        setShortField(term1469, term1469.getClass(), "month", (short) 6);
        setShortField(term1469, term1469.getClass(), "day", (short) 23);
        setField(term1468, term1468.getClass(), "date", term1469);
        setByteField(term1473, term1473.getClass(), "hour", (byte) 21);
        setByteField(term1473, term1473.getClass(), "minute", (byte) 55);
        setByteField(term1473, term1473.getClass(), "second", (byte) 27);
        setIntField(term1473, term1473.getClass(), "nano", 66889274);
        setField(term1468, term1468.getClass(), "time", term1473);
        setField(term1443, term1443.getClass(), "createdAt", term1468);
        setField(term1390, term1390.getClass(), "school", term1443);
        setIntField(term1479, term1479.getClass(), "year", 2017);
        setShortField(term1479, term1479.getClass(), "month", (short) 3);
        setShortField(term1479, term1479.getClass(), "day", (short) 5);
        setField(term1478, term1478.getClass(), "date", term1479);
        setByteField(term1483, term1483.getClass(), "hour", (byte) 20);
        setByteField(term1483, term1483.getClass(), "minute", (byte) 34);
        setByteField(term1483, term1483.getClass(), "second", (byte) 55);
        setIntField(term1483, term1483.getClass(), "nano", 78024496);
        setField(term1478, term1478.getClass(), "time", term1483);
        setField(term1390, term1390.getClass(), "createdAt", term1478);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.example.pdf.model.Student");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "nHXjMycHlU";
        callMethod(klass, "setId", argTypes, term1390, args);
    }

};


