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

public class Plant_getName_13908986373 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term173;

    public Plant_getName_13908986373() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term174 = new Long(6375119433582206027L);
        term173 = newInstance(Class.forName("com.mozen.springbootpaginationandsorting.model.Plant"));
        Object term212 = newInstance(Class.forName("java.time.Instant"));
        setField(term173, term173.getClass(), "id", term174);
        setField(term173, term173.getClass(), "name", "SzjVpOQTyS");
        setField(term173, term173.getClass(), "scientificName", "MjGYSRKTNF");
        setField(term173, term173.getClass(), "family", "hRNSzYYIrc");
        setLongField(term212, term212.getClass(), "seconds", 1786438250L);
        setIntField(term212, term212.getClass(), "nanos", 145401000);
        setField(term173, term173.getClass(), "createdAt", term212);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.mozen.springbootpaginationandsorting.model.Plant");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getName", argTypes, term173, args);
    }

};


