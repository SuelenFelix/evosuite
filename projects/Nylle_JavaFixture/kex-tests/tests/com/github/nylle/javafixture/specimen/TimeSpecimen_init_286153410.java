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

public class TimeSpecimen_init_286153410 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term238;
     Object term239;

    public TimeSpecimen_init_286153410() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term238 = newInstance(Class.forName("com.github.nylle.javafixture.SpecimenType"));
        setField(term238, term238.getClass(), "type", null);
        HashMap term252 = new HashMap();
        term239 = newInstance(Class.forName("com.github.nylle.javafixture.Context"));
        Object term240 = newInstance(Class.forName("com.github.nylle.javafixture.Configuration"));
        Object term245 = newInstance(Class.forName("java.time.Clock$FixedClock"));
        Object term246 = newInstance(Class.forName("java.time.Instant"));
        Object term249 = newInstance(Class.forName("java.time.ZoneOffset"));
        setIntField(term240, term240.getClass(), "maxCollectionSize", 10);
        setIntField(term240, term240.getClass(), "minCollectionSize", 2);
        setIntField(term240, term240.getClass(), "streamSize", 3);
        setBooleanField(term240, term240.getClass(), "usePositiveNumbersOnly", true);
        setLongField(term246, term246.getClass(), "seconds", 1786472231L);
        setIntField(term246, term246.getClass(), "nanos", 716024000);
        setField(term245, term245.getClass(), "instant", term246);
        setIntField(term249, term249.getClass(), "totalSeconds", 0);
        setField(term249, term249.getClass(), "id", "");
        setField(term245, term245.getClass(), "zone", term249);
        setField(term240, term240.getClass(), "clock", term245);
        setField(term239, term239.getClass(), "configuration", term240);
        setField(term239, term239.getClass(), "cache", term252);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.github.nylle.javafixture.specimen.TimeSpecimen");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.github.nylle.javafixture.SpecimenType");
        argTypes[1] = Class.forName("com.github.nylle.javafixture.Context");
        Object[] args = new Object[2];
        args[0] = term238;
        args[1] = term239;
        Object instance = callConstructor(klass, argTypes, args);
    }

};


