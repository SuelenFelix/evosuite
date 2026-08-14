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

public class DFSTraverser_init_11230286912 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1803;

    public DFSTraverser_init_11230286912() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term1803 = newInstance(Class.forName("org.graph4j.traversal.DFSTraverser"));
        setField(term1803, term1803.getClass(), "graph", null);
        setBooleanField(term1803, term1803.getClass(), "directed", false);
        setField(term1803, term1803.getClass(), "visitor", null);
        setIntField(term1803, term1803.getClass(), "orderIndex", 0);
        setIntField(term1803, term1803.getClass(), "compIndex", 0);
        setField(term1803, term1803.getClass(), "visited", null);
        setField(term1803, term1803.getClass(), "nextPos", null);
        setIntField(term1803, term1803.getClass(), "restartIndex", 0);
        setField(term1803, term1803.getClass(), "stack", null);
        setField(term1803, term1803.getClass(), "instack", null);
        setBooleanField(term1803, term1803.getClass(), "interrupted", false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.graph4j.traversal.DFSTraverser");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "init", argTypes, term1803, args);
    }

};


