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

public class Student_getPassword_391642085 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term758;

    public Student_getPassword_391642085() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term758 = newInstance(Class.forName("com.example.pdf.model.Student"));
        Object term807 = newInstance(Class.forName("java.time.LocalDate"));
        Object term811 = newInstance(Class.forName("com.example.pdf.model.School"));
        Object term836 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term837 = newInstance(Class.forName("java.time.LocalDate"));
        Object term841 = newInstance(Class.forName("java.time.LocalTime"));
        Object term846 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term847 = newInstance(Class.forName("java.time.LocalDate"));
        Object term851 = newInstance(Class.forName("java.time.LocalTime"));
        setField(term758, term758.getClass(), "id", "TEParAifyi");
        setField(term758, term758.getClass(), "name", "OWDIEULEFu");
        setField(term758, term758.getClass(), "email", "dWRymuLBtr");
        setField(term758, term758.getClass(), "password", "AijpHYOFuy");
        setIntField(term807, term807.getClass(), "year", 2018);
        setShortField(term807, term807.getClass(), "month", (short) 1);
        setShortField(term807, term807.getClass(), "day", (short) 13);
        setField(term758, term758.getClass(), "birthday", term807);
        setField(term811, term811.getClass(), "id", "SbAoxhfrkn");
        setField(term811, term811.getClass(), "name", "kuTXqwMtDB");
        setIntField(term837, term837.getClass(), "year", 2022);
        setShortField(term837, term837.getClass(), "month", (short) 11);
        setShortField(term837, term837.getClass(), "day", (short) 16);
        setField(term836, term836.getClass(), "date", term837);
        setByteField(term841, term841.getClass(), "hour", (byte) 15);
        setByteField(term841, term841.getClass(), "minute", (byte) 54);
        setByteField(term841, term841.getClass(), "second", (byte) 2);
        setIntField(term841, term841.getClass(), "nano", 733274103);
        setField(term836, term836.getClass(), "time", term841);
        setField(term811, term811.getClass(), "createdAt", term836);
        setField(term758, term758.getClass(), "school", term811);
        setIntField(term847, term847.getClass(), "year", 2019);
        setShortField(term847, term847.getClass(), "month", (short) 2);
        setShortField(term847, term847.getClass(), "day", (short) 21);
        setField(term846, term846.getClass(), "date", term847);
        setByteField(term851, term851.getClass(), "hour", (byte) 5);
        setByteField(term851, term851.getClass(), "minute", (byte) 41);
        setByteField(term851, term851.getClass(), "second", (byte) 11);
        setIntField(term851, term851.getClass(), "nano", 859829782);
        setField(term846, term846.getClass(), "time", term851);
        setField(term758, term758.getClass(), "createdAt", term846);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.example.pdf.model.Student");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getPassword", argTypes, term758, args);
    }

};


