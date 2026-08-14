package de.rieckpil.courses;

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
import static de.rieckpil.courses.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Long;
import java.lang.Object;

public class User_setCreatedAt_7747936878 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1441;
     Object term1478;

    public User_setCreatedAt_7747936878() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term1442 = new Long(-7237588299778557629L);
        term1441 = newInstance(Class.forName("de.rieckpil.courses.User"));
        Object term1468 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term1469 = newInstance(Class.forName("java.time.LocalDate"));
        Object term1473 = newInstance(Class.forName("java.time.LocalTime"));
        setField(term1441, term1441.getClass(), "id", term1442);
        setField(term1441, term1441.getClass(), "username", "ytSBIKXogI");
        setField(term1441, term1441.getClass(), "email", "nHXjMycHlU");
        setIntField(term1469, term1469.getClass(), "year", 2024);
        setShortField(term1469, term1469.getClass(), "month", (short) 1);
        setShortField(term1469, term1469.getClass(), "day", (short) 24);
        setField(term1468, term1468.getClass(), "date", term1469);
        setByteField(term1473, term1473.getClass(), "hour", (byte) 20);
        setByteField(term1473, term1473.getClass(), "minute", (byte) 28);
        setByteField(term1473, term1473.getClass(), "second", (byte) 39);
        setIntField(term1473, term1473.getClass(), "nano", 952728177);
        setField(term1468, term1468.getClass(), "time", term1473);
        setField(term1441, term1441.getClass(), "createdAt", term1468);
        term1478 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term1479 = newInstance(Class.forName("java.time.LocalDate"));
        Object term1483 = newInstance(Class.forName("java.time.LocalTime"));
        setIntField(term1479, term1479.getClass(), "year", 2029);
        setShortField(term1479, term1479.getClass(), "month", (short) 8);
        setShortField(term1479, term1479.getClass(), "day", (short) 29);
        setField(term1478, term1478.getClass(), "date", term1479);
        setByteField(term1483, term1483.getClass(), "hour", (byte) 15);
        setByteField(term1483, term1483.getClass(), "minute", (byte) 50);
        setByteField(term1483, term1483.getClass(), "second", (byte) 1);
        setIntField(term1483, term1483.getClass(), "nano", 277971904);
        setField(term1478, term1478.getClass(), "time", term1483);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("de.rieckpil.courses.User");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.time.LocalDateTime");
        Object[] args = new Object[1];
        args[0] = term1478;
        callMethod(klass, "setCreatedAt", argTypes, term1441, args);
    }

};


