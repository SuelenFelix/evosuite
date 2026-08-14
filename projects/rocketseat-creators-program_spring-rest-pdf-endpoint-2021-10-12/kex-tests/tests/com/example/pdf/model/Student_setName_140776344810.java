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

public class Student_setName_140776344810 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1570;

    public Student_setName_140776344810() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term1570 = newInstance(Class.forName("com.example.pdf.model.Student"));
        Object term1619 = newInstance(Class.forName("java.time.LocalDate"));
        Object term1623 = newInstance(Class.forName("com.example.pdf.model.School"));
        Object term1648 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term1649 = newInstance(Class.forName("java.time.LocalDate"));
        Object term1653 = newInstance(Class.forName("java.time.LocalTime"));
        Object term1658 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term1659 = newInstance(Class.forName("java.time.LocalDate"));
        Object term1663 = newInstance(Class.forName("java.time.LocalTime"));
        setField(term1570, term1570.getClass(), "id", "ieCtQFdkii");
        setField(term1570, term1570.getClass(), "name", "dEnhdmILtU");
        setField(term1570, term1570.getClass(), "email", "hoicvmsovO");
        setField(term1570, term1570.getClass(), "password", "eqJfYWRaEL");
        setIntField(term1619, term1619.getClass(), "year", 2026);
        setShortField(term1619, term1619.getClass(), "month", (short) 12);
        setShortField(term1619, term1619.getClass(), "day", (short) 13);
        setField(term1570, term1570.getClass(), "birthday", term1619);
        setField(term1623, term1623.getClass(), "id", "fhkbdRViHi");
        setField(term1623, term1623.getClass(), "name", "uWHnvSvaPl");
        setIntField(term1649, term1649.getClass(), "year", 2020);
        setShortField(term1649, term1649.getClass(), "month", (short) 7);
        setShortField(term1649, term1649.getClass(), "day", (short) 24);
        setField(term1648, term1648.getClass(), "date", term1649);
        setByteField(term1653, term1653.getClass(), "hour", (byte) 0);
        setByteField(term1653, term1653.getClass(), "minute", (byte) 59);
        setByteField(term1653, term1653.getClass(), "second", (byte) 56);
        setIntField(term1653, term1653.getClass(), "nano", 320219201);
        setField(term1648, term1648.getClass(), "time", term1653);
        setField(term1623, term1623.getClass(), "createdAt", term1648);
        setField(term1570, term1570.getClass(), "school", term1623);
        setIntField(term1659, term1659.getClass(), "year", 2014);
        setShortField(term1659, term1659.getClass(), "month", (short) 7);
        setShortField(term1659, term1659.getClass(), "day", (short) 13);
        setField(term1658, term1658.getClass(), "date", term1659);
        setByteField(term1663, term1663.getClass(), "hour", (byte) 21);
        setByteField(term1663, term1663.getClass(), "minute", (byte) 46);
        setByteField(term1663, term1663.getClass(), "second", (byte) 0);
        setIntField(term1663, term1663.getClass(), "nano", 887884128);
        setField(term1658, term1658.getClass(), "time", term1663);
        setField(term1570, term1570.getClass(), "createdAt", term1658);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.example.pdf.model.Student");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "kBdSllIBVz";
        callMethod(klass, "setName", argTypes, term1570, args);
    }

};


