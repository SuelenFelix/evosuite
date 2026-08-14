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

public class PlaceOnHoldCommand_getBookId_18286014794 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term148;

    public PlaceOnHoldCommand_getBookId_18286014794() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term148 = newInstance(Class.forName("com.bslota.optimisticapi.holding.application.PlaceOnHoldCommand"));
        Object term149 = newInstance(Class.forName("com.bslota.optimisticapi.holding.domain.BookId"));
        Object term150 = newInstance(Class.forName("java.util.UUID"));
        Object term153 = newInstance(Class.forName("com.bslota.optimisticapi.holding.domain.PatronId"));
        Object term154 = newInstance(Class.forName("java.util.UUID"));
        Object term157 = newInstance(Class.forName("com.bslota.optimisticapi.holding.aggregate.Version"));
        setLongField(term150, term150.getClass(), "mostSigBits", -7672528020740371001L);
        setLongField(term150, term150.getClass(), "leastSigBits", -4502405999831680926L);
        setField(term149, term149.getClass(), "value", term150);
        setField(term148, term148.getClass(), "bookId", term149);
        setLongField(term154, term154.getClass(), "mostSigBits", 1967728129628047933L);
        setLongField(term154, term154.getClass(), "leastSigBits", 2120084523938730454L);
        setField(term153, term153.getClass(), "value", term154);
        setField(term148, term148.getClass(), "patronId", term153);
        setLongField(term157, term157.getClass(), "value", -4325723315152823407L);
        setField(term148, term148.getClass(), "version", term157);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.bslota.optimisticapi.holding.application.PlaceOnHoldCommand");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getBookId", argTypes, term148, args);
    }

};


