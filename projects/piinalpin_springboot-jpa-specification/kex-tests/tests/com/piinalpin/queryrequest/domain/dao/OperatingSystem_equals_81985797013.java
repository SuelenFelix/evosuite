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

public class OperatingSystem_equals_81985797013 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1789;
     Object term1840;

    public OperatingSystem_equals_81985797013() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term1790 = new Long(8059786003080744426L);
        Integer term1838 = new Integer(-2068769794);
        term1789 = newInstance(Class.forName("com.piinalpin.queryrequest.domain.dao.OperatingSystem"));
        Object term1828 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term1829 = newInstance(Class.forName("java.time.LocalDate"));
        Object term1833 = newInstance(Class.forName("java.time.LocalTime"));
        setField(term1789, term1789.getClass(), "id", term1790);
        setField(term1789, term1789.getClass(), "name", "kBdSllIBVz");
        setField(term1789, term1789.getClass(), "version", "TJmVBGfTML");
        setField(term1789, term1789.getClass(), "kernel", "tPlsykYBqO");
        setIntField(term1829, term1829.getClass(), "year", 2015);
        setShortField(term1829, term1829.getClass(), "month", (short) 3);
        setShortField(term1829, term1829.getClass(), "day", (short) 10);
        setField(term1828, term1828.getClass(), "date", term1829);
        setByteField(term1833, term1833.getClass(), "hour", (byte) 23);
        setByteField(term1833, term1833.getClass(), "minute", (byte) 34);
        setByteField(term1833, term1833.getClass(), "second", (byte) 44);
        setIntField(term1833, term1833.getClass(), "nano", 587322824);
        setField(term1828, term1828.getClass(), "time", term1833);
        setField(term1789, term1789.getClass(), "releaseDate", term1828);
        setField(term1789, term1789.getClass(), "usages", term1838);
        term1840 = newInstance(Class.forName("java.lang.Object"));
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.piinalpin.queryrequest.domain.dao.OperatingSystem");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Object");
        Object[] args = new Object[1];
        args[0] = term1840;
        callMethod(klass, "equals", argTypes, term1789, args);
    }

};


