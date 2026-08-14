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

public class Student_getName_3121131203 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term442;

    public Student_getName_3121131203() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term442 = newInstance(Class.forName("com.example.pdf.model.Student"));
        Object term491 = newInstance(Class.forName("java.time.LocalDate"));
        Object term495 = newInstance(Class.forName("com.example.pdf.model.School"));
        Object term520 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term521 = newInstance(Class.forName("java.time.LocalDate"));
        Object term525 = newInstance(Class.forName("java.time.LocalTime"));
        Object term530 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term531 = newInstance(Class.forName("java.time.LocalDate"));
        Object term535 = newInstance(Class.forName("java.time.LocalTime"));
        setField(term442, term442.getClass(), "id", "tbcdzjIfER");
        setField(term442, term442.getClass(), "name", "HyxfbSQYBe");
        setField(term442, term442.getClass(), "email", "pCTimMblYc");
        setField(term442, term442.getClass(), "password", "hNxWaHcfhY");
        setIntField(term491, term491.getClass(), "year", 2020);
        setShortField(term491, term491.getClass(), "month", (short) 11);
        setShortField(term491, term491.getClass(), "day", (short) 22);
        setField(term442, term442.getClass(), "birthday", term491);
        setField(term495, term495.getClass(), "id", "RkybSrpybU");
        setField(term495, term495.getClass(), "name", "xOEqzGAmDU");
        setIntField(term521, term521.getClass(), "year", 2026);
        setShortField(term521, term521.getClass(), "month", (short) 12);
        setShortField(term521, term521.getClass(), "day", (short) 14);
        setField(term520, term520.getClass(), "date", term521);
        setByteField(term525, term525.getClass(), "hour", (byte) 16);
        setByteField(term525, term525.getClass(), "minute", (byte) 34);
        setByteField(term525, term525.getClass(), "second", (byte) 9);
        setIntField(term525, term525.getClass(), "nano", 518326996);
        setField(term520, term520.getClass(), "time", term525);
        setField(term495, term495.getClass(), "createdAt", term520);
        setField(term442, term442.getClass(), "school", term495);
        setIntField(term531, term531.getClass(), "year", 2025);
        setShortField(term531, term531.getClass(), "month", (short) 4);
        setShortField(term531, term531.getClass(), "day", (short) 24);
        setField(term530, term530.getClass(), "date", term531);
        setByteField(term535, term535.getClass(), "hour", (byte) 18);
        setByteField(term535, term535.getClass(), "minute", (byte) 11);
        setByteField(term535, term535.getClass(), "second", (byte) 40);
        setIntField(term535, term535.getClass(), "nano", 137454929);
        setField(term530, term530.getClass(), "time", term535);
        setField(term442, term442.getClass(), "createdAt", term530);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.example.pdf.model.Student");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getName", argTypes, term442, args);
    }

};


