package com.bslota.optimisticapi.holding.infrastructure.memory;

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
import static com.bslota.optimisticapi.holding.infrastructure.memory.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;

public class InMemoryBookRepository_save_14908044775 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term18;

    public InMemoryBookRepository_save_14908044775() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term18 = newInstance(Class.forName("com.bslota.optimisticapi.holding.infrastructure.memory.InMemoryBookRepository"));
        setField(term18, term18.getClass(), "store", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.bslota.optimisticapi.holding.infrastructure.memory.InMemoryBookRepository");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.bslota.optimisticapi.holding.domain.Book");
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "save", argTypes, term18, args);
    }

};


