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

public class PersonEntity_toString_180216074012 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term339;

    public PersonEntity_toString_180216074012() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term340 = new Long(-4325723315152823407L);
        term339 = newInstance(Class.forName("com.innova.entity.PersonEntity"));
        Object term355 = newInstance(Class.forName("java.util.Date"));
        setField(term339, term339.getClass(), "personId", term340);
        setField(term339, term339.getClass(), "personName", "MxlszYVzRf");
        setDoubleField(term339, term339.getClass(), "personPrice", 0.7655020693602768);
        setLongField(term355, term355.getClass(), "fastTime", 1745462962080L);
        setField(term355, term355.getClass(), "cdate", null);
        setField(term339, term339.getClass(), "date", term355);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.innova.entity.PersonEntity");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "toString", argTypes, term339, args);
    }

};


