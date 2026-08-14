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

public class Award_setAwardName_2548342885 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term5166;
     Object enum11;

    public Award_setAwardName_2548342885() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term5236 = Class.forName((String) "com.acme.types.AwardName");
        Field term5235 = ((Class) term5236).getDeclaredField((String) "PORTICO_PRIZE");
        ((Field) term5235).setAccessible(true);
        Object enum10 = ((Field) term5235).get((Object) null);
        term5166 = newInstance(Class.forName("com.acme.types.Award"));
        setField(term5166, term5166.getClass(), "id", "SbPIlRKXLL");
        setField(term5166, term5166.getClass(), "awardName", enum10);
        setField(term5166, term5166.getClass(), "category", "TGjqGBrVob");
        setIntField(term5166, term5166.getClass(), "year", 1474524152);
        Class<? extends Object> term5412 = Class.forName((String) "com.acme.types.AwardName");
        Field term5411 = ((Class) term5412).getDeclaredField((String) "ORWELL_PRIZE");
        ((Field) term5411).setAccessible(true);
        enum11 = ((Field) term5411).get((Object) null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.acme.types.Award");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.acme.types.AwardName");
        Object[] args = new Object[1];
        args[0] = enum11;
        callMethod(klass, "setAwardName", argTypes, term5166, args);
    }

};


