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

public class BookHoldingController_init_9661359930 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1313;

    public BookHoldingController_init_9661359930() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term1313 = newInstance(Class.forName("com.bslota.optimisticapi.holding.application.PlacingOnHold"));
        setField(term1313, term1313.getClass(), "bookRepository", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.bslota.optimisticapi.holding.infrastructure.rest.BookHoldingController");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.bslota.optimisticapi.holding.application.PlacingOnHold");
        Object[] args = new Object[1];
        args[0] = term1313;
        Object instance = callConstructor(klass, argTypes, args);
    }

};


