package com.bslota.optimisticapi.holding.aggregate;

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
import static com.bslota.optimisticapi.holding.aggregate.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;

public class StaleStateIdentified_forAggregateWith_641958743 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term7;

    public StaleStateIdentified_forAggregateWith_641958743() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term7 = newInstance(Class.forName("com.bslota.optimisticapi.holding.aggregate.StaleStateIdentified"));
        setField(term7, term7.getClass(), "backtrace", null);
        setField(term7, term7.getClass(), "detailMessage", null);
        setField(term7, term7.getClass(), "cause", null);
        setField(term7, term7.getClass(), "stackTrace", null);
        setIntField(term7, term7.getClass(), "depth", 0);
        setField(term7, term7.getClass(), "suppressedExceptions", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.bslota.optimisticapi.holding.aggregate.StaleStateIdentified");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.util.UUID");
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "forAggregateWith", argTypes, term7, args);
    }

};


