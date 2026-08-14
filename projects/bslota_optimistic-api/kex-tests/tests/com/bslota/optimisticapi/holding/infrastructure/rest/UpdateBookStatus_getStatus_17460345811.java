package com.bslota.optimisticapi.holding.infrastructure.rest;

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
import static com.bslota.optimisticapi.holding.infrastructure.rest.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.String;
import java.lang.Object;

public class UpdateBookStatus_getStatus_17460345811 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term314;

    public UpdateBookStatus_getStatus_17460345811() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term335 = Class.forName((String) "com.bslota.optimisticapi.holding.domain.Status");
        Field term334 = ((Class) term335).getDeclaredField((String) "AVAILABLE");
        ((Field) term334).setAccessible(true);
        Object enum1 = ((Field) term334).get((Object) null);
        term314 = newInstance(Class.forName("com.bslota.optimisticapi.holding.infrastructure.rest.UpdateBookStatus"));
        Object term328 = newInstance(Class.forName("com.bslota.optimisticapi.holding.domain.PatronId"));
        Object term329 = newInstance(Class.forName("java.util.UUID"));
        Object term332 = newInstance(Class.forName("com.bslota.optimisticapi.holding.aggregate.Version"));
        setField(term314, term314.getClass(), "status", enum1);
        setLongField(term329, term329.getClass(), "mostSigBits", -8257434502486459194L);
        setLongField(term329, term329.getClass(), "leastSigBits", -8400487765614892086L);
        setField(term328, term328.getClass(), "value", term329);
        setField(term314, term314.getClass(), "patronId", term328);
        setLongField(term332, term332.getClass(), "value", 6375119433582206027L);
        setField(term314, term314.getClass(), "version", term332);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.bslota.optimisticapi.holding.infrastructure.rest.UpdateBookStatus");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getStatus", argTypes, term314, args);
    }

};


