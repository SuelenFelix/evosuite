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

public class InsecureInMemoryStore_add_3509759023 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term57;

    public InsecureInMemoryStore_add_3509759023() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term57 = newInstance(Class.forName("com.microsoft.credentialstorage.implementation.memory.InsecureInMemoryStore"));
        Object term58 = newInstance(Class.forName("java.util.concurrent.ConcurrentHashMap"));
        setField(term58, term58.getClass(), "table", null);
        setField(term58, term58.getClass(), "nextTable", null);
        setLongField(term58, term58.getClass(), "baseCount", 0L);
        setIntField(term58, term58.getClass(), "sizeCtl", 0);
        setIntField(term58, term58.getClass(), "transferIndex", 0);
        setIntField(term58, term58.getClass(), "cellsBusy", 0);
        setField(term58, term58.getClass(), "counterCells", null);
        setField(term58, term58.getClass(), "keySet", null);
        setField(term58, term58.getClass(), "values", null);
        setField(term58, term58.getClass(), "entrySet", null);
        setField(term58, term58.getClass(), "keySet", null);
        setField(term58, term58.getClass(), "values", null);
        setField(term57, term57.getClass(), "store", term58);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.microsoft.credentialstorage.implementation.memory.InsecureInMemoryStore");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("java.lang.String");
        argTypes[1] = Class.forName("com.microsoft.credentialstorage.model.StoredSecret");
        Object[] args = new Object[2];
        args[0] = "MuLcgQHgqz";
        args[1] = null;
        callMethod(klass, "add", argTypes, term57, args);
    }

};


