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

public class PlacedOnHoldBook_author_123415896110 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term997;

    public PlacedOnHoldBook_author_123415896110() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term997 = newInstance(Class.forName("com.bslota.optimisticapi.holding.domain.PlacedOnHoldBook"));
        setField(term997, term997.getClass(), "id", null);
        setField(term997, term997.getClass(), "author", null);
        setField(term997, term997.getClass(), "title", null);
        setField(term997, term997.getClass(), "isbn", null);
        setField(term997, term997.getClass(), "patronId", null);
        setField(term997, term997.getClass(), "version", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.bslota.optimisticapi.holding.domain.PlacedOnHoldBook");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "author", argTypes, term997, args);
    }

};


