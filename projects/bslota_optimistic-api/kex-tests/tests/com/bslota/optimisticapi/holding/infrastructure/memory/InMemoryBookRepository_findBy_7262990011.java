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
import java.util.HashMap;
import java.lang.Object;

public class InMemoryBookRepository_findBy_7262990011 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1;
     Object term7;

    public InMemoryBookRepository_findBy_7262990011() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term2 = new HashMap();
        term1 = newInstance(Class.forName("com.bslota.optimisticapi.holding.infrastructure.memory.InMemoryBookRepository"));
        setField(term1, term1.getClass(), "store", term2);
        term7 = newInstance(Class.forName("com.bslota.optimisticapi.holding.domain.BookId"));
        Object term8 = newInstance(Class.forName("java.util.UUID"));
        setLongField(term8, term8.getClass(), "mostSigBits", 2442117782898005296L);
        setLongField(term8, term8.getClass(), "leastSigBits", 6375119433582206027L);
        setField(term7, term7.getClass(), "value", term8);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.bslota.optimisticapi.holding.infrastructure.memory.InMemoryBookRepository");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.bslota.optimisticapi.holding.domain.BookId");
        Object[] args = new Object[1];
        args[0] = term7;
        callMethod(klass, "findBy", argTypes, term1, args);
    }

};


