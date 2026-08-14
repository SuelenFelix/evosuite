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

public class Award_equals_60423508511 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term6719;
     Object term6760;

    public Award_equals_60423508511() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term6772 = Class.forName((String) "com.acme.types.AwardName");
        Field term6771 = ((Class) term6772).getDeclaredField((String) "DYLAN_PRIZE");
        ((Field) term6771).setAccessible(true);
        Object enum17 = ((Field) term6771).get((Object) null);
        term6719 = newInstance(Class.forName("com.acme.types.Award"));
        setField(term6719, term6719.getClass(), "id", "PbEsDEkNLx");
        setField(term6719, term6719.getClass(), "awardName", enum17);
        setField(term6719, term6719.getClass(), "category", "pWmmwQMysX");
        setIntField(term6719, term6719.getClass(), "year", -2015854073);
        term6760 = newInstance(Class.forName("java.lang.Object"));
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.acme.types.Award");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Object");
        Object[] args = new Object[1];
        args[0] = term6760;
        callMethod(klass, "equals", argTypes, term6719, args);
    }

};


