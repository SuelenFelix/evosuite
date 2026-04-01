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

public class OperatingSystem_setUsages_151865737612 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1706;
     Object term1757;

    public OperatingSystem_setUsages_151865737612() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term1707 = new Long(-2585684163342970173L);
        Integer term1755 = new Integer(-655067527);
        term1706 = newInstance(Class.forName("com.piinalpin.queryrequest.domain.dao.OperatingSystem"));
        Object term1745 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term1746 = newInstance(Class.forName("java.time.LocalDate"));
        Object term1750 = newInstance(Class.forName("java.time.LocalTime"));
        setField(term1706, term1706.getClass(), "id", term1707);
        setField(term1706, term1706.getClass(), "name", "eqJfYWRaEL");
        setField(term1706, term1706.getClass(), "version", "fhkbdRViHi");
        setField(term1706, term1706.getClass(), "kernel", "uWHnvSvaPl");
        setIntField(term1746, term1746.getClass(), "year", 2023);
        setShortField(term1746, term1746.getClass(), "month", (short) 3);
        setShortField(term1746, term1746.getClass(), "day", (short) 7);
        setField(term1745, term1745.getClass(), "date", term1746);
        setByteField(term1750, term1750.getClass(), "hour", (byte) 21);
        setByteField(term1750, term1750.getClass(), "minute", (byte) 15);
        setByteField(term1750, term1750.getClass(), "second", (byte) 43);
        setIntField(term1750, term1750.getClass(), "nano", 639721472);
        setField(term1745, term1745.getClass(), "time", term1750);
        setField(term1706, term1706.getClass(), "releaseDate", term1745);
        setField(term1706, term1706.getClass(), "usages", term1755);
        term1757 = new Integer(-6029667);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.piinalpin.queryrequest.domain.dao.OperatingSystem");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Integer");
        Object[] args = new Object[1];
        args[0] = term1757;
        callMethod(klass, "setUsages", argTypes, term1706, args);
    }

};


