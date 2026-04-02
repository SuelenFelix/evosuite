package com.mozen.springboothibernatesearch.model;

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
import static com.mozen.springboothibernatesearch.model.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Long;
import java.lang.Object;

public class Plant_hashCode_118938051715 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1076;

    public Plant_hashCode_118938051715() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term1077 = new Long(-5476826692763582090L);
        term1076 = newInstance(Class.forName("com.mozen.springboothibernatesearch.model.Plant"));
        Object term1115 = newInstance(Class.forName("java.time.Instant"));
        setField(term1076, term1076.getClass(), "id", term1077);
        setField(term1076, term1076.getClass(), "name", "GzFkzHGYFt");
        setField(term1076, term1076.getClass(), "scientificName", "tShwQLRGNe");
        setField(term1076, term1076.getClass(), "family", "LvtrsXUliU");
        setLongField(term1115, term1115.getClass(), "seconds", 1775099878L);
        setIntField(term1115, term1115.getClass(), "nanos", 932157000);
        setField(term1076, term1076.getClass(), "createdAt", term1115);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.mozen.springboothibernatesearch.model.Plant");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "hashCode", argTypes, term1076, args);
    }

};


