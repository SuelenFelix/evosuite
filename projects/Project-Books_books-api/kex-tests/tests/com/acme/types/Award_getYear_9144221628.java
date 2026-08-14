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

public class Award_getYear_9144221628 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term6042;

    public Award_getYear_9144221628() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term6096 = Class.forName((String) "com.acme.types.AwardName");
        Field term6095 = ((Class) term6096).getDeclaredField((String) "PORTICO_PRIZE");
        ((Field) term6095).setAccessible(true);
        Object enum14 = ((Field) term6095).get((Object) null);
        term6042 = newInstance(Class.forName("com.acme.types.Award"));
        setField(term6042, term6042.getClass(), "id", "fjOTVskUVh");
        setField(term6042, term6042.getClass(), "awardName", enum14);
        setField(term6042, term6042.getClass(), "category", "OhiftESVwX");
        setIntField(term6042, term6042.getClass(), "year", -375014958);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.acme.types.Award");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getYear", argTypes, term6042, args);
    }

};


