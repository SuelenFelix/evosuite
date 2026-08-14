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

public class BookId_of_12803027551 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1547;

    public BookId_of_12803027551() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term1547 = newInstance(Class.forName("java.util.UUID"));
        setLongField(term1547, term1547.getClass(), "mostSigBits", -5788180182343976541L);
        setLongField(term1547, term1547.getClass(), "leastSigBits", 2936323121573284007L);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.bslota.optimisticapi.holding.domain.BookId");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.util.UUID");
        Object[] args = new Object[1];
        args[0] = term1547;
        callMethod(klass, "of", argTypes, null, args);
    }

};


