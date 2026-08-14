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
import java.lang.String;

public class InstanceFactory_hasSpecimenTypeAsParameter_7033132067 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term3115;
     Object term3135;
     Object term3352;

    public InstanceFactory_hasSpecimenTypeAsParameter_7033132067() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term3124 = new HashMap();
        term3115 = newInstance(Class.forName("com.github.nylle.javafixture.InstanceFactory"));
        Object term3116 = newInstance(Class.forName("com.github.nylle.javafixture.SpecimenFactory"));
        Object term3117 = newInstance(Class.forName("com.github.nylle.javafixture.Context"));
        Object term3118 = newInstance(Class.forName("com.github.nylle.javafixture.Configuration"));
        Object term3123 = newInstance(Class.forName("java.time.Clock$FixedClock"));
        Object term3129 = newInstance(Class.forName("com.github.nylle.javafixture.PseudoRandom"));
        Object term3130 = newInstance(Class.forName("java.util.Random"));
        Object term3131 = newInstance(Class.forName("java.util.concurrent.atomic.AtomicLong"));
        setIntField(term3118, term3118.getClass(), "maxCollectionSize", 10);
        setIntField(term3118, term3118.getClass(), "minCollectionSize", 2);
        setIntField(term3118, term3118.getClass(), "streamSize", 3);
        setBooleanField(term3118, term3118.getClass(), "usePositiveNumbersOnly", true);
        setField(term3123, term3123.getClass(), "instant", null);
        setField(term3123, term3123.getClass(), "zone", null);
        setField(term3118, term3118.getClass(), "clock", term3123);
        setField(term3117, term3117.getClass(), "configuration", term3118);
        setField(term3117, term3117.getClass(), "cache", term3124);
        setField(term3116, term3116.getClass(), "context", term3117);
        setField(term3115, term3115.getClass(), "specimenFactory", term3116);
        setLongField(term3131, term3131.getClass(), "value", 270464386647503L);
        setField(term3130, term3130.getClass(), "seed", term3131);
        setDoubleField(term3130, term3130.getClass(), "nextNextGaussian", 0.0);
        setBooleanField(term3130, term3130.getClass(), "haveNextNextGaussian", false);
        setField(term3129, term3129.getClass(), "random", term3130);
        setField(term3115, term3115.getClass(), "random", term3129);
        Class<? extends Object> term3380 = Class.forName((String) "java.io.FileInputStream$1");
        Object[] term3503 = (Object[]) newArray("java.lang.Class", 0);
        term3135 = ((Class) term3380).getDeclaredMethod((String) "close", (Class[]) term3503);
        ((Method) term3135).setAccessible(true);
        term3352 = newInstance(Class.forName("com.github.nylle.javafixture.SpecimenType"));
        setField(term3352, term3352.getClass(), "type", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.github.nylle.javafixture.InstanceFactory");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("java.lang.reflect.Method");
        argTypes[1] = Class.forName("com.github.nylle.javafixture.SpecimenType");
        Object[] args = new Object[2];
        args[0] = term3135;
        args[1] = term3352;
        callMethod(klass, "hasSpecimenTypeAsParameter", argTypes, term3115, args);
    }

};


