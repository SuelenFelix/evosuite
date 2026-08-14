package com.microsoft.credentialstorage.implementation.memory;

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
import static com.microsoft.credentialstorage.implementation.memory.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;

public class InsecureInMemoryStore_isSecure_9789004284 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term85;

    public InsecureInMemoryStore_isSecure_9789004284() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term85 = newInstance(Class.forName("com.microsoft.credentialstorage.implementation.memory.InsecureInMemoryStore"));
        Object term86 = newInstance(Class.forName("java.util.concurrent.ConcurrentHashMap"));
        setField(term86, term86.getClass(), "table", null);
        setField(term86, term86.getClass(), "nextTable", null);
        setLongField(term86, term86.getClass(), "baseCount", 0L);
        setIntField(term86, term86.getClass(), "sizeCtl", 0);
        setIntField(term86, term86.getClass(), "transferIndex", 0);
        setIntField(term86, term86.getClass(), "cellsBusy", 0);
        setField(term86, term86.getClass(), "counterCells", null);
        setField(term86, term86.getClass(), "keySet", null);
        setField(term86, term86.getClass(), "values", null);
        setField(term86, term86.getClass(), "entrySet", null);
        setField(term86, term86.getClass(), "keySet", null);
        setField(term86, term86.getClass(), "values", null);
        setField(term85, term85.getClass(), "store", term86);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.microsoft.credentialstorage.implementation.memory.InsecureInMemoryStore");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "isSecure", argTypes, term85, args);
    }

};


