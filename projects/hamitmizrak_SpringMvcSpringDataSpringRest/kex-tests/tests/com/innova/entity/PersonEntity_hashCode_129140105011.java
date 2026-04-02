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

public class PersonEntity_hashCode_129140105011 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term311;

    public PersonEntity_hashCode_129140105011() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term312 = new Long(-8885298608300233488L);
        term311 = newInstance(Class.forName("com.innova.entity.PersonEntity"));
        Object term327 = newInstance(Class.forName("java.util.Date"));
        setField(term311, term311.getClass(), "personId", term312);
        setField(term311, term311.getClass(), "personName", "uuaPigETmJ");
        setDoubleField(term311, term311.getClass(), "personPrice", 0.5183269973490326);
        setLongField(term327, term327.getClass(), "fastTime", 1589457921030L);
        setField(term327, term327.getClass(), "cdate", null);
        setField(term311, term311.getClass(), "date", term327);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.innova.entity.PersonEntity");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "hashCode", argTypes, term311, args);
    }

};


