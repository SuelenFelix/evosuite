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

public class OperatingSystem_setVersion_14874661379 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1409;

    public OperatingSystem_setVersion_14874661379() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term1410 = new Long(-6573104506744284592L);
        Integer term1458 = new Integer(-1456670397);
        term1409 = newInstance(Class.forName("com.piinalpin.queryrequest.domain.dao.OperatingSystem"));
        Object term1448 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term1449 = newInstance(Class.forName("java.time.LocalDate"));
        Object term1453 = newInstance(Class.forName("java.time.LocalTime"));
        setField(term1409, term1409.getClass(), "id", term1410);
        setField(term1409, term1409.getClass(), "name", "UoYtihxVaS");
        setField(term1409, term1409.getClass(), "version", "JDswTTCZHV");
        setField(term1409, term1409.getClass(), "kernel", "onpbIeEKoi");
        setIntField(term1449, term1449.getClass(), "year", 2029);
        setShortField(term1449, term1449.getClass(), "month", (short) 6);
        setShortField(term1449, term1449.getClass(), "day", (short) 23);
        setField(term1448, term1448.getClass(), "date", term1449);
        setByteField(term1453, term1453.getClass(), "hour", (byte) 21);
        setByteField(term1453, term1453.getClass(), "minute", (byte) 55);
        setByteField(term1453, term1453.getClass(), "second", (byte) 27);
        setIntField(term1453, term1453.getClass(), "nano", 66889274);
        setField(term1448, term1448.getClass(), "time", term1453);
        setField(term1409, term1409.getClass(), "releaseDate", term1448);
        setField(term1409, term1409.getClass(), "usages", term1458);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.piinalpin.queryrequest.domain.dao.OperatingSystem");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "YRHGsAkhxb";
        callMethod(klass, "setVersion", argTypes, term1409, args);
    }

};


