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

public class AbstractSpecimen_init_13653008330 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1;
     Object term2;
     Object term20;

    public AbstractSpecimen_init_13653008330() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term1 = newInstance(Class.forName("com.github.nylle.javafixture.SpecimenType"));
        setField(term1, term1.getClass(), "type", null);
        HashMap term15 = new HashMap();
        term2 = newInstance(Class.forName("com.github.nylle.javafixture.Context"));
        Object term3 = newInstance(Class.forName("com.github.nylle.javafixture.Configuration"));
        Object term8 = newInstance(Class.forName("java.time.Clock$FixedClock"));
        Object term9 = newInstance(Class.forName("java.time.Instant"));
        Object term12 = newInstance(Class.forName("java.time.ZoneOffset"));
        setIntField(term3, term3.getClass(), "maxCollectionSize", 10);
        setIntField(term3, term3.getClass(), "minCollectionSize", 2);
        setIntField(term3, term3.getClass(), "streamSize", 3);
        setBooleanField(term3, term3.getClass(), "usePositiveNumbersOnly", false);
        setLongField(term9, term9.getClass(), "seconds", 1786472229L);
        setIntField(term9, term9.getClass(), "nanos", 878803000);
        setField(term8, term8.getClass(), "instant", term9);
        setIntField(term12, term12.getClass(), "totalSeconds", 0);
        setField(term12, term12.getClass(), "id", "");
        setField(term8, term8.getClass(), "zone", term12);
        setField(term3, term3.getClass(), "clock", term8);
        setField(term2, term2.getClass(), "configuration", term3);
        setField(term2, term2.getClass(), "cache", term15);
        HashMap term31 = new HashMap();
        term20 = newInstance(Class.forName("com.github.nylle.javafixture.SpecimenFactory"));
        Object term21 = newInstance(Class.forName("com.github.nylle.javafixture.Context"));
        Object term22 = newInstance(Class.forName("com.github.nylle.javafixture.Configuration"));
        Object term27 = newInstance(Class.forName("java.time.Clock$FixedClock"));
        Object term28 = newInstance(Class.forName("java.time.Instant"));
        setIntField(term22, term22.getClass(), "maxCollectionSize", 10);
        setIntField(term22, term22.getClass(), "minCollectionSize", 2);
        setIntField(term22, term22.getClass(), "streamSize", 3);
        setBooleanField(term22, term22.getClass(), "usePositiveNumbersOnly", false);
        setLongField(term28, term28.getClass(), "seconds", 1786472229L);
        setIntField(term28, term28.getClass(), "nanos", 881843000);
        setField(term27, term27.getClass(), "instant", term28);
        setField(term27, term27.getClass(), "zone", term12);
        setField(term22, term22.getClass(), "clock", term27);
        setField(term21, term21.getClass(), "configuration", term22);
        setField(term21, term21.getClass(), "cache", term31);
        setField(term20, term20.getClass(), "context", term21);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.github.nylle.javafixture.specimen.AbstractSpecimen");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Class.forName("com.github.nylle.javafixture.SpecimenType");
        argTypes[1] = Class.forName("com.github.nylle.javafixture.Context");
        argTypes[2] = Class.forName("com.github.nylle.javafixture.SpecimenFactory");
        Object[] args = new Object[3];
        args[0] = term1;
        args[1] = term2;
        args[2] = term20;
        Object instance = callConstructor(klass, argTypes, args);
    }

};


