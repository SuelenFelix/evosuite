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

public class BookId_equals_19371388364 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1558;
     Object term1562;

    public BookId_equals_19371388364() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term1558 = newInstance(Class.forName("com.bslota.optimisticapi.holding.domain.BookId"));
        Object term1559 = newInstance(Class.forName("java.util.UUID"));
        setLongField(term1559, term1559.getClass(), "mostSigBits", -7738503207562305297L);
        setLongField(term1559, term1559.getClass(), "leastSigBits", 3825396310311739952L);
        setField(term1558, term1558.getClass(), "value", term1559);
        term1562 = newInstance(Class.forName("java.lang.Object"));
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.bslota.optimisticapi.holding.domain.BookId");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Object");
        Object[] args = new Object[1];
        args[0] = term1562;
        callMethod(klass, "equals", argTypes, term1558, args);
    }

};


