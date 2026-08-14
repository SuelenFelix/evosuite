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
import java.lang.Object;

public class PatronId_asString_20369844492 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2236;

    public PatronId_asString_20369844492() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term2236 = newInstance(Class.forName("com.bslota.optimisticapi.holding.domain.PatronId"));
        Object term2237 = newInstance(Class.forName("java.util.UUID"));
        setLongField(term2237, term2237.getClass(), "mostSigBits", 2062173786000223358L);
        setLongField(term2237, term2237.getClass(), "leastSigBits", -8658027316505137504L);
        setField(term2236, term2236.getClass(), "value", term2237);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.bslota.optimisticapi.holding.domain.PatronId");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "asString", argTypes, term2236, args);
    }

};


