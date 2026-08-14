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

public class OperatingSystem_getReleaseDate_18847566565 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1061;

    public OperatingSystem_getReleaseDate_18847566565() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term1062 = new Long(2535595959091595249L);
        Integer term1110 = new Integer(-883034806);
        term1061 = newInstance(Class.forName("com.piinalpin.queryrequest.domain.dao.OperatingSystem"));
        Object term1100 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term1101 = newInstance(Class.forName("java.time.LocalDate"));
        Object term1105 = newInstance(Class.forName("java.time.LocalTime"));
        setField(term1061, term1061.getClass(), "id", term1062);
        setField(term1061, term1061.getClass(), "name", "aKnKipADSo");
        setField(term1061, term1061.getClass(), "version", "wSQxaModmm");
        setField(term1061, term1061.getClass(), "kernel", "UlajhuVLaP");
        setIntField(term1101, term1101.getClass(), "year", 2021);
        setShortField(term1101, term1101.getClass(), "month", (short) 9);
        setShortField(term1101, term1101.getClass(), "day", (short) 7);
        setField(term1100, term1100.getClass(), "date", term1101);
        setByteField(term1105, term1105.getClass(), "hour", (byte) 5);
        setByteField(term1105, term1105.getClass(), "minute", (byte) 25);
        setByteField(term1105, term1105.getClass(), "second", (byte) 7);
        setIntField(term1105, term1105.getClass(), "nano", 755924076);
        setField(term1100, term1100.getClass(), "time", term1105);
        setField(term1061, term1061.getClass(), "releaseDate", term1100);
        setField(term1061, term1061.getClass(), "usages", term1110);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.piinalpin.queryrequest.domain.dao.OperatingSystem");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getReleaseDate", argTypes, term1061, args);
    }

};


