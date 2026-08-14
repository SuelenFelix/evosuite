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

public class GraphMLWriter_addEdge_13388381107 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term248;

    public GraphMLWriter_addEdge_13388381107() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term248 = newInstance(Class.forName("com.todense.viewmodel.file.format.graphml.GraphMLWriter"));
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.todense.viewmodel.file.format.graphml.GraphMLWriter");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Class.forName("com.todense.model.graph.Edge");
        argTypes[1] = Class.forName("org.w3c.dom.Element");
        argTypes[2] = Class.forName("org.w3c.dom.Document");
        Object[] args = new Object[3];
        args[0] = null;
        args[1] = null;
        args[2] = null;
        callMethod(klass, "addEdge", argTypes, term248, args);
    }

};


