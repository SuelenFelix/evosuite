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

public class PatronId_getValue_16097637613 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2240;

    public PatronId_getValue_16097637613() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term2240 = newInstance(Class.forName("com.bslota.optimisticapi.holding.domain.PatronId"));
        Object term2241 = newInstance(Class.forName("java.util.UUID"));
        setLongField(term2241, term2241.getClass(), "mostSigBits", 414749984815662075L);
        setLongField(term2241, term2241.getClass(), "leastSigBits", 463622836963501975L);
        setField(term2240, term2240.getClass(), "value", term2241);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.bslota.optimisticapi.holding.domain.PatronId");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getValue", argTypes, term2240, args);
    }

};


