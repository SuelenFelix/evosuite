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

public class User_getCreatedAt_11055845597 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1384;

    public User_getCreatedAt_11055845597() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term1385 = new Long(6811161968424632369L);
        term1384 = newInstance(Class.forName("de.rieckpil.courses.User"));
        Object term1411 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term1412 = newInstance(Class.forName("java.time.LocalDate"));
        Object term1416 = newInstance(Class.forName("java.time.LocalTime"));
        setField(term1384, term1384.getClass(), "id", term1385);
        setField(term1384, term1384.getClass(), "username", "ffYhPOzlUs");
        setField(term1384, term1384.getClass(), "email", "MLqYREekMl");
        setIntField(term1412, term1412.getClass(), "year", 2025);
        setShortField(term1412, term1412.getClass(), "month", (short) 4);
        setShortField(term1412, term1412.getClass(), "day", (short) 24);
        setField(term1411, term1411.getClass(), "date", term1412);
        setByteField(term1416, term1416.getClass(), "hour", (byte) 18);
        setByteField(term1416, term1416.getClass(), "minute", (byte) 11);
        setByteField(term1416, term1416.getClass(), "second", (byte) 40);
        setIntField(term1416, term1416.getClass(), "nano", 137454929);
        setField(term1411, term1411.getClass(), "time", term1416);
        setField(term1384, term1384.getClass(), "createdAt", term1411);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("de.rieckpil.courses.User");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getCreatedAt", argTypes, term1384, args);
    }

};


