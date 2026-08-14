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

public class BFSTraverser_maxLevel_188795037516 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term552;

    public BFSTraverser_maxLevel_188795037516() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term552 = newInstance(Class.forName("org.graph4j.traversal.BFSTraverser"));
        setField(term552, term552.getClass(), "graph", null);
        setBooleanField(term552, term552.getClass(), "directed", false);
        setField(term552, term552.getClass(), "visitor", null);
        setField(term552, term552.getClass(), "queue", null);
        setIntField(term552, term552.getClass(), "orderIndex", 0);
        setIntField(term552, term552.getClass(), "compIndex", 0);
        setField(term552, term552.getClass(), "visited", null);
        setIntField(term552, term552.getClass(), "restartIndex", 0);
        setIntField(term552, term552.getClass(), "maxLevel", 0);
        setBooleanField(term552, term552.getClass(), "interrupted", false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.graph4j.traversal.BFSTraverser");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "maxLevel", argTypes, term552, args);
    }

};


