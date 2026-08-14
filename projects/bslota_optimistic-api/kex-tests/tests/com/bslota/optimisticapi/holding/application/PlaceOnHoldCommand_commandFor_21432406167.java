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

public class PlaceOnHoldCommand_commandFor_21432406167 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2796;

    public PlaceOnHoldCommand_commandFor_21432406167() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term2796 = newInstance(Class.forName("com.bslota.optimisticapi.holding.application.PlaceOnHoldCommand"));
        setField(term2796, term2796.getClass(), "bookId", null);
        setField(term2796, term2796.getClass(), "patronId", null);
        setField(term2796, term2796.getClass(), "version", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.bslota.optimisticapi.holding.application.PlaceOnHoldCommand");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.bslota.optimisticapi.holding.domain.BookId");
        argTypes[1] = Class.forName("com.bslota.optimisticapi.holding.domain.PatronId");
        Object[] args = new Object[2];
        args[0] = null;
        args[1] = null;
        callMethod(klass, "commandFor", argTypes, term2796, args);
    }

};


