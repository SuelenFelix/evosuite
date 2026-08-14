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

public class Student_getBirthday_20678722416 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term916;

    public Student_getBirthday_20678722416() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term916 = newInstance(Class.forName("com.example.pdf.model.Student"));
        Object term965 = newInstance(Class.forName("java.time.LocalDate"));
        Object term969 = newInstance(Class.forName("com.example.pdf.model.School"));
        Object term994 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term995 = newInstance(Class.forName("java.time.LocalDate"));
        Object term999 = newInstance(Class.forName("java.time.LocalTime"));
        Object term1004 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term1005 = newInstance(Class.forName("java.time.LocalDate"));
        Object term1009 = newInstance(Class.forName("java.time.LocalTime"));
        setField(term916, term916.getClass(), "id", "Ghbwtircqb");
        setField(term916, term916.getClass(), "name", "xrwlQZdwCp");
        setField(term916, term916.getClass(), "email", "IDCWpPLRkE");
        setField(term916, term916.getClass(), "password", "nyiiPDVjAc");
        setIntField(term965, term965.getClass(), "year", 2015);
        setShortField(term965, term965.getClass(), "month", (short) 4);
        setShortField(term965, term965.getClass(), "day", (short) 14);
        setField(term916, term916.getClass(), "birthday", term965);
        setField(term969, term969.getClass(), "id", "aKnKipADSo");
        setField(term969, term969.getClass(), "name", "wSQxaModmm");
        setIntField(term995, term995.getClass(), "year", 2018);
        setShortField(term995, term995.getClass(), "month", (short) 9);
        setShortField(term995, term995.getClass(), "day", (short) 28);
        setField(term994, term994.getClass(), "date", term995);
        setByteField(term999, term999.getClass(), "hour", (byte) 3);
        setByteField(term999, term999.getClass(), "minute", (byte) 37);
        setByteField(term999, term999.getClass(), "second", (byte) 46);
        setIntField(term999, term999.getClass(), "nano", 763326845);
        setField(term994, term994.getClass(), "time", term999);
        setField(term969, term969.getClass(), "createdAt", term994);
        setField(term916, term916.getClass(), "school", term969);
        setIntField(term1005, term1005.getClass(), "year", 2012);
        setShortField(term1005, term1005.getClass(), "month", (short) 9);
        setShortField(term1005, term1005.getClass(), "day", (short) 11);
        setField(term1004, term1004.getClass(), "date", term1005);
        setByteField(term1009, term1009.getClass(), "hour", (byte) 22);
        setByteField(term1009, term1009.getClass(), "minute", (byte) 10);
        setByteField(term1009, term1009.getClass(), "second", (byte) 8);
        setIntField(term1009, term1009.getClass(), "nano", 380008862);
        setField(term1004, term1004.getClass(), "time", term1009);
        setField(term916, term916.getClass(), "createdAt", term1004);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.example.pdf.model.Student");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getBirthday", argTypes, term916, args);
    }

};


