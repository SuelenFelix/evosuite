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

public class GenericSpecimen_init_19800582760 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2332;
     Object term2333;
     Object term2351;

    public GenericSpecimen_init_19800582760() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term2332 = newInstance(Class.forName("com.github.nylle.javafixture.SpecimenType"));
        setField(term2332, term2332.getClass(), "type", null);
        HashMap term2346 = new HashMap();
        term2333 = newInstance(Class.forName("com.github.nylle.javafixture.Context"));
        Object term2334 = newInstance(Class.forName("com.github.nylle.javafixture.Configuration"));
        Object term2339 = newInstance(Class.forName("java.time.Clock$FixedClock"));
        Object term2340 = newInstance(Class.forName("java.time.Instant"));
        Object term2343 = newInstance(Class.forName("java.time.ZoneOffset"));
        setIntField(term2334, term2334.getClass(), "maxCollectionSize", 10);
        setIntField(term2334, term2334.getClass(), "minCollectionSize", 2);
        setIntField(term2334, term2334.getClass(), "streamSize", 3);
        setBooleanField(term2334, term2334.getClass(), "usePositiveNumbersOnly", false);
        setLongField(term2340, term2340.getClass(), "seconds", 1786472234L);
        setIntField(term2340, term2340.getClass(), "nanos", 451599000);
        setField(term2339, term2339.getClass(), "instant", term2340);
        setIntField(term2343, term2343.getClass(), "totalSeconds", 0);
        setField(term2343, term2343.getClass(), "id", "");
        setField(term2339, term2339.getClass(), "zone", term2343);
        setField(term2334, term2334.getClass(), "clock", term2339);
        setField(term2333, term2333.getClass(), "configuration", term2334);
        setField(term2333, term2333.getClass(), "cache", term2346);
        HashMap term2362 = new HashMap();
        term2351 = newInstance(Class.forName("com.github.nylle.javafixture.SpecimenFactory"));
        Object term2352 = newInstance(Class.forName("com.github.nylle.javafixture.Context"));
        Object term2353 = newInstance(Class.forName("com.github.nylle.javafixture.Configuration"));
        Object term2358 = newInstance(Class.forName("java.time.Clock$FixedClock"));
        Object term2359 = newInstance(Class.forName("java.time.Instant"));
        setIntField(term2353, term2353.getClass(), "maxCollectionSize", 10);
        setIntField(term2353, term2353.getClass(), "minCollectionSize", 2);
        setIntField(term2353, term2353.getClass(), "streamSize", 3);
        setBooleanField(term2353, term2353.getClass(), "usePositiveNumbersOnly", false);
        setLongField(term2359, term2359.getClass(), "seconds", 1786472234L);
        setIntField(term2359, term2359.getClass(), "nanos", 454560000);
        setField(term2358, term2358.getClass(), "instant", term2359);
        setField(term2358, term2358.getClass(), "zone", term2343);
        setField(term2353, term2353.getClass(), "clock", term2358);
        setField(term2352, term2352.getClass(), "configuration", term2353);
        setField(term2352, term2352.getClass(), "cache", term2362);
        setField(term2351, term2351.getClass(), "context", term2352);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.github.nylle.javafixture.specimen.GenericSpecimen");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Class.forName("com.github.nylle.javafixture.SpecimenType");
        argTypes[1] = Class.forName("com.github.nylle.javafixture.Context");
        argTypes[2] = Class.forName("com.github.nylle.javafixture.SpecimenFactory");
        Object[] args = new Object[3];
        args[0] = term2332;
        args[1] = term2333;
        args[2] = term2351;
        Object instance = callConstructor(klass, argTypes, args);
    }

};


