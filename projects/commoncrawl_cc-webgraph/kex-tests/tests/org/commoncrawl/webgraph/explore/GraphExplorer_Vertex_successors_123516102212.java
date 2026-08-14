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

public class GraphExplorer_Vertex_successors_123516102212 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term225;

    public GraphExplorer_Vertex_successors_123516102212() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term225 = newInstance(Class.forName("org.commoncrawl.webgraph.explore.GraphExplorer$Vertex"));
        setLongField(term225, term225.getClass(), "id", 0L);
        setField(term225, term225.getClass(), "label", null);
        setField(term225, term225.getClass(), "this$0", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.commoncrawl.webgraph.explore.GraphExplorer$Vertex");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "successors", argTypes, term225, args);
    }

};


