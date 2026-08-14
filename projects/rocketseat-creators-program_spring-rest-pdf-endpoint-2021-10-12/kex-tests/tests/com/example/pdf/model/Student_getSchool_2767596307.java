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

public class Student_getSchool_2767596307 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1074;

    public Student_getSchool_2767596307() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term1074 = newInstance(Class.forName("com.example.pdf.model.Student"));
        Object term1123 = newInstance(Class.forName("java.time.LocalDate"));
        Object term1127 = newInstance(Class.forName("com.example.pdf.model.School"));
        Object term1152 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term1153 = newInstance(Class.forName("java.time.LocalDate"));
        Object term1157 = newInstance(Class.forName("java.time.LocalTime"));
        Object term1162 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term1163 = newInstance(Class.forName("java.time.LocalDate"));
        Object term1167 = newInstance(Class.forName("java.time.LocalTime"));
        setField(term1074, term1074.getClass(), "id", "UlajhuVLaP");
        setField(term1074, term1074.getClass(), "name", "gGSMzuGICf");
        setField(term1074, term1074.getClass(), "email", "hxCBltsObl");
        setField(term1074, term1074.getClass(), "password", "BndsHwAFMv");
        setIntField(term1123, term1123.getClass(), "year", 2017);
        setShortField(term1123, term1123.getClass(), "month", (short) 5);
        setShortField(term1123, term1123.getClass(), "day", (short) 21);
        setField(term1074, term1074.getClass(), "birthday", term1123);
        setField(term1127, term1127.getClass(), "id", "GzFkzHGYFt");
        setField(term1127, term1127.getClass(), "name", "tShwQLRGNe");
        setIntField(term1153, term1153.getClass(), "year", 2021);
        setShortField(term1153, term1153.getClass(), "month", (short) 9);
        setShortField(term1153, term1153.getClass(), "day", (short) 7);
        setField(term1152, term1152.getClass(), "date", term1153);
        setByteField(term1157, term1157.getClass(), "hour", (byte) 5);
        setByteField(term1157, term1157.getClass(), "minute", (byte) 25);
        setByteField(term1157, term1157.getClass(), "second", (byte) 7);
        setIntField(term1157, term1157.getClass(), "nano", 755924076);
        setField(term1152, term1152.getClass(), "time", term1157);
        setField(term1127, term1127.getClass(), "createdAt", term1152);
        setField(term1074, term1074.getClass(), "school", term1127);
        setIntField(term1163, term1163.getClass(), "year", 2012);
        setShortField(term1163, term1163.getClass(), "month", (short) 2);
        setShortField(term1163, term1163.getClass(), "day", (short) 19);
        setField(term1162, term1162.getClass(), "date", term1163);
        setByteField(term1167, term1167.getClass(), "hour", (byte) 8);
        setByteField(term1167, term1167.getClass(), "minute", (byte) 4);
        setByteField(term1167, term1167.getClass(), "second", (byte) 43);
        setIntField(term1167, term1167.getClass(), "nano", 114930008);
        setField(term1162, term1162.getClass(), "time", term1167);
        setField(term1074, term1074.getClass(), "createdAt", term1162);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.example.pdf.model.Student");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getSchool", argTypes, term1074, args);
    }

};


