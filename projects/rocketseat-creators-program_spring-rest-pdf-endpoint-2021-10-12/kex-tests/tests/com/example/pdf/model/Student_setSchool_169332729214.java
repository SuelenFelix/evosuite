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

public class Student_setSchool_169332729214 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2272;
     Object term2370;

    public Student_setSchool_169332729214() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term2272 = newInstance(Class.forName("com.example.pdf.model.Student"));
        Object term2321 = newInstance(Class.forName("java.time.LocalDate"));
        Object term2325 = newInstance(Class.forName("com.example.pdf.model.School"));
        Object term2350 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term2351 = newInstance(Class.forName("java.time.LocalDate"));
        Object term2355 = newInstance(Class.forName("java.time.LocalTime"));
        Object term2360 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term2361 = newInstance(Class.forName("java.time.LocalDate"));
        Object term2365 = newInstance(Class.forName("java.time.LocalTime"));
        setField(term2272, term2272.getClass(), "id", "TimdotUuNC");
        setField(term2272, term2272.getClass(), "name", "PkWMRdJcBb");
        setField(term2272, term2272.getClass(), "email", "jSpAteRute");
        setField(term2272, term2272.getClass(), "password", "swZVeJAxjt");
        setIntField(term2321, term2321.getClass(), "year", 2029);
        setShortField(term2321, term2321.getClass(), "month", (short) 1);
        setShortField(term2321, term2321.getClass(), "day", (short) 20);
        setField(term2272, term2272.getClass(), "birthday", term2321);
        setField(term2325, term2325.getClass(), "id", "xOcJIiQQDu");
        setField(term2325, term2325.getClass(), "name", "GVizqqzXpy");
        setIntField(term2351, term2351.getClass(), "year", 2027);
        setShortField(term2351, term2351.getClass(), "month", (short) 2);
        setShortField(term2351, term2351.getClass(), "day", (short) 19);
        setField(term2350, term2350.getClass(), "date", term2351);
        setByteField(term2355, term2355.getClass(), "hour", (byte) 17);
        setByteField(term2355, term2355.getClass(), "minute", (byte) 37);
        setByteField(term2355, term2355.getClass(), "second", (byte) 27);
        setIntField(term2355, term2355.getClass(), "nano", 920380537);
        setField(term2350, term2350.getClass(), "time", term2355);
        setField(term2325, term2325.getClass(), "createdAt", term2350);
        setField(term2272, term2272.getClass(), "school", term2325);
        setIntField(term2361, term2361.getClass(), "year", 2021);
        setShortField(term2361, term2361.getClass(), "month", (short) 8);
        setShortField(term2361, term2361.getClass(), "day", (short) 12);
        setField(term2360, term2360.getClass(), "date", term2361);
        setByteField(term2365, term2365.getClass(), "hour", (byte) 2);
        setByteField(term2365, term2365.getClass(), "minute", (byte) 17);
        setByteField(term2365, term2365.getClass(), "second", (byte) 51);
        setIntField(term2365, term2365.getClass(), "nano", 207375141);
        setField(term2360, term2360.getClass(), "time", term2365);
        setField(term2272, term2272.getClass(), "createdAt", term2360);
        term2370 = newInstance(Class.forName("com.example.pdf.model.School"));
        Object term2395 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term2396 = newInstance(Class.forName("java.time.LocalDate"));
        Object term2400 = newInstance(Class.forName("java.time.LocalTime"));
        setField(term2370, term2370.getClass(), "id", "JqXGgAhZPl");
        setField(term2370, term2370.getClass(), "name", "jiKYgYHqIS");
        setIntField(term2396, term2396.getClass(), "year", 2025);
        setShortField(term2396, term2396.getClass(), "month", (short) 11);
        setShortField(term2396, term2396.getClass(), "day", (short) 3);
        setField(term2395, term2395.getClass(), "date", term2396);
        setByteField(term2400, term2400.getClass(), "hour", (byte) 21);
        setByteField(term2400, term2400.getClass(), "minute", (byte) 24);
        setByteField(term2400, term2400.getClass(), "second", (byte) 23);
        setIntField(term2400, term2400.getClass(), "nano", 210986721);
        setField(term2395, term2395.getClass(), "time", term2400);
        setField(term2370, term2370.getClass(), "createdAt", term2395);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.example.pdf.model.Student");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.example.pdf.model.School");
        Object[] args = new Object[1];
        args[0] = term2370;
        callMethod(klass, "setSchool", argTypes, term2272, args);
    }

};


