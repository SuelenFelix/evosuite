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

public class AvailableBook_placeOnHoldBy_20974041318 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1538;

    public AvailableBook_placeOnHoldBy_20974041318() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term1538 = newInstance(Class.forName("com.bslota.optimisticapi.holding.domain.AvailableBook"));
        setField(term1538, term1538.getClass(), "id", null);
        setField(term1538, term1538.getClass(), "author", null);
        setField(term1538, term1538.getClass(), "title", null);
        setField(term1538, term1538.getClass(), "isbn", null);
        setField(term1538, term1538.getClass(), "version", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.bslota.optimisticapi.holding.domain.AvailableBook");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.bslota.optimisticapi.holding.domain.PatronId");
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "placeOnHoldBy", argTypes, term1538, args);
    }

};


