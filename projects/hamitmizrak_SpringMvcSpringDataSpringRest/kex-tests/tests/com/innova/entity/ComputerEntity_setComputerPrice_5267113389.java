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
import java.lang.Double;

public class ComputerEntity_setComputerPrice_5267113389 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1988;
     Object term2018;

    public ComputerEntity_setComputerPrice_5267113389() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term1989 = new Long(4784595517102746672L);
        term1988 = newInstance(Class.forName("com.innova.entity.ComputerEntity"));
        Object term2016 = newInstance(Class.forName("java.util.Date"));
        setField(term1988, term1988.getClass(), "computerId", term1989);
        setField(term1988, term1988.getClass(), "computerName", "MAcUBcBckh");
        setField(term1988, term1988.getClass(), "computerTrade", "oVgzLbrsFr");
        setDoubleField(term1988, term1988.getClass(), "computerPrice", 0.07802449704920456);
        setLongField(term2016, term2016.getClass(), "fastTime", 1761994701322L);
        setField(term2016, term2016.getClass(), "cdate", null);
        setField(term1988, term1988.getClass(), "createdDate", term2016);
        term2018 = new Double(0.5279279537140873);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.innova.entity.ComputerEntity");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = double.class;
        Object[] args = new Object[1];
        args[0] = term2018;
        callMethod(klass, "setComputerPrice", argTypes, term1988, args);
    }

};


