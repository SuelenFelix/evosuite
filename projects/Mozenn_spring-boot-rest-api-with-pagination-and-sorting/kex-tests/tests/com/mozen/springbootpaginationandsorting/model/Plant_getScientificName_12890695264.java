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

public class Plant_getScientificName_12890695264 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term245;

    public Plant_getScientificName_12890695264() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term246 = new Long(-8257434502486459194L);
        term245 = newInstance(Class.forName("com.mozen.springbootpaginationandsorting.model.Plant"));
        Object term284 = newInstance(Class.forName("java.time.Instant"));
        setField(term245, term245.getClass(), "id", term246);
        setField(term245, term245.getClass(), "name", "RMFIsYGgne");
        setField(term245, term245.getClass(), "scientificName", "NRdvgJlhkX");
        setField(term245, term245.getClass(), "family", "uuaPigETmJ");
        setLongField(term284, term284.getClass(), "seconds", 1786438250L);
        setIntField(term284, term284.getClass(), "nanos", 187731000);
        setField(term245, term245.getClass(), "createdAt", term284);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.mozen.springbootpaginationandsorting.model.Plant");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getScientificName", argTypes, term245, args);
    }

};


