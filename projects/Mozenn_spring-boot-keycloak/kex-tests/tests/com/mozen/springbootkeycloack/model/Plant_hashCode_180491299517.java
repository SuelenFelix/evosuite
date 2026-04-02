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

public class Plant_hashCode_180491299517 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1081;

    public Plant_hashCode_180491299517() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term1082 = new Long(-5476826692763582090L);
        term1081 = newInstance(Class.forName("com.mozen.springbootkeycloack.model.Plant"));
        Object term1120 = newInstance(Class.forName("java.time.Instant"));
        setField(term1081, term1081.getClass(), "id", term1082);
        setField(term1081, term1081.getClass(), "name", "GzFkzHGYFt");
        setField(term1081, term1081.getClass(), "scientificName", "tShwQLRGNe");
        setField(term1081, term1081.getClass(), "family", "LvtrsXUliU");
        setLongField(term1120, term1120.getClass(), "seconds", 1775105447L);
        setIntField(term1120, term1120.getClass(), "nanos", 181527000);
        setField(term1081, term1081.getClass(), "createdAt", term1120);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.mozen.springbootkeycloack.model.Plant");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "hashCode", argTypes, term1081, args);
    }

};


