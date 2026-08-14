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

public class AsyncEngineEntry_setName_94256249411 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1352;

    public AsyncEngineEntry_setName_94256249411() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term1352 = newInstance(Class.forName("com.scaleguard.server.db.AsyncEngineEntry"));
        setField(term1352, term1352.getClass(), "id", "ieCtQFdkii");
        setField(term1352, term1352.getClass(), "name", "dEnhdmILtU");
        setField(term1352, term1352.getClass(), "description", "hoicvmsovO");
        setField(term1352, term1352.getClass(), "payload", "eqJfYWRaEL");
        setField(term1352, term1352.getClass(), "type", "fhkbdRViHi");
        setLongField(term1352, term1352.getClass(), "mts", -6573104506744284592L);
        setLongField(term1352, term1352.getClass(), "uts", -4920224193275732920L);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.scaleguard.server.db.AsyncEngineEntry");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "uWHnvSvaPl";
        callMethod(klass, "setName", argTypes, term1352, args);
    }

};


