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

public class MapSpecimen_init_1417980790 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term852;
     Object term853;
     Object term871;

    public MapSpecimen_init_1417980790() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term852 = newInstance(Class.forName("com.github.nylle.javafixture.SpecimenType"));
        setField(term852, term852.getClass(), "type", null);
        HashMap term866 = new HashMap();
        term853 = newInstance(Class.forName("com.github.nylle.javafixture.Context"));
        Object term854 = newInstance(Class.forName("com.github.nylle.javafixture.Configuration"));
        Object term859 = newInstance(Class.forName("java.time.Clock$FixedClock"));
        Object term860 = newInstance(Class.forName("java.time.Instant"));
        Object term863 = newInstance(Class.forName("java.time.ZoneOffset"));
        setIntField(term854, term854.getClass(), "maxCollectionSize", 10);
        setIntField(term854, term854.getClass(), "minCollectionSize", 2);
        setIntField(term854, term854.getClass(), "streamSize", 3);
        setBooleanField(term854, term854.getClass(), "usePositiveNumbersOnly", true);
        setLongField(term860, term860.getClass(), "seconds", 1786472232L);
        setIntField(term860, term860.getClass(), "nanos", 708675000);
        setField(term859, term859.getClass(), "instant", term860);
        setIntField(term863, term863.getClass(), "totalSeconds", 0);
        setField(term863, term863.getClass(), "id", "");
        setField(term859, term859.getClass(), "zone", term863);
        setField(term854, term854.getClass(), "clock", term859);
        setField(term853, term853.getClass(), "configuration", term854);
        setField(term853, term853.getClass(), "cache", term866);
        HashMap term882 = new HashMap();
        term871 = newInstance(Class.forName("com.github.nylle.javafixture.SpecimenFactory"));
        Object term872 = newInstance(Class.forName("com.github.nylle.javafixture.Context"));
        Object term873 = newInstance(Class.forName("com.github.nylle.javafixture.Configuration"));
        Object term878 = newInstance(Class.forName("java.time.Clock$FixedClock"));
        Object term879 = newInstance(Class.forName("java.time.Instant"));
        setIntField(term873, term873.getClass(), "maxCollectionSize", 10);
        setIntField(term873, term873.getClass(), "minCollectionSize", 2);
        setIntField(term873, term873.getClass(), "streamSize", 3);
        setBooleanField(term873, term873.getClass(), "usePositiveNumbersOnly", true);
        setLongField(term879, term879.getClass(), "seconds", 1786472232L);
        setIntField(term879, term879.getClass(), "nanos", 710225000);
        setField(term878, term878.getClass(), "instant", term879);
        setField(term878, term878.getClass(), "zone", term863);
        setField(term873, term873.getClass(), "clock", term878);
        setField(term872, term872.getClass(), "configuration", term873);
        setField(term872, term872.getClass(), "cache", term882);
        setField(term871, term871.getClass(), "context", term872);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.github.nylle.javafixture.specimen.MapSpecimen");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Class.forName("com.github.nylle.javafixture.SpecimenType");
        argTypes[1] = Class.forName("com.github.nylle.javafixture.Context");
        argTypes[2] = Class.forName("com.github.nylle.javafixture.SpecimenFactory");
        Object[] args = new Object[3];
        args[0] = term852;
        args[1] = term853;
        args[2] = term871;
        Object instance = callConstructor(klass, argTypes, args);
    }

};


