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

public class InstanceFactory_createCollection_19255405146 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term3094;
     Object term3114;

    public InstanceFactory_createCollection_19255405146() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term3103 = new HashMap();
        term3094 = newInstance(Class.forName("com.github.nylle.javafixture.InstanceFactory"));
        Object term3095 = newInstance(Class.forName("com.github.nylle.javafixture.SpecimenFactory"));
        Object term3096 = newInstance(Class.forName("com.github.nylle.javafixture.Context"));
        Object term3097 = newInstance(Class.forName("com.github.nylle.javafixture.Configuration"));
        Object term3102 = newInstance(Class.forName("java.time.Clock$FixedClock"));
        Object term3108 = newInstance(Class.forName("com.github.nylle.javafixture.PseudoRandom"));
        Object term3109 = newInstance(Class.forName("java.util.Random"));
        Object term3110 = newInstance(Class.forName("java.util.concurrent.atomic.AtomicLong"));
        setIntField(term3097, term3097.getClass(), "maxCollectionSize", 10);
        setIntField(term3097, term3097.getClass(), "minCollectionSize", 2);
        setIntField(term3097, term3097.getClass(), "streamSize", 3);
        setBooleanField(term3097, term3097.getClass(), "usePositiveNumbersOnly", false);
        setField(term3102, term3102.getClass(), "instant", null);
        setField(term3102, term3102.getClass(), "zone", null);
        setField(term3097, term3097.getClass(), "clock", term3102);
        setField(term3096, term3096.getClass(), "configuration", term3097);
        setField(term3096, term3096.getClass(), "cache", term3103);
        setField(term3095, term3095.getClass(), "context", term3096);
        setField(term3094, term3094.getClass(), "specimenFactory", term3095);
        setLongField(term3110, term3110.getClass(), "value", 108596013933892L);
        setField(term3109, term3109.getClass(), "seed", term3110);
        setDoubleField(term3109, term3109.getClass(), "nextNextGaussian", 0.0);
        setBooleanField(term3109, term3109.getClass(), "haveNextNextGaussian", false);
        setField(term3108, term3108.getClass(), "random", term3109);
        setField(term3094, term3094.getClass(), "random", term3108);
        term3114 = newInstance(Class.forName("com.github.nylle.javafixture.SpecimenType"));
        setField(term3114, term3114.getClass(), "type", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.github.nylle.javafixture.InstanceFactory");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.github.nylle.javafixture.SpecimenType");
        Object[] args = new Object[1];
        args[0] = term3114;
        callMethod(klass, "createCollection", argTypes, term3094, args);
    }

};


