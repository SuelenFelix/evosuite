package com.scaleguard.server.db;

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
import static com.scaleguard.server.db.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;

public class AsyncEngineEntry_getUts_166489641814 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1715;

    public AsyncEngineEntry_getUts_166489641814() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term1715 = newInstance(Class.forName("com.scaleguard.server.db.AsyncEngineEntry"));
        setField(term1715, term1715.getClass(), "id", "oVgzLbrsFr");
        setField(term1715, term1715.getClass(), "name", "vQVyKLdtaz");
        setField(term1715, term1715.getClass(), "description", "OWKQODBLzb");
        setField(term1715, term1715.getClass(), "payload", "wGmYcqUkgE");
        setField(term1715, term1715.getClass(), "type", "idgaQsnJpQ");
        setLongField(term1715, term1715.getClass(), "mts", 7009926388951271268L);
        setLongField(term1715, term1715.getClass(), "uts", -7672528020740371001L);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.scaleguard.server.db.AsyncEngineEntry");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getUts", argTypes, term1715, args);
    }

};


