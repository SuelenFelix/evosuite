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
     Object term87338;

    public BFSTraverser_maxLevel_188795037516() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term87338 = newInstance(Class.forName("org.graph4j.traversal.BFSTraverser"));
        setField(term87338, term87338.getClass(), "graph", null);
        setBooleanField(term87338, term87338.getClass(), "directed", false);
        setField(term87338, term87338.getClass(), "visitor", null);
        setField(term87338, term87338.getClass(), "queue", null);
        setIntField(term87338, term87338.getClass(), "orderIndex", 0);
        setIntField(term87338, term87338.getClass(), "compIndex", 0);
        setField(term87338, term87338.getClass(), "visited", null);
        setIntField(term87338, term87338.getClass(), "restartIndex", 0);
        setIntField(term87338, term87338.getClass(), "maxLevel", 0);
        setBooleanField(term87338, term87338.getClass(), "interrupted", false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.graph4j.traversal.BFSTraverser");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "maxLevel", argTypes, term87338, args);
    }

};


