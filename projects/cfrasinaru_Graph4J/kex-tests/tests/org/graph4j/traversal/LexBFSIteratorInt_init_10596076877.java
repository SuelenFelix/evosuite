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

public class LexBFSIteratorInt_init_10596076877 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term824;

    public LexBFSIteratorInt_init_10596076877() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term824 = newInstance(Class.forName("org.graph4j.traversal.LexBFSIteratorInt"));
        setField(term824, term824.getClass(), "graph", null);
        setIntField(term824, term824.getClass(), "startVertex", 0);
        setIntField(term824, term824.getClass(), "compIndex", 0);
        setField(term824, term824.getClass(), "visited", null);
        setField(term824, term824.getClass(), "head", null);
        setField(term824, term824.getClass(), "vertexSlice", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.graph4j.traversal.LexBFSIteratorInt");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "init", argTypes, term824, args);
    }

};


