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

public class OperatingSystem_getKernel_11622155604 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term980;

    public OperatingSystem_getKernel_11622155604() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term981 = new Long(-4325723315152823407L);
        Integer term1029 = new Integer(1134449235);
        term980 = newInstance(Class.forName("com.piinalpin.queryrequest.domain.dao.OperatingSystem"));
        Object term1019 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term1020 = newInstance(Class.forName("java.time.LocalDate"));
        Object term1024 = newInstance(Class.forName("java.time.LocalTime"));
        setField(term980, term980.getClass(), "id", term981);
        setField(term980, term980.getClass(), "name", "xrwlQZdwCp");
        setField(term980, term980.getClass(), "version", "IDCWpPLRkE");
        setField(term980, term980.getClass(), "kernel", "nyiiPDVjAc");
        setIntField(term1020, term1020.getClass(), "year", 2012);
        setShortField(term1020, term1020.getClass(), "month", (short) 9);
        setShortField(term1020, term1020.getClass(), "day", (short) 11);
        setField(term1019, term1019.getClass(), "date", term1020);
        setByteField(term1024, term1024.getClass(), "hour", (byte) 22);
        setByteField(term1024, term1024.getClass(), "minute", (byte) 10);
        setByteField(term1024, term1024.getClass(), "second", (byte) 8);
        setIntField(term1024, term1024.getClass(), "nano", 380008862);
        setField(term1019, term1019.getClass(), "time", term1024);
        setField(term980, term980.getClass(), "releaseDate", term1019);
        setField(term980, term980.getClass(), "usages", term1029);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.piinalpin.queryrequest.domain.dao.OperatingSystem");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getKernel", argTypes, term980, args);
    }

};


