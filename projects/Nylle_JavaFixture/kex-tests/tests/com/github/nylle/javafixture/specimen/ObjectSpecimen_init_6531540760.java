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

public class ObjectSpecimen_init_6531540760 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term394;
     Object term395;
     Object term413;

    public ObjectSpecimen_init_6531540760() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term394 = newInstance(Class.forName("com.github.nylle.javafixture.SpecimenType"));
        setField(term394, term394.getClass(), "type", null);
        HashMap term408 = new HashMap();
        term395 = newInstance(Class.forName("com.github.nylle.javafixture.Context"));
        Object term396 = newInstance(Class.forName("com.github.nylle.javafixture.Configuration"));
        Object term401 = newInstance(Class.forName("java.time.Clock$FixedClock"));
        Object term402 = newInstance(Class.forName("java.time.Instant"));
        Object term405 = newInstance(Class.forName("java.time.ZoneOffset"));
        setIntField(term396, term396.getClass(), "maxCollectionSize", 10);
        setIntField(term396, term396.getClass(), "minCollectionSize", 2);
        setIntField(term396, term396.getClass(), "streamSize", 3);
        setBooleanField(term396, term396.getClass(), "usePositiveNumbersOnly", false);
        setLongField(term402, term402.getClass(), "seconds", 1786472232L);
        setIntField(term402, term402.getClass(), "nanos", 165291000);
        setField(term401, term401.getClass(), "instant", term402);
        setIntField(term405, term405.getClass(), "totalSeconds", 0);
        setField(term405, term405.getClass(), "id", "");
        setField(term401, term401.getClass(), "zone", term405);
        setField(term396, term396.getClass(), "clock", term401);
        setField(term395, term395.getClass(), "configuration", term396);
        setField(term395, term395.getClass(), "cache", term408);
        HashMap term424 = new HashMap();
        term413 = newInstance(Class.forName("com.github.nylle.javafixture.SpecimenFactory"));
        Object term414 = newInstance(Class.forName("com.github.nylle.javafixture.Context"));
        Object term415 = newInstance(Class.forName("com.github.nylle.javafixture.Configuration"));
        Object term420 = newInstance(Class.forName("java.time.Clock$FixedClock"));
        Object term421 = newInstance(Class.forName("java.time.Instant"));
        setIntField(term415, term415.getClass(), "maxCollectionSize", 10);
        setIntField(term415, term415.getClass(), "minCollectionSize", 2);
        setIntField(term415, term415.getClass(), "streamSize", 3);
        setBooleanField(term415, term415.getClass(), "usePositiveNumbersOnly", true);
        setLongField(term421, term421.getClass(), "seconds", 1786472232L);
        setIntField(term421, term421.getClass(), "nanos", 166337000);
        setField(term420, term420.getClass(), "instant", term421);
        setField(term420, term420.getClass(), "zone", term405);
        setField(term415, term415.getClass(), "clock", term420);
        setField(term414, term414.getClass(), "configuration", term415);
        setField(term414, term414.getClass(), "cache", term424);
        setField(term413, term413.getClass(), "context", term414);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.github.nylle.javafixture.specimen.ObjectSpecimen");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Class.forName("com.github.nylle.javafixture.SpecimenType");
        argTypes[1] = Class.forName("com.github.nylle.javafixture.Context");
        argTypes[2] = Class.forName("com.github.nylle.javafixture.SpecimenFactory");
        Object[] args = new Object[3];
        args[0] = term394;
        args[1] = term395;
        args[2] = term413;
        Object instance = callConstructor(klass, argTypes, args);
    }

};


