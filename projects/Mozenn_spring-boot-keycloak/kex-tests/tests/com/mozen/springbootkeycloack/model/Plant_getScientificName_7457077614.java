package com.mozen.springbootkeycloack.model;

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
import static com.mozen.springbootkeycloack.model.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Long;
import java.lang.Object;

public class Plant_getScientificName_7457077614 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term211;

    public Plant_getScientificName_7457077614() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term212 = new Long(-8257434502486459194L);
        term211 = newInstance(Class.forName("com.mozen.springbootkeycloack.model.Plant"));
        Object term250 = newInstance(Class.forName("java.time.Instant"));
        setField(term211, term211.getClass(), "id", term212);
        setField(term211, term211.getClass(), "name", "RMFIsYGgne");
        setField(term211, term211.getClass(), "scientificName", "NRdvgJlhkX");
        setField(term211, term211.getClass(), "family", "uuaPigETmJ");
        setLongField(term250, term250.getClass(), "seconds", 1786466033L);
        setIntField(term250, term250.getClass(), "nanos", 619335000);
        setField(term211, term211.getClass(), "createdAt", term250);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.mozen.springbootkeycloack.model.Plant");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getScientificName", argTypes, term211, args);
    }

};


