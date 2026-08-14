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

public class InstanceFactory_construct_12020433711 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term63;
     Object term83;
     Object term84;

    public InstanceFactory_construct_12020433711() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term72 = new HashMap();
        term63 = newInstance(Class.forName("com.github.nylle.javafixture.InstanceFactory"));
        Object term64 = newInstance(Class.forName("com.github.nylle.javafixture.SpecimenFactory"));
        Object term65 = newInstance(Class.forName("com.github.nylle.javafixture.Context"));
        Object term66 = newInstance(Class.forName("com.github.nylle.javafixture.Configuration"));
        Object term71 = newInstance(Class.forName("java.time.Clock$FixedClock"));
        Object term77 = newInstance(Class.forName("com.github.nylle.javafixture.PseudoRandom"));
        Object term78 = newInstance(Class.forName("java.util.Random"));
        Object term79 = newInstance(Class.forName("java.util.concurrent.atomic.AtomicLong"));
        setIntField(term66, term66.getClass(), "maxCollectionSize", 10);
        setIntField(term66, term66.getClass(), "minCollectionSize", 2);
        setIntField(term66, term66.getClass(), "streamSize", 3);
        setBooleanField(term66, term66.getClass(), "usePositiveNumbersOnly", false);
        setField(term71, term71.getClass(), "instant", null);
        setField(term71, term71.getClass(), "zone", null);
        setField(term66, term66.getClass(), "clock", term71);
        setField(term65, term65.getClass(), "configuration", term66);
        setField(term65, term65.getClass(), "cache", term72);
        setField(term64, term64.getClass(), "context", term65);
        setField(term63, term63.getClass(), "specimenFactory", term64);
        setLongField(term79, term79.getClass(), "value", 215637793295811L);
        setField(term78, term78.getClass(), "seed", term79);
        setDoubleField(term78, term78.getClass(), "nextNextGaussian", 0.0);
        setBooleanField(term78, term78.getClass(), "haveNextNextGaussian", false);
        setField(term77, term77.getClass(), "random", term78);
        setField(term63, term63.getClass(), "random", term77);
        term83 = newInstance(Class.forName("com.github.nylle.javafixture.SpecimenType"));
        setField(term83, term83.getClass(), "type", null);
        HashMap term87 = new HashMap();
        term84 = newInstance(Class.forName("com.github.nylle.javafixture.CustomizationContext"));
        Object term85 = newInstance(Class.forName("java.util.ImmutableCollections$ListN"));
        Object[] term86 = (Object[]) newArray("java.lang.Object", 0);
        setField(term85, term85.getClass(), "elements", term86);
        setField(term84, term84.getClass(), "ignoredFields", term85);
        setField(term84, term84.getClass(), "customFields", term87);
        setBooleanField(term84, term84.getClass(), "useRandomConstructor", false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.github.nylle.javafixture.InstanceFactory");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.github.nylle.javafixture.SpecimenType");
        argTypes[1] = Class.forName("com.github.nylle.javafixture.CustomizationContext");
        Object[] args = new Object[2];
        args[0] = term83;
        args[1] = term84;
        callMethod(klass, "construct", argTypes, term63, args);
    }

};


