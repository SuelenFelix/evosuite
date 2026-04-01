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

public class OperatingSystem_setReleaseDate_149425916011 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1615;
     Object term1666;

    public OperatingSystem_setReleaseDate_149425916011() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term1616 = new Long(8428634514691209827L);
        Integer term1664 = new Integer(1048535127);
        term1615 = newInstance(Class.forName("com.piinalpin.queryrequest.domain.dao.OperatingSystem"));
        Object term1654 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term1655 = newInstance(Class.forName("java.time.LocalDate"));
        Object term1659 = newInstance(Class.forName("java.time.LocalTime"));
        setField(term1615, term1615.getClass(), "id", term1616);
        setField(term1615, term1615.getClass(), "name", "ieCtQFdkii");
        setField(term1615, term1615.getClass(), "version", "dEnhdmILtU");
        setField(term1615, term1615.getClass(), "kernel", "hoicvmsovO");
        setIntField(term1655, term1655.getClass(), "year", 2020);
        setShortField(term1655, term1655.getClass(), "month", (short) 7);
        setShortField(term1655, term1655.getClass(), "day", (short) 24);
        setField(term1654, term1654.getClass(), "date", term1655);
        setByteField(term1659, term1659.getClass(), "hour", (byte) 0);
        setByteField(term1659, term1659.getClass(), "minute", (byte) 59);
        setByteField(term1659, term1659.getClass(), "second", (byte) 56);
        setIntField(term1659, term1659.getClass(), "nano", 320219201);
        setField(term1654, term1654.getClass(), "time", term1659);
        setField(term1615, term1615.getClass(), "releaseDate", term1654);
        setField(term1615, term1615.getClass(), "usages", term1664);
        term1666 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term1667 = newInstance(Class.forName("java.time.LocalDate"));
        Object term1671 = newInstance(Class.forName("java.time.LocalTime"));
        setIntField(term1667, term1667.getClass(), "year", 2014);
        setShortField(term1667, term1667.getClass(), "month", (short) 7);
        setShortField(term1667, term1667.getClass(), "day", (short) 13);
        setField(term1666, term1666.getClass(), "date", term1667);
        setByteField(term1671, term1671.getClass(), "hour", (byte) 21);
        setByteField(term1671, term1671.getClass(), "minute", (byte) 46);
        setByteField(term1671, term1671.getClass(), "second", (byte) 0);
        setIntField(term1671, term1671.getClass(), "nano", 887884128);
        setField(term1666, term1666.getClass(), "time", term1671);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.piinalpin.queryrequest.domain.dao.OperatingSystem");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.time.LocalDateTime");
        Object[] args = new Object[1];
        args[0] = term1666;
        callMethod(klass, "setReleaseDate", argTypes, term1615, args);
    }

};


