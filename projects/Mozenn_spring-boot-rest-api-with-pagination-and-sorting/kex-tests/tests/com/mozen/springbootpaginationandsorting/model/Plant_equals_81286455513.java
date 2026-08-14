package com.mozen.springbootpaginationandsorting.model;

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
import static com.mozen.springbootpaginationandsorting.model.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Long;
import java.lang.Object;

public class Plant_equals_81286455513 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term964;
     Object term1006;

    public Plant_equals_81286455513() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term965 = new Long(-4325723315152823407L);
        term964 = newInstance(Class.forName("com.mozen.springbootpaginationandsorting.model.Plant"));
        Object term1003 = newInstance(Class.forName("java.time.Instant"));
        setField(term964, term964.getClass(), "id", term965);
        setField(term964, term964.getClass(), "name", "aKnKipADSo");
        setField(term964, term964.getClass(), "scientificName", "wSQxaModmm");
        setField(term964, term964.getClass(), "family", "UlajhuVLaP");
        setLongField(term1003, term1003.getClass(), "seconds", 1786438250L);
        setIntField(term1003, term1003.getClass(), "nanos", 617707000);
        setField(term964, term964.getClass(), "createdAt", term1003);
        term1006 = newInstance(Class.forName("java.lang.Object"));
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.mozen.springbootpaginationandsorting.model.Plant");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Object");
        Object[] args = new Object[1];
        args[0] = term1006;
        callMethod(klass, "equals", argTypes, term964, args);
    }

};


