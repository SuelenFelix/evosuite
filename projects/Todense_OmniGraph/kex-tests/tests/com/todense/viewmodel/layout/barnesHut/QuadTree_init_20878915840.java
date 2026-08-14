package com.todense.viewmodel.layout.barnesHut;

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
import static com.todense.viewmodel.layout.barnesHut.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Integer;
import java.util.ArrayList;
import java.lang.Object;
import java.util.HashMap;

public class QuadTree_init_20878915840 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term23;
     Object term25;

    public QuadTree_init_20878915840() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term23 = new Integer(568599855);
        ArrayList term28 = new ArrayList();
        HashMap term33 = new HashMap();
        term25 = newInstance(Class.forName("com.todense.model.graph.Graph"));
        Object term32 = newInstance(Class.forName("com.todense.model.EdgeList"));
        Object[] term38 = (Object[]) newArray("java.lang.Object", 0);
        setDoubleField(term25, term25.getClass(), "MAX_NODE_POSITION_MAGNITUDE", 1.0E20);
        setIntField(term25, term25.getClass(), "idCounter", 1162663216);
        setField(term25, term25.getClass(), "nodes", term28);
        setField(term32, term32.getClass(), "edgeMap", term33);
        setField(term32, term32.getClass(), "elementData", term38);
        setIntField(term32, term32.getClass(), "size", 0);
        setIntField(term32, term32.getClass(), "modCount", 0);
        setField(term25, term25.getClass(), "edges", term32);
        setField(term25, term25.getClass(), "name", "UnnamedGraph");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.todense.viewmodel.layout.barnesHut.QuadTree");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = int.class;
        argTypes[1] = Class.forName("com.todense.model.graph.Graph");
        Object[] args = new Object[2];
        args[0] = term23;
        args[1] = term25;
        Object instance = callConstructor(klass, argTypes, args);
    }

};


