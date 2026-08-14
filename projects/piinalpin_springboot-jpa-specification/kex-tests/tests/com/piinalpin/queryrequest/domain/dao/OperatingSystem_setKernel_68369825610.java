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

public class OperatingSystem_setKernel_68369825610 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1512;

    public OperatingSystem_setKernel_68369825610() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term1513 = new Long(-4920224193275732920L);
        Integer term1561 = new Integer(1622346318);
        term1512 = newInstance(Class.forName("com.piinalpin.queryrequest.domain.dao.OperatingSystem"));
        Object term1551 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term1552 = newInstance(Class.forName("java.time.LocalDate"));
        Object term1556 = newInstance(Class.forName("java.time.LocalTime"));
        setField(term1512, term1512.getClass(), "id", term1513);
        setField(term1512, term1512.getClass(), "name", "ffYhPOzlUs");
        setField(term1512, term1512.getClass(), "version", "MLqYREekMl");
        setField(term1512, term1512.getClass(), "kernel", "ytSBIKXogI");
        setIntField(term1552, term1552.getClass(), "year", 2017);
        setShortField(term1552, term1552.getClass(), "month", (short) 3);
        setShortField(term1552, term1552.getClass(), "day", (short) 5);
        setField(term1551, term1551.getClass(), "date", term1552);
        setByteField(term1556, term1556.getClass(), "hour", (byte) 20);
        setByteField(term1556, term1556.getClass(), "minute", (byte) 34);
        setByteField(term1556, term1556.getClass(), "second", (byte) 55);
        setIntField(term1556, term1556.getClass(), "nano", 78024496);
        setField(term1551, term1551.getClass(), "time", term1556);
        setField(term1512, term1512.getClass(), "releaseDate", term1551);
        setField(term1512, term1512.getClass(), "usages", term1561);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.piinalpin.queryrequest.domain.dao.OperatingSystem");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "nHXjMycHlU";
        callMethod(klass, "setKernel", argTypes, term1512, args);
    }

};


