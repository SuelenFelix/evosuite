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

public class InstanceFactory_init_13302897340 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term45;

    public InstanceFactory_init_13302897340() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term58 = new HashMap();
        term45 = newInstance(Class.forName("com.github.nylle.javafixture.SpecimenFactory"));
        Object term46 = newInstance(Class.forName("com.github.nylle.javafixture.Context"));
        Object term47 = newInstance(Class.forName("com.github.nylle.javafixture.Configuration"));
        Object term52 = newInstance(Class.forName("java.time.Clock$FixedClock"));
        Object term53 = newInstance(Class.forName("java.time.Instant"));
        Object term56 = newInstance(Class.forName("java.time.ZoneOffset"));
        setIntField(term47, term47.getClass(), "maxCollectionSize", 10);
        setIntField(term47, term47.getClass(), "minCollectionSize", 2);
        setIntField(term47, term47.getClass(), "streamSize", 3);
        setBooleanField(term47, term47.getClass(), "usePositiveNumbersOnly", false);
        setLongField(term53, term53.getClass(), "seconds", 1786471417L);
        setIntField(term53, term53.getClass(), "nanos", 68220000);
        setField(term52, term52.getClass(), "instant", term53);
        setIntField(term56, term56.getClass(), "totalSeconds", 0);
        setField(term56, term56.getClass(), "id", null);
        setField(term52, term52.getClass(), "zone", term56);
        setField(term47, term47.getClass(), "clock", term52);
        setField(term46, term46.getClass(), "configuration", term47);
        setField(term46, term46.getClass(), "cache", term58);
        setField(term45, term45.getClass(), "context", term46);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.github.nylle.javafixture.InstanceFactory");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.github.nylle.javafixture.SpecimenFactory");
        Object[] args = new Object[1];
        args[0] = term45;
        Object instance = callConstructor(klass, argTypes, args);
    }

};


