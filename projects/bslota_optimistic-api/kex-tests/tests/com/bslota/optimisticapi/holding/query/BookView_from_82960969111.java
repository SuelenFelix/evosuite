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

public class BookView_from_82960969111 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1075;

    public BookView_from_82960969111() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term1075 = newInstance(Class.forName("com.bslota.optimisticapi.holding.query.BookView"));
        setField(term1075, term1075.getClass(), "id", null);
        setField(term1075, term1075.getClass(), "author", null);
        setField(term1075, term1075.getClass(), "title", null);
        setField(term1075, term1075.getClass(), "isbn", null);
        setField(term1075, term1075.getClass(), "patronId", null);
        setField(term1075, term1075.getClass(), "status", null);
        setLongField(term1075, term1075.getClass(), "version", 0L);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.bslota.optimisticapi.holding.query.BookView");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.bslota.optimisticapi.holding.domain.Book");
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "from", argTypes, term1075, args);
    }

};


