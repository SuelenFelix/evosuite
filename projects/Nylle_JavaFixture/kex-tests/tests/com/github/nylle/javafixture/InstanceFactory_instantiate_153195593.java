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

public class InstanceFactory_instantiate_153195593 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2960;
     Object term2980;

    public InstanceFactory_instantiate_153195593() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term2969 = new HashMap();
        term2960 = newInstance(Class.forName("com.github.nylle.javafixture.InstanceFactory"));
        Object term2961 = newInstance(Class.forName("com.github.nylle.javafixture.SpecimenFactory"));
        Object term2962 = newInstance(Class.forName("com.github.nylle.javafixture.Context"));
        Object term2963 = newInstance(Class.forName("com.github.nylle.javafixture.Configuration"));
        Object term2968 = newInstance(Class.forName("java.time.Clock$FixedClock"));
        Object term2974 = newInstance(Class.forName("com.github.nylle.javafixture.PseudoRandom"));
        Object term2975 = newInstance(Class.forName("java.util.Random"));
        Object term2976 = newInstance(Class.forName("java.util.concurrent.atomic.AtomicLong"));
        setIntField(term2963, term2963.getClass(), "maxCollectionSize", 10);
        setIntField(term2963, term2963.getClass(), "minCollectionSize", 2);
        setIntField(term2963, term2963.getClass(), "streamSize", 3);
        setBooleanField(term2963, term2963.getClass(), "usePositiveNumbersOnly", true);
        setField(term2968, term2968.getClass(), "instant", null);
        setField(term2968, term2968.getClass(), "zone", null);
        setField(term2963, term2963.getClass(), "clock", term2968);
        setField(term2962, term2962.getClass(), "configuration", term2963);
        setField(term2962, term2962.getClass(), "cache", term2969);
        setField(term2961, term2961.getClass(), "context", term2962);
        setField(term2960, term2960.getClass(), "specimenFactory", term2961);
        setLongField(term2976, term2976.getClass(), "value", 196794261829761L);
        setField(term2975, term2975.getClass(), "seed", term2976);
        setDoubleField(term2975, term2975.getClass(), "nextNextGaussian", 0.0);
        setBooleanField(term2975, term2975.getClass(), "haveNextNextGaussian", false);
        setField(term2974, term2974.getClass(), "random", term2975);
        setField(term2960, term2960.getClass(), "random", term2974);
        term2980 = newInstance(Class.forName("com.github.nylle.javafixture.SpecimenType"));
        setField(term2980, term2980.getClass(), "type", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.github.nylle.javafixture.InstanceFactory");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.github.nylle.javafixture.SpecimenType");
        Object[] args = new Object[1];
        args[0] = term2980;
        callMethod(klass, "instantiate", argTypes, term2960, args);
    }

};


