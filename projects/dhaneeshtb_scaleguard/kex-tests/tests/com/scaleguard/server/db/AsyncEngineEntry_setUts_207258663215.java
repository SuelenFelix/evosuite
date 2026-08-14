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

public class AsyncEngineEntry_setUts_207258663215 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1828;
     Object term1891;

    public AsyncEngineEntry_setUts_207258663215() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term1828 = newInstance(Class.forName("com.scaleguard.server.db.AsyncEngineEntry"));
        setField(term1828, term1828.getClass(), "id", "VgZnGoIFwQ");
        setField(term1828, term1828.getClass(), "name", "jUbSRrkrYZ");
        setField(term1828, term1828.getClass(), "description", "bWWfajKbEX");
        setField(term1828, term1828.getClass(), "payload", "cAPeiZHKGJ");
        setField(term1828, term1828.getClass(), "type", "LvJFtLBaxj");
        setLongField(term1828, term1828.getClass(), "mts", -4502405999831680926L);
        setLongField(term1828, term1828.getClass(), "uts", 1967728129628047933L);
        term1891 = new Long(2120084523938730454L);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.scaleguard.server.db.AsyncEngineEntry");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = long.class;
        Object[] args = new Object[1];
        args[0] = term1891;
        callMethod(klass, "setUts", argTypes, term1828, args);
    }

};


