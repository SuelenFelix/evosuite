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

public class UpdateBookStatus_patronId_6459398912 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term598;

    public UpdateBookStatus_patronId_6459398912() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term619 = Class.forName((String) "com.bslota.optimisticapi.holding.domain.Status");
        Field term618 = ((Class) term619).getDeclaredField((String) "AVAILABLE");
        ((Field) term618).setAccessible(true);
        Object enum2 = ((Field) term618).get((Object) null);
        term598 = newInstance(Class.forName("com.bslota.optimisticapi.holding.infrastructure.rest.UpdateBookStatus"));
        Object term612 = newInstance(Class.forName("com.bslota.optimisticapi.holding.domain.PatronId"));
        Object term613 = newInstance(Class.forName("java.util.UUID"));
        Object term616 = newInstance(Class.forName("com.bslota.optimisticapi.holding.aggregate.Version"));
        setField(term598, term598.getClass(), "status", enum2);
        setLongField(term613, term613.getClass(), "mostSigBits", 5270370404989704783L);
        setLongField(term613, term613.getClass(), "leastSigBits", 7411271909051562686L);
        setField(term612, term612.getClass(), "value", term613);
        setField(term598, term598.getClass(), "patronId", term612);
        setLongField(term616, term616.getClass(), "value", -8257434502486459194L);
        setField(term598, term598.getClass(), "version", term616);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.bslota.optimisticapi.holding.infrastructure.rest.UpdateBookStatus");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "patronId", argTypes, term598, args);
    }

};


