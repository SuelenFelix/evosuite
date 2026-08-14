package com.github.nylle.javafixture.specimen;

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
import static com.github.nylle.javafixture.specimen.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;
import java.util.HashMap;

public class SpecialSpecimen_init_9647653370 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1477;
     Object term1478;

    public SpecialSpecimen_init_9647653370() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term1477 = newInstance(Class.forName("com.github.nylle.javafixture.SpecimenType"));
        setField(term1477, term1477.getClass(), "type", null);
        HashMap term1491 = new HashMap();
        term1478 = newInstance(Class.forName("com.github.nylle.javafixture.Context"));
        Object term1479 = newInstance(Class.forName("com.github.nylle.javafixture.Configuration"));
        Object term1484 = newInstance(Class.forName("java.time.Clock$FixedClock"));
        Object term1485 = newInstance(Class.forName("java.time.Instant"));
        Object term1488 = newInstance(Class.forName("java.time.ZoneOffset"));
        setIntField(term1479, term1479.getClass(), "maxCollectionSize", 10);
        setIntField(term1479, term1479.getClass(), "minCollectionSize", 2);
        setIntField(term1479, term1479.getClass(), "streamSize", 3);
        setBooleanField(term1479, term1479.getClass(), "usePositiveNumbersOnly", false);
        setLongField(term1485, term1485.getClass(), "seconds", 1786472233L);
        setIntField(term1485, term1485.getClass(), "nanos", 427805000);
        setField(term1484, term1484.getClass(), "instant", term1485);
        setIntField(term1488, term1488.getClass(), "totalSeconds", 0);
        setField(term1488, term1488.getClass(), "id", "");
        setField(term1484, term1484.getClass(), "zone", term1488);
        setField(term1479, term1479.getClass(), "clock", term1484);
        setField(term1478, term1478.getClass(), "configuration", term1479);
        setField(term1478, term1478.getClass(), "cache", term1491);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.github.nylle.javafixture.specimen.SpecialSpecimen");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.github.nylle.javafixture.SpecimenType");
        argTypes[1] = Class.forName("com.github.nylle.javafixture.Context");
        Object[] args = new Object[2];
        args[0] = term1477;
        args[1] = term1478;
        Object instance = callConstructor(klass, argTypes, args);
    }

};


