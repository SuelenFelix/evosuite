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

public class PlaceOnHoldCommand_getVersion_3054361526 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term170;

    public PlaceOnHoldCommand_getVersion_3054361526() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term170 = newInstance(Class.forName("com.bslota.optimisticapi.holding.application.PlaceOnHoldCommand"));
        Object term171 = newInstance(Class.forName("com.bslota.optimisticapi.holding.domain.BookId"));
        Object term172 = newInstance(Class.forName("java.util.UUID"));
        Object term175 = newInstance(Class.forName("com.bslota.optimisticapi.holding.domain.PatronId"));
        Object term176 = newInstance(Class.forName("java.util.UUID"));
        Object term179 = newInstance(Class.forName("com.bslota.optimisticapi.holding.aggregate.Version"));
        setLongField(term172, term172.getClass(), "mostSigBits", -484994522244390100L);
        setLongField(term172, term172.getClass(), "leastSigBits", 1233889271256172047L);
        setField(term171, term171.getClass(), "value", term172);
        setField(term170, term170.getClass(), "bookId", term171);
        setLongField(term176, term176.getClass(), "mostSigBits", 6617340557564669657L);
        setLongField(term176, term176.getClass(), "leastSigBits", 1439298019805881866L);
        setField(term175, term175.getClass(), "value", term176);
        setField(term170, term170.getClass(), "patronId", term175);
        setLongField(term179, term179.getClass(), "value", -316468845751588286L);
        setField(term170, term170.getClass(), "version", term179);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.bslota.optimisticapi.holding.application.PlaceOnHoldCommand");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getVersion", argTypes, term170, args);
    }

};


