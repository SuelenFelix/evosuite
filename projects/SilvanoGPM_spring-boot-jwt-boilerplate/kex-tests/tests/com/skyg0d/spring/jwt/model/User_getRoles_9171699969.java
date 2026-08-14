package com.skyg0d.spring.jwt.model;

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
import static com.skyg0d.spring.jwt.model.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.util.HashMap;
import java.util.Map;
import java.lang.Object;
import java.util.Set;
import java.util.Collection;
import java.util.HashSet;

public class User_getRoles_9171699969 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1877;

    public User_getRoles_9171699969() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term1915 = new HashMap();
        Set<Object> term1973 =  ((Map) term1915).keySet();
        HashSet term1914 = new HashSet((Collection<? extends Object>) term1973);
        term1877 = newInstance(Class.forName("com.skyg0d.spring.jwt.model.User"));
        Object term1920 = newInstance(Class.forName("java.util.UUID"));
        Object term1923 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term1924 = newInstance(Class.forName("java.time.LocalDate"));
        Object term1928 = newInstance(Class.forName("java.time.LocalTime"));
        Object term1933 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term1934 = newInstance(Class.forName("java.time.LocalDate"));
        Object term1938 = newInstance(Class.forName("java.time.LocalTime"));
        setField(term1877, term1877.getClass(), "username", "RkybSrpybU");
        setField(term1877, term1877.getClass(), "email", "xOEqzGAmDU");
        setField(term1877, term1877.getClass(), "password", "eZFUvlxvGV");
        setField(term1877, term1877.getClass(), "roles", term1914);
        setLongField(term1920, term1920.getClass(), "mostSigBits", -4443169559037975007L);
        setLongField(term1920, term1920.getClass(), "leastSigBits", -3842548265506930260L);
        setField(term1877, term1877.getClass(), "id", term1920);
        setIntField(term1924, term1924.getClass(), "year", 2012);
        setShortField(term1924, term1924.getClass(), "month", (short) 4);
        setShortField(term1924, term1924.getClass(), "day", (short) 25);
        setField(term1923, term1923.getClass(), "date", term1924);
        setByteField(term1928, term1928.getClass(), "hour", (byte) 21);
        setByteField(term1928, term1928.getClass(), "minute", (byte) 14);
        setByteField(term1928, term1928.getClass(), "second", (byte) 15);
        setIntField(term1928, term1928.getClass(), "nano", 561700934);
        setField(term1923, term1923.getClass(), "time", term1928);
        setField(term1877, term1877.getClass(), "createdAt", term1923);
        setIntField(term1934, term1934.getClass(), "year", 2011);
        setShortField(term1934, term1934.getClass(), "month", (short) 10);
        setShortField(term1934, term1934.getClass(), "day", (short) 25);
        setField(term1933, term1933.getClass(), "date", term1934);
        setByteField(term1938, term1938.getClass(), "hour", (byte) 10);
        setByteField(term1938, term1938.getClass(), "minute", (byte) 33);
        setByteField(term1938, term1938.getClass(), "second", (byte) 8);
        setIntField(term1938, term1938.getClass(), "nano", 268304014);
        setField(term1933, term1933.getClass(), "time", term1938);
        setField(term1877, term1877.getClass(), "updatedAt", term1933);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.skyg0d.spring.jwt.model.User");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getRoles", argTypes, term1877, args);
    }

};


