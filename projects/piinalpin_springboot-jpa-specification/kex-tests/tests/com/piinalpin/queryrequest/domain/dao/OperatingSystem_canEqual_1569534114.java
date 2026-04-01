package com.piinalpin.queryrequest.domain.dao;

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
import static com.piinalpin.queryrequest.domain.dao.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Long;
import java.lang.Object;
import java.lang.Integer;

public class OperatingSystem_canEqual_1569534114 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1871;
     Object term1922;

    public OperatingSystem_canEqual_1569534114() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term1872 = new Long(-4365849114644724155L);
        Integer term1920 = new Integer(-117576464);
        term1871 = newInstance(Class.forName("com.piinalpin.queryrequest.domain.dao.OperatingSystem"));
        Object term1910 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term1911 = newInstance(Class.forName("java.time.LocalDate"));
        Object term1915 = newInstance(Class.forName("java.time.LocalTime"));
        setField(term1871, term1871.getClass(), "id", term1872);
        setField(term1871, term1871.getClass(), "name", "bLPjGVBhlX");
        setField(term1871, term1871.getClass(), "version", "whBvTVIIlC");
        setField(term1871, term1871.getClass(), "kernel", "IgRJUzaCwW");
        setIntField(term1911, term1911.getClass(), "year", 2027);
        setShortField(term1911, term1911.getClass(), "month", (short) 8);
        setShortField(term1911, term1911.getClass(), "day", (short) 26);
        setField(term1910, term1910.getClass(), "date", term1911);
        setByteField(term1915, term1915.getClass(), "hour", (byte) 5);
        setByteField(term1915, term1915.getClass(), "minute", (byte) 11);
        setByteField(term1915, term1915.getClass(), "second", (byte) 9);
        setIntField(term1915, term1915.getClass(), "nano", 219245092);
        setField(term1910, term1910.getClass(), "time", term1915);
        setField(term1871, term1871.getClass(), "releaseDate", term1910);
        setField(term1871, term1871.getClass(), "usages", term1920);
        term1922 = newInstance(Class.forName("java.lang.Object"));
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.piinalpin.queryrequest.domain.dao.OperatingSystem");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Object");
        Object[] args = new Object[1];
        args[0] = term1922;
        callMethod(klass, "canEqual", argTypes, term1871, args);
    }

};


