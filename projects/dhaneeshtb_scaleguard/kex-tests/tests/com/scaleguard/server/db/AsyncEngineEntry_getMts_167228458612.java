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

public class AsyncEngineEntry_getMts_167228458612 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1487;

    public AsyncEngineEntry_getMts_167228458612() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term1487 = newInstance(Class.forName("com.scaleguard.server.db.AsyncEngineEntry"));
        setField(term1487, term1487.getClass(), "id", "kBdSllIBVz");
        setField(term1487, term1487.getClass(), "name", "TJmVBGfTML");
        setField(term1487, term1487.getClass(), "description", "tPlsykYBqO");
        setField(term1487, term1487.getClass(), "payload", "bLPjGVBhlX");
        setField(term1487, term1487.getClass(), "type", "whBvTVIIlC");
        setLongField(term1487, term1487.getClass(), "mts", 8428634514691209827L);
        setLongField(term1487, term1487.getClass(), "uts", -2585684163342970173L);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.scaleguard.server.db.AsyncEngineEntry");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getMts", argTypes, term1487, args);
    }

};


