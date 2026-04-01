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

public class OperatingSystem_setId_17734152617 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1223;
     Object term1274;

    public OperatingSystem_setId_17734152617() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term1224 = new Long(-872011222785455006L);
        Integer term1272 = new Integer(597278769);
        term1223 = newInstance(Class.forName("com.piinalpin.queryrequest.domain.dao.OperatingSystem"));
        Object term1262 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term1263 = newInstance(Class.forName("java.time.LocalDate"));
        Object term1267 = newInstance(Class.forName("java.time.LocalTime"));
        setField(term1223, term1223.getClass(), "id", term1224);
        setField(term1223, term1223.getClass(), "name", "GzFkzHGYFt");
        setField(term1223, term1223.getClass(), "version", "tShwQLRGNe");
        setField(term1223, term1223.getClass(), "kernel", "LvtrsXUliU");
        setIntField(term1263, term1263.getClass(), "year", 2017);
        setShortField(term1263, term1263.getClass(), "month", (short) 6);
        setShortField(term1263, term1263.getClass(), "day", (short) 8);
        setField(term1262, term1262.getClass(), "date", term1263);
        setByteField(term1267, term1267.getClass(), "hour", (byte) 0);
        setByteField(term1267, term1267.getClass(), "minute", (byte) 18);
        setByteField(term1267, term1267.getClass(), "second", (byte) 55);
        setIntField(term1267, term1267.getClass(), "nano", 680586717);
        setField(term1262, term1262.getClass(), "time", term1267);
        setField(term1223, term1223.getClass(), "releaseDate", term1262);
        setField(term1223, term1223.getClass(), "usages", term1272);
        term1274 = new Long(-316468845751588286L);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.piinalpin.queryrequest.domain.dao.OperatingSystem");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Long");
        Object[] args = new Object[1];
        args[0] = term1274;
        callMethod(klass, "setId", argTypes, term1223, args);
    }

};


