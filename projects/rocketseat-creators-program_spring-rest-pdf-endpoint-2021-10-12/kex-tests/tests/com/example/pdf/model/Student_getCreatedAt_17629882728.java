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

public class Student_getCreatedAt_17629882728 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1232;

    public Student_getCreatedAt_17629882728() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term1232 = newInstance(Class.forName("com.example.pdf.model.Student"));
        Object term1281 = newInstance(Class.forName("java.time.LocalDate"));
        Object term1285 = newInstance(Class.forName("com.example.pdf.model.School"));
        Object term1310 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term1311 = newInstance(Class.forName("java.time.LocalDate"));
        Object term1315 = newInstance(Class.forName("java.time.LocalTime"));
        Object term1320 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term1321 = newInstance(Class.forName("java.time.LocalDate"));
        Object term1325 = newInstance(Class.forName("java.time.LocalTime"));
        setField(term1232, term1232.getClass(), "id", "LvtrsXUliU");
        setField(term1232, term1232.getClass(), "name", "xLbjWUgOIL");
        setField(term1232, term1232.getClass(), "email", "jDtqGUpnZN");
        setField(term1232, term1232.getClass(), "password", "nGKItKLYNC");
        setIntField(term1281, term1281.getClass(), "year", 2022);
        setShortField(term1281, term1281.getClass(), "month", (short) 2);
        setShortField(term1281, term1281.getClass(), "day", (short) 25);
        setField(term1232, term1232.getClass(), "birthday", term1281);
        setField(term1285, term1285.getClass(), "id", "UiUYnPrcCi");
        setField(term1285, term1285.getClass(), "name", "UoYtihxVaS");
        setIntField(term1311, term1311.getClass(), "year", 2017);
        setShortField(term1311, term1311.getClass(), "month", (short) 6);
        setShortField(term1311, term1311.getClass(), "day", (short) 8);
        setField(term1310, term1310.getClass(), "date", term1311);
        setByteField(term1315, term1315.getClass(), "hour", (byte) 0);
        setByteField(term1315, term1315.getClass(), "minute", (byte) 18);
        setByteField(term1315, term1315.getClass(), "second", (byte) 55);
        setIntField(term1315, term1315.getClass(), "nano", 680586717);
        setField(term1310, term1310.getClass(), "time", term1315);
        setField(term1285, term1285.getClass(), "createdAt", term1310);
        setField(term1232, term1232.getClass(), "school", term1285);
        setIntField(term1321, term1321.getClass(), "year", 2015);
        setShortField(term1321, term1321.getClass(), "month", (short) 9);
        setShortField(term1321, term1321.getClass(), "day", (short) 16);
        setField(term1320, term1320.getClass(), "date", term1321);
        setByteField(term1325, term1325.getClass(), "hour", (byte) 6);
        setByteField(term1325, term1325.getClass(), "minute", (byte) 19);
        setByteField(term1325, term1325.getClass(), "second", (byte) 42);
        setIntField(term1325, term1325.getClass(), "nano", 630084975);
        setField(term1320, term1320.getClass(), "time", term1325);
        setField(term1232, term1232.getClass(), "createdAt", term1320);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.example.pdf.model.Student");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getCreatedAt", argTypes, term1232, args);
    }

};


