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

public class AsyncEngineEntry_getUts_166489641828 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1978;

    public AsyncEngineEntry_getUts_166489641828() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term1978 = newInstance(Class.forName("com.scaleguard.server.db.AsyncEngineEntry"));
        setField(term1978, term1978.getClass(), "id", null);
        setField(term1978, term1978.getClass(), "name", null);
        setField(term1978, term1978.getClass(), "description", null);
        setField(term1978, term1978.getClass(), "payload", null);
        setField(term1978, term1978.getClass(), "type", null);
        setLongField(term1978, term1978.getClass(), "mts", 0L);
        setLongField(term1978, term1978.getClass(), "uts", 0L);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.scaleguard.server.db.AsyncEngineEntry");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getUts", argTypes, term1978, args);
    }

};


