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

public class Student_getId_10307511842 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term284;

    public Student_getId_10307511842() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term284 = newInstance(Class.forName("com.example.pdf.model.Student"));
        Object term333 = newInstance(Class.forName("java.time.LocalDate"));
        Object term337 = newInstance(Class.forName("com.example.pdf.model.School"));
        Object term362 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term363 = newInstance(Class.forName("java.time.LocalDate"));
        Object term367 = newInstance(Class.forName("java.time.LocalTime"));
        Object term372 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term373 = newInstance(Class.forName("java.time.LocalDate"));
        Object term377 = newInstance(Class.forName("java.time.LocalTime"));
        setField(term284, term284.getClass(), "id", "uuaPigETmJ");
        setField(term284, term284.getClass(), "name", "MxlszYVzRf");
        setField(term284, term284.getClass(), "email", "LQFpaHEwXR");
        setField(term284, term284.getClass(), "password", "oVcInYnLWB");
        setIntField(term333, term333.getClass(), "year", 2021);
        setShortField(term333, term333.getClass(), "month", (short) 1);
        setShortField(term333, term333.getClass(), "day", (short) 18);
        setField(term284, term284.getClass(), "birthday", term333);
        setField(term337, term337.getClass(), "id", "aJlieCFVtF");
        setField(term337, term337.getClass(), "name", "ZiaGIbnzTs");
        setIntField(term363, term363.getClass(), "year", 2015);
        setShortField(term363, term363.getClass(), "month", (short) 4);
        setShortField(term363, term363.getClass(), "day", (short) 14);
        setField(term362, term362.getClass(), "date", term363);
        setByteField(term367, term367.getClass(), "hour", (byte) 18);
        setByteField(term367, term367.getClass(), "minute", (byte) 24);
        setByteField(term367, term367.getClass(), "second", (byte) 32);
        setIntField(term367, term367.getClass(), "nano", 369233818);
        setField(term362, term362.getClass(), "time", term367);
        setField(term337, term337.getClass(), "createdAt", term362);
        setField(term284, term284.getClass(), "school", term337);
        setIntField(term373, term373.getClass(), "year", 2022);
        setShortField(term373, term373.getClass(), "month", (short) 2);
        setShortField(term373, term373.getClass(), "day", (short) 26);
        setField(term372, term372.getClass(), "date", term373);
        setByteField(term377, term377.getClass(), "hour", (byte) 11);
        setByteField(term377, term377.getClass(), "minute", (byte) 42);
        setByteField(term377, term377.getClass(), "second", (byte) 15);
        setIntField(term377, term377.getClass(), "nano", 377731937);
        setField(term372, term372.getClass(), "time", term377);
        setField(term284, term284.getClass(), "createdAt", term372);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.example.pdf.model.Student");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getId", argTypes, term284, args);
    }

};


