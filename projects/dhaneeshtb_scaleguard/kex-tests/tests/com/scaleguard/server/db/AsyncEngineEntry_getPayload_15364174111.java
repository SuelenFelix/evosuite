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

public class AsyncEngineEntry_getPayload_15364174111 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term244;

    public AsyncEngineEntry_getPayload_15364174111() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term244 = newInstance(Class.forName("com.scaleguard.server.db.AsyncEngineEntry"));
        setField(term244, term244.getClass(), "id", "uuaPigETmJ");
        setField(term244, term244.getClass(), "name", "MxlszYVzRf");
        setField(term244, term244.getClass(), "description", "LQFpaHEwXR");
        setField(term244, term244.getClass(), "payload", "oVcInYnLWB");
        setField(term244, term244.getClass(), "type", "aJlieCFVtF");
        setLongField(term244, term244.getClass(), "mts", 2442117782898005296L);
        setLongField(term244, term244.getClass(), "uts", 6375119433582206027L);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.scaleguard.server.db.AsyncEngineEntry");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getPayload", argTypes, term244, args);
    }

};


