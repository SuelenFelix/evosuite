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

public class BFSIterator_init_180966615711 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term107117;

    public BFSIterator_init_180966615711() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term107117 = newInstance(Class.forName("org.graph4j.traversal.BFSIterator"));
        setField(term107117, term107117.getClass(), "graph", null);
        setIntField(term107117, term107117.getClass(), "startVertex", 0);
        setIntField(term107117, term107117.getClass(), "numVertices", 0);
        setField(term107117, term107117.getClass(), "queue", null);
        setField(term107117, term107117.getClass(), "visited", null);
        setIntField(term107117, term107117.getClass(), "restartIndex", 0);
        setIntField(term107117, term107117.getClass(), "numIterations", 0);
        setIntField(term107117, term107117.getClass(), "compIndex", 0);
        setIntField(term107117, term107117.getClass(), "orderNumber", 0);
        setIntField(term107117, term107117.getClass(), "maxLevel", 0);
        setBooleanField(term107117, term107117.getClass(), "reverse", false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.graph4j.traversal.BFSIterator");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "init", argTypes, term107117, args);
    }

};


