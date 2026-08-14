package com.bslota.optimisticapi.holding.query;

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
import static com.bslota.optimisticapi.holding.query.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;

public class BookView_getStatus_1747572718 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2227;

    public BookView_getStatus_1747572718() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term2227 = newInstance(Class.forName("com.bslota.optimisticapi.holding.query.BookView"));
        setField(term2227, term2227.getClass(), "id", null);
        setField(term2227, term2227.getClass(), "author", null);
        setField(term2227, term2227.getClass(), "title", null);
        setField(term2227, term2227.getClass(), "isbn", null);
        setField(term2227, term2227.getClass(), "patronId", null);
        setField(term2227, term2227.getClass(), "status", null);
        setLongField(term2227, term2227.getClass(), "version", 0L);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.bslota.optimisticapi.holding.query.BookView");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getStatus", argTypes, term2227, args);
    }

};


