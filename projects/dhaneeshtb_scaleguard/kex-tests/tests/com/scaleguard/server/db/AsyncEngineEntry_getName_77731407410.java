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

public class AsyncEngineEntry_getName_77731407410 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1239;

    public AsyncEngineEntry_getName_77731407410() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term1239 = newInstance(Class.forName("com.scaleguard.server.db.AsyncEngineEntry"));
        setField(term1239, term1239.getClass(), "id", "YRHGsAkhxb");
        setField(term1239, term1239.getClass(), "name", "ffYhPOzlUs");
        setField(term1239, term1239.getClass(), "description", "MLqYREekMl");
        setField(term1239, term1239.getClass(), "payload", "ytSBIKXogI");
        setField(term1239, term1239.getClass(), "type", "nHXjMycHlU");
        setLongField(term1239, term1239.getClass(), "mts", -316468845751588286L);
        setLongField(term1239, term1239.getClass(), "uts", 5127676408959197577L);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.scaleguard.server.db.AsyncEngineEntry");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getName", argTypes, term1239, args);
    }

};


