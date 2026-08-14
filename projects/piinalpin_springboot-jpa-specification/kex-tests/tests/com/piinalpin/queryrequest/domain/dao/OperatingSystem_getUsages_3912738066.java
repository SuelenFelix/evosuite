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

public class OperatingSystem_getUsages_3912738066 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1142;

    public OperatingSystem_getUsages_3912738066() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term1143 = new Long(-5476826692763582090L);
        Integer term1191 = new Integer(1585847225);
        term1142 = newInstance(Class.forName("com.piinalpin.queryrequest.domain.dao.OperatingSystem"));
        Object term1181 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term1182 = newInstance(Class.forName("java.time.LocalDate"));
        Object term1186 = newInstance(Class.forName("java.time.LocalTime"));
        setField(term1142, term1142.getClass(), "id", term1143);
        setField(term1142, term1142.getClass(), "name", "gGSMzuGICf");
        setField(term1142, term1142.getClass(), "version", "hxCBltsObl");
        setField(term1142, term1142.getClass(), "kernel", "BndsHwAFMv");
        setIntField(term1182, term1182.getClass(), "year", 2012);
        setShortField(term1182, term1182.getClass(), "month", (short) 2);
        setShortField(term1182, term1182.getClass(), "day", (short) 19);
        setField(term1181, term1181.getClass(), "date", term1182);
        setByteField(term1186, term1186.getClass(), "hour", (byte) 8);
        setByteField(term1186, term1186.getClass(), "minute", (byte) 4);
        setByteField(term1186, term1186.getClass(), "second", (byte) 43);
        setIntField(term1186, term1186.getClass(), "nano", 114930008);
        setField(term1181, term1181.getClass(), "time", term1186);
        setField(term1142, term1142.getClass(), "releaseDate", term1181);
        setField(term1142, term1142.getClass(), "usages", term1191);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.piinalpin.queryrequest.domain.dao.OperatingSystem");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getUsages", argTypes, term1142, args);
    }

};


