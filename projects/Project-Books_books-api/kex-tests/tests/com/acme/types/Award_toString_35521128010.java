package com.acme.types;

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
import static com.acme.types.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.String;
import java.lang.Object;

public class Award_toString_35521128010 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term6498;

    public Award_toString_35521128010() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term6550 = Class.forName((String) "com.acme.types.AwardName");
        Field term6549 = ((Class) term6550).getDeclaredField((String) "NOBEL_PRIZE");
        ((Field) term6549).setAccessible(true);
        Object enum16 = ((Field) term6549).get((Object) null);
        term6498 = newInstance(Class.forName("com.acme.types.Award"));
        setField(term6498, term6498.getClass(), "id", "DhSWasYJlP");
        setField(term6498, term6498.getClass(), "awardName", enum16);
        setField(term6498, term6498.getClass(), "category", "JOSsHVpnAd");
        setIntField(term6498, term6498.getClass(), "year", -341152642);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.acme.types.Award");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "toString", argTypes, term6498, args);
    }

};


