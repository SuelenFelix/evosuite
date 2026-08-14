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
import java.util.ArrayList;
import java.lang.Object;
import java.util.HashMap;
import java.lang.String;

public class TspWriter_writeGraph_17542993011 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1;
     Object term2;
     Object term32;

    public TspWriter_writeGraph_17542993011() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term1 = newInstance(Class.forName("com.todense.viewmodel.file.format.tsp.TspWriter"));
        ArrayList term5 = new ArrayList();
        HashMap term10 = new HashMap();
        term2 = newInstance(Class.forName("com.todense.model.graph.Graph"));
        Object term9 = newInstance(Class.forName("com.todense.model.EdgeList"));
        Object[] term15 = (Object[]) newArray("java.lang.Object", 0);
        setDoubleField(term2, term2.getClass(), "MAX_NODE_POSITION_MAGNITUDE", 1.0E20);
        setIntField(term2, term2.getClass(), "idCounter", 568599855);
        setField(term2, term2.getClass(), "nodes", term5);
        setField(term9, term9.getClass(), "edgeMap", term10);
        setField(term9, term9.getClass(), "elementData", term15);
        setIntField(term9, term9.getClass(), "size", 0);
        setIntField(term9, term9.getClass(), "modCount", 0);
        setField(term2, term2.getClass(), "edges", term9);
        setField(term2, term2.getClass(), "name", "UnnamedGraph");
        Class<? extends Object> term102 = Class.forName((String) "java.io.File$PathStatus");
        Field term101 = ((Class) term102).getDeclaredField((String) "INVALID");
        ((Field) term101).setAccessible(true);
        Object enum0 = ((Field) term101).get((Object) null);
        term32 = newInstance(Class.forName("java.io.File"));
        setField(term32, term32.getClass(), "path", "PAEBtnZtTD");
        setField(term32, term32.getClass(), "status", enum0);
        setIntField(term32, term32.getClass(), "prefixLength", 1162663216);
        setField(term32, term32.getClass(), "filePath", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.todense.viewmodel.file.format.tsp.TspWriter");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.todense.model.graph.Graph");
        argTypes[1] = Class.forName("java.io.File");
        Object[] args = new Object[2];
        args[0] = term2;
        args[1] = term32;
        callMethod(klass, "writeGraph", argTypes, term1, args);
    }

};


