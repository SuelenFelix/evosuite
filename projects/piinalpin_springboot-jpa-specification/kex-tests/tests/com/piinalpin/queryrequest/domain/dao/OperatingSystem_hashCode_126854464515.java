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

public class OperatingSystem_hashCode_126854464515 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1953;

    public OperatingSystem_hashCode_126854464515() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term1954 = new Long(2486810210675247493L);
        Integer term2002 = new Integer(-1007160944);
        term1953 = newInstance(Class.forName("com.piinalpin.queryrequest.domain.dao.OperatingSystem"));
        Object term1992 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term1993 = newInstance(Class.forName("java.time.LocalDate"));
        Object term1997 = newInstance(Class.forName("java.time.LocalTime"));
        setField(term1953, term1953.getClass(), "id", term1954);
        setField(term1953, term1953.getClass(), "name", "JUmudUmaaV");
        setField(term1953, term1953.getClass(), "version", "KoyGrUJeJW");
        setField(term1953, term1953.getClass(), "kernel", "HqBOwkVqjD");
        setIntField(term1993, term1993.getClass(), "year", 2025);
        setShortField(term1993, term1993.getClass(), "month", (short) 3);
        setShortField(term1993, term1993.getClass(), "day", (short) 9);
        setField(term1992, term1992.getClass(), "date", term1993);
        setByteField(term1997, term1997.getClass(), "hour", (byte) 5);
        setByteField(term1997, term1997.getClass(), "minute", (byte) 49);
        setByteField(term1997, term1997.getClass(), "second", (byte) 12);
        setIntField(term1997, term1997.getClass(), "nano", 791695028);
        setField(term1992, term1992.getClass(), "time", term1997);
        setField(term1953, term1953.getClass(), "releaseDate", term1992);
        setField(term1953, term1953.getClass(), "usages", term2002);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.piinalpin.queryrequest.domain.dao.OperatingSystem");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "hashCode", argTypes, term1953, args);
    }

};


