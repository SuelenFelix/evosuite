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

public class PlaceOnHoldCommand_getBookId_18286014793 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2763;

    public PlaceOnHoldCommand_getBookId_18286014793() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term2763 = newInstance(Class.forName("com.bslota.optimisticapi.holding.application.PlaceOnHoldCommand"));
        Object term2764 = newInstance(Class.forName("com.bslota.optimisticapi.holding.domain.BookId"));
        Object term2765 = newInstance(Class.forName("java.util.UUID"));
        Object term2768 = newInstance(Class.forName("com.bslota.optimisticapi.holding.domain.PatronId"));
        Object term2769 = newInstance(Class.forName("java.util.UUID"));
        Object term2772 = newInstance(Class.forName("com.bslota.optimisticapi.holding.aggregate.Version"));
        setLongField(term2765, term2765.getClass(), "mostSigBits", -484994522244390100L);
        setLongField(term2765, term2765.getClass(), "leastSigBits", 1233889271256172047L);
        setField(term2764, term2764.getClass(), "value", term2765);
        setField(term2763, term2763.getClass(), "bookId", term2764);
        setLongField(term2769, term2769.getClass(), "mostSigBits", 6617340557564669657L);
        setLongField(term2769, term2769.getClass(), "leastSigBits", 1439298019805881866L);
        setField(term2768, term2768.getClass(), "value", term2769);
        setField(term2763, term2763.getClass(), "patronId", term2768);
        setLongField(term2772, term2772.getClass(), "value", 2486810210675247493L);
        setField(term2763, term2763.getClass(), "version", term2772);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.bslota.optimisticapi.holding.application.PlaceOnHoldCommand");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getBookId", argTypes, term2763, args);
    }

};


