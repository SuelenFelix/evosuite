package com.bslota.optimisticapi.holding.application;

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
import static com.bslota.optimisticapi.holding.application.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;

public class PlacingOnHold_handle_2189359151 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1;
     Object term2;

    public PlacingOnHold_handle_2189359151() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term1 = newInstance(Class.forName("com.bslota.optimisticapi.holding.application.PlacingOnHold"));
        setField(term1, term1.getClass(), "bookRepository", null);
        term2 = newInstance(Class.forName("com.bslota.optimisticapi.holding.application.PlaceOnHoldCommand"));
        Object term3 = newInstance(Class.forName("com.bslota.optimisticapi.holding.domain.BookId"));
        Object term4 = newInstance(Class.forName("java.util.UUID"));
        Object term7 = newInstance(Class.forName("com.bslota.optimisticapi.holding.domain.PatronId"));
        Object term8 = newInstance(Class.forName("java.util.UUID"));
        Object term11 = newInstance(Class.forName("com.bslota.optimisticapi.holding.aggregate.Version"));
        setLongField(term4, term4.getClass(), "mostSigBits", 2442117782898005296L);
        setLongField(term4, term4.getClass(), "leastSigBits", 6375119433582206027L);
        setField(term3, term3.getClass(), "value", term4);
        setField(term2, term2.getClass(), "bookId", term3);
        setLongField(term8, term8.getClass(), "mostSigBits", -8257434502486459194L);
        setLongField(term8, term8.getClass(), "leastSigBits", -8400487765614892086L);
        setField(term7, term7.getClass(), "value", term8);
        setField(term2, term2.getClass(), "patronId", term7);
        setLongField(term11, term11.getClass(), "value", 6375119433582206027L);
        setField(term2, term2.getClass(), "version", term11);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.bslota.optimisticapi.holding.application.PlacingOnHold");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.bslota.optimisticapi.holding.application.PlaceOnHoldCommand");
        Object[] args = new Object[1];
        args[0] = term2;
        callMethod(klass, "handle", argTypes, term1, args);
    }

};


