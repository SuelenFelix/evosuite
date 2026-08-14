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

public class School_getId_13973107632 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2745;

    public School_getId_13973107632() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term2745 = newInstance(Class.forName("com.example.pdf.model.School"));
        Object term2770 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term2771 = newInstance(Class.forName("java.time.LocalDate"));
        Object term2775 = newInstance(Class.forName("java.time.LocalTime"));
        setField(term2745, term2745.getClass(), "id", "QXzGXbEXMu");
        setField(term2745, term2745.getClass(), "name", "qxSDVejjiY");
        setIntField(term2771, term2771.getClass(), "year", 2010);
        setShortField(term2771, term2771.getClass(), "month", (short) 5);
        setShortField(term2771, term2771.getClass(), "day", (short) 2);
        setField(term2770, term2770.getClass(), "date", term2771);
        setByteField(term2775, term2775.getClass(), "hour", (byte) 2);
        setByteField(term2775, term2775.getClass(), "minute", (byte) 22);
        setByteField(term2775, term2775.getClass(), "second", (byte) 33);
        setIntField(term2775, term2775.getClass(), "nano", 530835039);
        setField(term2770, term2770.getClass(), "time", term2775);
        setField(term2745, term2745.getClass(), "createdAt", term2770);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.example.pdf.model.School");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getId", argTypes, term2745, args);
    }

};


