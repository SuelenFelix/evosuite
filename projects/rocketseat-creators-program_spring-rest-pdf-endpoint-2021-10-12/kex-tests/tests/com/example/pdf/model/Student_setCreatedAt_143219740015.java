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

public class Student_setCreatedAt_143219740015 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2485;
     Object term2583;

    public Student_setCreatedAt_143219740015() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term2485 = newInstance(Class.forName("com.example.pdf.model.Student"));
        Object term2534 = newInstance(Class.forName("java.time.LocalDate"));
        Object term2538 = newInstance(Class.forName("com.example.pdf.model.School"));
        Object term2563 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term2564 = newInstance(Class.forName("java.time.LocalDate"));
        Object term2568 = newInstance(Class.forName("java.time.LocalTime"));
        Object term2573 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term2574 = newInstance(Class.forName("java.time.LocalDate"));
        Object term2578 = newInstance(Class.forName("java.time.LocalTime"));
        setField(term2485, term2485.getClass(), "id", "DfISiziTgG");
        setField(term2485, term2485.getClass(), "name", "XqgfKFvPSD");
        setField(term2485, term2485.getClass(), "email", "JiVRgTZvKc");
        setField(term2485, term2485.getClass(), "password", "XPKmummaqg");
        setIntField(term2534, term2534.getClass(), "year", 2029);
        setShortField(term2534, term2534.getClass(), "month", (short) 8);
        setShortField(term2534, term2534.getClass(), "day", (short) 28);
        setField(term2485, term2485.getClass(), "birthday", term2534);
        setField(term2538, term2538.getClass(), "id", "BKLfkLiZTH");
        setField(term2538, term2538.getClass(), "name", "SPpkrGcPRr");
        setIntField(term2564, term2564.getClass(), "year", 2016);
        setShortField(term2564, term2564.getClass(), "month", (short) 6);
        setShortField(term2564, term2564.getClass(), "day", (short) 15);
        setField(term2563, term2563.getClass(), "date", term2564);
        setByteField(term2568, term2568.getClass(), "hour", (byte) 21);
        setByteField(term2568, term2568.getClass(), "minute", (byte) 23);
        setByteField(term2568, term2568.getClass(), "second", (byte) 23);
        setIntField(term2568, term2568.getClass(), "nano", 433372070);
        setField(term2563, term2563.getClass(), "time", term2568);
        setField(term2538, term2538.getClass(), "createdAt", term2563);
        setField(term2485, term2485.getClass(), "school", term2538);
        setIntField(term2574, term2574.getClass(), "year", 2012);
        setShortField(term2574, term2574.getClass(), "month", (short) 8);
        setShortField(term2574, term2574.getClass(), "day", (short) 25);
        setField(term2573, term2573.getClass(), "date", term2574);
        setByteField(term2578, term2578.getClass(), "hour", (byte) 19);
        setByteField(term2578, term2578.getClass(), "minute", (byte) 49);
        setByteField(term2578, term2578.getClass(), "second", (byte) 8);
        setIntField(term2578, term2578.getClass(), "nano", 912685024);
        setField(term2573, term2573.getClass(), "time", term2578);
        setField(term2485, term2485.getClass(), "createdAt", term2573);
        term2583 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term2584 = newInstance(Class.forName("java.time.LocalDate"));
        Object term2588 = newInstance(Class.forName("java.time.LocalTime"));
        setIntField(term2584, term2584.getClass(), "year", 2012);
        setShortField(term2584, term2584.getClass(), "month", (short) 3);
        setShortField(term2584, term2584.getClass(), "day", (short) 27);
        setField(term2583, term2583.getClass(), "date", term2584);
        setByteField(term2588, term2588.getClass(), "hour", (byte) 17);
        setByteField(term2588, term2588.getClass(), "minute", (byte) 49);
        setByteField(term2588, term2588.getClass(), "second", (byte) 24);
        setIntField(term2588, term2588.getClass(), "nano", 530647398);
        setField(term2583, term2583.getClass(), "time", term2588);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.example.pdf.model.Student");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.time.LocalDateTime");
        Object[] args = new Object[1];
        args[0] = term2583;
        callMethod(klass, "setCreatedAt", argTypes, term2485, args);
    }

};


