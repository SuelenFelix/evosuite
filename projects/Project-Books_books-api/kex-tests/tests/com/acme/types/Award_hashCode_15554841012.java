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

public class Award_hashCode_15554841012 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term6941;

    public Award_hashCode_15554841012() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term6994 = Class.forName((String) "com.acme.types.AwardName");
        Field term6993 = ((Class) term6994).getDeclaredField((String) "ORWELL_PRIZE");
        ((Field) term6993).setAccessible(true);
        Object enum18 = ((Field) term6993).get((Object) null);
        term6941 = newInstance(Class.forName("com.acme.types.Award"));
        setField(term6941, term6941.getClass(), "id", "BuJzsOARZG");
        setField(term6941, term6941.getClass(), "awardName", enum18);
        setField(term6941, term6941.getClass(), "category", "lIqJQDMmVL");
        setIntField(term6941, term6941.getClass(), "year", 538259104);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.acme.types.Award");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "hashCode", argTypes, term6941, args);
    }

};


