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

public class ComputerEntity_setComputerTrade_10187219178 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1916;

    public ComputerEntity_setComputerTrade_10187219178() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term1917 = new Long(-6645965768855543712L);
        term1916 = newInstance(Class.forName("com.innova.entity.ComputerEntity"));
        Object term1944 = newInstance(Class.forName("java.util.Date"));
        setField(term1916, term1916.getClass(), "computerId", term1917);
        setField(term1916, term1916.getClass(), "computerName", "JUmudUmaaV");
        setField(term1916, term1916.getClass(), "computerTrade", "KoyGrUJeJW");
        setDoubleField(term1916, term1916.getClass(), "computerPrice", 0.3587267442738795);
        setLongField(term1944, term1944.getClass(), "fastTime", 1741444563811L);
        setField(term1944, term1944.getClass(), "cdate", null);
        setField(term1916, term1916.getClass(), "createdDate", term1944);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.innova.entity.ComputerEntity");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "HqBOwkVqjD";
        callMethod(klass, "setComputerTrade", argTypes, term1916, args);
    }

};


