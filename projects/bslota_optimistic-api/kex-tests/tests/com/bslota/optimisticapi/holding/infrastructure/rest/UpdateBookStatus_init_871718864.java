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
import java.lang.Long;

public class UpdateBookStatus_init_871718864 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1166;

    public UpdateBookStatus_init_871718864() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term1166 = new Long(0L);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.bslota.optimisticapi.holding.infrastructure.rest.UpdateBookStatus");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Class.forName("com.bslota.optimisticapi.holding.domain.Status");
        argTypes[1] = Class.forName("java.util.UUID");
        argTypes[2] = long.class;
        Object[] args = new Object[3];
        args[0] = null;
        args[1] = null;
        args[2] = term1166;
        Object instance = callConstructor(klass, argTypes, args);
    }

};


