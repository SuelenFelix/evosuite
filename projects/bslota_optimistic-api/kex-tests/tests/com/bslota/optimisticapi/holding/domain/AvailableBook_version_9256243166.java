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

public class AvailableBook_version_9256243166 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1462;

    public AvailableBook_version_9256243166() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term1462 = newInstance(Class.forName("com.bslota.optimisticapi.holding.domain.AvailableBook"));
        Object term1463 = newInstance(Class.forName("com.bslota.optimisticapi.holding.domain.BookId"));
        Object term1464 = newInstance(Class.forName("java.util.UUID"));
        Object term1467 = newInstance(Class.forName("com.bslota.optimisticapi.holding.domain.Author"));
        Object term1480 = newInstance(Class.forName("com.bslota.optimisticapi.holding.domain.Title"));
        Object term1493 = newInstance(Class.forName("com.bslota.optimisticapi.holding.domain.ISBN"));
        Object term1506 = newInstance(Class.forName("com.bslota.optimisticapi.holding.aggregate.Version"));
        setLongField(term1464, term1464.getClass(), "mostSigBits", -2170847986967241072L);
        setLongField(term1464, term1464.getClass(), "leastSigBits", 4044358158040652353L);
        setField(term1463, term1463.getClass(), "value", term1464);
        setField(term1462, term1462.getClass(), "id", term1463);
        setField(term1467, term1467.getClass(), "name", "MLqYREekMl");
        setField(term1462, term1462.getClass(), "author", term1467);
        setField(term1480, term1480.getClass(), "title", "ytSBIKXogI");
        setField(term1462, term1462.getClass(), "title", term1480);
        setField(term1493, term1493.getClass(), "value", "nHXjMycHlU");
        setField(term1462, term1462.getClass(), "isbn", term1493);
        setLongField(term1506, term1506.getClass(), "value", -872011222785455006L);
        setField(term1462, term1462.getClass(), "version", term1506);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.bslota.optimisticapi.holding.domain.AvailableBook");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "version", argTypes, term1462, args);
    }

};


