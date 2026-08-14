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
import java.lang.Long;

public class AsyncEngineEntry_setMts_206519846427 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1973;
     Object term1976;

    public AsyncEngineEntry_setMts_206519846427() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term1973 = newInstance(Class.forName("com.scaleguard.server.db.AsyncEngineEntry"));
        setField(term1973, term1973.getClass(), "id", null);
        setField(term1973, term1973.getClass(), "name", null);
        setField(term1973, term1973.getClass(), "description", null);
        setField(term1973, term1973.getClass(), "payload", null);
        setField(term1973, term1973.getClass(), "type", null);
        setLongField(term1973, term1973.getClass(), "mts", 0L);
        setLongField(term1973, term1973.getClass(), "uts", 0L);
        term1976 = new Long(0L);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.scaleguard.server.db.AsyncEngineEntry");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = long.class;
        Object[] args = new Object[1];
        args[0] = term1976;
        callMethod(klass, "setMts", argTypes, term1973, args);
    }

};


