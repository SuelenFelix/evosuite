package com.todense.viewmodel.file.format.graphml;

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
import static com.todense.viewmodel.file.format.graphml.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.String;
import java.lang.Object;

public class GraphMLReader_readGraph_5239921821 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term249;
     Object term250;

    public GraphMLReader_readGraph_5239921821() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term249 = newInstance(Class.forName("com.todense.viewmodel.file.format.graphml.GraphMLReader"));
        Class<? extends Object> term286 = Class.forName((String) "java.io.File$PathStatus");
        Field term285 = ((Class) term286).getDeclaredField((String) "INVALID");
        ((Field) term285).setAccessible(true);
        Object enum1 = ((Field) term285).get((Object) null);
        term250 = newInstance(Class.forName("java.io.File"));
        setField(term250, term250.getClass(), "path", "sjlJAEtRrb");
        setField(term250, term250.getClass(), "status", enum1);
        setIntField(term250, term250.getClass(), "prefixLength", 1484323161);
        setField(term250, term250.getClass(), "filePath", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.todense.viewmodel.file.format.graphml.GraphMLReader");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.io.File");
        Object[] args = new Object[1];
        args[0] = term250;
        callMethod(klass, "readGraph", argTypes, term249, args);
    }

};


