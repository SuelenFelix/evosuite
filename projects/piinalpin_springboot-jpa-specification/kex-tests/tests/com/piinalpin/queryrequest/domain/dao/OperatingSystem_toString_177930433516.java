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

public class OperatingSystem_toString_177930433516 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2034;

    public OperatingSystem_toString_177930433516() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term2035 = new Long(7009926388951271268L);
        Integer term2083 = new Integer(1135664017);
        term2034 = newInstance(Class.forName("com.piinalpin.queryrequest.domain.dao.OperatingSystem"));
        Object term2073 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term2074 = newInstance(Class.forName("java.time.LocalDate"));
        Object term2078 = newInstance(Class.forName("java.time.LocalTime"));
        setField(term2034, term2034.getClass(), "id", term2035);
        setField(term2034, term2034.getClass(), "name", "MAcUBcBckh");
        setField(term2034, term2034.getClass(), "version", "oVgzLbrsFr");
        setField(term2034, term2034.getClass(), "kernel", "vQVyKLdtaz");
        setIntField(term2074, term2074.getClass(), "year", 2023);
        setShortField(term2074, term2074.getClass(), "month", (short) 9);
        setShortField(term2074, term2074.getClass(), "day", (short) 23);
        setField(term2073, term2073.getClass(), "date", term2074);
        setByteField(term2078, term2078.getClass(), "hour", (byte) 12);
        setByteField(term2078, term2078.getClass(), "minute", (byte) 55);
        setByteField(term2078, term2078.getClass(), "second", (byte) 58);
        setIntField(term2078, term2078.getClass(), "nano", 159178396);
        setField(term2073, term2073.getClass(), "time", term2078);
        setField(term2034, term2034.getClass(), "releaseDate", term2073);
        setField(term2034, term2034.getClass(), "usages", term2083);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.piinalpin.queryrequest.domain.dao.OperatingSystem");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "toString", argTypes, term2034, args);
    }

};


