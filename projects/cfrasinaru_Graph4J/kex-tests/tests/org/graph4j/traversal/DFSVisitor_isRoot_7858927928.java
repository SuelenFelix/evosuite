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
import java.lang.Object;

public class DFSVisitor_isRoot_7858927928 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term3361;

    public DFSVisitor_isRoot_7858927928() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term3361 = newInstance(Class.forName("org.graph4j.traversal.SearchNode"));
        Object term3366 = newInstance(Class.forName("org.graph4j.traversal.SearchNode"));
        Object term3371 = newInstance(Class.forName("org.graph4j.traversal.SearchNode"));
        Object term3376 = newInstance(Class.forName("org.graph4j.traversal.SearchNode"));
        Object term3381 = newInstance(Class.forName("org.graph4j.traversal.SearchNode"));
        setIntField(term3361, term3361.getClass(), "component", 2013647768);
        setIntField(term3361, term3361.getClass(), "vertex", 1706579212);
        setIntField(term3361, term3361.getClass(), "level", -1073781147);
        setIntField(term3361, term3361.getClass(), "order", 138913824);
        setIntField(term3366, term3366.getClass(), "component", -637767208);
        setIntField(term3366, term3366.getClass(), "vertex", 844890845);
        setIntField(term3366, term3366.getClass(), "level", -989538894);
        setIntField(term3366, term3366.getClass(), "order", 1316863342);
        setIntField(term3371, term3371.getClass(), "component", 735033722);
        setIntField(term3371, term3371.getClass(), "vertex", -1409886459);
        setIntField(term3371, term3371.getClass(), "level", 666379561);
        setIntField(term3371, term3371.getClass(), "order", 1071163503);
        setIntField(term3376, term3376.getClass(), "component", -1507726422);
        setIntField(term3376, term3376.getClass(), "vertex", 171429081);
        setIntField(term3376, term3376.getClass(), "level", 1552107519);
        setIntField(term3376, term3376.getClass(), "order", -1952294830);
        setIntField(term3381, term3381.getClass(), "component", -1756012081);
        setIntField(term3381, term3381.getClass(), "vertex", 879317718);
        setIntField(term3381, term3381.getClass(), "level", -1205568351);
        setIntField(term3381, term3381.getClass(), "order", -1038188576);
        setField(term3381, term3381.getClass(), "parent", null);
        setField(term3376, term3376.getClass(), "parent", term3381);
        setField(term3371, term3371.getClass(), "parent", term3376);
        setField(term3366, term3366.getClass(), "parent", term3371);
        setField(term3361, term3361.getClass(), "parent", term3366);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.graph4j.traversal.DFSVisitor");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.graph4j.traversal.SearchNode");
        Object[] args = new Object[1];
        args[0] = term3361;
        callMethod(klass, "isRoot", argTypes, null, args);
    }

};


