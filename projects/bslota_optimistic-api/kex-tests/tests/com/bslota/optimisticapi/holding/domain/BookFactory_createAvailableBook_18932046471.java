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

public class BookFactory_createAvailableBook_18932046471 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1572;
     Object term1573;
     Object term1586;
     Object term1599;

    public BookFactory_createAvailableBook_18932046471() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term1572 = newInstance(Class.forName("com.bslota.optimisticapi.holding.domain.BookFactory"));
        term1573 = newInstance(Class.forName("com.bslota.optimisticapi.holding.domain.Author"));
        setField(term1573, term1573.getClass(), "name", "ieCtQFdkii");
        term1586 = newInstance(Class.forName("com.bslota.optimisticapi.holding.domain.Title"));
        setField(term1586, term1586.getClass(), "title", "dEnhdmILtU");
        term1599 = newInstance(Class.forName("com.bslota.optimisticapi.holding.domain.ISBN"));
        setField(term1599, term1599.getClass(), "value", "hoicvmsovO");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.bslota.optimisticapi.holding.domain.BookFactory");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Class.forName("com.bslota.optimisticapi.holding.domain.Author");
        argTypes[1] = Class.forName("com.bslota.optimisticapi.holding.domain.Title");
        argTypes[2] = Class.forName("com.bslota.optimisticapi.holding.domain.ISBN");
        Object[] args = new Object[3];
        args[0] = term1573;
        args[1] = term1586;
        args[2] = term1599;
        callMethod(klass, "createAvailableBook", argTypes, term1572, args);
    }

};


