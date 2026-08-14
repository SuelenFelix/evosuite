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

public class CollectionSpecimen_init_6059094030 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2770;
     Object term2771;
     Object term2789;

    public CollectionSpecimen_init_6059094030() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term2770 = newInstance(Class.forName("com.github.nylle.javafixture.SpecimenType"));
        setField(term2770, term2770.getClass(), "type", null);
        HashMap term2784 = new HashMap();
        term2771 = newInstance(Class.forName("com.github.nylle.javafixture.Context"));
        Object term2772 = newInstance(Class.forName("com.github.nylle.javafixture.Configuration"));
        Object term2777 = newInstance(Class.forName("java.time.Clock$FixedClock"));
        Object term2778 = newInstance(Class.forName("java.time.Instant"));
        Object term2781 = newInstance(Class.forName("java.time.ZoneOffset"));
        setIntField(term2772, term2772.getClass(), "maxCollectionSize", 10);
        setIntField(term2772, term2772.getClass(), "minCollectionSize", 2);
        setIntField(term2772, term2772.getClass(), "streamSize", 3);
        setBooleanField(term2772, term2772.getClass(), "usePositiveNumbersOnly", true);
        setLongField(term2778, term2778.getClass(), "seconds", 1786472234L);
        setIntField(term2778, term2778.getClass(), "nanos", 861984000);
        setField(term2777, term2777.getClass(), "instant", term2778);
        setIntField(term2781, term2781.getClass(), "totalSeconds", 0);
        setField(term2781, term2781.getClass(), "id", "");
        setField(term2777, term2777.getClass(), "zone", term2781);
        setField(term2772, term2772.getClass(), "clock", term2777);
        setField(term2771, term2771.getClass(), "configuration", term2772);
        setField(term2771, term2771.getClass(), "cache", term2784);
        HashMap term2800 = new HashMap();
        term2789 = newInstance(Class.forName("com.github.nylle.javafixture.SpecimenFactory"));
        Object term2790 = newInstance(Class.forName("com.github.nylle.javafixture.Context"));
        Object term2791 = newInstance(Class.forName("com.github.nylle.javafixture.Configuration"));
        Object term2796 = newInstance(Class.forName("java.time.Clock$FixedClock"));
        Object term2797 = newInstance(Class.forName("java.time.Instant"));
        setIntField(term2791, term2791.getClass(), "maxCollectionSize", 10);
        setIntField(term2791, term2791.getClass(), "minCollectionSize", 2);
        setIntField(term2791, term2791.getClass(), "streamSize", 3);
        setBooleanField(term2791, term2791.getClass(), "usePositiveNumbersOnly", false);
        setLongField(term2797, term2797.getClass(), "seconds", 1786472234L);
        setIntField(term2797, term2797.getClass(), "nanos", 864695000);
        setField(term2796, term2796.getClass(), "instant", term2797);
        setField(term2796, term2796.getClass(), "zone", term2781);
        setField(term2791, term2791.getClass(), "clock", term2796);
        setField(term2790, term2790.getClass(), "configuration", term2791);
        setField(term2790, term2790.getClass(), "cache", term2800);
        setField(term2789, term2789.getClass(), "context", term2790);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.github.nylle.javafixture.specimen.CollectionSpecimen");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Class.forName("com.github.nylle.javafixture.SpecimenType");
        argTypes[1] = Class.forName("com.github.nylle.javafixture.Context");
        argTypes[2] = Class.forName("com.github.nylle.javafixture.SpecimenFactory");
        Object[] args = new Object[3];
        args[0] = term2770;
        args[1] = term2771;
        args[2] = term2789;
        Object instance = callConstructor(klass, argTypes, args);
    }

};


