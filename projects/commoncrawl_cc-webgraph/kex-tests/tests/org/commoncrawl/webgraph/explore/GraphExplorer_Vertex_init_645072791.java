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
import java.lang.Long;

public class GraphExplorer_Vertex_init_645072791 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term70;
     Object term85;

    public GraphExplorer_Vertex_init_645072791() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term70 = newInstance(Class.forName("org.commoncrawl.webgraph.explore.GraphExplorer"));
        Object term71 = newInstance(Class.forName("org.commoncrawl.webgraph.explore.GraphExplorer$Vertex"));
        setField(term70, term70.getClass(), "g", null);
        setLongField(term71, term71.getClass(), "id", 6375119433582206027L);
        setField(term71, term71.getClass(), "label", "xxtlPwDYFs");
        setField(term71, term71.getClass(), "this$0", null);
        setField(term70, term70.getClass(), "v", term71);
        term85 = new Long(-8257434502486459194L);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.commoncrawl.webgraph.explore.GraphExplorer$Vertex");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("org.commoncrawl.webgraph.explore.GraphExplorer");
        argTypes[1] = long.class;
        Object[] args = new Object[2];
        args[0] = term70;
        args[1] = term85;
        Object instance = callConstructor(klass, argTypes, args);
    }

};


