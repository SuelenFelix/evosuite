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

public class ComputerEntity_ComputerEntityBuilder_computerId_9594506811 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1126;
     Object term1156;

    public ComputerEntity_ComputerEntityBuilder_computerId_9594506811() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term1127 = new Long(-4502405999831680926L);
        term1126 = newInstance(Class.forName("com.innova.entity.ComputerEntity$ComputerEntityBuilder"));
        Object term1154 = newInstance(Class.forName("java.util.Date"));
        setField(term1126, term1126.getClass(), "computerId", term1127);
        setField(term1126, term1126.getClass(), "computerName", "UlajhuVLaP");
        setField(term1126, term1126.getClass(), "computerTrade", "gGSMzuGICf");
        setDoubleField(term1126, term1126.getClass(), "computerPrice", 0.8598297828918529);
        setLongField(term1154, term1154.getClass(), "fastTime", 1659994192918L);
        setField(term1154, term1154.getClass(), "cdate", null);
        setField(term1126, term1126.getClass(), "createdDate", term1154);
        term1156 = new Long(1967728129628047933L);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.innova.entity.ComputerEntity$ComputerEntityBuilder");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Long");
        Object[] args = new Object[1];
        args[0] = term1156;
        callMethod(klass, "computerId", argTypes, term1126, args);
    }

};


