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

public class ComputerEntity_getComputerPrice_3263312184 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1692;

    public ComputerEntity_getComputerPrice_3263312184() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term1693 = new Long(-8708192233349544946L);
        term1692 = newInstance(Class.forName("com.innova.entity.ComputerEntity"));
        Object term1720 = newInstance(Class.forName("java.util.Date"));
        setField(term1692, term1692.getClass(), "computerId", term1693);
        setField(term1692, term1692.getClass(), "computerName", "eqJfYWRaEL");
        setField(term1692, term1692.getClass(), "computerTrade", "fhkbdRViHi");
        setDoubleField(term1692, term1692.getClass(), "computerPrice", 0.2852810965221698);
        setLongField(term1720, term1720.getClass(), "fastTime", 1426018874434L);
        setField(term1720, term1720.getClass(), "cdate", null);
        setField(term1692, term1692.getClass(), "createdDate", term1720);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.innova.entity.ComputerEntity");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getComputerPrice", argTypes, term1692, args);
    }

};


