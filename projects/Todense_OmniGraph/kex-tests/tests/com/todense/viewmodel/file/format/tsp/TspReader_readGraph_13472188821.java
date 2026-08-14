package com.todense.viewmodel.file.format.tsp;

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
import static com.todense.viewmodel.file.format.tsp.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.String;
import java.lang.Object;

public class TspReader_readGraph_13472188821 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term245;
     Object term246;

    public TspReader_readGraph_13472188821() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term245 = newInstance(Class.forName("com.todense.viewmodel.file.format.tsp.TspReader"));
        Class<? extends Object> term282 = Class.forName((String) "java.io.File$PathStatus");
        Field term281 = ((Class) term282).getDeclaredField((String) "INVALID");
        ((Field) term281).setAccessible(true);
        Object enum1 = ((Field) term281).get((Object) null);
        term246 = newInstance(Class.forName("java.io.File"));
        setField(term246, term246.getClass(), "path", "sjlJAEtRrb");
        setField(term246, term246.getClass(), "status", enum1);
        setIntField(term246, term246.getClass(), "prefixLength", 1484323161);
        setField(term246, term246.getClass(), "filePath", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.todense.viewmodel.file.format.tsp.TspReader");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.io.File");
        Object[] args = new Object[1];
        args[0] = term246;
        callMethod(klass, "readGraph", argTypes, term245, args);
    }

};


