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

public class PredefinedSpecimen_init_424367560 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1935;
     Object term1936;

    public PredefinedSpecimen_init_424367560() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term1935 = newInstance(Class.forName("com.github.nylle.javafixture.SpecimenType"));
        setField(term1935, term1935.getClass(), "type", null);
        HashMap term1949 = new HashMap();
        term1936 = newInstance(Class.forName("com.github.nylle.javafixture.Context"));
        Object term1937 = newInstance(Class.forName("com.github.nylle.javafixture.Configuration"));
        Object term1942 = newInstance(Class.forName("java.time.Clock$FixedClock"));
        Object term1943 = newInstance(Class.forName("java.time.Instant"));
        Object term1946 = newInstance(Class.forName("java.time.ZoneOffset"));
        setIntField(term1937, term1937.getClass(), "maxCollectionSize", 10);
        setIntField(term1937, term1937.getClass(), "minCollectionSize", 2);
        setIntField(term1937, term1937.getClass(), "streamSize", 3);
        setBooleanField(term1937, term1937.getClass(), "usePositiveNumbersOnly", true);
        setLongField(term1943, term1943.getClass(), "seconds", 1786472233L);
        setIntField(term1943, term1943.getClass(), "nanos", 945409000);
        setField(term1942, term1942.getClass(), "instant", term1943);
        setIntField(term1946, term1946.getClass(), "totalSeconds", 0);
        setField(term1946, term1946.getClass(), "id", "");
        setField(term1942, term1942.getClass(), "zone", term1946);
        setField(term1937, term1937.getClass(), "clock", term1942);
        setField(term1936, term1936.getClass(), "configuration", term1937);
        setField(term1936, term1936.getClass(), "cache", term1949);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.github.nylle.javafixture.specimen.PredefinedSpecimen");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.github.nylle.javafixture.SpecimenType");
        argTypes[1] = Class.forName("com.github.nylle.javafixture.Context");
        Object[] args = new Object[2];
        args[0] = term1935;
        args[1] = term1936;
        Object instance = callConstructor(klass, argTypes, args);
    }

};


