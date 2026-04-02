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

public class PersonEntity_PersonEntityBuilder_toString_17352687016 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1084;

    public PersonEntity_PersonEntityBuilder_toString_17352687016() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term1085 = new Long(-7672528020740371001L);
        term1084 = newInstance(Class.forName("com.innova.entity.PersonEntity$PersonEntityBuilder"));
        Object term1100 = newInstance(Class.forName("java.util.Date"));
        setField(term1084, term1084.getClass(), "personId", term1085);
        setField(term1084, term1084.getClass(), "personName", "wSQxaModmm");
        setDoubleField(term1084, term1084.getClass(), "personPrice", 0.4569171842750229);
        setLongField(term1100, term1100.getClass(), "fastTime", 1442370534632L);
        setField(term1100, term1100.getClass(), "cdate", null);
        setField(term1084, term1084.getClass(), "date", term1100);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.innova.entity.PersonEntity$PersonEntityBuilder");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "toString", argTypes, term1084, args);
    }

};


