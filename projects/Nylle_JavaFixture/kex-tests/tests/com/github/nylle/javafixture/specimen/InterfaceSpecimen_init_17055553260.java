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

public class InterfaceSpecimen_init_17055553260 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term3353;
     Object term3354;
     Object term3372;

    public InterfaceSpecimen_init_17055553260() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term3353 = newInstance(Class.forName("com.github.nylle.javafixture.SpecimenType"));
        setField(term3353, term3353.getClass(), "type", null);
        HashMap term3367 = new HashMap();
        term3354 = newInstance(Class.forName("com.github.nylle.javafixture.Context"));
        Object term3355 = newInstance(Class.forName("com.github.nylle.javafixture.Configuration"));
        Object term3360 = newInstance(Class.forName("java.time.Clock$FixedClock"));
        Object term3361 = newInstance(Class.forName("java.time.Instant"));
        Object term3364 = newInstance(Class.forName("java.time.ZoneOffset"));
        setIntField(term3355, term3355.getClass(), "maxCollectionSize", 10);
        setIntField(term3355, term3355.getClass(), "minCollectionSize", 2);
        setIntField(term3355, term3355.getClass(), "streamSize", 3);
        setBooleanField(term3355, term3355.getClass(), "usePositiveNumbersOnly", false);
        setLongField(term3361, term3361.getClass(), "seconds", 1786472235L);
        setIntField(term3361, term3361.getClass(), "nanos", 463843000);
        setField(term3360, term3360.getClass(), "instant", term3361);
        setIntField(term3364, term3364.getClass(), "totalSeconds", 0);
        setField(term3364, term3364.getClass(), "id", "");
        setField(term3360, term3360.getClass(), "zone", term3364);
        setField(term3355, term3355.getClass(), "clock", term3360);
        setField(term3354, term3354.getClass(), "configuration", term3355);
        setField(term3354, term3354.getClass(), "cache", term3367);
        HashMap term3383 = new HashMap();
        term3372 = newInstance(Class.forName("com.github.nylle.javafixture.SpecimenFactory"));
        Object term3373 = newInstance(Class.forName("com.github.nylle.javafixture.Context"));
        Object term3374 = newInstance(Class.forName("com.github.nylle.javafixture.Configuration"));
        Object term3379 = newInstance(Class.forName("java.time.Clock$FixedClock"));
        Object term3380 = newInstance(Class.forName("java.time.Instant"));
        setIntField(term3374, term3374.getClass(), "maxCollectionSize", 10);
        setIntField(term3374, term3374.getClass(), "minCollectionSize", 2);
        setIntField(term3374, term3374.getClass(), "streamSize", 3);
        setBooleanField(term3374, term3374.getClass(), "usePositiveNumbersOnly", false);
        setLongField(term3380, term3380.getClass(), "seconds", 1786472235L);
        setIntField(term3380, term3380.getClass(), "nanos", 464767000);
        setField(term3379, term3379.getClass(), "instant", term3380);
        setField(term3379, term3379.getClass(), "zone", term3364);
        setField(term3374, term3374.getClass(), "clock", term3379);
        setField(term3373, term3373.getClass(), "configuration", term3374);
        setField(term3373, term3373.getClass(), "cache", term3383);
        setField(term3372, term3372.getClass(), "context", term3373);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.github.nylle.javafixture.specimen.InterfaceSpecimen");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Class.forName("com.github.nylle.javafixture.SpecimenType");
        argTypes[1] = Class.forName("com.github.nylle.javafixture.Context");
        argTypes[2] = Class.forName("com.github.nylle.javafixture.SpecimenFactory");
        Object[] args = new Object[3];
        args[0] = term3353;
        args[1] = term3354;
        args[2] = term3372;
        Object instance = callConstructor(klass, argTypes, args);
    }

};


