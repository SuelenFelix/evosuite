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

public class ComputerEntity_setComputerName_12967233947 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1844;

    public ComputerEntity_setComputerName_12967233947() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term1845 = new Long(-6292278961887936280L);
        term1844 = newInstance(Class.forName("com.innova.entity.ComputerEntity"));
        Object term1872 = newInstance(Class.forName("java.util.Date"));
        setField(term1844, term1844.getClass(), "computerId", term1845);
        setField(term1844, term1844.getClass(), "computerName", "bLPjGVBhlX");
        setField(term1844, term1844.getClass(), "computerTrade", "whBvTVIIlC");
        setDoubleField(term1844, term1844.getClass(), "computerPrice", 0.0668892744806211);
        setLongField(term1872, term1872.getClass(), "fastTime", 1400691778698L);
        setField(term1872, term1872.getClass(), "cdate", null);
        setField(term1844, term1844.getClass(), "createdDate", term1872);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.innova.entity.ComputerEntity");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "IgRJUzaCwW";
        callMethod(klass, "setComputerName", argTypes, term1844, args);
    }

};


