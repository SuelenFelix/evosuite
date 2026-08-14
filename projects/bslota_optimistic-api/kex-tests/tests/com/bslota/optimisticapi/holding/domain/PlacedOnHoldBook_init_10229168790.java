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

public class PlacedOnHoldBook_init_10229168790 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term355;
     Object term359;
     Object term372;
     Object term385;
     Object term398;
     Object term402;

    public PlacedOnHoldBook_init_10229168790() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term355 = newInstance(Class.forName("com.bslota.optimisticapi.holding.domain.BookId"));
        Object term356 = newInstance(Class.forName("java.util.UUID"));
        setLongField(term356, term356.getClass(), "mostSigBits", 2442117782898005296L);
        setLongField(term356, term356.getClass(), "leastSigBits", 6375119433582206027L);
        setField(term355, term355.getClass(), "value", term356);
        term359 = newInstance(Class.forName("com.bslota.optimisticapi.holding.domain.Author"));
        setField(term359, term359.getClass(), "name", "aJlieCFVtF");
        term372 = newInstance(Class.forName("com.bslota.optimisticapi.holding.domain.Title"));
        setField(term372, term372.getClass(), "title", "ZiaGIbnzTs");
        term385 = newInstance(Class.forName("com.bslota.optimisticapi.holding.domain.ISBN"));
        setField(term385, term385.getClass(), "value", "tbcdzjIfER");
        term398 = newInstance(Class.forName("com.bslota.optimisticapi.holding.domain.PatronId"));
        Object term399 = newInstance(Class.forName("java.util.UUID"));
        setLongField(term399, term399.getClass(), "mostSigBits", -8257434502486459194L);
        setLongField(term399, term399.getClass(), "leastSigBits", -8400487765614892086L);
        setField(term398, term398.getClass(), "value", term399);
        term402 = newInstance(Class.forName("com.bslota.optimisticapi.holding.aggregate.Version"));
        setLongField(term402, term402.getClass(), "value", 2442117782898005296L);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.bslota.optimisticapi.holding.domain.PlacedOnHoldBook");
        Class<?>[] argTypes = new Class<?>[6];
        argTypes[0] = Class.forName("com.bslota.optimisticapi.holding.domain.BookId");
        argTypes[1] = Class.forName("com.bslota.optimisticapi.holding.domain.Author");
        argTypes[2] = Class.forName("com.bslota.optimisticapi.holding.domain.Title");
        argTypes[3] = Class.forName("com.bslota.optimisticapi.holding.domain.ISBN");
        argTypes[4] = Class.forName("com.bslota.optimisticapi.holding.domain.PatronId");
        argTypes[5] = Class.forName("com.bslota.optimisticapi.holding.aggregate.Version");
        Object[] args = new Object[6];
        args[0] = term355;
        args[1] = term359;
        args[2] = term372;
        args[3] = term385;
        args[4] = term398;
        args[5] = term402;
        Object instance = callConstructor(klass, argTypes, args);
    }

};


