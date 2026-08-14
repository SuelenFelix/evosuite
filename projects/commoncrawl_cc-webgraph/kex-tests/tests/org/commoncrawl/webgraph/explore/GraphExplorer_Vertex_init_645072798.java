package org.commoncrawl.webgraph.explore;

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
import static org.commoncrawl.webgraph.explore.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Long;

public class GraphExplorer_Vertex_init_645072798 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term217;

    public GraphExplorer_Vertex_init_645072798() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term217 = new Long(0L);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.commoncrawl.webgraph.explore.GraphExplorer$Vertex");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("org.commoncrawl.webgraph.explore.GraphExplorer");
        argTypes[1] = long.class;
        Object[] args = new Object[2];
        args[0] = null;
        args[1] = term217;
        Object instance = callConstructor(klass, argTypes, args);
    }

};


