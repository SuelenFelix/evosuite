package org.graph4j.traversal;

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
import static org.graph4j.traversal.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;

public class DFSTraverser_traverse_28652343711 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2180;

    public DFSTraverser_traverse_28652343711() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term2180 = newInstance(Class.forName("org.graph4j.traversal.DFSTraverser"));
        setField(term2180, term2180.getClass(), "graph", null);
        setBooleanField(term2180, term2180.getClass(), "directed", false);
        setField(term2180, term2180.getClass(), "visitor", null);
        setIntField(term2180, term2180.getClass(), "orderIndex", 0);
        setIntField(term2180, term2180.getClass(), "compIndex", 0);
        setField(term2180, term2180.getClass(), "visited", null);
        setField(term2180, term2180.getClass(), "nextPos", null);
        setIntField(term2180, term2180.getClass(), "restartIndex", 0);
        setField(term2180, term2180.getClass(), "stack", null);
        setField(term2180, term2180.getClass(), "instack", null);
        setBooleanField(term2180, term2180.getClass(), "interrupted", false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.graph4j.traversal.DFSTraverser");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.graph4j.traversal.DFSVisitor");
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "traverse", argTypes, term2180, args);
    }

};


