package com.github.nylle.javafixture;

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
import static com.github.nylle.javafixture.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;
import java.util.HashMap;
import java.util.LinkedHashMap;

public class InstanceFactory_proxy_16066549055 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term3002;
     Object term3022;
     Object term3023;

    public InstanceFactory_proxy_16066549055() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term3011 = new HashMap();
        term3002 = newInstance(Class.forName("com.github.nylle.javafixture.InstanceFactory"));
        Object term3003 = newInstance(Class.forName("com.github.nylle.javafixture.SpecimenFactory"));
        Object term3004 = newInstance(Class.forName("com.github.nylle.javafixture.Context"));
        Object term3005 = newInstance(Class.forName("com.github.nylle.javafixture.Configuration"));
        Object term3010 = newInstance(Class.forName("java.time.Clock$FixedClock"));
        Object term3016 = newInstance(Class.forName("com.github.nylle.javafixture.PseudoRandom"));
        Object term3017 = newInstance(Class.forName("java.util.Random"));
        Object term3018 = newInstance(Class.forName("java.util.concurrent.atomic.AtomicLong"));
        setIntField(term3005, term3005.getClass(), "maxCollectionSize", 10);
        setIntField(term3005, term3005.getClass(), "minCollectionSize", 2);
        setIntField(term3005, term3005.getClass(), "streamSize", 3);
        setBooleanField(term3005, term3005.getClass(), "usePositiveNumbersOnly", true);
        setField(term3010, term3010.getClass(), "instant", null);
        setField(term3010, term3010.getClass(), "zone", null);
        setField(term3005, term3005.getClass(), "clock", term3010);
        setField(term3004, term3004.getClass(), "configuration", term3005);
        setField(term3004, term3004.getClass(), "cache", term3011);
        setField(term3003, term3003.getClass(), "context", term3004);
        setField(term3002, term3002.getClass(), "specimenFactory", term3003);
        setLongField(term3018, term3018.getClass(), "value", 37379254805795L);
        setField(term3017, term3017.getClass(), "seed", term3018);
        setDoubleField(term3017, term3017.getClass(), "nextNextGaussian", 0.0);
        setBooleanField(term3017, term3017.getClass(), "haveNextNextGaussian", false);
        setField(term3016, term3016.getClass(), "random", term3017);
        setField(term3002, term3002.getClass(), "random", term3016);
        term3022 = newInstance(Class.forName("com.github.nylle.javafixture.SpecimenType"));
        setField(term3022, term3022.getClass(), "type", null);
        term3023 = new LinkedHashMap();
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.github.nylle.javafixture.InstanceFactory");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.github.nylle.javafixture.SpecimenType");
        argTypes[1] = Class.forName("java.util.Map");
        Object[] args = new Object[2];
        args[0] = term3022;
        args[1] = term3023;
        callMethod(klass, "proxy", argTypes, term3002, args);
    }

};


