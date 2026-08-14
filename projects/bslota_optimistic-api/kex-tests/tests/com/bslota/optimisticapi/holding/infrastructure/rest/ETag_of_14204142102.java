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

public class ETag_of_14204142102 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1215;

    public ETag_of_14204142102() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term1215 = newInstance(Class.forName("com.bslota.optimisticapi.holding.aggregate.Version"));
        setLongField(term1215, term1215.getClass(), "value", 5270370404989704783L);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.bslota.optimisticapi.holding.infrastructure.rest.ETag");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.bslota.optimisticapi.holding.aggregate.Version");
        Object[] args = new Object[1];
        args[0] = term1215;
        callMethod(klass, "of", argTypes, null, args);
    }

};


