package com.bslota.optimisticapi.holding.application;

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
import static com.bslota.optimisticapi.holding.application.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;

public class PlaceOnHoldCommand_getPatronId_10558308315 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term159;

    public PlaceOnHoldCommand_getPatronId_10558308315() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term159 = newInstance(Class.forName("com.bslota.optimisticapi.holding.application.PlaceOnHoldCommand"));
        Object term160 = newInstance(Class.forName("com.bslota.optimisticapi.holding.domain.BookId"));
        Object term161 = newInstance(Class.forName("java.util.UUID"));
        Object term164 = newInstance(Class.forName("com.bslota.optimisticapi.holding.domain.PatronId"));
        Object term165 = newInstance(Class.forName("java.util.UUID"));
        Object term168 = newInstance(Class.forName("com.bslota.optimisticapi.holding.aggregate.Version"));
        setLongField(term161, term161.getClass(), "mostSigBits", 6855071767938501807L);
        setLongField(term161, term161.getClass(), "leastSigBits", -5892135042702373494L);
        setField(term160, term160.getClass(), "value", term161);
        setField(term159, term159.getClass(), "bookId", term160);
        setLongField(term165, term165.getClass(), "mostSigBits", 5262507301787091109L);
        setLongField(term165, term165.getClass(), "leastSigBits", -6823727938421990489L);
        setField(term164, term164.getClass(), "value", term165);
        setField(term159, term159.getClass(), "patronId", term164);
        setLongField(term168, term168.getClass(), "value", -5476826692763582090L);
        setField(term159, term159.getClass(), "version", term168);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.bslota.optimisticapi.holding.application.PlaceOnHoldCommand");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getPatronId", argTypes, term159, args);
    }

};


