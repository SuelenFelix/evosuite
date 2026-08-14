package com.bslota.optimisticapi.holding.infrastructure.jpa;

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
import static com.bslota.optimisticapi.holding.infrastructure.jpa.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;

public class BookEntity_getStatus_110141090516 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term3331;

    public BookEntity_getStatus_110141090516() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term3331 = newInstance(Class.forName("com.bslota.optimisticapi.holding.infrastructure.jpa.BookEntity"));
        setField(term3331, term3331.getClass(), "id", null);
        setField(term3331, term3331.getClass(), "title", null);
        setField(term3331, term3331.getClass(), "author", null);
        setField(term3331, term3331.getClass(), "isbn", null);
        setField(term3331, term3331.getClass(), "patronId", null);
        setField(term3331, term3331.getClass(), "status", null);
        setLongField(term3331, term3331.getClass(), "version", 0L);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.bslota.optimisticapi.holding.infrastructure.jpa.BookEntity");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getStatus", argTypes, term3331, args);
    }

};


