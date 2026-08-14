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

public class InsecureInMemoryStore_delete_14905121152 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term29;

    public InsecureInMemoryStore_delete_14905121152() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term29 = newInstance(Class.forName("com.microsoft.credentialstorage.implementation.memory.InsecureInMemoryStore"));
        Object term30 = newInstance(Class.forName("java.util.concurrent.ConcurrentHashMap"));
        setField(term30, term30.getClass(), "table", null);
        setField(term30, term30.getClass(), "nextTable", null);
        setLongField(term30, term30.getClass(), "baseCount", 0L);
        setIntField(term30, term30.getClass(), "sizeCtl", 0);
        setIntField(term30, term30.getClass(), "transferIndex", 0);
        setIntField(term30, term30.getClass(), "cellsBusy", 0);
        setField(term30, term30.getClass(), "counterCells", null);
        setField(term30, term30.getClass(), "keySet", null);
        setField(term30, term30.getClass(), "values", null);
        setField(term30, term30.getClass(), "entrySet", null);
        setField(term30, term30.getClass(), "keySet", null);
        setField(term30, term30.getClass(), "values", null);
        setField(term29, term29.getClass(), "store", term30);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.microsoft.credentialstorage.implementation.memory.InsecureInMemoryStore");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "sjlJAEtRrb";
        callMethod(klass, "delete", argTypes, term29, args);
    }

};


