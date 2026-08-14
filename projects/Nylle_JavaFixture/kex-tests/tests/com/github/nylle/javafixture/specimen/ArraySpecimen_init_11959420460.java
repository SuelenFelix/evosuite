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

public class ArraySpecimen_init_11959420460 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2137;
     Object term2138;
     Object term2156;

    public ArraySpecimen_init_11959420460() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term2137 = newInstance(Class.forName("com.github.nylle.javafixture.SpecimenType"));
        setField(term2137, term2137.getClass(), "type", null);
        HashMap term2151 = new HashMap();
        term2138 = newInstance(Class.forName("com.github.nylle.javafixture.Context"));
        Object term2139 = newInstance(Class.forName("com.github.nylle.javafixture.Configuration"));
        Object term2144 = newInstance(Class.forName("java.time.Clock$FixedClock"));
        Object term2145 = newInstance(Class.forName("java.time.Instant"));
        Object term2148 = newInstance(Class.forName("java.time.ZoneOffset"));
        setIntField(term2139, term2139.getClass(), "maxCollectionSize", 10);
        setIntField(term2139, term2139.getClass(), "minCollectionSize", 2);
        setIntField(term2139, term2139.getClass(), "streamSize", 3);
        setBooleanField(term2139, term2139.getClass(), "usePositiveNumbersOnly", false);
        setLongField(term2145, term2145.getClass(), "seconds", 1786472234L);
        setIntField(term2145, term2145.getClass(), "nanos", 177668000);
        setField(term2144, term2144.getClass(), "instant", term2145);
        setIntField(term2148, term2148.getClass(), "totalSeconds", 0);
        setField(term2148, term2148.getClass(), "id", "");
        setField(term2144, term2144.getClass(), "zone", term2148);
        setField(term2139, term2139.getClass(), "clock", term2144);
        setField(term2138, term2138.getClass(), "configuration", term2139);
        setField(term2138, term2138.getClass(), "cache", term2151);
        HashMap term2167 = new HashMap();
        term2156 = newInstance(Class.forName("com.github.nylle.javafixture.SpecimenFactory"));
        Object term2157 = newInstance(Class.forName("com.github.nylle.javafixture.Context"));
        Object term2158 = newInstance(Class.forName("com.github.nylle.javafixture.Configuration"));
        Object term2163 = newInstance(Class.forName("java.time.Clock$FixedClock"));
        Object term2164 = newInstance(Class.forName("java.time.Instant"));
        setIntField(term2158, term2158.getClass(), "maxCollectionSize", 10);
        setIntField(term2158, term2158.getClass(), "minCollectionSize", 2);
        setIntField(term2158, term2158.getClass(), "streamSize", 3);
        setBooleanField(term2158, term2158.getClass(), "usePositiveNumbersOnly", true);
        setLongField(term2164, term2164.getClass(), "seconds", 1786472234L);
        setIntField(term2164, term2164.getClass(), "nanos", 178452000);
        setField(term2163, term2163.getClass(), "instant", term2164);
        setField(term2163, term2163.getClass(), "zone", term2148);
        setField(term2158, term2158.getClass(), "clock", term2163);
        setField(term2157, term2157.getClass(), "configuration", term2158);
        setField(term2157, term2157.getClass(), "cache", term2167);
        setField(term2156, term2156.getClass(), "context", term2157);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.github.nylle.javafixture.specimen.ArraySpecimen");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Class.forName("com.github.nylle.javafixture.SpecimenType");
        argTypes[1] = Class.forName("com.github.nylle.javafixture.Context");
        argTypes[2] = Class.forName("com.github.nylle.javafixture.SpecimenFactory");
        Object[] args = new Object[3];
        args[0] = term2137;
        args[1] = term2138;
        args[2] = term2156;
        Object instance = callConstructor(klass, argTypes, args);
    }

};


