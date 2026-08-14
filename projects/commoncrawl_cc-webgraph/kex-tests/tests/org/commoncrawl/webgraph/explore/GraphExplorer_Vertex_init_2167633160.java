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
import java.lang.Object;

public class GraphExplorer_Vertex_init_2167633160 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term23;

    public GraphExplorer_Vertex_init_2167633160() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term23 = newInstance(Class.forName("org.commoncrawl.webgraph.explore.GraphExplorer"));
        Object term24 = newInstance(Class.forName("org.commoncrawl.webgraph.explore.GraphExplorer$Vertex"));
        setField(term23, term23.getClass(), "g", null);
        setLongField(term24, term24.getClass(), "id", 2442117782898005296L);
        setField(term24, term24.getClass(), "label", "sjlJAEtRrb");
        setField(term24, term24.getClass(), "this$0", null);
        setField(term23, term23.getClass(), "v", term24);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.commoncrawl.webgraph.explore.GraphExplorer$Vertex");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("org.commoncrawl.webgraph.explore.GraphExplorer");
        argTypes[1] = Class.forName("java.lang.String");
        Object[] args = new Object[2];
        args[0] = term23;
        args[1] = "MuLcgQHgqz";
        Object instance = callConstructor(klass, argTypes, args);
    }

};


