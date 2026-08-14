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

public class InsecureInMemoryStore_get_21449600471 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1;

    public InsecureInMemoryStore_get_21449600471() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term1 = newInstance(Class.forName("com.microsoft.credentialstorage.implementation.memory.InsecureInMemoryStore"));
        Object term2 = newInstance(Class.forName("java.util.concurrent.ConcurrentHashMap"));
        setField(term2, term2.getClass(), "table", null);
        setField(term2, term2.getClass(), "nextTable", null);
        setLongField(term2, term2.getClass(), "baseCount", 0L);
        setIntField(term2, term2.getClass(), "sizeCtl", 0);
        setIntField(term2, term2.getClass(), "transferIndex", 0);
        setIntField(term2, term2.getClass(), "cellsBusy", 0);
        setField(term2, term2.getClass(), "counterCells", null);
        setField(term2, term2.getClass(), "keySet", null);
        setField(term2, term2.getClass(), "values", null);
        setField(term2, term2.getClass(), "entrySet", null);
        setField(term2, term2.getClass(), "keySet", null);
        setField(term2, term2.getClass(), "values", null);
        setField(term1, term1.getClass(), "store", term2);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.microsoft.credentialstorage.implementation.memory.InsecureInMemoryStore");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "PAEBtnZtTD";
        callMethod(klass, "get", argTypes, term1, args);
    }

};


