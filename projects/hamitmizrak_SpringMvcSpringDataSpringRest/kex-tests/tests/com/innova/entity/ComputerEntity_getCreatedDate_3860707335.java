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

public class ComputerEntity_getCreatedDate_3860707335 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1742;

    public ComputerEntity_getCreatedDate_3860707335() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term1743 = new Long(5907001541142728739L);
        term1742 = newInstance(Class.forName("com.innova.entity.ComputerEntity"));
        Object term1770 = newInstance(Class.forName("java.util.Date"));
        setField(term1742, term1742.getClass(), "computerId", term1743);
        setField(term1742, term1742.getClass(), "computerName", "uWHnvSvaPl");
        setField(term1742, term1742.getClass(), "computerTrade", "kBdSllIBVz");
        setDoubleField(term1742, term1742.getClass(), "computerPrice", 0.6300849762307866);
        setLongField(term1770, term1770.getClass(), "fastTime", 1633004775487L);
        setField(term1770, term1770.getClass(), "cdate", null);
        setField(term1742, term1742.getClass(), "createdDate", term1770);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.innova.entity.ComputerEntity");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getCreatedDate", argTypes, term1742, args);
    }

};


