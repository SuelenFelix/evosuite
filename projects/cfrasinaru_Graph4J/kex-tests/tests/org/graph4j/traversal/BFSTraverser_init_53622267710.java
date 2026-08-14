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

public class BFSTraverser_init_53622267710 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term506;

    public BFSTraverser_init_53622267710() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term506 = newInstance(Class.forName("org.graph4j.traversal.BFSTraverser"));
        setField(term506, term506.getClass(), "graph", null);
        setBooleanField(term506, term506.getClass(), "directed", false);
        setField(term506, term506.getClass(), "visitor", null);
        setField(term506, term506.getClass(), "queue", null);
        setIntField(term506, term506.getClass(), "orderIndex", 0);
        setIntField(term506, term506.getClass(), "compIndex", 0);
        setField(term506, term506.getClass(), "visited", null);
        setIntField(term506, term506.getClass(), "restartIndex", 0);
        setIntField(term506, term506.getClass(), "maxLevel", 0);
        setBooleanField(term506, term506.getClass(), "interrupted", false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.graph4j.traversal.BFSTraverser");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "init", argTypes, term506, args);
    }

};


