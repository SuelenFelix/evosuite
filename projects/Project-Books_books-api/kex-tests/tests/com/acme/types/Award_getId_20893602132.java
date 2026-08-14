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

public class Award_getId_20893602132 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term4461;

    public Award_getId_20893602132() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term4515 = Class.forName((String) "com.acme.types.AwardName");
        Field term4514 = ((Class) term4515).getDeclaredField((String) "PORTICO_PRIZE");
        ((Field) term4514).setAccessible(true);
        Object enum7 = ((Field) term4514).get((Object) null);
        term4461 = newInstance(Class.forName("com.acme.types.Award"));
        setField(term4461, term4461.getClass(), "id", "PbMQbuzByL");
        setField(term4461, term4461.getClass(), "awardName", enum7);
        setField(term4461, term4461.getClass(), "category", "ILplPJhYrB");
        setIntField(term4461, term4461.getClass(), "year", 1386130016);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.acme.types.Award");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getId", argTypes, term4461, args);
    }

};


