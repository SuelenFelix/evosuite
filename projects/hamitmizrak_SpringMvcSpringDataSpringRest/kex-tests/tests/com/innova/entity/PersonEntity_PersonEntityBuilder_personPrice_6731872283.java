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

public class PersonEntity_PersonEntityBuilder_personPrice_6731872283 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term996;
     Object term1014;

    public PersonEntity_PersonEntityBuilder_personPrice_6731872283() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term997 = new Long(-4365849114644724155L);
        term996 = newInstance(Class.forName("com.innova.entity.PersonEntity$PersonEntityBuilder"));
        Object term1012 = newInstance(Class.forName("java.util.Date"));
        setField(term996, term996.getClass(), "personId", term997);
        setField(term996, term996.getClass(), "personName", "IDCWpPLRkE");
        setDoubleField(term996, term996.getClass(), "personPrice", 0.9828442029246764);
        setLongField(term1012, term1012.getClass(), "fastTime", 1329640267573L);
        setField(term1012, term1012.getClass(), "cdate", null);
        setField(term996, term996.getClass(), "date", term1012);
        term1014 = new Double(0.2779719046761513);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.innova.entity.PersonEntity$PersonEntityBuilder");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = double.class;
        Object[] args = new Object[1];
        args[0] = term1014;
        callMethod(klass, "personPrice", argTypes, term996, args);
    }

};


