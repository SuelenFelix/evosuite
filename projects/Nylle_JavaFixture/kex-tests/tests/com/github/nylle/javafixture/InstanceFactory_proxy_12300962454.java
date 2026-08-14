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

public class InstanceFactory_proxy_12300962454 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2981;
     Object term3001;

    public InstanceFactory_proxy_12300962454() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term2990 = new HashMap();
        term2981 = newInstance(Class.forName("com.github.nylle.javafixture.InstanceFactory"));
        Object term2982 = newInstance(Class.forName("com.github.nylle.javafixture.SpecimenFactory"));
        Object term2983 = newInstance(Class.forName("com.github.nylle.javafixture.Context"));
        Object term2984 = newInstance(Class.forName("com.github.nylle.javafixture.Configuration"));
        Object term2989 = newInstance(Class.forName("java.time.Clock$FixedClock"));
        Object term2995 = newInstance(Class.forName("com.github.nylle.javafixture.PseudoRandom"));
        Object term2996 = newInstance(Class.forName("java.util.Random"));
        Object term2997 = newInstance(Class.forName("java.util.concurrent.atomic.AtomicLong"));
        setIntField(term2984, term2984.getClass(), "maxCollectionSize", 10);
        setIntField(term2984, term2984.getClass(), "minCollectionSize", 2);
        setIntField(term2984, term2984.getClass(), "streamSize", 3);
        setBooleanField(term2984, term2984.getClass(), "usePositiveNumbersOnly", true);
        setField(term2989, term2989.getClass(), "instant", null);
        setField(term2989, term2989.getClass(), "zone", null);
        setField(term2984, term2984.getClass(), "clock", term2989);
        setField(term2983, term2983.getClass(), "configuration", term2984);
        setField(term2983, term2983.getClass(), "cache", term2990);
        setField(term2982, term2982.getClass(), "context", term2983);
        setField(term2981, term2981.getClass(), "specimenFactory", term2982);
        setLongField(term2997, term2997.getClass(), "value", 125178175893942L);
        setField(term2996, term2996.getClass(), "seed", term2997);
        setDoubleField(term2996, term2996.getClass(), "nextNextGaussian", 0.0);
        setBooleanField(term2996, term2996.getClass(), "haveNextNextGaussian", false);
        setField(term2995, term2995.getClass(), "random", term2996);
        setField(term2981, term2981.getClass(), "random", term2995);
        term3001 = newInstance(Class.forName("com.github.nylle.javafixture.SpecimenType"));
        setField(term3001, term3001.getClass(), "type", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.github.nylle.javafixture.InstanceFactory");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.github.nylle.javafixture.SpecimenType");
        Object[] args = new Object[1];
        args[0] = term3001;
        callMethod(klass, "proxy", argTypes, term2981, args);
    }

};


