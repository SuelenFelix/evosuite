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
import java.lang.Double;

public class PersonEntity_PersonEntityBuilder_personPrice_67318722810 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1116;
     Object term1118;

    public PersonEntity_PersonEntityBuilder_personPrice_67318722810() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term1116 = newInstance(Class.forName("com.innova.entity.PersonEntity$PersonEntityBuilder"));
        setField(term1116, term1116.getClass(), "personId", null);
        setField(term1116, term1116.getClass(), "personName", null);
        setDoubleField(term1116, term1116.getClass(), "personPrice", 0.0);
        setField(term1116, term1116.getClass(), "date", null);
        term1118 = new Double(0.0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.innova.entity.PersonEntity$PersonEntityBuilder");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = double.class;
        Object[] args = new Object[1];
        args[0] = term1118;
        callMethod(klass, "personPrice", argTypes, term1116, args);
    }

};


