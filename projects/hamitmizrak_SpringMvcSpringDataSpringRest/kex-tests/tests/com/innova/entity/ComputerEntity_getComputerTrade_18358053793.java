package com.innova.entity;

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
import static com.innova.entity.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Long;
import java.lang.Object;

public class ComputerEntity_getComputerTrade_18358053793 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1642;

    public ComputerEntity_getComputerTrade_18358053793() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term1643 = new Long(1439298019805881866L);
        term1642 = newInstance(Class.forName("com.innova.entity.ComputerEntity"));
        Object term1670 = newInstance(Class.forName("java.util.Date"));
        setField(term1642, term1642.getClass(), "computerId", term1643);
        setField(term1642, term1642.getClass(), "computerName", "dEnhdmILtU");
        setField(term1642, term1642.getClass(), "computerTrade", "hoicvmsovO");
        setDoubleField(term1642, term1642.getClass(), "computerPrice", 0.6805867182029153);
        setLongField(term1670, term1670.getClass(), "fastTime", 1666076287186L);
        setField(term1670, term1670.getClass(), "cdate", null);
        setField(term1642, term1642.getClass(), "createdDate", term1670);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.innova.entity.ComputerEntity");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getComputerTrade", argTypes, term1642, args);
    }

};


