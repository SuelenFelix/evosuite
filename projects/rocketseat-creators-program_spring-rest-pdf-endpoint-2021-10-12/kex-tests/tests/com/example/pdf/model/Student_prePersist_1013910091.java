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

public class Student_prePersist_1013910091 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term126;

    public Student_prePersist_1013910091() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term126 = newInstance(Class.forName("com.example.pdf.model.Student"));
        Object term175 = newInstance(Class.forName("java.time.LocalDate"));
        Object term179 = newInstance(Class.forName("com.example.pdf.model.School"));
        Object term204 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term205 = newInstance(Class.forName("java.time.LocalDate"));
        Object term209 = newInstance(Class.forName("java.time.LocalTime"));
        Object term214 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term215 = newInstance(Class.forName("java.time.LocalDate"));
        Object term219 = newInstance(Class.forName("java.time.LocalTime"));
        setField(term126, term126.getClass(), "id", "EGtDIRbSSb");
        setField(term126, term126.getClass(), "name", "SzjVpOQTyS");
        setField(term126, term126.getClass(), "email", "MjGYSRKTNF");
        setField(term126, term126.getClass(), "password", "hRNSzYYIrc");
        setIntField(term175, term175.getClass(), "year", 2016);
        setShortField(term175, term175.getClass(), "month", (short) 11);
        setShortField(term175, term175.getClass(), "day", (short) 29);
        setField(term126, term126.getClass(), "birthday", term175);
        setField(term179, term179.getClass(), "id", "RMFIsYGgne");
        setField(term179, term179.getClass(), "name", "NRdvgJlhkX");
        setIntField(term205, term205.getClass(), "year", 2021);
        setShortField(term205, term205.getClass(), "month", (short) 1);
        setShortField(term205, term205.getClass(), "day", (short) 18);
        setField(term204, term204.getClass(), "date", term205);
        setByteField(term209, term209.getClass(), "hour", (byte) 13);
        setByteField(term209, term209.getClass(), "minute", (byte) 38);
        setByteField(term209, term209.getClass(), "second", (byte) 26);
        setIntField(term209, term209.getClass(), "nano", 544608644);
        setField(term204, term204.getClass(), "time", term209);
        setField(term179, term179.getClass(), "createdAt", term204);
        setField(term126, term126.getClass(), "school", term179);
        setIntField(term215, term215.getClass(), "year", 2015);
        setShortField(term215, term215.getClass(), "month", (short) 9);
        setShortField(term215, term215.getClass(), "day", (short) 19);
        setField(term214, term214.getClass(), "date", term215);
        setByteField(term219, term219.getClass(), "hour", (byte) 9);
        setByteField(term219, term219.getClass(), "minute", (byte) 4);
        setByteField(term219, term219.getClass(), "second", (byte) 10);
        setIntField(term219, term219.getClass(), "nano", 401765865);
        setField(term214, term214.getClass(), "time", term219);
        setField(term126, term126.getClass(), "createdAt", term214);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.example.pdf.model.Student");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "prePersist", argTypes, term126, args);
    }

};


