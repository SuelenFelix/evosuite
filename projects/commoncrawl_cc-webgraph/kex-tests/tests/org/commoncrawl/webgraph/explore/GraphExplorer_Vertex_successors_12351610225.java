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

public class GraphExplorer_Vertex_successors_12351610225 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term169;

    public GraphExplorer_Vertex_successors_12351610225() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term169 = newInstance(Class.forName("org.commoncrawl.webgraph.explore.GraphExplorer$Vertex"));
        setLongField(term169, term169.getClass(), "id", 4872422362414183754L);
        setField(term169, term169.getClass(), "label", "MjGYSRKTNF");
        setField(term169, term169.getClass(), "this$0", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.commoncrawl.webgraph.explore.GraphExplorer$Vertex");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "successors", argTypes, term169, args);
    }

};


