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

public class PrimitiveSpecimen_init_9280479150 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term3629;
     Object term3630;

    public PrimitiveSpecimen_init_9280479150() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term3629 = newInstance(Class.forName("com.github.nylle.javafixture.SpecimenType"));
        setField(term3629, term3629.getClass(), "type", null);
        HashMap term3643 = new HashMap();
        term3630 = newInstance(Class.forName("com.github.nylle.javafixture.Context"));
        Object term3631 = newInstance(Class.forName("com.github.nylle.javafixture.Configuration"));
        Object term3636 = newInstance(Class.forName("java.time.Clock$FixedClock"));
        Object term3637 = newInstance(Class.forName("java.time.Instant"));
        Object term3640 = newInstance(Class.forName("java.time.ZoneOffset"));
        setIntField(term3631, term3631.getClass(), "maxCollectionSize", 10);
        setIntField(term3631, term3631.getClass(), "minCollectionSize", 2);
        setIntField(term3631, term3631.getClass(), "streamSize", 3);
        setBooleanField(term3631, term3631.getClass(), "usePositiveNumbersOnly", false);
        setLongField(term3637, term3637.getClass(), "seconds", 1786472235L);
        setIntField(term3637, term3637.getClass(), "nanos", 766585000);
        setField(term3636, term3636.getClass(), "instant", term3637);
        setIntField(term3640, term3640.getClass(), "totalSeconds", 0);
        setField(term3640, term3640.getClass(), "id", "");
        setField(term3636, term3636.getClass(), "zone", term3640);
        setField(term3631, term3631.getClass(), "clock", term3636);
        setField(term3630, term3630.getClass(), "configuration", term3631);
        setField(term3630, term3630.getClass(), "cache", term3643);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.github.nylle.javafixture.specimen.PrimitiveSpecimen");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.github.nylle.javafixture.SpecimenType");
        argTypes[1] = Class.forName("com.github.nylle.javafixture.Context");
        Object[] args = new Object[2];
        args[0] = term3629;
        args[1] = term3630;
        Object instance = callConstructor(klass, argTypes, args);
    }

};


