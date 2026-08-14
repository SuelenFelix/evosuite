package com.bslota.optimisticapi.holding.domain;

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
import static com.bslota.optimisticapi.holding.domain.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;

public class PatronId_from_11640420001 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2233;

    public PatronId_from_11640420001() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term2233 = newInstance(Class.forName("java.util.UUID"));
        setLongField(term2233, term2233.getClass(), "mostSigBits", 2443640364875054177L);
        setLongField(term2233, term2233.getClass(), "leastSigBits", -1610676979013636850L);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.bslota.optimisticapi.holding.domain.PatronId");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.util.UUID");
        Object[] args = new Object[1];
        args[0] = term2233;
        callMethod(klass, "from", argTypes, null, args);
    }

};


