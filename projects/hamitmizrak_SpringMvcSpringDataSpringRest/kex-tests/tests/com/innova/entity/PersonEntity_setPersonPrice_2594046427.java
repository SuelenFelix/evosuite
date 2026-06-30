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

public class PersonEntity_setPersonPrice_2594046427 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term193;
     Object term211;

    public PersonEntity_setPersonPrice_2594046427() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term194 = new Long(6811161968424632369L);
        term193 = newInstance(Class.forName("com.innova.entity.PersonEntity"));
        Object term209 = newInstance(Class.forName("java.util.Date"));
        setField(term193, term193.getClass(), "personId", term194);
        setField(term193, term193.getClass(), "personName", "MjGYSRKTNF");
        setDoubleField(term193, term193.getClass(), "personPrice", 0.2641345529914265);
        setLongField(term209, term209.getClass(), "fastTime", 1429023851389L);
        setField(term209, term209.getClass(), "cdate", null);
        setField(term193, term193.getClass(), "date", term209);
        term211 = new Double(0.36923381893433327);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.innova.entity.PersonEntity");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = double.class;
        Object[] args = new Object[1];
        args[0] = term211;
        callMethod(klass, "setPersonPrice", argTypes, term193, args);
    }

};


