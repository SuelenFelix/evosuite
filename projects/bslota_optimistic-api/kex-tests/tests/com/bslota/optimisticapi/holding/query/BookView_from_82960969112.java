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

public class BookView_from_82960969112 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2365;

    public BookView_from_82960969112() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term2365 = newInstance(Class.forName("com.bslota.optimisticapi.holding.query.BookView"));
        setField(term2365, term2365.getClass(), "id", null);
        setField(term2365, term2365.getClass(), "author", null);
        setField(term2365, term2365.getClass(), "title", null);
        setField(term2365, term2365.getClass(), "isbn", null);
        setField(term2365, term2365.getClass(), "patronId", null);
        setField(term2365, term2365.getClass(), "status", null);
        setLongField(term2365, term2365.getClass(), "version", 0L);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.bslota.optimisticapi.holding.query.BookView");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.bslota.optimisticapi.holding.domain.Book");
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "from", argTypes, term2365, args);
    }

};


